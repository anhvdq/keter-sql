package dev.keter.tree;

import dev.keter.ExpressionFormatter;

public abstract class Expression extends Node {
    protected Expression(NodeLocation location) {
        super(location);
    }

    /**
     * Accessible for {@link AstVisitor}, use
     * {@link AstVisitor#process(Node, Object)} instead.
     */
    @Override
    protected <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitExpression(this, context);
    }

    @Override
    public final String toString() {
        return ExpressionFormatter.formatExpression(this);
    }
}
