package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.google.common.base.MoreObjects.toStringHelper;
import static java.util.Objects.requireNonNull;

public class WindowFrame extends Node {
    public enum Type {
        RANGE, ROWS
    }

    private final Type type;
    private final FrameBound start;
    private final FrameBound end;

    public WindowFrame(Type type, FrameBound start, FrameBound end) {
        this(null, type, start, end);
    }

    private WindowFrame(NodeLocation location, Type type, FrameBound start, FrameBound end) {
        super(location);
        this.type = requireNonNull(type, "type is null");
        this.start = requireNonNull(start, "start is null");
        this.end = end;
    }

    public Type getType() {
        return type;
    }

    public FrameBound getStart() {
        return start;
    }

    public Optional<FrameBound> getEnd() {
        return Optional.ofNullable(end);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitWindowFrame(this, context);
    }

    @Override
    public List<Node> getChildren() {
        ImmutableList.Builder<Node> nodes = ImmutableList.builder();
        nodes.add(start);
        Optional.ofNullable(end).ifPresent(nodes::add);
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
        WindowFrame o = (WindowFrame) obj;
        return type == o.type && Objects.equals(start, o.start) && Objects.equals(end, o.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, start, end);
    }

    @Override
    public String toString() {
        return toStringHelper(this).add("type", type).add("start", start).add("end", end).toString();
    }

    @Override
    public boolean shallowEquals(Node other) {
        if (!sameClass(this, other)) {
            return false;
        }

        WindowFrame otherNode = (WindowFrame) other;
        return type == otherNode.type;
    }
}
