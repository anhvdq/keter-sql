package dev.keter.analyzer;

import com.google.common.collect.ImmutableList;
import dev.keter.plan.AnalyzeNode;
import dev.keter.tree.*;

import java.util.List;
import java.util.stream.Collectors;

import static dev.keter.spi.StandardErrorCode.NOT_SUPPORTED;
import static dev.keter.spi.type.BooleanType.BOOLEAN;
import static dev.keter.spi.type.DoubleType.DOUBLE;
import static dev.keter.spi.type.LongType.LONG;
import static dev.keter.spi.type.StringType.STRING;
import static dev.keter.spi.type.TimestampType.TIMESTAMP;
import static dev.keter.spi.type.UnknownType.UNKNOWN;
import static dev.keter.util.SemanticExceptions.semanticException;
import static java.lang.String.format;

public class FunctionAnalyzer {
    public AnalyzeNode analyze(Expression expression) {
        Visitor visitor = new Visitor();
        return visitor.process(expression);
    }

    private class Visitor extends AstVisitor<AnalyzeNode, Void> {

        public Visitor() {
        }

        @Override
        protected AnalyzeNode visitNode(Node node, Void context) {
            throw semanticException(NOT_SUPPORTED, node, "not yet implemented: %s", node.getClass().getName());
        }

        @Override
        protected AnalyzeNode visitExpression(Expression node, Void context) {
            throw semanticException(NOT_SUPPORTED, node, "not yet implemented: %s", node.getClass().getName());
        }

        @Override
        protected AnalyzeNode visitNamedExpression(NamedExpression node, Void context) {
            AnalyzeNode expression = process(node.getExpression());
            if (node.getAlias().isPresent()) {
                return new AnalyzeNode(format("%s AS %s", expression.getName(),
                        node.getAlias().get().getValue()), expression.getValue().orElse(null),
                        expression.getReturnType(), expression.getParams());
            } else {
                return expression;
            }
        }

        @Override
        protected AnalyzeNode visitIdentifier(Identifier node, Void context) {
            //TODO: This should check relation data type from metadata
            return new AnalyzeNode(node.getClass().getSimpleName(), node.toString(), UNKNOWN, ImmutableList.of());
        }

        @Override
        protected AnalyzeNode visitLongLiteral(LongLiteral node, Void context) {
            return new AnalyzeNode(node.getClass().getSimpleName(), node.toString(), LONG, ImmutableList.of());
        }

        @Override
        protected AnalyzeNode visitNotExpression(NotExpression node, Void context) {
            return new AnalyzeNode("NOT {exp}", null, BOOLEAN, ImmutableList.of(process(node.getValue())));
        }

        @Override
        protected AnalyzeNode visitLogicalBinaryExpression(LogicalBinaryExpression node, Void context) {
            return new AnalyzeNode(format("{left} %s {right}", node.getOperator()), null,
                    BOOLEAN, ImmutableList.of(process(node.getLeft()), process(node.getRight())));
        }

        @Override
        protected AnalyzeNode visitArithmeticUnary(ArithmeticUnaryExpression node, Void context) {
            //TODO: This should check sign to determine data type
            return new AnalyzeNode(format("%s {exp}", node.getSign()), null,
                    DOUBLE, ImmutableList.of(process(node.getValue())));
        }

        @Override
        protected AnalyzeNode visitArithmeticBinary(ArithmeticBinaryExpression node, Void context) {
            //TODO: This should check operator & expression type to determine data type
            return new AnalyzeNode(format("{left} %s {right}", node.getOperator()), null,
                    DOUBLE, ImmutableList.of(process(node.getLeft()), process(node.getRight())));
        }

        @Override
        protected AnalyzeNode visitComparisonExpression(ComparisonExpression node, Void context) {
            return new AnalyzeNode(format("{left} %s {right}", node.getOperator()), null,
                    BOOLEAN, ImmutableList.of(process(node.getLeft()), process(node.getRight())));
        }

        @Override
        protected AnalyzeNode visitCurrentTime(CurrentTime node, Void context) {
            return new AnalyzeNode("current_time()", null,
                    TIMESTAMP, ImmutableList.of());
        }

        @Override
        protected AnalyzeNode visitSimpleCaseExpression(SimpleCaseExpression node, Void context) {
            //TODO: Implement
            throw semanticException(NOT_SUPPORTED, node, "not yet implemented: %s", node.getClass().getName());
        }

        @Override
        protected AnalyzeNode visitSearchedCaseExpression(SearchedCaseExpression node, Void context) {
            //TODO: Implement
            throw semanticException(NOT_SUPPORTED, node, "not yet implemented: %s", node.getClass().getName());
        }

        @Override
        protected AnalyzeNode visitWhenClause(WhenClause node, Void context) {
            //TODO: Implement
            throw semanticException(NOT_SUPPORTED, node, "not yet implemented: %s", node.getClass().getName());
        }

        @Override
        protected AnalyzeNode visitCast(Cast node, Void context) {
            //TODO: Implement
            throw semanticException(NOT_SUPPORTED, node, "not yet implemented: %s", node.getClass().getName());
        }

        @Override
        protected AnalyzeNode visitNullLiteral(NullLiteral node, Void context) {
            return new AnalyzeNode(node.getClass().getSimpleName(), node.toString(), UNKNOWN, ImmutableList.of());
        }

        @Override
        protected AnalyzeNode visitStringLiteral(StringLiteral node, Void context) {
            return new AnalyzeNode(node.getClass().getSimpleName(), node.toString(), STRING, ImmutableList.of());
        }

        @Override
        protected AnalyzeNode visitIntervalLiteral(IntervalLiteral node, Void context) {
            //TODO: Implement
            throw semanticException(NOT_SUPPORTED, node, "not yet implemented: %s", node.getClass().getName());
        }

        @Override
        protected AnalyzeNode visitBooleanLiteral(BooleanLiteral node, Void context) {
            return new AnalyzeNode(node.getClass().getSimpleName(), node.toString(), BOOLEAN, ImmutableList.of());
        }

        @Override
        protected AnalyzeNode visitDoubleLiteral(DoubleLiteral node, Void context) {
            return new AnalyzeNode(node.getClass().getSimpleName(), node.toString(), DOUBLE, ImmutableList.of());
        }

        @Override
        protected AnalyzeNode visitDecimalLiteral(DecimalLiteral node, Void context) {
            return new AnalyzeNode(node.getClass().getSimpleName(), node.toString(), DOUBLE, ImmutableList.of());
        }

        @Override
        protected AnalyzeNode visitTimestampLiteral(TimestampLiteral node, Void context) {
            return new AnalyzeNode(node.getClass().getSimpleName(), node.toString(), TIMESTAMP, ImmutableList.of());
        }

        @Override
        protected AnalyzeNode visitTimeLiteral(TimeLiteral node, Void context) {
            return new AnalyzeNode(node.getClass().getSimpleName(), node.toString(), TIMESTAMP, ImmutableList.of());
        }

        @Override
        protected AnalyzeNode visitGenericLiteral(GenericLiteral node, Void context) {
            return new AnalyzeNode(node.getClass().getSimpleName(), node.toString(), UNKNOWN, ImmutableList.of());
        }

        @Override
        protected AnalyzeNode visitCharLiteral(CharLiteral node, Void context) {
            return new AnalyzeNode(node.getClass().getSimpleName(), node.toString(), STRING, ImmutableList.of());
        }

        @Override
        protected AnalyzeNode visitIntervalDataType(IntervalDayTimeDataType node, Void context) {
            //TODO: Implement
            throw semanticException(NOT_SUPPORTED, node, "not yet implemented: %s", node.getClass().getName());
        }

        @Override
        protected AnalyzeNode visitDateTimeType(DateTimeDataType node, Void context) {
            //TODO: Implement
            throw semanticException(NOT_SUPPORTED, node, "not yet implemented: %s", node.getClass().getName());
        }

        @Override
        protected AnalyzeNode visitDataTypeParameter(DataTypeParameter node, Void context) {
            //TODO: Implement
            throw semanticException(NOT_SUPPORTED, node, "not yet implemented: %s", node.getClass().getName());
        }

        @Override
        protected AnalyzeNode visitFunctionCall(FunctionCall node, Void context) {
            //TODO: This should validate function by metadata
            List<AnalyzeNode> argNodes = node.getArguments().stream()
                    .map(this::process)
                    .collect(Collectors.toList());

            String argType = argNodes.stream().map(argNode -> argNode.getReturnType().name())
                    .collect(Collectors.joining(", "));

            return new AnalyzeNode(format("%s(%s)", node.getName(), argType), null,
                    UNKNOWN, argNodes);
        }

        @Override
        protected AnalyzeNode visitCoalesceExpression(CoalesceExpression node, Void context) {
            //TODO: This should calculate data type by params type
            List<AnalyzeNode> argNodes = node.getOperands().stream()
                    .map(this::process)
                    .collect(Collectors.toList());

            String argType = argNodes.stream().map(argNode -> argNode.getReturnType().name())
                    .collect(Collectors.joining(", "));

            return new AnalyzeNode(format("coalesce(%s)", argType), null,
                    UNKNOWN, argNodes);
        }

        @Override
        protected AnalyzeNode visitInPredicate(InPredicate node, Void context) {
            //TODO: Implement
            throw semanticException(NOT_SUPPORTED, node, "not yet implemented: %s", node.getClass().getName());
        }

        @Override
        protected AnalyzeNode visitInListExpression(InListExpression node, Void context) {
            //TODO: Implement
            throw semanticException(NOT_SUPPORTED, node, "not yet implemented: %s", node.getClass().getName());
        }

        @Override
        protected AnalyzeNode visitIsNotNullPredicate(IsNotNullPredicate node, Void context) {
            return new AnalyzeNode("{exp} IS NOT NULL", null, BOOLEAN, ImmutableList.of(process(node.getValue())));
        }

        @Override
        protected AnalyzeNode visitIsNullPredicate(IsNullPredicate node, Void context) {
            return new AnalyzeNode("{exp} IS NULL", null, BOOLEAN, ImmutableList.of(process(node.getValue())));
        }

        @Override
        protected AnalyzeNode visitLikePredicate(LikePredicate node, Void context) {
            return new AnalyzeNode("{exp} LIKE {pattern}", null,
                    BOOLEAN, ImmutableList.of(process(node.getValue()), process(node.getPattern())));
        }
    }
}
