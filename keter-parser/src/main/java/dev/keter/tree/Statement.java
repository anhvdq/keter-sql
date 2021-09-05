package dev.keter.tree;

public abstract class Statement extends Node {
    protected Statement(NodeLocation location) {
        super(location);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitStatement(this, context);
    }
}
