package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

import static com.google.common.base.Preconditions.checkArgument;
import static java.util.Locale.ENGLISH;
import static java.util.Objects.requireNonNull;

public class Identifier extends Expression {
    private static final Pattern NAME_PATTERN = Pattern.compile("([a-zA-Z0-9_])*");

    private final String value;
    private final boolean delimited;

    public Identifier(String value, boolean delimited) {
        this(null, value, delimited);
    }

    public Identifier(String value) {
        this(null, value, !NAME_PATTERN.matcher(value).matches());
    }

    public Identifier(NodeLocation location, String value, boolean delimited) {
        super(location);
        this.value = requireNonNull(value, "value is null");
        this.delimited = delimited;

        checkArgument(!value.isEmpty(), "value is empty");
        checkArgument(delimited || NAME_PATTERN.matcher(value).matches(), "value contains illegal characters: %s",
                value);
    }

    public String getValue() {
        return value;
    }

    public boolean isDelimited() {
        return delimited;
    }

    public String getCanonicalValue() {
        if (isDelimited()) {
            return value;
        }

        return value.toUpperCase(ENGLISH);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitIdentifier(this, context);
    }

    @Override
    public List<Node> getChildren() {
        return ImmutableList.of();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Identifier that = (Identifier) o;
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

        Identifier that = (Identifier) other;
        return Objects.equals(value, that.value) && delimited == that.delimited;
    }
}
