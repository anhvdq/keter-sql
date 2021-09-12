package dev.keter.spi.type;

public class UnknownType extends AbstractType {
    public static final UnknownType UNKNOWN = new UnknownType();

    private UnknownType() {
        super("unknown", boolean.class);
    }
}
