package dev.keter.spi.type;

public class StringType extends AbstractType {
    public static final StringType STRING = new StringType();

    private StringType() {
        super("string", String.class);
    }
}
