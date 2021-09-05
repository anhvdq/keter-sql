package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;

import static com.google.common.base.MoreObjects.toStringHelper;
import static java.util.Objects.requireNonNull;

public final class ProcessingMode extends Node {
    private final Mode mode;

    public ProcessingMode(NodeLocation location, Mode mode) {
        super(location);
        this.mode = requireNonNull(mode, "mode is null");
    }

    public Mode getMode() {
        return mode;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitProcessingMode(this, context);
    }

    @Override
    public List<Node> getChildren() {
        return ImmutableList.of();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        return mode == ((ProcessingMode) obj).mode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode);
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("mode", mode)
                .toString();
    }

    public enum Mode {
        RUNNING, FINAL
    }
}
