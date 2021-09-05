package dev.keter.tree;

import java.util.Objects;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

public class IntervalLiteral extends Literal {
    public enum Sign {
        POSITIVE {
            @Override
            public int multiplier() {
                return 1;
            }
        },
        NEGATIVE {
            @Override
            public int multiplier() {
                return -1;
            }
        };

        public abstract int multiplier();
    }

    public enum IntervalField {
        YEAR, MONTH, DAY, HOUR, MINUTE, SECOND
    }

    private final String value;
    private final Sign sign;
    private final IntervalField startField;
    private final IntervalField endField;

    public IntervalLiteral(String value, Sign sign, IntervalField startField) {
        this(null, value, sign, startField, null);
    }

    public IntervalLiteral(String value, Sign sign, IntervalField startField, IntervalField endField) {
        this(null, value, sign, startField, endField);
    }

    public IntervalLiteral(NodeLocation location, String value, Sign sign, IntervalField startField, IntervalField endField) {
        super(location);
        requireNonNull(value, "value is null");
        requireNonNull(sign, "sign is null");
        requireNonNull(startField, "startField is null");

        this.value = value;
        this.sign = sign;
        this.startField = startField;
        this.endField = endField;
    }

    public String getValue() {
        return value;
    }

    public Sign getSign() {
        return sign;
    }

    public IntervalField getStartField() {
        return startField;
    }

    public Optional<IntervalField> getEndField() {
        return Optional.ofNullable(endField);
    }

    public boolean isYearToMonth() {
        return startField == IntervalField.YEAR || startField == IntervalField.MONTH;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitIntervalLiteral(this, context);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, sign, startField, endField);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IntervalLiteral other = (IntervalLiteral) obj;
        return Objects.equals(this.value, other.value) &&
                this.sign == other.sign &&
                this.startField == other.startField &&
                Objects.equals(this.endField, other.endField);
    }

    @Override
    public boolean shallowEquals(Node other) {
        if (!sameClass(this, other)) {
            return false;
        }

        IntervalLiteral otherLiteral = (IntervalLiteral) other;
        return Objects.equals(this.value, otherLiteral.value) &&
                this.sign == otherLiteral.sign &&
                this.startField == otherLiteral.startField &&
                Objects.equals(this.endField, otherLiteral.endField);
    }
}
