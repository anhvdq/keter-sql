package dev.keter.tree;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

public class StringLiteral extends Literal {
    private final String value;

    public StringLiteral(String value) {
        this(null, value);
    }

    public StringLiteral(NodeLocation location, String value) {
        super(location);
        requireNonNull(value, "value is null");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitStringLiteral(this, context);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        StringLiteral that = (StringLiteral) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean shallowEquals(Node other) {
        if (!sameClass(this, other)) {
            return false;
        }

        return Objects.equals(value, ((StringLiteral) other).value);
    }
}
