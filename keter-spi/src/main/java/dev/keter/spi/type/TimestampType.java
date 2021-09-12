package dev.keter.spi.type;

public class TimestampType extends AbstractType {
    public static final TimestampType TIMESTAMP = new TimestampType();

    private TimestampType() {
        super("timestamp", long.class);
    }
}
