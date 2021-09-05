package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.google.common.base.MoreObjects.toStringHelper;
import static java.util.Objects.requireNonNull;

public class FrameBound extends Node {
    public enum Type {
        UNBOUNDED_PRECEDING, PRECEDING, CURRENT_ROW, FOLLOWING, UNBOUNDED_FOLLOWING
    }

    private final Type type;
    private final Expression value;

    public FrameBound(Type type) {
        this(null, type);
    }

    public FrameBound(Type type, Expression value) {
        this(null, type, value);
    }

    private FrameBound(NodeLocation location, Type type) {
        this(location, type, null);
    }

    private FrameBound(NodeLocation location, Type type, Expression value) {
        super(location);
        this.type = requireNonNull(type, "type is null");
        this.value = value;
    }

    public Type getType() {
        return type;
    }

    public Optional<Expression> getValue() {
        return Optional.ofNullable(value);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitFrameBound(this, context);
    }

    @Override
    public List<Node> getChildren() {
        ImmutableList.Builder<Node> nodes = ImmutableList.builder();
        Optional.ofNullable(value).ifPresent(nodes::add);
        return nodes.build();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        FrameBound o = (FrameBound) obj;
        return type == o.type && Objects.equals(value, o.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value);
    }

    @Override
    public String toString() {
        return toStringHelper(this).add("type", type).add("value", value).toString();
    }

    @Override
    public boolean shallowEquals(Node other) {
        if (!sameClass(this, other)) {
            return false;
        }

        FrameBound otherNode = (FrameBound) other;
        return type == otherNode.type;
    }
}
