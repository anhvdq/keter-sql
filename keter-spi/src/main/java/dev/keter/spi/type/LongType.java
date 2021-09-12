package dev.keter.spi.type;

public class LongType extends AbstractType {
    public static final LongType LONG = new LongType();

    private LongType() {
        super("long", long.class);
    }
}
