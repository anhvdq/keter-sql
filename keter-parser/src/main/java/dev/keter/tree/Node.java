package dev.keter.tree;

import java.util.List;
import java.util.Optional;

public abstract class Node {
    private final NodeLocation location;

    protected Node(NodeLocation location) {
        this.location = location;
    }

    /**
     * Accessible for {@link AstVisitor}, use
     * {@link AstVisitor#process(Node, Object)} instead.
     */
    protected <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitNode(this, context);
    }

    public Optional<NodeLocation> getLocation() {
        return Optional.ofNullable(location);
    }

    public abstract List<? extends Node> getChildren();

    // Force subclasses to have a proper equals and hashcode implementation
    @Override
    public abstract int hashCode();

    @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract String toString();

    /**
     * Compare with another node by considering internal state excluding any Node
     * returned by getChildren()
     */
    public boolean shallowEquals(Node other) {
        throw new UnsupportedOperationException("not yet implemented: " + getClass().getName());
    }

    static boolean sameClass(Node left, Node right) {
        if (left == right) {
            return true;
        }

        return left.getClass() == right.getClass();
    }
}
