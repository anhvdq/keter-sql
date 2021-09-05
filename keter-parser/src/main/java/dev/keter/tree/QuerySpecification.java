package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.google.common.base.MoreObjects.toStringHelper;
import static com.google.common.base.Preconditions.checkArgument;
import static java.util.Objects.requireNonNull;

public class QuerySpecification extends QueryBody {
    private final Select select;
    private final Relation from;
    private final Expression where;
    private final GroupBy groupBy;
    private final Expression having;
    private final List<NamedWindow> windows;
    private final OrderBy orderBy;
    private final Offset offset;
    private final Node limit;

    public QuerySpecification(Select select, Relation from, Expression where,
                              GroupBy groupBy, Expression having, List<NamedWindow> windows,
                              OrderBy orderBy, Offset offset, Node limit) {
        this(null, select, from, where, groupBy, having, windows, orderBy, offset, limit);
    }

    public QuerySpecification(NodeLocation location, Select select, Relation from,
                               Expression where, GroupBy groupBy, Expression having,
                               List<NamedWindow> windows, OrderBy orderBy, Offset offset, Node limit) {
        super(location);

        checkArgument(limit == null || limit instanceof Limit, "limit must be optional of Limit type");

        this.select = requireNonNull(select, "select is null");
        this.from = from;
        this.where = where;
        this.groupBy = groupBy;
        this.having = having;
        this.windows = requireNonNull(windows, "windows is null");
        this.orderBy = orderBy;
        this.offset = offset;
        this.limit = limit;
    }

    public Select getSelect() {
        return select;
    }

    public Optional<Relation> getFrom() {
        return Optional.ofNullable(from);
    }

    public Optional<Expression> getWhere() {
        return Optional.ofNullable(where);
    }

    public Optional<GroupBy> getGroupBy() {
        return Optional.ofNullable(groupBy);
    }

    public Optional<Expression> getHaving() {
        return Optional.ofNullable(having);
    }

    public List<NamedWindow> getWindows() {
        return windows;
    }

    public Optional<OrderBy> getOrderBy() {
        return Optional.ofNullable(orderBy);
    }

    public Optional<Offset> getOffset() {
        return Optional.ofNullable(offset);
    }

    public Optional<Node> getLimit() {
        return Optional.ofNullable(limit);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitQuerySpecification(this, context);
    }

    @Override
    public List<Node> getChildren() {
        ImmutableList.Builder<Node> nodes = ImmutableList.builder();
        nodes.add(select);
        Optional.ofNullable(from).ifPresent(nodes::add);
        Optional.ofNullable(where).ifPresent(nodes::add);
        Optional.ofNullable(groupBy).ifPresent(nodes::add);
        Optional.ofNullable(having).ifPresent(nodes::add);
        nodes.addAll(windows);
        Optional.ofNullable(orderBy).ifPresent(nodes::add);
        Optional.ofNullable(offset).ifPresent(nodes::add);
        Optional.ofNullable(limit).ifPresent(nodes::add);
        return nodes.build();
    }

    @Override
    public String toString() {
        return toStringHelper(this).add("select", select).add("from", from).add("where", where)
                .add("groupBy", groupBy).add("having", having)
                .add("windows", windows.isEmpty() ? null : windows).add("orderBy", orderBy)
                .add("offset", offset).add("limit", limit).toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        QuerySpecification o = (QuerySpecification) obj;
        return Objects.equals(select, o.select) && Objects.equals(from, o.from) && Objects.equals(where, o.where)
                && Objects.equals(groupBy, o.groupBy) && Objects.equals(having, o.having)
                && Objects.equals(windows, o.windows) && Objects.equals(orderBy, o.orderBy)
                && Objects.equals(offset, o.offset) && Objects.equals(limit, o.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(select, from, where, groupBy, having, windows, orderBy, offset, limit);
    }

    @Override
    public boolean shallowEquals(Node other) {
        return sameClass(this, other);
    }
}
