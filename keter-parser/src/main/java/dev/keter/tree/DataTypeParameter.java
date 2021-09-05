package dev.keter.tree;

public abstract class DataTypeParameter
        extends Node {
    protected DataTypeParameter(NodeLocation location) {
        super(location);
    }

    @Override
    protected <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitDataTypeParameter(this, context);
    }
}
