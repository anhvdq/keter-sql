package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class AllColumns extends Expression {
    private final QualifiedName qualifiedName;

    public AllColumns(QualifiedName aliases) {
        this(null, aliases);
    }

    public AllColumns(NodeLocation location, QualifiedName qualifiedName) {
        super(location);
        this.qualifiedName = qualifiedName;
    }

    public Optional<QualifiedName> getQualifiedName() {
        return Optional.ofNullable(qualifiedName);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitAllColumns(this, context);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AllColumns other = (AllColumns) o;
        return Objects.equals(qualifiedName, other.qualifiedName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qualifiedName);
    }

    @Override
    public List<Node> getChildren() {
        return ImmutableList.of();
    }

    @Override
    public boolean shallowEquals(Node other) {
        if (!sameClass(this, other)) {
            return false;
        }

        return qualifiedName.equals(((AllColumns) other).qualifiedName);
    }
}
