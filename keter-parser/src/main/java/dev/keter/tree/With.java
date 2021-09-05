package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;

import static com.google.common.base.MoreObjects.toStringHelper;
import static com.google.common.base.Preconditions.checkArgument;
import static java.util.Objects.requireNonNull;

public class With extends Node {
    private final boolean recursive;
    private final List<NamedQuery> queries;

    public With(boolean recursive, List<NamedQuery> queries) {
        this(null, recursive, queries);
    }

    public With(NodeLocation location, boolean recursive, List<NamedQuery> queries) {
        super(location);
        requireNonNull(queries, "queries is null");
        checkArgument(!queries.isEmpty(), "queries is empty");

        this.recursive = recursive;
        this.queries = ImmutableList.copyOf(queries);
    }

    public boolean isRecursive() {
        return recursive;
    }

    public List<NamedQuery> getQueries() {
        return queries;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitWith(this, context);
    }

    @Override
    public List<? extends Node> getChildren() {
        return queries;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        With o = (With) obj;
        return Objects.equals(recursive, o.recursive) && Objects.equals(queries, o.queries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recursive, queries);
    }

    @Override
    public String toString() {
        return toStringHelper(this).add("recursive", recursive).add("queries", queries).toString();
    }

    @Override
    public boolean shallowEquals(Node other) {
        return sameClass(this, other);
    }
}
