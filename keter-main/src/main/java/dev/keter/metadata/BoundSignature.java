package dev.keter.metadata;

import com.google.common.collect.ImmutableList;
import dev.keter.spi.type.Type;

import java.util.List;
import java.util.Objects;

import static com.google.common.collect.ImmutableList.toImmutableList;
import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.joining;

public class BoundSignature {
    private final String name;
    private final Type returnType;
    private final List<Type> argumentTypes;

    public BoundSignature(
            String name,
            Type returnType,
            List<Type> argumentTypes) {
        this.name = requireNonNull(name, "name is null");
        this.returnType = requireNonNull(returnType, "returnType is null");
        this.argumentTypes = ImmutableList.copyOf(requireNonNull(argumentTypes, "argumentTypes is null"));
    }

    public String getName() {
        return name;
    }

    public Type getReturnType() {
        return returnType;
    }

    public List<Type> getArgumentTypes() {
        return argumentTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BoundSignature that = (BoundSignature) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(returnType, that.returnType) &&
                Objects.equals(argumentTypes, that.argumentTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, returnType, argumentTypes);
    }

    @Override
    public String toString() {
        return name +
                argumentTypes.stream()
                        .map(Type::toString)
                        .collect(joining(", ", "(", "):")) +
                returnType;
    }
}
