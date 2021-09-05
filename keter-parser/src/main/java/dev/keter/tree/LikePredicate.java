package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

public class LikePredicate extends Predicate {
    private final Expression value;
    private final Expression pattern;
    private final Expression escape;

    public LikePredicate(NodeLocation location, Expression value, Expression pattern, Expression escape) {
        super(location);
        requireNonNull(value, "value is null");
        requireNonNull(pattern, "pattern is null");

        this.value = value;
        this.pattern = pattern;
        this.escape = escape;
    }

    public Expression getValue() {
        return value;
    }

    public Expression getPattern() {
        return pattern;
    }

    public Optional<Expression> getEscape() {
        return Optional.ofNullable(escape);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitLikePredicate(this, context);
    }

    @Override
    public List<Node> getChildren() {
        ImmutableList.Builder<Node> result = ImmutableList.<Node>builder()
                .add(value)
                .add(pattern);

        Optional.ofNullable(escape).ifPresent(result::add);

        return result.build();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        LikePredicate that = (LikePredicate) o;
        return Objects.equals(value, that.value) &&
                Objects.equals(pattern, that.pattern) &&
                Objects.equals(escape, that.escape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, pattern, escape);
    }

    @Override
    public boolean shallowEquals(Node other) {
        return sameClass(this, other);
    }
}
