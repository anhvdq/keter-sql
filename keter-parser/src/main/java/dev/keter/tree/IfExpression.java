package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

/**
 * IF(v1,v2[,v3]): CASE WHEN v1 THEN v2 [ELSE v3] END
 */
public class IfExpression extends Expression {
    private final Expression condition;
    private final Expression trueValue;
    private final Expression falseValue;

    public IfExpression(Expression condition, Expression trueValue, Expression falseValue) {
        this(null, condition, trueValue, falseValue);
    }

    public IfExpression(NodeLocation location, Expression condition, Expression trueValue, Expression falseValue) {
        super(location);
        this.condition = requireNonNull(condition, "condition is null");
        this.trueValue = requireNonNull(trueValue, "trueValue is null");
        this.falseValue = falseValue;
    }

    public Expression getCondition() {
        return condition;
    }

    public Expression getTrueValue() {
        return trueValue;
    }

    public Optional<Expression> getFalseValue() {
        return Optional.ofNullable(falseValue);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitIfExpression(this, context);
    }

    @Override
    public List<Node> getChildren() {
        ImmutableList.Builder<Node> nodes = ImmutableList.builder();
        Optional.ofNullable(falseValue).ifPresent(nodes::add);
        return nodes.add(condition)
                .add(trueValue)
                .build();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        IfExpression o = (IfExpression) obj;
        return Objects.equals(condition, o.condition) &&
                Objects.equals(trueValue, o.trueValue) &&
                Objects.equals(falseValue, o.falseValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition, trueValue, falseValue);
    }

    @Override
    public boolean shallowEquals(Node other) {
        return sameClass(this, other);
    }
}
