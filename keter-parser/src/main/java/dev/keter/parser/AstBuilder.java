package dev.keter.parser;

import com.google.common.collect.ImmutableList;
import dev.keter.parser.SqlBaseParser.*;
import dev.keter.tree.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import static com.google.common.collect.Iterables.getOnlyElement;
import static java.lang.String.format;
import static java.util.Locale.ENGLISH;
import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toList;

class AstBuilder extends SqlBaseBaseVisitor<Node> {
    private int parameterPosition;
    private final ParsingOptions parsingOptions;

    AstBuilder(ParsingOptions parsingOptions) {
        this.parsingOptions = requireNonNull(parsingOptions, "parsingOptions is null");
    }

    @Override
    public Node visitSingleExpression(SingleExpressionContext ctx) {
        return visit(ctx.namedExpression());
    }

    @Override
    public Node visitSingleStatement(SingleStatementContext ctx) {
        return visit(ctx.statement());
    }

    @Override
    public Node visitQuery(QueryContext ctx) {
        QueryBody term = (QueryBody) visit(ctx.queryTerm());

        QueryOrganizationContext queryOrganizationContext = ctx.queryOrganization();

        Optional<OrderBy> orderBy = Optional.empty();
        if (queryOrganizationContext.ORDER() != null) {
            orderBy = Optional.of(new OrderBy(getLocation(queryOrganizationContext.ORDER()),
                    visit(queryOrganizationContext.sortItem(), SortItem.class)));
        }

        // Spark SQL not support OFFSET syntax
        Optional<Offset> offset = Optional.empty();

        Optional<Node> limit = Optional.empty();
        // Spark SQL not support FETCH syntax
        if (queryOrganizationContext.LIMIT() != null) {
            if (queryOrganizationContext.ALL() == null && queryOrganizationContext.INTEGER_VALUE() == null
                    && queryOrganizationContext.QUESTION_MARK() == null) {
                throw new IllegalStateException("Missing LIMIT value");
            }

            Expression rowCount;

            if (queryOrganizationContext.ALL() != null) {
                rowCount = new AllRows(getLocation(queryOrganizationContext.ALL()));
            } else if (queryOrganizationContext.INTEGER_VALUE() != null) {
                rowCount = new LongLiteral(getLocation(queryOrganizationContext.INTEGER_VALUE()),
                        queryOrganizationContext.INTEGER_VALUE().getText());
            } else {
                rowCount = new Parameter(getLocation(queryOrganizationContext.QUESTION_MARK()), parameterPosition);
                parameterPosition++;
            }

            limit = Optional.of(new Limit((getLocation(queryOrganizationContext.LIMIT())), rowCount));
        }

        if (term instanceof QuerySpecification) {
            // When we have a simple query specification
            // followed by order by, offset, limit,
            // fold the order by, limit, offset clauses
            // into the query specification (analyzer/planner
            // expects this structure to resolve references with respect
            // to columns defined in the query specification)
            QuerySpecification query = (QuerySpecification) term;

            return new Query(getLocation(ctx.queryTerm()), null,
                    new QuerySpecification(getLocation(ctx.queryTerm()),
                            query.getSelect(),
                            query.getFrom().orElse(null),
                            query.getWhere().orElse(null),
                            query.getGroupBy().orElse(null),
                            query.getHaving().orElse(null),
                            query.getWindows(),
                            orderBy.orElse(null),
                            offset.orElse(null),
                            limit.orElse(null)),
                    null, null, null);
        }

        return new Query(getLocation(ctx),
                visitIfPresent(ctx.ctes(),
                        With.class).orElse(null),
                term,
                orderBy.orElse(null),
                offset.orElse(null),
                limit.orElse(null));
    }

    @Override
    public Node visitCtes(CtesContext ctx) {
        // Spark SQL does not support RECURSIVE syntax
        return new With(getLocation(ctx), false, visit(ctx.namedQuery(), NamedQuery.class));
    }

    @Override
    public Node visitNamedQuery(NamedQueryContext ctx) {
        Optional<List<Identifier>> columns = Optional.empty();
        if (ctx.columnAliases() != null) {
            columns = Optional.of(visit(ctx.columnAliases().identifier(), Identifier.class));
        }

        return new NamedQuery(getLocation(ctx), (Identifier) visit(ctx.name), (Query) visit(ctx.query()), columns.orElse(null));
    }

    @Override
    public Node visitRegularQuerySpecification(RegularQuerySpecificationContext ctx) {
        List<NamedExpression> selectItems = visit(ctx.selectClause().namedExpressionSeq().namedExpression(),
                NamedExpression.class);
        Select select = new Select(getLocation(ctx.selectClause().SELECT()),
                isDistinct(ctx.selectClause().setQuantifier()), selectItems);

        Optional<Relation> from = Optional.empty();
        List<Relation> relations = visit(ctx.fromClause().relation(), Relation.class);
        if (!relations.isEmpty()) {
            // synthesize implicit join nodes
            Iterator<Relation> iterator = relations.iterator();
            Relation relation = iterator.next();

            while (iterator.hasNext()) {
                relation = new Join(getLocation(ctx), Join.Type.IMPLICIT, relation, iterator.next(), null);
            }

            from = Optional.of(relation);
        }

        List<NamedWindow> windows = ImmutableList.of();
        if (ctx.windowClause() != null) {
            windows = visit(ctx.windowClause().namedWindow(), NamedWindow.class);
        }

        // TODO: Support LateralView

        return new QuerySpecification(getLocation(ctx),
                select,
                from.orElse(null),
                visitIfPresent(ctx.whereClause(), Expression.class).orElse(null),
                visitIfPresent(ctx.aggregationClause(), GroupBy.class).orElse(null),
                visitIfPresent(ctx.havingClause(), Expression.class).orElse(null),
                windows,
                null,
                null,
                null);
    }

    @Override
    public Node visitAggregationClause(SqlBaseParser.AggregationClauseContext ctx) {
        List<Expression> groupByExpressions;
        if (!ctx.groupingExpressionsWithGroupingAnalytics.isEmpty()) {
            groupByExpressions = ctx.groupingExpressionsWithGroupingAnalytics.stream()
                    .map(groupByClause -> {
                        if (groupByClause.groupingAnalytics() != null)
                            throw new IllegalArgumentException("Unsupported syntax: CUBE, ROLLUP, GROUPING SETS");
                        return (Expression) visit(groupByClause);
                    }).collect(toList());
        } else {
            groupByExpressions = visit(ctx.groupingExpressions, Expression.class);
            if (ctx.GROUPING() != null) {
                // GROUP BY ... GROUPING SETS (...)
                // `groupByExpressions` can be non-empty for Hive compatibility. It may add extra grouping
                // expressions that do not exist in GROUPING SETS (...), and the value is always null.
                // For example, `SELECT a, b, c FROM ... GROUP BY a, b, c GROUPING SETS (a, b)`, the output
                // of column `c` is always null.
                throw new IllegalArgumentException("Unsupported syntax: GROUPING SETS");
            } else {
                // GROUP BY .... (WITH CUBE | WITH ROLLUP)?
                if (ctx.CUBE() != null) {
                    throw new IllegalArgumentException("Unsupported syntax: WITH CUBE");
                } else if (ctx.ROLLUP() != null) {
                    throw new IllegalArgumentException("Unsupported syntax: WITH ROLLUP");
                }
            }
        }
        // Spark SQL not support DISTINCT syntax
        return new GroupBy(getLocation(ctx), false, groupByExpressions);
    }

    @Override
    public Node visitNamedExpression(SqlBaseParser.NamedExpressionContext ctx) {
        if (ctx.identifierList() != null) {
            throw new IllegalArgumentException("Unsupported multi alias");
        }
        return new NamedExpression(getLocation(ctx), (Expression) visit(ctx.expression()), visitIfPresent(ctx.name, Identifier.class).orElse(null));
    }

    @Override
    public Node visitUnquotedIdentifier(UnquotedIdentifierContext ctx) {
        return new Identifier(getLocation(ctx), ctx.getText(), false);
    }

    @Override
    public Node visitQuotedIdentifier(QuotedIdentifierContext ctx) {
        String token = ctx.getText();
        String identifier = token.substring(1, token.length() - 1)
                .replace("\"\"", "\"");

        return new Identifier(getLocation(ctx), identifier, true);
    }

    @Override
    public Node visitBackQuotedIdentifier(BackQuotedIdentifierContext ctx) {
        String token = ctx.getText();
        String identifier = token.substring(1, token.length() - 1)
                .replace("\"\"", "\"");

        return new Identifier(getLocation(ctx), identifier, true);
    }

    @Override
    public Node visitSortItem(SortItemContext ctx) {
        return new SortItem(
                getLocation(ctx),
                (Expression) visit(ctx.expression()),
                Optional.ofNullable(ctx.ordering)
                        .map(AstBuilder::getOrderingType)
                        .orElse(SortItem.Ordering.ASCENDING),
                Optional.ofNullable(ctx.nullOrdering)
                        .map(AstBuilder::getNullOrderingType)
                        .orElse(SortItem.NullOrdering.UNDEFINED));
    }

    @Override
    public Node visitPredicated(PredicatedContext ctx) {
        Expression expression = (Expression) visit(ctx.valueExpression());
        if (ctx.predicate() != null) {
            switch (ctx.predicate().kind.getType()) {
                case SqlBaseLexer.BETWEEN:
                    expression = new BetweenPredicate(getLocation(ctx.predicate()),
                            expression,
                            (Expression) visit(ctx.predicate().lower),
                            (Expression) visit(ctx.predicate().upper));

                    if (ctx.predicate().NOT() != null)
                        expression = new NotExpression(getLocation(ctx.predicate()), expression);
                    break;
                case SqlBaseLexer.IN:
                    Expression listExpression;
                    if (ctx.predicate().query() != null) {
                        listExpression = new SubqueryExpression(getLocation(ctx.predicate()),
                                (Query) visit(ctx.predicate().query()));
                    } else {
                        listExpression = new InListExpression(getLocation(ctx.predicate()),
                                visit(ctx.predicate().expression(), Expression.class));
                    }
                    expression = new InPredicate(getLocation(ctx.predicate()), expression, listExpression);
                    if (ctx.predicate().NOT() != null)
                        expression = new NotExpression(getLocation(ctx.predicate()), expression);
                    break;
                case SqlBaseLexer.LIKE:
                    if(ctx.predicate().quantifier != null)
                        throw new IllegalArgumentException("Unsupported LIKE predicate with qualifier: " + ctx.predicate().quantifier.getText());

                    // TODO: Implement LIKE with escape char
                    expression = new LikePredicate(
                            getLocation(ctx.predicate()),
                            expression,
                            (Expression) visit(ctx.predicate().pattern),
                            null);

                    if (ctx.predicate().NOT() != null)
                        expression = new NotExpression(getLocation(ctx.predicate()), expression);

                case SqlBaseLexer.NULL:
                    if (ctx.predicate().NOT() != null)
                        expression = new IsNotNullPredicate(getLocation(ctx.predicate()), expression);
                    else expression = new IsNullPredicate(getLocation(ctx.predicate()), expression);
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported predicate: " + ctx.predicate().kind.getText());
            }
        }
        return expression;
    }

    @Override
    public Node visitLogicalNot(LogicalNotContext ctx) {
        return new NotExpression(getLocation(ctx), (Expression) visit(ctx.booleanExpression()));
    }

    @Override
    public Node visitLogicalBinary(LogicalBinaryContext ctx) {
        return new LogicalBinaryExpression(
                getLocation(ctx.operator),
                getLogicalBinaryOperator(ctx.operator),
                (Expression) visit(ctx.left),
                (Expression) visit(ctx.right));
    }

    @Override
    public Node visitExists(ExistsContext ctx) {
        return new ExistsPredicate(getLocation(ctx), new SubqueryExpression(getLocation(ctx), (Query) visit(ctx.query())));
    }

    @Override
    public Node visitArithmeticUnary(ArithmeticUnaryContext ctx) {
        Expression child = (Expression) visit(ctx.valueExpression());

        switch (ctx.operator.getType()) {
            case SqlBaseLexer.MINUS:
                return ArithmeticUnaryExpression.negative(getLocation(ctx), child);
            case SqlBaseLexer.PLUS:
                return ArithmeticUnaryExpression.positive(getLocation(ctx), child);
            default:
                throw new UnsupportedOperationException("Unsupported sign: " + ctx.operator.getText());
        }
    }

    @Override
    public Node visitArithmeticBinary(ArithmeticBinaryContext ctx) {
        return new ArithmeticBinaryExpression(
                getLocation(ctx.operator),
                getArithmeticBinaryOperator(ctx.operator),
                (Expression) visit(ctx.left),
                (Expression) visit(ctx.right));
    }

    @Override
    public Node visitComparison(ComparisonContext ctx) {
        return new ComparisonExpression(
                getLocation(ctx.comparisonOperator()),
                getComparisonOperator(((TerminalNode) ctx.comparisonOperator().getChild(0)).getSymbol()),
                (Expression) visit(ctx.left),
                (Expression) visit(ctx.right));
    }

    @Override
    public Node visitSpecialDateTimeFunction(SpecialDateTimeFunctionContext ctx) {
        CurrentTime.Function function = getDateTimeFunctionType(ctx.name);
        return new CurrentTime(getLocation(ctx), function);
    }

    @Override
    public Node visitSimpleCase(SimpleCaseContext ctx) {
        return new SimpleCaseExpression(
                getLocation(ctx),
                (Expression) visit(ctx.operand),
                visit(ctx.whenClause(), WhenClause.class),
                visitIfPresent(ctx.elseExpression, Expression.class).orElse(null));
    }

    @Override
    public Node visitSearchedCase(SearchedCaseContext ctx) {
        return new SearchedCaseExpression(
                getLocation(ctx),
                visit(ctx.whenClause(), WhenClause.class),
                visitIfPresent(ctx.elseExpression, Expression.class).orElse(null));
    }

    @Override
    public Node visitWhenClause(SqlBaseParser.WhenClauseContext ctx) {
        return new WhenClause(getLocation(ctx), (Expression) visit(ctx.condition), (Expression) visit(ctx.result));
    }

    @Override
    public Node visitCast(CastContext ctx) {
        boolean isTryCast = ctx.TRY_CAST() != null;
        return new Cast(getLocation(ctx), (Expression) visit(ctx.expression()), (DataType) visit(ctx.dataType()), isTryCast);
    }

    @Override
    public Node visitNullLiteral(NullLiteralContext ctx) {
        return new NullLiteral(getLocation(ctx));
    }

    @Override
    public Node visitInterval(IntervalContext ctx) {
        return new IntervalLiteral(
                getLocation(ctx),
                ((StringLiteral) visit(ctx.string())).getValue(),
                Optional.ofNullable(ctx.sign)
                        .map(AstBuilder::getIntervalSign)
                        .orElse(IntervalLiteral.Sign.POSITIVE),
                getIntervalFieldType((Token) ctx.from.getChild(0).getPayload()),
                Optional.ofNullable(ctx.to)
                        .map((x) -> x.getChild(0).getPayload())
                        .map(Token.class::cast)
                        .map(AstBuilder::getIntervalFieldType)
                        .orElse(null));
    }

    @Override
    public Node visitBooleanValue(BooleanValueContext ctx) {
        return new BooleanLiteral(getLocation(ctx), ctx.getText());
    }

    @Override
    public Node visitIntegerLiteral(IntegerLiteralContext ctx) {
        return new LongLiteral(getLocation(ctx), ctx.getText());
    }

    @Override
    public Node visitDoubleLiteral(DoubleLiteralContext ctx) {
        return new DoubleLiteral(getLocation(ctx), ctx.getText());
    }

    @Override
    public Node visitDecimalLiteral(DecimalLiteralContext ctx) {
        switch (parsingOptions.getDecimalLiteralTreatment()) {
            case AS_DOUBLE:
                return new DoubleLiteral(getLocation(ctx), ctx.getText());
            case AS_DECIMAL:
                return new DecimalLiteral(getLocation(ctx), ctx.getText());
            case REJECT:
                throw new ParsingException("Unexpected decimal literal: " + ctx.getText());
        }
        throw new AssertionError("Unreachable");
    }

    @Override
    public Node visitBasicStringLiteral(BasicStringLiteralContext ctx) {
        return new StringLiteral(getLocation(ctx), unquote(ctx.STRING().getText()));
    }

    @Override
    public Node visitUnicodeStringLiteral(UnicodeStringLiteralContext ctx) {
        return new StringLiteral(getLocation(ctx), decodeUnicodeLiteral(ctx));
    }

    @Override
    public Node visitTypeConstructor(TypeConstructorContext ctx) {
        String value = ((StringLiteral) visit(ctx.string())).getValue();

        String type = ctx.identifier().getText();
        if (type.equalsIgnoreCase("time")) {
            return new TimeLiteral(getLocation(ctx), value);
        }
        if (type.equalsIgnoreCase("timestamp")) {
            return new TimestampLiteral(getLocation(ctx), value);
        }
        if (type.equalsIgnoreCase("decimal")) {
            return new DecimalLiteral(getLocation(ctx), value);
        }
        if (type.equalsIgnoreCase("char")) {
            return new CharLiteral(getLocation(ctx), value);
        }

        return new GenericLiteral(getLocation(ctx), type, value);
    }

    @Override
    public Node visitSelectAll(SelectAllContext ctx) {
        QualifiedName qualifiedName = null;
        if (ctx.qualifiedName() != null) {
            qualifiedName = getQualifiedName(ctx.qualifiedName());
        }

        return new AllColumns(
                getLocation(ctx),
                qualifiedName);
    }

    @Override
    public Node visitSubqueryExpression(SubqueryExpressionContext ctx) {
        return new SubqueryExpression(getLocation(ctx), (Query) visit(ctx.query()));
    }

    @Override
    public Node visitFunctionCall(FunctionCallContext ctx) {
        Optional<Expression> filter = visitIfPresent(ctx.where, Expression.class);
        Optional<Window> window = visitIfPresent(ctx.windowSpec(), Window.class);

        if (ctx.functionName().qualifiedName() == null)
            throw new IllegalArgumentException("Function name not supported: " + ctx.functionName().getText());

        QualifiedName name = getQualifiedName(ctx.functionName().qualifiedName());

        boolean distinct = isDistinct(ctx.setQuantifier());

        TerminalNode nullTreatment = ctx.NULLS();

        if (name.toString().equalsIgnoreCase("if")) {
            check(ctx.expression().size() == 2 || ctx.expression().size() == 3, "Invalid number of arguments for 'if' function", ctx);
            check(!window.isPresent(), "OVER clause not valid for 'if' function", ctx);
            check(!distinct, "DISTINCT not valid for 'if' function", ctx);
            check(nullTreatment == null, "Null treatment clause not valid for 'if' function", ctx);
            check(!filter.isPresent(), "FILTER not valid for 'if' function", ctx);

            Expression elseExpression = null;
            if (ctx.expression().size() == 3) {
                elseExpression = (Expression) visit(ctx.expression(2));
            }

            return new IfExpression(
                    getLocation(ctx),
                    (Expression) visit(ctx.expression(0)),
                    (Expression) visit(ctx.expression(1)),
                    elseExpression);
        }

        if (name.toString().equalsIgnoreCase("nullif")) {
            check(ctx.expression().size() == 2, "Invalid number of arguments for 'nullif' function", ctx);
            check(!window.isPresent(), "OVER clause not valid for 'nullif' function", ctx);
            check(!distinct, "DISTINCT not valid for 'nullif' function", ctx);
            check(nullTreatment == null, "Null treatment clause not valid for 'nullif' function", ctx);
            check(!filter.isPresent(), "FILTER not valid for 'nullif' function", ctx);

            return new NullIfExpression(
                    getLocation(ctx),
                    (Expression) visit(ctx.expression(0)),
                    (Expression) visit(ctx.expression(1)));
        }

        if (name.toString().equalsIgnoreCase("coalesce")) {
            check(ctx.expression().size() >= 2, "The 'coalesce' function must have at least two arguments", ctx);
            check(!window.isPresent(), "OVER clause not valid for 'coalesce' function", ctx);
            check(!distinct, "DISTINCT not valid for 'coalesce' function", ctx);
            check(nullTreatment == null, "Null treatment clause not valid for 'coalesce' function", ctx);
            check(!filter.isPresent(), "FILTER not valid for 'coalesce' function", ctx);

            return new CoalesceExpression(getLocation(ctx), visit(ctx.expression(), Expression.class));
        }

        if (name.toString().equalsIgnoreCase("try")) {
            check(ctx.expression().size() == 1, "The 'try' function must have exactly one argument", ctx);
            check(!window.isPresent(), "OVER clause not valid for 'try' function", ctx);
            check(!distinct, "DISTINCT not valid for 'try' function", ctx);
            check(nullTreatment == null, "Null treatment clause not valid for 'try' function", ctx);
            check(!filter.isPresent(), "FILTER not valid for 'try' function", ctx);

            return new TryExpression(getLocation(ctx), (Expression) visit(getOnlyElement(ctx.expression())));
        }

        if (name.toString().equalsIgnoreCase("format")) {
            check(ctx.expression().size() >= 2, "The 'format' function must have at least two arguments", ctx);
            check(!window.isPresent(), "OVER clause not valid for 'format' function", ctx);
            check(!distinct, "DISTINCT not valid for 'format' function", ctx);
            check(nullTreatment == null, "Null treatment clause not valid for 'format' function", ctx);
            check(!filter.isPresent(), "FILTER not valid for 'format' function", ctx);

            return new Format(getLocation(ctx), visit(ctx.expression(), Expression.class));
        }

        FunctionCall.NullTreatment nulls = null;
        if (nullTreatment != null) {
            if (ctx.IGNORE() != null) {
                nulls = FunctionCall.NullTreatment.IGNORE;
            } else if (ctx.RESPECT() != null) {
                nulls = FunctionCall.NullTreatment.RESPECT;
            }
        }

        return new FunctionCall(
                getLocation(ctx),
                name,
                window.orElse(null),
                filter.orElse(null),
                null,
                distinct,
                nulls,
                null,
                visit(ctx.expression(), Expression.class));
    }

    @Override
    public Node visitLambda(LambdaContext ctx) {
        List<LambdaArgumentDeclaration> arguments = visit(ctx.identifier(), Identifier.class).stream()
                .map(LambdaArgumentDeclaration::new)
                .collect(toList());

        Expression body = (Expression) visit(ctx.expression());

        return new LambdaExpression(getLocation(ctx), arguments, body);
    }

    @Override
    public Node visitColumnReference(ColumnReferenceContext ctx) {
        return visit(ctx.identifier());
    }

    @Override
    public Node visitDereference(DereferenceContext ctx) {
        return new DereferenceExpression(
                getLocation(ctx),
                (Expression) visit(ctx.base),
                (Identifier) visit(ctx.fieldName));
    }

    @Override
    public Node visitParenthesizedExpression(ParenthesizedExpressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Node visitSubstring(SubstringContext ctx) {
        return new FunctionCall(getLocation(ctx), QualifiedName.of("substr"), visit(ctx.valueExpression(), Expression.class));
    }

    @Override
    public Node visitTrim(TrimContext ctx) {
        //TODO: need to handle by spark way
        return new FunctionCall(getLocation(ctx), QualifiedName.of("trim"), visit(ctx.valueExpression(), Expression.class));
    }

    @Override
    public Node visitParameter(ParameterContext ctx) {
        Parameter parameter = new Parameter(getLocation(ctx), parameterPosition);
        parameterPosition++;
        return parameter;
    }

    @Override
    public Node visitIntervalType(IntervalTypeContext ctx) {
        String from = ctx.from.getText();
        String to = getTextIfPresent(ctx.to)
                .orElse(from);

        return new IntervalDayTimeDataType(
                getLocation(ctx),
                IntervalDayTimeDataType.Field.valueOf(from.toUpperCase(ENGLISH)),
                IntervalDayTimeDataType.Field.valueOf(to.toUpperCase(ENGLISH)));
    }

    @Override
    public Node visitDateTimeType(DateTimeTypeContext ctx) {
        DateTimeDataType.Type type;

        if (ctx.base.getType() == SqlBaseLexer.TIME) {
            type = DateTimeDataType.Type.TIME;
        } else if (ctx.base.getType() == SqlBaseLexer.TIMESTAMP) {
            type = DateTimeDataType.Type.TIMESTAMP;
        } else {
            throw new ParsingException("Unexpected datetime type: " + ctx.getText());
        }

        return new DateTimeDataType(
                getLocation(ctx),
                type,
                ctx.WITH() != null,
                visitIfPresent(ctx.precision, DataTypeParameter.class).orElse(null));
    }

    @Override
    public Node visitRelation(RelationContext ctx) {
        Relation left = (Relation) visit(ctx.relationPrimary());

        if (ctx.joinRelation() != null) {
            for (JoinRelationContext joinCtx : ctx.joinRelation()) {
                Relation right = (Relation) visit(joinCtx.right);

                JoinCriteria criteria;
                if (joinCtx.NATURAL() != null) {
                    criteria = new NaturalJoin();
                } else {
                    if (joinCtx.joinCriteria().ON() != null) {
                        criteria = new JoinOn((Expression) visit(joinCtx.joinCriteria().booleanExpression()));
                    } else if (joinCtx.joinCriteria().USING() != null) {
                        criteria = new JoinUsing(visit(joinCtx.joinCriteria().identifierList().identifierSeq().ident, Identifier.class));
                    } else {
                        throw new IllegalArgumentException("Unsupported join criteria");
                    }
                }

                Join.Type joinType;
                if (joinCtx.joinType().LEFT() != null) {
                    joinType = Join.Type.LEFT;
                } else if (joinCtx.joinType().RIGHT() != null) {
                    joinType = Join.Type.RIGHT;
                } else if (joinCtx.joinType().FULL() != null) {
                    joinType = Join.Type.FULL;
                } else {
                    joinType = Join.Type.INNER;
                }

                left = new Join(getLocation(joinCtx), joinType, left, right, criteria);
            }
        }

        return left;
    }


    @Override
    public Node visitJoinRelation(JoinRelationContext ctx) {
        return super.visitJoinRelation(ctx);
    }

    @Override
    public Node visitTableName(TableNameContext ctx) {
        List<Identifier> identifiers = visit(ctx.multipartIdentifier().identifier(), Identifier.class);
        return new Table(getLocation(ctx), QualifiedName.of(identifiers));
    }

    @Override
    public Node visitAliasedQuery(AliasedQueryContext ctx) {
        return new TableSubquery(getLocation(ctx), (Query) visit(ctx.query()));
    }

    @Override
    public Node visitAliasedRelation(AliasedRelationContext ctx) {
        Relation child = (Relation) visit(ctx.relation());

        if (ctx.tableAlias() == null) {
            return child;
        }

        List<Identifier> aliases = null;
        if (ctx.tableAlias().identifierList() != null) {
            aliases = visit(ctx.tableAlias().identifierList().identifierSeq().ident, Identifier.class);
        }

        return new AliasedRelation(getLocation(ctx), child, (Identifier) visit(ctx.tableAlias().identifier()), aliases);
    }

    private static SortItem.NullOrdering getNullOrderingType(Token token) {
        switch (token.getType()) {
            case SqlBaseLexer.FIRST:
                return SortItem.NullOrdering.FIRST;
            case SqlBaseLexer.LAST:
                return SortItem.NullOrdering.LAST;
        }

        throw new IllegalArgumentException("Unsupported ordering: " + token.getText());
    }

    private static SortItem.Ordering getOrderingType(Token token) {
        switch (token.getType()) {
            case SqlBaseLexer.ASC:
                return SortItem.Ordering.ASCENDING;
            case SqlBaseLexer.DESC:
                return SortItem.Ordering.DESCENDING;
        }

        throw new IllegalArgumentException("Unsupported ordering: " + token.getText());
    }

    private static LogicalBinaryExpression.Operator getLogicalBinaryOperator(Token token) {
        switch (token.getType()) {
            case SqlBaseLexer.AND:
                return LogicalBinaryExpression.Operator.AND;
            case SqlBaseLexer.OR:
                return LogicalBinaryExpression.Operator.OR;
        }

        throw new IllegalArgumentException("Unsupported operator: " + token.getText());
    }

    private static ArithmeticBinaryExpression.Operator getArithmeticBinaryOperator(Token operator) {
        switch (operator.getType()) {
            case SqlBaseLexer.PLUS:
                return ArithmeticBinaryExpression.Operator.ADD;
            case SqlBaseLexer.MINUS:
                return ArithmeticBinaryExpression.Operator.SUBTRACT;
            case SqlBaseLexer.ASTERISK:
                return ArithmeticBinaryExpression.Operator.MULTIPLY;
            case SqlBaseLexer.SLASH:
                return ArithmeticBinaryExpression.Operator.DIVIDE;
            case SqlBaseLexer.PERCENT:
                return ArithmeticBinaryExpression.Operator.MODULUS;
        }

        throw new UnsupportedOperationException("Unsupported operator: " + operator.getText());
    }

    private static ComparisonExpression.Operator getComparisonOperator(Token symbol) {
        switch (symbol.getType()) {
            case SqlBaseLexer.EQ:
                return ComparisonExpression.Operator.EQUAL;
            case SqlBaseLexer.NEQ:
                return ComparisonExpression.Operator.NOT_EQUAL;
            case SqlBaseLexer.LT:
                return ComparisonExpression.Operator.LESS_THAN;
            case SqlBaseLexer.LTE:
                return ComparisonExpression.Operator.LESS_THAN_OR_EQUAL;
            case SqlBaseLexer.GT:
                return ComparisonExpression.Operator.GREATER_THAN;
            case SqlBaseLexer.GTE:
                return ComparisonExpression.Operator.GREATER_THAN_OR_EQUAL;
        }

        throw new IllegalArgumentException("Unsupported operator: " + symbol.getText());
    }

    private static CurrentTime.Function getDateTimeFunctionType(Token token) {
        switch (token.getType()) {
            case SqlBaseLexer.CURRENT_DATE:
                return CurrentTime.Function.DATE;
            case SqlBaseLexer.CURRENT_TIME:
                return CurrentTime.Function.TIME;
            case SqlBaseLexer.CURRENT_TIMESTAMP:
                return CurrentTime.Function.TIMESTAMP;
            case SqlBaseLexer.LOCALTIME:
                return CurrentTime.Function.LOCALTIME;
            case SqlBaseLexer.LOCALTIMESTAMP:
                return CurrentTime.Function.LOCALTIMESTAMP;
        }

        throw new IllegalArgumentException("Unsupported special function: " + token.getText());
    }

    private static IntervalLiteral.Sign getIntervalSign(Token token) {
        switch (token.getType()) {
            case SqlBaseLexer.MINUS:
                return IntervalLiteral.Sign.NEGATIVE;
            case SqlBaseLexer.PLUS:
                return IntervalLiteral.Sign.POSITIVE;
        }

        throw new IllegalArgumentException("Unsupported sign: " + token.getText());
    }

    private static IntervalLiteral.IntervalField getIntervalFieldType(Token token) {
        switch (token.getType()) {
            case SqlBaseLexer.YEAR:
                return IntervalLiteral.IntervalField.YEAR;
            case SqlBaseLexer.MONTH:
                return IntervalLiteral.IntervalField.MONTH;
            case SqlBaseLexer.DAY:
                return IntervalLiteral.IntervalField.DAY;
            case SqlBaseLexer.HOUR:
                return IntervalLiteral.IntervalField.HOUR;
            case SqlBaseLexer.MINUTE:
                return IntervalLiteral.IntervalField.MINUTE;
            case SqlBaseLexer.SECOND:
                return IntervalLiteral.IntervalField.SECOND;
        }

        throw new IllegalArgumentException("Unsupported interval field: " + token.getText());
    }

    private static boolean isDistinct(SqlBaseParser.SetQuantifierContext setQuantifier) {
        return setQuantifier != null && setQuantifier.DISTINCT() != null;
    }

    private static String unquote(String value) {
        return value.substring(1, value.length() - 1)
                .replace("''", "'");
    }

    private static Optional<String> getTextIfPresent(ParserRuleContext context) {
        return Optional.ofNullable(context)
                .map(ParseTree::getText);
    }

    private enum UnicodeDecodeState {
        EMPTY,
        ESCAPED,
        UNICODE_SEQUENCE
    }

    private static String decodeUnicodeLiteral(SqlBaseParser.UnicodeStringLiteralContext ctx) {
        char escape;
        if (ctx.UESCAPE() != null) {
            String escapeString = unquote(ctx.STRING().getText());
            check(!escapeString.isEmpty(), "Empty Unicode escape character", ctx);
            check(escapeString.length() == 1, "Invalid Unicode escape character: " + escapeString, ctx);
            escape = escapeString.charAt(0);
            check(isValidUnicodeEscape(escape), "Invalid Unicode escape character: " + escapeString, ctx);
        } else {
            escape = '\\';
        }

        String rawContent = unquote(ctx.UNICODE_STRING().getText().substring(2));
        StringBuilder unicodeStringBuilder = new StringBuilder();
        StringBuilder escapedCharacterBuilder = new StringBuilder();
        int charactersNeeded = 0;
        UnicodeDecodeState state = UnicodeDecodeState.EMPTY;
        for (int i = 0; i < rawContent.length(); i++) {
            char ch = rawContent.charAt(i);
            switch (state) {
                case EMPTY:
                    if (ch == escape) {
                        state = UnicodeDecodeState.ESCAPED;
                    } else {
                        unicodeStringBuilder.append(ch);
                    }
                    break;
                case ESCAPED:
                    if (ch == escape) {
                        unicodeStringBuilder.append(escape);
                        state = UnicodeDecodeState.EMPTY;
                    } else if (ch == '+') {
                        state = UnicodeDecodeState.UNICODE_SEQUENCE;
                        charactersNeeded = 6;
                    } else if (isHexDigit(ch)) {
                        state = UnicodeDecodeState.UNICODE_SEQUENCE;
                        charactersNeeded = 4;
                        escapedCharacterBuilder.append(ch);
                    } else {
                        throw parseError("Invalid hexadecimal digit: " + ch, ctx);
                    }
                    break;
                case UNICODE_SEQUENCE:
                    check(isHexDigit(ch), "Incomplete escape sequence: " + escapedCharacterBuilder.toString(), ctx);
                    escapedCharacterBuilder.append(ch);
                    if (charactersNeeded == escapedCharacterBuilder.length()) {
                        String currentEscapedCode = escapedCharacterBuilder.toString();
                        escapedCharacterBuilder.setLength(0);
                        int codePoint = Integer.parseInt(currentEscapedCode, 16);
                        check(Character.isValidCodePoint(codePoint), "Invalid escaped character: " + currentEscapedCode, ctx);
                        if (Character.isSupplementaryCodePoint(codePoint)) {
                            unicodeStringBuilder.appendCodePoint(codePoint);
                        } else {
                            char currentCodePoint = (char) codePoint;
                            check(!Character.isSurrogate(currentCodePoint), format("Invalid escaped character: %s. Escaped character is a surrogate. Use '\\+123456' instead.", currentEscapedCode), ctx);
                            unicodeStringBuilder.append(currentCodePoint);
                        }
                        state = UnicodeDecodeState.EMPTY;
                        charactersNeeded = -1;
                    } else {
                        check(charactersNeeded > escapedCharacterBuilder.length(), "Unexpected escape sequence length: " + escapedCharacterBuilder.length(), ctx);
                    }
                    break;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        check(state == UnicodeDecodeState.EMPTY, "Incomplete escape sequence: " + escapedCharacterBuilder.toString(), ctx);
        return unicodeStringBuilder.toString();
    }

    private static boolean isHexDigit(char c) {
        return ((c >= '0') && (c <= '9')) ||
                ((c >= 'A') && (c <= 'F')) ||
                ((c >= 'a') && (c <= 'f'));
    }

    private static boolean isValidUnicodeEscape(char c) {
        return c < 0x7F && c > 0x20 && !isHexDigit(c) && c != '"' && c != '+' && c != '\'';
    }

    private static void check(boolean condition, String message, ParserRuleContext ctx) {
        if (!condition) {
            throw parseError(message, ctx);
        }
    }

    private QualifiedName getQualifiedName(SqlBaseParser.QualifiedNameContext context) {
        return QualifiedName.of(visit(context.identifier(), Identifier.class));
    }

    private <T> Optional<T> visitIfPresent(ParserRuleContext ctx, Class<T> clazz) {
        return Optional.ofNullable(ctx).map(this::visit).map(clazz::cast);
    }

    private <T> List<T> visit(List<? extends ParserRuleContext> contexts, Class<T> clazz) {
        return contexts.stream().map(this::visit).map(clazz::cast).collect(toList());
    }

    public static NodeLocation getLocation(TerminalNode terminalNode) {
        requireNonNull(terminalNode, "terminalNode is null");
        return getLocation(terminalNode.getSymbol());
    }

    public static NodeLocation getLocation(ParserRuleContext parserRuleContext) {
        requireNonNull(parserRuleContext, "parserRuleContext is null");
        return getLocation(parserRuleContext.getStart());
    }

    public static NodeLocation getLocation(Token token) {
        requireNonNull(token, "token is null");
        return new NodeLocation(token.getLine(), token.getCharPositionInLine() + 1);
    }

    private static ParsingException parseError(String message, ParserRuleContext ctx) {
        return new ParsingException(message, null, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine() + 1);
    }
}
