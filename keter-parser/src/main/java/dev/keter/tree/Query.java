package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.google.common.base.MoreObjects.toStringHelper;
import static com.google.common.base.Preconditions.checkArgument;
import static java.util.Objects.requireNonNull;

public class Query extends Statement {
    private final With with;
    private final QueryBody queryBody;
    private final OrderBy orderBy;
    private final Offset offset;
    private final Node limit;

    public Query(With with, QueryBody queryBody, OrderBy orderBy, Offset offset,
                 Node limit) {
        this(null, with, queryBody, orderBy, offset, limit);
    }

    public Query(NodeLocation location, With with, QueryBody queryBody, OrderBy orderBy,
                  Offset offset, Node limit) {
        super(location);

        this.with = with;
        this.queryBody = requireNonNull(queryBody, "queryBody is null");
        this.orderBy = orderBy;
        this.offset = offset;
        checkArgument(limit == null || limit instanceof Limit, "limit must be optional of Limit type");
        this.limit = limit;
    }

    public Optional<With> getWith() {
        return Optional.ofNullable(with);
    }

    public QueryBody getQueryBody() {
        return queryBody;
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
        return visitor.visitQuery(this, context);
    }

    @Override
    public List<Node> getChildren() {
        ImmutableList.Builder<Node> nodes = ImmutableList.builder();
        Optional.ofNullable(with).ifPresent(nodes::add);
        nodes.add(queryBody);
        Optional.ofNullable(orderBy).ifPresent(nodes::add);
        Optional.ofNullable(offset).ifPresent(nodes::add);
        Optional.ofNullable(limit).ifPresent(nodes::add);
        return nodes.build();
    }

    @Override
    public String toString() {
        return toStringHelper(this).add("with", with).add("queryBody", queryBody).add("orderBy", orderBy)
                .add("offset", offset).add("limit", limit).omitNullValues().toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        Query o = (Query) obj;
        return Objects.equals(with, o.with) && Objects.equals(queryBody, o.queryBody)
                && Objects.equals(orderBy, o.orderBy) && Objects.equals(offset, o.offset)
                && Objects.equals(limit, o.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(with, queryBody, orderBy, offset, limit);
    }

    @Override
    public boolean shallowEquals(Node other) {
        return sameClass(this, other);
    }
}
