package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;

/**
 * NULLIF(V1,V2): CASE WHEN V1=V2 THEN NULL ELSE V1 END
 */
public class NullIfExpression
        extends Expression {
    private final Expression first;
    private final Expression second;

    public NullIfExpression(Expression first, Expression second) {
        this(null, first, second);
    }

    public NullIfExpression(NodeLocation location, Expression first, Expression second) {
        super(location);
        this.first = first;
        this.second = second;
    }

    public Expression getFirst() {
        return first;
    }

    public Expression getSecond() {
        return second;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitNullIfExpression(this, context);
    }

    @Override
    public List<Node> getChildren() {
        return ImmutableList.of(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        NullIfExpression that = (NullIfExpression) o;
        return Objects.equals(first, that.first) &&
                Objects.equals(second, that.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public boolean shallowEquals(Node other) {
        return sameClass(this, other);
    }
}
