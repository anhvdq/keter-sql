package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;

public abstract class Predicate extends Expression {

    protected Predicate(NodeLocation location) {
        super(location);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitPredicate(this, context);
    }

    @Override
    public List<Node> getChildren() {
        return ImmutableList.of();
    }
}
