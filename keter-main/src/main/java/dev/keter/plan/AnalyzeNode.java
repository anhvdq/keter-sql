package dev.keter.plan;

import dev.keter.spi.type.Type;

import java.util.List;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

public class AnalyzeNode {
    private final String name;
    private final String value;
    private final Type returnType;
    private final List<AnalyzeNode> params;

    public AnalyzeNode(String name, String value, Type returnType, List<AnalyzeNode> params) {
        this.name = requireNonNull(name, "name can not be null");
        this.value = value;
        this.returnType = requireNonNull(returnType, "returnType can not be null");
        this.params = requireNonNull(params, "params can not be null");
    }

    public String getName() {
        return name;
    }

    public Optional<String> getValue() {
        return Optional.ofNullable(value);
    }

    public Type getReturnType() {
        return returnType;
    }

    public List<AnalyzeNode> getParams() {
        return params;
    }
}
