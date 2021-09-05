package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;

import static com.google.common.base.MoreObjects.toStringHelper;
import static java.util.Objects.requireNonNull;

public class Select extends Node {
    private final boolean distinct;
    private final List<NamedExpression> selectItems;

    public Select(boolean distinct, List<NamedExpression> selectItems) {
        this(null, distinct, selectItems);
    }

    public Select(NodeLocation location, boolean distinct, List<NamedExpression> selectItems) {
        super(location);
        this.distinct = distinct;
        this.selectItems = ImmutableList.copyOf(requireNonNull(selectItems, "selectItems"));
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<NamedExpression> getSelectItems() {
        return selectItems;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitSelect(this, context);
    }

    @Override
    public List<? extends Node> getChildren() {
        return selectItems;
    }

    @Override
    public String toString() {
        return toStringHelper(this).add("distinct", distinct).add("selectItems", selectItems).omitNullValues()
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Select select = (Select) o;
        return (distinct == select.distinct) && Objects.equals(selectItems, select.selectItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(distinct, selectItems);
    }

    @Override
    public boolean shallowEquals(Node other) {
        if (!sameClass(this, other)) {
            return false;
        }

        return distinct == ((Select) other).distinct;
    }
}
