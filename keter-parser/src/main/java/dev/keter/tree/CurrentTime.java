package dev.keter.tree;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

public class CurrentTime extends Expression {
    private final Function function;
    private final Integer precision;

    public enum Function {
        TIME("current_time"),
        DATE("current_date"),
        TIMESTAMP("current_timestamp"),
        LOCALTIME("localtime"),
        LOCALTIMESTAMP("localtimestamp");

        private final String name;

        Function(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public CurrentTime(Function function) {
        this(null, function, null);
    }

    public CurrentTime(NodeLocation location, Function function) {
        this(location, function, null);
    }

    public CurrentTime(Function function, Integer precision) {
        this(null, function, precision);
    }

    public CurrentTime(NodeLocation location, Function function, Integer precision) {
        super(location);
        requireNonNull(function, "function is null");
        this.function = function;
        this.precision = precision;
    }

    public Function getFunction() {
        return function;
    }

    public Integer getPrecision() {
        return precision;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitCurrentTime(this, context);
    }

    @Override
    public List<Node> getChildren() {
        return ImmutableList.of();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (getClass() != o.getClass())) {
            return false;
        }
        CurrentTime that = (CurrentTime) o;
        return (function == that.function) &&
                Objects.equals(precision, that.precision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(function, precision);
    }

    @Override
    public boolean shallowEquals(Node other) {
        if (!sameClass(this, other)) {
            return false;
        }

        CurrentTime otherNode = (CurrentTime) other;
        return (function == otherNode.function) &&
                Objects.equals(precision, otherNode.precision);
    }
}
