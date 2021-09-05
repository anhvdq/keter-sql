package dev.keter.tree;

public abstract class Relation extends Node {
    protected Relation(NodeLocation location) {
        super(location);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitRelation(this, context);
    }
}
