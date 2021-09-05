package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

public class ExistsPredicate extends Expression {
    private final Expression subquery;

    public ExistsPredicate(Expression subquery) {
        this(null, subquery);
    }

    public ExistsPredicate(NodeLocation location, Expression subquery) {
        super(location);
        requireNonNull(subquery, "subquery is null");
        this.subquery = subquery;
    }

    public Expression getSubquery() {
        return subquery;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitExists(this, context);
    }

    @Override
    public List<Node> getChildren() {
        return ImmutableList.of(subquery);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ExistsPredicate that = (ExistsPredicate) o;
        return Objects.equals(subquery, that.subquery);
    }

    @Override
    public int hashCode() {
        return subquery.hashCode();
    }

    @Override
    public boolean shallowEquals(Node other) {
        return sameClass(this, other);
    }
}
