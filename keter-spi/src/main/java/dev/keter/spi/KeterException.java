package dev.keter.spi;

import java.util.Optional;

import static java.lang.String.format;

public class KeterException extends RuntimeException {
    private final ErrorCode errorCode;
    private final Location location;

    public KeterException(ErrorCodeSupplier errorCode, String message) {
        this(errorCode, message, null);
    }

    public KeterException(ErrorCodeSupplier errorCode, Throwable throwable) {
        this(errorCode, null, throwable);
    }

    public KeterException(ErrorCodeSupplier errorCode, String message, Throwable cause) {
        this(errorCode, null, message, cause);
    }

    public KeterException(ErrorCodeSupplier errorCodeSupplier, Location location, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCodeSupplier.toErrorCode();
        this.location = location;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public Optional<Location> getLocation() {
        return Optional.ofNullable(location);
    }

    @Override
    public String getMessage() {
        String message = getRawMessage();
        if (location != null) {
            message = format("line %s:%s: %s", location.getLineNumber(), location.getColumnNumber(), message);
        }
        return message;
    }

    public String getRawMessage() {
        String message = super.getMessage();
        if (message == null && getCause() != null) {
            message = getCause().getMessage();
        }
        if (message == null) {
            message = errorCode.getName();
        }
        return message;
    }
}
