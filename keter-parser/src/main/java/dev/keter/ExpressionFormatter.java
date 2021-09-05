package dev.keter;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import dev.keter.tree.*;

import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.PrimitiveIterator;
import java.util.function.Function;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkState;
import static com.google.common.collect.Iterables.getOnlyElement;
import static java.lang.String.format;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static dev.keter.SqlFormatter.formatName;
import static dev.keter.SqlFormatter.formatSql;
import static java.lang.String.format;

public final class ExpressionFormatter {
    private static final ThreadLocal<DecimalFormat> doubleFormatter = ThreadLocal
            .withInitial(() -> new DecimalFormat("0.###################E0###", new DecimalFormatSymbols(Locale.US)));

    private ExpressionFormatter() {
    }

    public static String formatExpression(Expression expression) {
        return new Formatter().process(expression, null);
    }

    private static String formatIdentifier(String s) {
        return '"' + s.replace("\"", "\"\"") + '"';
    }

    public static class Formatter extends AstVisitor<String, Void> {
        @Override
        protected String visitNode(Node node, Void context) {
            throw new UnsupportedOperationException();
        }

        @Override
        protected String visitExpression(Expression node, Void context) {
            throw new UnsupportedOperationException(
                    format("not yet implemented: %s.visit%s", getClass().getName(), node.getClass().getSimpleName()));
        }

        @Override
        protected String visitNamedExpression(NamedExpression node, Void context) {
            if (node.getAlias().isPresent()) {
                return formatExpression(node.getExpression()) + " " + formatExpression(node.getAlias().get());
            }
            return formatExpression(node.getExpression());
        }

        @Override
        protected String visitFormat(Format node, Void context) {
            return "format(" + joinExpressions(node.getArguments()) + ")";
        }

        @Override
        protected String visitCurrentTime(CurrentTime node, Void context) {
            StringBuilder builder = new StringBuilder();

            builder.append(node.getFunction().getName());

            if (node.getPrecision() != null) {
                builder.append('(').append(node.getPrecision()).append(')');
            }

            return builder.toString();
        }

        @Override
        protected String visitBooleanLiteral(BooleanLiteral node, Void context) {
            return String.valueOf(node.getValue());
        }

        @Override
        protected String visitStringLiteral(StringLiteral node, Void context) {
            return formatStringLiteral(node.getValue());
        }

        @Override
        protected String visitCharLiteral(CharLiteral node, Void context) {
            return "CHAR " + formatStringLiteral(node.getValue());
        }

        @Override
        protected String visitParameter(Parameter node, Void context) {
            return "?";
        }

        @Override
        protected String visitAllRows(AllRows node, Void context) {
            return "ALL";
        }

        @Override
        protected String visitLongLiteral(LongLiteral node, Void context) {
            return Long.toString(node.getValue());
        }

        @Override
        protected String visitDoubleLiteral(DoubleLiteral node, Void context) {
            return doubleFormatter.get().format(node.getValue());
        }

        @Override
        protected String visitDecimalLiteral(DecimalLiteral node, Void context) {
            // TODO return node value without "DECIMAL '..'" when
            // FeaturesConfig#parseDecimalLiteralsAsDouble switch is removed
            return "DECIMAL '" + node.getValue() + "'";
        }

        @Override
        protected String visitGenericLiteral(GenericLiteral node, Void context) {
            return node.getType() + " " + formatStringLiteral(node.getValue());
        }

        @Override
        protected String visitTimeLiteral(TimeLiteral node, Void context) {
            return "TIME '" + node.getValue() + "'";
        }

        @Override
        protected String visitTimestampLiteral(TimestampLiteral node, Void context) {
            return "TIMESTAMP '" + node.getValue() + "'";
        }

        @Override
        protected String visitNullLiteral(NullLiteral node, Void context) {
            return "null";
        }

        @Override
        protected String visitIntervalLiteral(IntervalLiteral node, Void context) {
            String sign = (node.getSign() == IntervalLiteral.Sign.NEGATIVE) ? "- " : "";
            StringBuilder builder = new StringBuilder().append("INTERVAL ").append(sign).append(" '")
                    .append(node.getValue()).append("' ").append(node.getStartField());

            if (node.getEndField().isPresent()) {
                builder.append(" TO ").append(node.getEndField().get());
            }
            return builder.toString();
        }

        @Override
        protected String visitSubqueryExpression(SubqueryExpression node, Void context) {
            return "(" + formatSql(node.getQuery()) + ")";
        }

        @Override
        protected String visitExists(ExistsPredicate node, Void context) {
            return "(EXISTS " + formatSql(node.getSubquery()) + ")";
        }

        @Override
        protected String visitIdentifier(Identifier node, Void context) {
            if (!node.isDelimited()) {
                return node.getValue();
            } else {
                return '"' + node.getValue().replace("\"", "\"\"") + '"';
            }
        }

        @Override
        protected String visitLambdaArgumentDeclaration(LambdaArgumentDeclaration node, Void context) {
            return formatExpression(node.getName());
        }

        @Override
        protected String visitDereferenceExpression(DereferenceExpression node, Void context) {
            String baseString = process(node.getBase(), context);
            return baseString + "." + process(node.getField());
        }

        @Override
        protected String visitFunctionCall(FunctionCall node, Void context) {
            StringBuilder builder = new StringBuilder();

            if (node.getProcessingMode().isPresent()) {
                builder.append(node.getProcessingMode().get().getMode()).append(" ");
            }

            String arguments = joinExpressions(node.getArguments());
            if (node.getArguments().isEmpty() && "count".equalsIgnoreCase(node.getName().getSuffix())) {
                arguments = "*";
            }
            if (node.isDistinct()) {
                arguments = "DISTINCT " + arguments;
            }

            builder.append(formatName(node.getName())).append('(').append(arguments);

            if (node.getOrderBy().isPresent()) {
                builder.append(' ').append(formatOrderBy(node.getOrderBy().get()));
            }

            builder.append(')');

            node.getNullTreatment().ifPresent(nullTreatment -> {
                switch (nullTreatment) {
                    case IGNORE:
                        builder.append(" IGNORE NULLS");
                        break;
                    case RESPECT:
                        builder.append(" RESPECT NULLS");
                        break;
                }
            });

            if (node.getFilter().isPresent()) {
                builder.append(" FILTER ").append(visitFilter(node.getFilter().get(), context));
            }

            if (node.getWindow().isPresent()) {
                builder.append(" OVER ").append(formatWindow(node.getWindow().get()));
            }

            return builder.toString();
        }

        private String visitFilter(Expression node, Void context) {
            return "(WHERE " + process(node, context) + ')';
        }

        @Override
        protected String visitLambdaExpression(LambdaExpression node, Void context) {
            StringBuilder builder = new StringBuilder();

            builder.append('(');
            Joiner.on(", ").appendTo(builder, node.getArguments());
            builder.append(") -> ");
            builder.append(process(node.getBody(), context));
            return builder.toString();
        }

        @Override
        protected String visitLogicalBinaryExpression(LogicalBinaryExpression node, Void context) {
            return formatBinaryExpression(node.getOperator().toString(), node.getLeft(), node.getRight());
        }

        @Override
        protected String visitNotExpression(NotExpression node, Void context) {
            return "(NOT " + process(node.getValue(), context) + ")";
        }

        @Override
        protected String visitComparisonExpression(ComparisonExpression node, Void context) {
            return formatBinaryExpression(node.getOperator().getValue(), node.getLeft(), node.getRight());
        }

        @Override
        protected String visitNullIfExpression(NullIfExpression node, Void context) {
            return "NULLIF(" + process(node.getFirst(), context) + ", " + process(node.getSecond(), context) + ')';
        }

        @Override
        protected String visitIfExpression(IfExpression node, Void context) {
            StringBuilder builder = new StringBuilder();
            builder.append("IF(").append(process(node.getCondition(), context)).append(", ")
                    .append(process(node.getTrueValue(), context));
            if (node.getFalseValue().isPresent()) {
                builder.append(", ").append(process(node.getFalseValue().get(), context));
            }
            builder.append(")");
            return builder.toString();
        }

        @Override
        protected String visitBetweenPredicate(BetweenPredicate node, Void context) {
            return "(" + process(node.getValue(), context) + " BETWEEN " +
                    process(node.getMin(), context) + " AND " + process(node.getMax(), context) + ")";
        }

        @Override
        protected String visitInPredicate(InPredicate node, Void context) {
            return "(" + process(node.getValue(), context) + " IN " + process(node.getValueList(), context) + ")";
        }

        @Override
        protected String visitInListExpression(InListExpression node, Void context) {
            return "(" + joinExpressions(node.getValues()) + ")";
        }

        @Override
        protected String visitIsNullPredicate(IsNullPredicate node, Void context) {
            return "(" + process(node.getValue(), context) + " IS NULL)";
        }

        @Override
        protected String visitIsNotNullPredicate(IsNotNullPredicate node, Void context) {
            return "(" + process(node.getValue(), context) + " IS NOT NULL)";
        }

        @Override
        protected String visitLikePredicate(LikePredicate node, Void context) {
            StringBuilder builder = new StringBuilder();

            builder.append('(')
                    .append(process(node.getValue(), context))
                    .append(" LIKE ")
                    .append(process(node.getPattern(), context));

            node.getEscape().ifPresent(escape -> builder.append(" ESCAPE ")
                    .append(process(escape, context)));

            builder.append(')');

            return builder.toString();
        }

        @Override
        protected String visitTryExpression(TryExpression node, Void context) {
            return "TRY(" + process(node.getInnerExpression(), context) + ")";
        }

        @Override
        protected String visitCoalesceExpression(CoalesceExpression node, Void context) {
            return "COALESCE(" + joinExpressions(node.getOperands()) + ")";
        }

        @Override
        protected String visitArithmeticUnary(ArithmeticUnaryExpression node, Void context) {
            String value = process(node.getValue(), context);

            switch (node.getSign()) {
                case MINUS:
                    // Unary is ambiguous with respect to negative numbers. "-1" parses as a number,
                    // but "-(1)" parses as "unaryMinus(number)"
                    // The parentheses are needed to ensure the parsing roundtrips properly.
                    return "-(" + value + ")";
                case PLUS:
                    return "+" + value;
            }
            throw new UnsupportedOperationException("Unsupported sign: " + node.getSign());
        }

        @Override
        protected String visitArithmeticBinary(ArithmeticBinaryExpression node, Void context) {
            return formatBinaryExpression(node.getOperator().getValue(), node.getLeft(), node.getRight());
        }

        @Override
        protected String visitAllColumns(AllColumns node, Void context) {
            StringBuilder builder = new StringBuilder();

            node.getQualifiedName().ifPresent(name -> builder.append(name).append("."));
            builder.append("*");

            return builder.toString();
        }

        @Override
        public String visitCast(Cast node, Void context) {
            return (node.isSafe() ? "TRY_CAST" : "CAST") + "(" + process(node.getExpression(), context) + " AS "
                    + process(node.getType(), context) + ")";
        }

        @Override
        protected String visitSearchedCaseExpression(SearchedCaseExpression node, Void context) {
            ImmutableList.Builder<String> parts = ImmutableList.builder();
            parts.add("CASE");
            for (WhenClause whenClause : node.getWhenClauses()) {
                parts.add(process(whenClause, context));
            }

            node.getDefaultValue().ifPresent((value) -> parts.add("ELSE").add(process(value, context)));

            parts.add("END");

            return "(" + Joiner.on(' ').join(parts.build()) + ")";
        }

        @Override
        protected String visitSimpleCaseExpression(SimpleCaseExpression node, Void context) {
            ImmutableList.Builder<String> parts = ImmutableList.builder();

            parts.add("CASE").add(process(node.getOperand(), context));

            for (WhenClause whenClause : node.getWhenClauses()) {
                parts.add(process(whenClause, context));
            }

            node.getDefaultValue().ifPresent((value) -> parts.add("ELSE").add(process(value, context)));

            parts.add("END");

            return "(" + Joiner.on(' ').join(parts.build()) + ")";
        }

        @Override
        protected String visitWhenClause(WhenClause node, Void context) {
            return "WHEN " + process(node.getOperand(), context) + " THEN " + process(node.getResult(), context);
        }

        @Override
        protected String visitIntervalDataType(IntervalDayTimeDataType node, Void context) {
            StringBuilder builder = new StringBuilder();

            builder.append("INTERVAL ");
            builder.append(node.getFrom());
            if (node.getFrom() != node.getTo()) {
                builder.append(" TO ").append(node.getTo());
            }

            return builder.toString();
        }

        @Override
        protected String visitDateTimeType(DateTimeDataType node, Void context) {
            StringBuilder builder = new StringBuilder();

            builder.append(node.getType().toString().toLowerCase(Locale.ENGLISH)); // TODO: normalize to upper case
            // according to standard SQL
            // semantics
            if (node.getPrecision().isPresent()) {
                builder.append("(").append(node.getPrecision().get()).append(")");
            }

            if (node.isWithTimeZone()) {
                builder.append(" with time zone"); // TODO: normalize to upper case according to standard SQL semantics
            }

            return builder.toString();
        }

        private String formatBinaryExpression(String operator, Expression left, Expression right) {
            return '(' + process(left, null) + ' ' + operator + ' ' + process(right, null) + ')';
        }

        private String joinExpressions(List<Expression> expressions) {
            return Joiner.on(", ").join(expressions.stream().map((e) -> process(e, null)).iterator());
        }
    }

    static String formatStringLiteral(String s) {
        s = s.replace("'", "''");
        if (CharMatcher.inRange((char) 0x20, (char) 0x7E).matchesAllOf(s)) {
            return "'" + s + "'";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("U&'");
        PrimitiveIterator.OfInt iterator = s.codePoints().iterator();
        while (iterator.hasNext()) {
            int codePoint = iterator.nextInt();
            checkArgument(codePoint >= 0, "Invalid UTF-8 encoding in characters: %s", s);
            if (isAsciiPrintable(codePoint)) {
                char ch = (char) codePoint;
                if (ch == '\\') {
                    builder.append(ch);
                }
                builder.append(ch);
            } else if (codePoint <= 0xFFFF) {
                builder.append('\\');
                builder.append(format("%04X", codePoint));
            } else {
                builder.append("\\+");
                builder.append(format("%06X", codePoint));
            }
        }
        builder.append("'");
        return builder.toString();
    }

    public static String formatOrderBy(OrderBy orderBy) {
        return "ORDER BY " + formatSortItems(orderBy.getSortItems());
    }

    private static String formatSortItems(List<SortItem> sortItems) {
        return Joiner.on(", ").join(sortItems.stream().map(sortItemFormatterFunction()).iterator());
    }

    private static String formatWindow(Window window) {
        if (window instanceof WindowReference) {
            return formatExpression(((WindowReference) window).getName());
        }

        return formatWindowSpecification((WindowSpecification) window);
    }

    static String formatWindowSpecification(WindowSpecification windowSpecification) {
        List<String> parts = new ArrayList<>();

        if (windowSpecification.getExistingWindowName().isPresent()) {
            parts.add(formatExpression(windowSpecification.getExistingWindowName().get()));
        }
        if (!windowSpecification.getPartitionBy().isEmpty()) {
            parts.add("PARTITION BY " + windowSpecification.getPartitionBy().stream()
                    .map(ExpressionFormatter::formatExpression).collect(joining(", ")));
        }
        if (windowSpecification.getOrderBy().isPresent()) {
            parts.add(formatOrderBy(windowSpecification.getOrderBy().get()));
        }
        if (windowSpecification.getFrame().isPresent()) {
            parts.add(formatFrame(windowSpecification.getFrame().get()));
        }

        return '(' + Joiner.on(' ').join(parts) + ')';
    }

    private static String formatFrame(WindowFrame windowFrame) {
        StringBuilder builder = new StringBuilder();

        builder.append(windowFrame.getType().toString()).append(' ');

        if (windowFrame.getEnd().isPresent()) {
            builder.append("BETWEEN ").append(formatFrameBound(windowFrame.getStart())).append(" AND ")
                    .append(formatFrameBound(windowFrame.getEnd().get()));
        } else {
            builder.append(formatFrameBound(windowFrame.getStart()));
        }

        return builder.toString();
    }

    private static String formatFrameBound(FrameBound frameBound) {
        switch (frameBound.getType()) {
            case UNBOUNDED_PRECEDING:
                return "UNBOUNDED PRECEDING";
            case PRECEDING:
                return formatExpression(frameBound.getValue().get()) + " PRECEDING";
            case CURRENT_ROW:
                return "CURRENT ROW";
            case FOLLOWING:
                return formatExpression(frameBound.getValue().get()) + " FOLLOWING";
            case UNBOUNDED_FOLLOWING:
                return "UNBOUNDED FOLLOWING";
        }
        throw new IllegalArgumentException("unhandled type: " + frameBound.getType());
    }

    static String formatGroupBy(List<Expression> groupingExpressions) {
        ImmutableList.Builder<String> resultStrings = ImmutableList.builder();

        for (Expression groupingExpression : groupingExpressions) {
            resultStrings.add(formatExpression(groupingExpression));
        }
        return Joiner.on(", ").join(resultStrings.build());
    }

    private static boolean isAsciiPrintable(int codePoint) {
        return codePoint >= 0x20 && codePoint < 0x7F;
    }

    private static String formatGroupingSet(List<Expression> groupingSet) {
        return format("(%s)",
                Joiner.on(", ").join(groupingSet.stream().map(ExpressionFormatter::formatExpression).iterator()));
    }

    private static Function<SortItem, String> sortItemFormatterFunction() {
        return input -> {
            StringBuilder builder = new StringBuilder();

            builder.append(formatExpression(input.getSortKey()));

            switch (input.getOrdering()) {
                case ASCENDING:
                    builder.append(" ASC");
                    break;
                case DESCENDING:
                    builder.append(" DESC");
                    break;
                default:
                    throw new UnsupportedOperationException("unknown ordering: " + input.getOrdering());
            }

            switch (input.getNullOrdering()) {
                case FIRST:
                    builder.append(" NULLS FIRST");
                    break;
                case LAST:
                    builder.append(" NULLS LAST");
                    break;
                case UNDEFINED:
                    // no op
                    break;
                default:
                    throw new UnsupportedOperationException("unknown null ordering: " + input.getNullOrdering());
            }

            return builder.toString();
        };
    }
}
