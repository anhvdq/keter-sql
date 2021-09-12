package dev.keter.spi.type;

public class DateType extends AbstractType {
    public static final DateType DATE = new DateType();

    private DateType() {
        super("date", long.class);
    }
}
