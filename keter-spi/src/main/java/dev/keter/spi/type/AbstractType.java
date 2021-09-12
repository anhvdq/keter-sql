package dev.keter.spi.type;

public abstract class AbstractType implements Type {
    private final String name;
    private final Class<?> javaType;

    protected AbstractType(String name, Class<?> javaType) {
        this.name = name;
        this.javaType = javaType;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Class<?> getJavaType() {
        return javaType;
    }
}
