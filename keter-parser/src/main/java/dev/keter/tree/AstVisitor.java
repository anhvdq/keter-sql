package dev.keter.tree;

import javax.annotation.Nullable;

public abstract class AstVisitor<R, C> {
    public R process(Node node) {
        return process(node, null);
    }

    public R process(Node node, @Nullable C context) {
        return node.accept(this, context);
    }

    protected R visitNode(Node node, C context) {
        return null;
    }

    protected R visitStatement(Statement node, C context) {
        return visitNode(node, context);
    }

    protected R visitExpression(Expression node, C context) {
        return visitNode(node, context);
    }

    protected R visitIdentifier(Identifier node, C context) {
        return visitExpression(node, context);
    }

    protected R visitNamedQuery(NamedQuery node, C context) {
        return visitNode(node, context);
    }

    protected R visitWith(With node, C context) {
        return visitNode(node, context);
    }

    protected R visitRelation(Relation node, C context) {
        return visitNode(node, context);
    }

    protected R visitQueryBody(QueryBody node, C context) {
        return visitRelation(node, context);
    }

    protected R visitSortItem(SortItem node, C context) {
        return visitNode(node, context);
    }

    protected R visitOrderBy(OrderBy node, C context) {
        return visitNode(node, context);
    }

    protected R visitOffset(Offset node, C context) {
        return visitNode(node, context);
    }

    protected R visitParameter(Parameter node, C context) {
        return visitExpression(node, context);
    }

    protected R visitLiteral(Literal node, C context) {
        return visitExpression(node, context);
    }

    protected R visitPredicate(Predicate node, C context) {
        return visitExpression(node, context);
    }

    protected R visitLongLiteral(LongLiteral node, C context) {
        return visitLiteral(node, context);
    }

    protected R visitLimit(Limit node, C context) {
        return visitNode(node, context);
    }

    protected R visitAllRows(AllRows node, C context) {
        return visitExpression(node, context);
    }

    protected R visitQuery(Query node, C context) {
        return visitStatement(node, context);
    }

    protected R visitNamedExpression(NamedExpression node, C context) {
        return visitNode(node, context);
    }

    protected R visitSelect(Select node, C context) {
        return visitNode(node, context);
    }

    protected R visitGroupBy(GroupBy node, C context) {
        return visitNode(node, context);
    }

    protected R visitFrameBound(FrameBound node, C context) {
        return visitNode(node, context);
    }

    protected R visitGroupingExpression(GroupingExpression node, C context) {
        return visitExpression(node, context);
    }

    protected R visitWindowFrame(WindowFrame node, C context) {
        return visitNode(node, context);
    }

    protected R visitWindowSpecification(WindowSpecification node, C context) {
        return visitNode(node, context);
    }

    protected R visitQuerySpecification(QuerySpecification node, C context) {
        return visitQueryBody(node, context);
    }

    protected R visitNamedWindow(NamedWindow node, C context) {
        return visitNode(node, context);
    }

    protected R visitJoin(Join node, C context) {
        return visitRelation(node, context);
    }

    protected R visitNotExpression(NotExpression node, C context) {
        return visitExpression(node, context);
    }

    protected R visitLogicalBinaryExpression(LogicalBinaryExpression node, C context) {
        return visitExpression(node, context);
    }

    protected R visitSubqueryExpression(SubqueryExpression node, C context) {
        return visitExpression(node, context);
    }

    protected R visitExists(ExistsPredicate node, C context) {
        return visitExpression(node, context);
    }

    protected R visitArithmeticUnary(ArithmeticUnaryExpression node, C context) {
        return visitExpression(node, context);
    }

    protected R visitArithmeticBinary(ArithmeticBinaryExpression node, C context) {
        return visitExpression(node, context);
    }

    protected R visitComparisonExpression(ComparisonExpression node, C context) {
        return visitExpression(node, context);
    }

    protected R visitCurrentTime(CurrentTime node, C context) {
        return visitExpression(node, context);
    }

    protected R visitSimpleCaseExpression(SimpleCaseExpression node, C context) {
        return visitExpression(node, context);
    }

    protected R visitSearchedCaseExpression(SearchedCaseExpression node, C context) {
        return visitExpression(node, context);
    }

    protected R visitWhenClause(WhenClause node, C context) {
        return visitExpression(node, context);
    }

    protected R visitCast(Cast node, C context) {
        return visitExpression(node, context);
    }

    protected R visitNullLiteral(NullLiteral node, C context) {
        return visitLiteral(node, context);
    }

    protected R visitStringLiteral(StringLiteral node, C context) {
        return visitLiteral(node, context);
    }

    protected R visitIntervalLiteral(IntervalLiteral node, C context) {
        return visitLiteral(node, context);
    }

    protected R visitBooleanLiteral(BooleanLiteral node, C context) {
        return visitLiteral(node, context);
    }

    protected R visitDoubleLiteral(DoubleLiteral node, C context) {
        return visitLiteral(node, context);
    }

    protected R visitDecimalLiteral(DecimalLiteral node, C context) {
        return visitLiteral(node, context);
    }

    protected R visitTimestampLiteral(TimestampLiteral node, C context) {
        return visitLiteral(node, context);
    }

    protected R visitTimeLiteral(TimeLiteral node, C context) {
        return visitLiteral(node, context);
    }

    protected R visitGenericLiteral(GenericLiteral node, C context) {
        return visitLiteral(node, context);
    }

    protected R visitCharLiteral(CharLiteral node, C context) {
        return visitLiteral(node, context);
    }

    protected R visitAllColumns(AllColumns node, C context) {
        return visitExpression(node, context);
    }

    protected R visitDataType(DataType node, C context) {
        return visitExpression(node, context);
    }

    protected R visitIntervalDataType(IntervalDayTimeDataType node, C context) {
        return visitDataType(node, context);
    }

    protected R visitDateTimeType(DateTimeDataType node, C context) {
        return visitDataType(node, context);
    }

    protected R visitDataTypeParameter(DataTypeParameter node, C context) {
        return visitNode(node, context);
    }

    protected R visitProcessingMode(ProcessingMode node, C context) {
        return visitNode(node, context);
    }

    protected R visitFunctionCall(FunctionCall node, C context) {
        return visitExpression(node, context);
    }

    protected R visitWindowReference(WindowReference node, C context) {
        return visitNode(node, context);
    }

    protected R visitDereferenceExpression(DereferenceExpression node, C context) {
        return visitExpression(node, context);
    }

    protected R visitLambdaArgumentDeclaration(LambdaArgumentDeclaration node, C context) {
        return visitExpression(node, context);
    }

    protected R visitLambdaExpression(LambdaExpression node, C context) {
        return visitExpression(node, context);
    }

    protected R visitIfExpression(IfExpression node, C context) {
        return visitExpression(node, context);
    }

    protected R visitNullIfExpression(NullIfExpression node, C context) {
        return visitExpression(node, context);
    }

    protected R visitCoalesceExpression(CoalesceExpression node, C context) {
        return visitExpression(node, context);
    }

    protected R visitTryExpression(TryExpression node, C context) {
        return visitExpression(node, context);
    }

    protected R visitFormat(Format node, C context) {
        return visitExpression(node, context);
    }

    protected R visitTableSubquery(TableSubquery node, C context) {
        return visitQueryBody(node, context);
    }

    protected R visitTable(Table node, C context) {
        return visitQueryBody(node, context);
    }

    protected R visitAliasedRelation(AliasedRelation node, C context) {
        return visitRelation(node, context);
    }

    protected R visitBetweenPredicate(BetweenPredicate node, C context) {
        return visitPredicate(node, context);
    }

    protected R visitInPredicate(InPredicate node, C context) {
        return visitPredicate(node, context);
    }

    protected R visitInListExpression(InListExpression node, C context) {
        return visitExpression(node, context);
    }

    protected R visitIsNotNullPredicate(IsNotNullPredicate node, C context) {
        return visitPredicate(node, context);
    }

    protected R visitIsNullPredicate(IsNullPredicate node, C context) {
        return visitPredicate(node, context);
    }

    protected R visitLikePredicate(LikePredicate node, C context) {
        return visitPredicate(node, context);
    }
}
