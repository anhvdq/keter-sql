package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.google.common.base.MoreObjects.toStringHelper;
import static java.util.Objects.requireNonNull;

public class WindowSpecification extends Node implements Window {
    private final Identifier existingWindowName;
    private final List<Expression> clusterBy;
    private final List<Expression> partitionBy;
    private final OrderBy orderBy;
    private final WindowFrame frame;

    public WindowSpecification(Identifier existingWindowName, List<Expression> clusterBy,
                               List<Expression> partitionBy, OrderBy orderBy, WindowFrame frame) {
        this(null, existingWindowName, clusterBy, partitionBy, orderBy, frame);
    }

    private WindowSpecification(NodeLocation location, Identifier existingWindowName,
                                List<Expression> clusterBy, List<Expression> partitionBy, OrderBy orderBy,
                                WindowFrame frame) {
        super(location);
        this.existingWindowName = existingWindowName;
        this.clusterBy = requireNonNull(clusterBy, "clusterBy is null");
        this.partitionBy = requireNonNull(partitionBy, "partitionBy is null");
        this.orderBy = orderBy;
        this.frame = frame;
    }

    public Optional<Identifier> getExistingWindowName() {
        return Optional.ofNullable(existingWindowName);
    }

    public List<Expression> getPartitionBy() {
        return partitionBy;
    }

    public Optional<OrderBy> getOrderBy() {
        return Optional.ofNullable(orderBy);
    }

    public Optional<WindowFrame> getFrame() {
        return Optional.ofNullable(frame);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitWindowSpecification(this, context);
    }

    @Override
    public List<Node> getChildren() {
        ImmutableList.Builder<Node> nodes = ImmutableList.builder();
        Optional.ofNullable(existingWindowName).ifPresent(nodes::add);
        nodes.addAll(clusterBy);
        nodes.addAll(partitionBy);
        Optional.ofNullable(orderBy).ifPresent(nodes::add);
        Optional.ofNullable(frame).ifPresent(nodes::add);
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
        WindowSpecification o = (WindowSpecification) obj;
        return Objects.equals(existingWindowName, o.existingWindowName) && Objects.equals(partitionBy, o.partitionBy)
                && Objects.equals(orderBy, o.orderBy) && Objects.equals(frame, o.frame);
    }

    @Override
    public int hashCode() {
        return Objects.hash(existingWindowName, partitionBy, orderBy, frame);
    }

    @Override
    public String toString() {
        return toStringHelper(this).add("existingWindowName", existingWindowName).add("partitionBy", partitionBy)
                .add("orderBy", orderBy).add("frame", frame).toString();
    }

    @Override
    public boolean shallowEquals(Node other) {
        return sameClass(this, other);
    }
}
