package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;

import static com.google.common.base.MoreObjects.toStringHelper;
import static java.util.Objects.requireNonNull;

public class GroupBy extends Node {
    private final boolean isDistinct;
    private final List<Expression> groupingExpressions;

    public GroupBy(boolean isDistinct, List<Expression> groupingExpressions) {
        this(null, isDistinct, groupingExpressions);
    }

    public GroupBy(NodeLocation location, boolean isDistinct, List<Expression> groupingExpressions) {
        super(location);
        this.isDistinct = isDistinct;
        this.groupingExpressions = ImmutableList.copyOf(requireNonNull(groupingExpressions));
    }

    public boolean isDistinct() {
        return isDistinct;
    }

    public List<Expression> getGroupingExpressions() {
        return groupingExpressions;
    }

    @Override
    protected <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitGroupBy(this, context);
    }

    @Override
    public List<? extends Node> getChildren() {
        return groupingExpressions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GroupBy groupBy = (GroupBy) o;
        return isDistinct == groupBy.isDistinct && Objects.equals(groupingExpressions, groupBy.groupingExpressions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDistinct, groupingExpressions);
    }

    @Override
    public String toString() {
        return toStringHelper(this).add("isDistinct", isDistinct).add("GroupingExpressions", groupingExpressions).toString();
    }

    @Override
    public boolean shallowEquals(Node other) {
        if (!sameClass(this, other)) {
            return false;
        }

        return isDistinct == ((GroupBy) other).isDistinct;
    }
}
