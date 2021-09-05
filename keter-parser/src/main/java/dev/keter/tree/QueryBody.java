package dev.keter.tree;

public abstract class QueryBody extends Relation {
    protected QueryBody(NodeLocation location) {
        super(location);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitQueryBody(this, context);
    }
}
