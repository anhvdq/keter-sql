package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.google.common.base.MoreObjects.toStringHelper;
import static java.util.Objects.requireNonNull;

public class NamedQuery extends Node {
    private final Identifier name;
    private final Query query;
    private final List<Identifier> columnNames;

    public NamedQuery(Identifier name, Query query, List<Identifier> columnNames) {
        this(null, name, query, columnNames);
    }

    public NamedQuery(NodeLocation location, Identifier name, Query query,
                       List<Identifier> columnNames) {
        super(location);
        this.name = name;
        this.query = requireNonNull(query, "query is null");
        this.columnNames = columnNames;
    }

    public Identifier getName() {
        return name;
    }

    public Query getQuery() {
        return query;
    }

    public Optional<List<Identifier>> getColumnNames() {
        return Optional.ofNullable(columnNames);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitNamedQuery(this, context);
    }

    @Override
    public List<Node> getChildren() {
        return ImmutableList.of(query);
    }

    @Override
    public String toString() {
        return toStringHelper(this).add("name", name).add("query", query).add("columnNames", columnNames)
                .omitNullValues().toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, query, columnNames);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        NamedQuery o = (NamedQuery) obj;
        return Objects.equals(name, o.name) && Objects.equals(query, o.query)
                && Objects.equals(columnNames, o.columnNames);
    }

    @Override
    public boolean shallowEquals(Node other) {
        if (!sameClass(this, other)) {
            return false;
        }

        NamedQuery otherRelation = (NamedQuery) other;
        return name.equals(otherRelation.name) && Objects.equals(columnNames, otherRelation.columnNames);
    }
}
