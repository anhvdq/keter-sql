package dev.keter.spi;

public class Location {
    private final int lineNumber;
    private final int columnNumber;

    public Location(int lineNumber, int columnNumber) {
        if (lineNumber < 1) {
            throw new IllegalArgumentException("lineNumber must be at least one");
        }

        if (columnNumber < 1) {
            throw new IllegalArgumentException("columnNumber must be at least one");
        }

        this.lineNumber = lineNumber;
        this.columnNumber = columnNumber;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    @Override
    public String toString() {
        return lineNumber + ":" + columnNumber;
    }
}
