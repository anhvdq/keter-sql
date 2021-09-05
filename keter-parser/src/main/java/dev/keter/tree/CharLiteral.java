package dev.keter.tree;

import com.google.common.base.CharMatcher;

import java.util.Objects;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

public class CharLiteral extends Literal {
    private final String value;

    public CharLiteral(String value) {
        this(null, value);
    }

    public CharLiteral(NodeLocation location, String value) {
        super(location);
        requireNonNull(value, "value is null");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitCharLiteral(this, context);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharLiteral that = (CharLiteral) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean shallowEquals(Node other) {
        if (!sameClass(this, other)) {
            return false;
        }

        return Objects.equals(value, ((CharLiteral) other).value);
    }
}
