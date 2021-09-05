package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;

public abstract class Literal extends Expression {
    protected Literal(NodeLocation location) {
        super(location);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitLiteral(this, context);
    }

    @Override
    public List<Node> getChildren() {
        return ImmutableList.of();
    }
}
