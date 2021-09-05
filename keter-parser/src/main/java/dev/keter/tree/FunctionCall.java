package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.google.common.base.Preconditions.checkArgument;
import static java.util.Objects.requireNonNull;

public class FunctionCall
        extends Expression {
    private final QualifiedName name;
    private final Window window;
    private final Expression filter;
    private final OrderBy orderBy;
    private final boolean distinct;
    private final NullTreatment nullTreatment;
    private final ProcessingMode processingMode;
    private final List<Expression> arguments;

    public FunctionCall(QualifiedName name, List<Expression> arguments) {
        this(null, name, null, null, null, false, null, null, arguments);
    }

    public FunctionCall(NodeLocation location, QualifiedName name, List<Expression> arguments) {
        this(location, name, null, null, null, false, null, null, arguments);
    }

    public FunctionCall(
            NodeLocation location,
            QualifiedName name,
            Window window,
            Expression filter,
            OrderBy orderBy,
            boolean distinct,
            NullTreatment nullTreatment,
            ProcessingMode processingMode,
            List<Expression> arguments) {
        super(location);
        requireNonNull(name, "name is null");
        Optional.ofNullable(window).ifPresent(node -> checkArgument(node instanceof WindowReference || node instanceof WindowSpecification, "unexpected window: " + node.getClass().getSimpleName()));
        requireNonNull(arguments, "arguments is null");

        this.name = name;
        this.window = window;
        this.filter = filter;
        this.orderBy = orderBy;
        this.distinct = distinct;
        this.nullTreatment = nullTreatment;
        this.processingMode = processingMode;
        this.arguments = arguments;
    }

    public QualifiedName getName() {
        return name;
    }

    public Optional<Window> getWindow() {
        return Optional.ofNullable(window);
    }

    public Optional<OrderBy> getOrderBy() {
        return Optional.ofNullable(orderBy);
    }

    public boolean isDistinct() {
        return distinct;
    }

    public Optional<NullTreatment> getNullTreatment() {
        return Optional.ofNullable(nullTreatment);
    }

    public Optional<ProcessingMode> getProcessingMode() {
        return Optional.ofNullable(processingMode);
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    public Optional<Expression> getFilter() {
        return Optional.ofNullable(filter);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitFunctionCall(this, context);
    }

    @Override
    public List<Node> getChildren() {
        ImmutableList.Builder<Node> nodes = ImmutableList.builder();
        Optional.ofNullable(window).ifPresent(window -> nodes.add((Node) window));
        Optional.ofNullable(filter).ifPresent(nodes::add);
        Optional.ofNullable(orderBy).map(OrderBy::getSortItems).ifPresent(nodes::addAll);
        nodes.addAll(arguments);
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
        FunctionCall o = (FunctionCall) obj;
        return Objects.equals(name, o.name) &&
                Objects.equals(window, o.window) &&
                Objects.equals(filter, o.filter) &&
                Objects.equals(orderBy, o.orderBy) &&
                Objects.equals(distinct, o.distinct) &&
                Objects.equals(nullTreatment, o.nullTreatment) &&
                Objects.equals(processingMode, o.processingMode) &&
                Objects.equals(arguments, o.arguments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, distinct, nullTreatment, processingMode, window, filter, orderBy, arguments);
    }

    // TODO: make this a proper Tree node so that we can report error
    // locations more accurately
    public enum NullTreatment {
        IGNORE, RESPECT
    }

    @Override
    public boolean shallowEquals(Node other) {
        if (!sameClass(this, other)) {
            return false;
        }

        FunctionCall otherFunction = (FunctionCall) other;

        return name.equals(otherFunction.name) &&
                distinct == otherFunction.distinct &&
                nullTreatment.equals(otherFunction.nullTreatment) &&
                processingMode.equals(otherFunction.processingMode);
    }
}
