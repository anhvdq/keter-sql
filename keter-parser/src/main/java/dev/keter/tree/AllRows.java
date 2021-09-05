package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class AllRows extends Expression {
    public AllRows() {
        this(null);
    }

    public AllRows(NodeLocation location) {
        super(location);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitAllRows(this, context);
    }

    @Override
    public List<? extends Node> getChildren() {
        return ImmutableList.of();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        return (o != null) && (getClass() == o.getClass());
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean shallowEquals(Node other) {
        return sameClass(this, other);
    }
}
