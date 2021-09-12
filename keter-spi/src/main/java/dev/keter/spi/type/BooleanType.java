package dev.keter.spi.type;

public class BooleanType extends AbstractType {
    public static final BooleanType BOOLEAN = new BooleanType();

    private BooleanType() {
        super("boolean", boolean.class);
    }
}
