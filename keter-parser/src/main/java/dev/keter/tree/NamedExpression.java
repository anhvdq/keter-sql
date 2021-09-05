package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

public class NamedExpression extends Expression {
    private final Identifier alias;
    private final Expression expression;

    public NamedExpression(Expression expression) {
        this(null, expression, null);
    }

    public NamedExpression(Expression expression, Identifier alias) {
        this(null, expression, alias);
    }

    public NamedExpression(NodeLocation location, Expression expression, Identifier alias) {
        super(location);

        this.expression = requireNonNull(expression, "expression is null");
        this.alias = alias;
    }

    public Optional<Identifier> getAlias() {
        return Optional.ofNullable(alias);
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NamedExpression other = (NamedExpression) obj;
        return Objects.equals(this.alias, other.alias) && Objects.equals(this.expression, other.expression);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias, expression);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitNamedExpression(this, context);
    }

    @Override
    public List<Node> getChildren() {
        return ImmutableList.of(expression);
    }

    @Override
    public boolean shallowEquals(Node other) {
        if (!sameClass(this, other)) {
            return false;
        }

        return alias.equals(((NamedExpression) other).alias);
    }
}
