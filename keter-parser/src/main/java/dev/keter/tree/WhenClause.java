package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;

public class WhenClause extends Expression {
    private final Expression operand;
    private final Expression result;

    public WhenClause(Expression operand, Expression result) {
        this(null, operand, result);
    }

    public WhenClause(NodeLocation location, Expression operand, Expression result) {
        super(location);
        this.operand = operand;
        this.result = result;
    }

    public Expression getOperand() {
        return operand;
    }

    public Expression getResult() {
        return result;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitWhenClause(this, context);
    }

    @Override
    public List<Node> getChildren() {
        return ImmutableList.of(operand, result);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        WhenClause that = (WhenClause) o;
        return Objects.equals(operand, that.operand) &&
                Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operand, result);
    }

    @Override
    public boolean shallowEquals(Node other) {
        return sameClass(this, other);
    }
}
