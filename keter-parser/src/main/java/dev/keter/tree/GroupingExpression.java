package dev.keter.tree;

public abstract class GroupingExpression extends Expression {
    protected GroupingExpression(NodeLocation location) {
        super(location);
    }

    @Override
    protected <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitGroupingExpression(this, context);
    }
}
