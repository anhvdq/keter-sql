package dev.keter;

import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import dev.keter.tree.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.collect.ImmutableList.toImmutableList;
import static com.google.common.collect.Iterables.getOnlyElement;
import static com.google.common.collect.Iterables.transform;
import static dev.keter.ExpressionFormatter.*;
import static java.lang.String.format;
import static java.util.stream.Collectors.joining;

public final class SqlFormatter {
    private static final String INDENT = "   ";

    private SqlFormatter() {
    }

    public static String formatSql(Node root) {
        StringBuilder builder = new StringBuilder();
        new Formatter(builder).process(root, 0);
        return builder.toString();
    }

    static String formatName(QualifiedName name) {
        return name.getOriginalParts().stream()
                .map(ExpressionFormatter::formatExpression)
                .collect(joining("."));
    }

    private static class Formatter
            extends AstVisitor<Void, Integer> {
        private final StringBuilder builder;

        public Formatter(StringBuilder builder) {
            this.builder = builder;
        }

        @Override
        protected Void visitNode(Node node, Integer indent) {
            throw new UnsupportedOperationException("not yet implemented: " + node);
        }

        @Override
        protected Void visitExpression(Expression node, Integer indent) {
            checkArgument(indent == 0, "visitExpression should only be called at root");
            builder.append(formatExpression(node));
            return null;
        }

        @Override
        protected Void visitQuery(Query node, Integer indent) {
            if (node.getWith().isPresent()) {
                With with = node.getWith().get();
                append(indent, "WITH");
                if (with.isRecursive()) {
                    builder.append(" RECURSIVE");
                }
                builder.append("\n  ");
                Iterator<NamedQuery> queries = with.getQueries().iterator();
                while (queries.hasNext()) {
                    NamedQuery query = queries.next();
                    append(indent, formatExpression(query.getName()));
                    query.getColumnNames().ifPresent(columnNames -> appendAliasColumns(builder, columnNames));
                    builder.append(" AS ");
                    process(new TableSubquery(query.getQuery()), indent);
                    builder.append('\n');
                    if (queries.hasNext()) {
                        builder.append(", ");
                    }
                }
            }

            processRelation(node.getQueryBody(), indent);

            if (node.getOrderBy().isPresent()) {
                process(node.getOrderBy().get(), indent);
            }

            if (node.getOffset().isPresent()) {
                process(node.getOffset().get(), indent);
            }

            if (node.getLimit().isPresent()) {
                process(node.getLimit().get(), indent);
            }
            return null;
        }

        @Override
        protected Void visitQuerySpecification(QuerySpecification node, Integer indent) {
            process(node.getSelect(), indent);

            if (node.getFrom().isPresent()) {
                append(indent, "FROM");
                builder.append('\n');
                append(indent, "  ");
                process(node.getFrom().get(), indent);
            }

            builder.append('\n');

            if (node.getWhere().isPresent()) {
                append(indent, "WHERE " + formatExpression(node.getWhere().get()))
                        .append('\n');
            }

            if (node.getGroupBy().isPresent()) {
                append(indent, "GROUP BY " + (node.getGroupBy().get().isDistinct() ? " DISTINCT " : "") + formatGroupBy(node.getGroupBy().get().getGroupingExpressions())).append('\n');
            }

            if (node.getHaving().isPresent()) {
                append(indent, "HAVING " + formatExpression(node.getHaving().get()))
                        .append('\n');
            }

            if (!node.getWindows().isEmpty()) {
                append(indent, "WINDOW");
                formatDefinitionList(node.getWindows().stream()
                        .map(definition -> formatExpression(definition.getName()) + " AS " + formatWindowSpecification(definition.getWindow()))
                        .collect(toImmutableList()), indent + 1);
            }

            if (node.getOrderBy().isPresent()) {
                process(node.getOrderBy().get(), indent);
            }

            if (node.getOffset().isPresent()) {
                process(node.getOffset().get(), indent);
            }

            if (node.getLimit().isPresent()) {
                process(node.getLimit().get(), indent);
            }
            return null;
        }

        @Override
        protected Void visitOrderBy(OrderBy node, Integer indent) {
            append(indent, formatOrderBy(node))
                    .append('\n');
            return null;
        }

        @Override
        protected Void visitOffset(Offset node, Integer indent) {
            append(indent, "OFFSET ")
                    .append(formatExpression(node.getRowCount()))
                    .append(" ROWS\n");
            return null;
        }

        @Override
        protected Void visitLimit(Limit node, Integer indent) {
            append(indent, "LIMIT ")
                    .append(formatExpression(node.getRowCount()))
                    .append('\n');
            return null;
        }

        @Override
        protected Void visitSelect(Select node, Integer indent) {
            append(indent, "SELECT");
            if (node.isDistinct()) {
                builder.append(" DISTINCT");
            }

            if (node.getSelectItems().size() > 1) {
                boolean first = true;
                for (NamedExpression item : node.getSelectItems()) {
                    builder.append("\n")
                            .append(indentString(indent))
                            .append(first ? "  " : ", ");

                    process(item, indent);
                    first = false;
                }
            } else {
                builder.append(' ');
                process(getOnlyElement(node.getSelectItems()), indent);
            }

            builder.append('\n');

            return null;
        }

        @Override
        protected Void visitAllColumns(AllColumns node, Integer context) {
            node.getQualifiedName().ifPresent(value -> builder
                    .append(value)
                    .append("."));
            builder.append("*");

            return null;
        }

        @Override
        protected Void visitJoin(Join node, Integer indent) {
            JoinCriteria criteria = node.getCriteria().orElse(null);
            String type = node.getType().toString();
            if (criteria instanceof NaturalJoin) {
                type = "NATURAL " + type;
            }

            if (node.getType() != Join.Type.IMPLICIT) {
                builder.append('(');
            }
            process(node.getLeft(), indent);

            builder.append('\n');
            if (node.getType() == Join.Type.IMPLICIT) {
                append(indent, ", ");
            } else {
                append(indent, type).append(" JOIN ");
            }

            process(node.getRight(), indent);

            if (node.getType() != Join.Type.CROSS && node.getType() != Join.Type.IMPLICIT) {
                if (criteria instanceof JoinUsing) {
                    JoinUsing using = (JoinUsing) criteria;
                    builder.append(" USING (")
                            .append(Joiner.on(", ").join(using.getColumns()))
                            .append(")");
                } else if (criteria instanceof JoinOn) {
                    JoinOn on = (JoinOn) criteria;
                    builder.append(" ON ")
                            .append(formatExpression(on.getExpression()));
                } else if (!(criteria instanceof NaturalJoin)) {
                    throw new UnsupportedOperationException("unknown join criteria: " + criteria);
                }
            }

            if (node.getType() != Join.Type.IMPLICIT) {
                builder.append(")");
            }

            return null;
        }

        private void processRelation(Relation relation, Integer indent) {
            if (relation instanceof Table) {
                builder.append("TABLE ")
                        .append(((Table) relation).getName())
                        .append('\n');
            } else {
                process(relation, indent);
            }
        }

        private StringBuilder append(int indent, String value) {
            return builder.append(indentString(indent))
                    .append(value);
        }

        private static String indentString(int indent) {
            return Strings.repeat(INDENT, indent);
        }

        private void formatDefinitionList(List<String> elements, int indent) {
            if (elements.size() == 1) {
                builder.append(" ")
                        .append(getOnlyElement(elements))
                        .append("\n");
            } else {
                builder.append("\n");
                for (int i = 0; i < elements.size() - 1; i++) {
                    append(indent, elements.get(i))
                            .append(",\n");
                }
                append(indent, elements.get(elements.size() - 1))
                        .append("\n");
            }
        }
    }

    private static void appendAliasColumns(StringBuilder builder, List<Identifier> columns) {
        if ((columns != null) && (!columns.isEmpty())) {
            String formattedColumns = columns.stream()
                    .map(ExpressionFormatter::formatExpression)
                    .collect(Collectors.joining(", "));

            builder.append(" (")
                    .append(formattedColumns)
                    .append(')');
        }
    }
}
