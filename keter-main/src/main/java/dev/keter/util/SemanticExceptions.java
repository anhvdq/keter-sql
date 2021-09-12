package dev.keter.util;

import dev.keter.spi.ErrorCodeSupplier;
import dev.keter.spi.KeterException;
import dev.keter.tree.Expression;
import dev.keter.tree.Node;
import dev.keter.tree.QualifiedName;

import static java.lang.String.format;
import static dev.keter.util.ExpressionTreeUtils.extractLocation;
import static dev.keter.spi.StandardErrorCode.COLUMN_NOT_FOUND;
import static dev.keter.spi.StandardErrorCode.AMBIGUOUS_NAME;

public final class SemanticExceptions
{
    private SemanticExceptions() {}

    public static KeterException missingAttributeException(Expression node, QualifiedName name)
    {
        throw semanticException(COLUMN_NOT_FOUND, node, "Column '%s' cannot be resolved", name);
    }

    public static KeterException ambiguousAttributeException(Expression node, QualifiedName name)
    {
        throw semanticException(AMBIGUOUS_NAME, node, "Column '%s' is ambiguous", name);
    }

    public static KeterException semanticException(ErrorCodeSupplier code, Node node, String format, Object... args)
    {
        return semanticException(code, node, null, format, args);
    }

    public static KeterException semanticException(ErrorCodeSupplier code, Node node, Throwable cause, String format, Object... args)
    {
        throw new KeterException(code, extractLocation(node).orElse(null), format(format, args), cause);
    }
}
