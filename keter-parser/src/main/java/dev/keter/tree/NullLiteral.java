package dev.keter.tree;

public class NullLiteral extends Literal {
    public NullLiteral() {
        super(null);
    }

    public NullLiteral(NodeLocation location) {
        super(location);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitNullLiteral(this, context);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        return true;
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
