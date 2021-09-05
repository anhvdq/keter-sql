package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;

import static com.google.common.base.MoreObjects.toStringHelper;
import static java.util.Objects.requireNonNull;

public class NamedWindow extends Node {
    private final Identifier name;
    private final WindowSpecification window;

    public NamedWindow(Identifier name, WindowSpecification window) {
        this(null, name, window);
    }

    private NamedWindow(NodeLocation location, Identifier name, WindowSpecification window) {
        super(location);
        this.name = requireNonNull(name, "name is null");
        this.window = requireNonNull(window, "window is null");
    }

    public Identifier getName() {
        return name;
    }

    public WindowSpecification getWindow() {
        return window;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitNamedWindow(this, context);
    }

    @Override
    public List<Node> getChildren() {
        return ImmutableList.of(window);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        NamedWindow o = (NamedWindow) obj;
        return Objects.equals(name, o.name) && Objects.equals(window, o.window);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, window);
    }

    @Override
    public String toString() {
        return toStringHelper(this).add("name", name).add("window", window).toString();
    }

    @Override
    public boolean shallowEquals(Node other) {
        if (!sameClass(this, other)) {
            return false;
        }

        return name.equals(((NamedWindow) other).name);
    }
}
