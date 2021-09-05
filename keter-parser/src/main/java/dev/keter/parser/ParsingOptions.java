package dev.keter.parser;

import static java.util.Objects.requireNonNull;

public class ParsingOptions {
    public enum DecimalLiteralTreatment {
        AS_DOUBLE,
        AS_DECIMAL,
        REJECT
    }

    private final DecimalLiteralTreatment decimalLiteralTreatment;

    public ParsingOptions() {
        this(DecimalLiteralTreatment.REJECT);
    }

    public ParsingOptions(DecimalLiteralTreatment decimalLiteralTreatment) {
        this.decimalLiteralTreatment = requireNonNull(decimalLiteralTreatment, "decimalLiteralTreatment is null");
    }

    public DecimalLiteralTreatment getDecimalLiteralTreatment() {
        return decimalLiteralTreatment;
    }
}
