package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

public class TryExpression extends Expression {
    private final Expression innerExpression;

    public TryExpression(Expression innerExpression) {
        this(null, innerExpression);
    }

    public TryExpression(NodeLocation location, Expression innerExpression) {
        super(location);
        this.innerExpression = requireNonNull(innerExpression, "innerExpression is null");
    }

    public Expression getInnerExpression() {
        return innerExpression;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitTryExpression(this, context);
    }

    @Override
    public List<Node> getChildren() {
        return ImmutableList.of(innerExpression);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        TryExpression o = (TryExpression) obj;
        return Objects.equals(innerExpression, o.innerExpression);
    }

    @Override
    public int hashCode() {
        return Objects.hash(innerExpression);
    }

    @Override
    public boolean shallowEquals(Node other) {
        return sameClass(this, other);
    }
}
