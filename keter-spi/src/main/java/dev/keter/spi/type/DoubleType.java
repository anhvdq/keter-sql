package dev.keter.spi.type;

public class DoubleType extends AbstractType {
    public static final DoubleType DOUBLE = new DoubleType();

    private DoubleType() {
        super("double", double.class);
    }
}
