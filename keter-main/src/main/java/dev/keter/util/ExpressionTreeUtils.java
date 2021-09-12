package dev.keter.util;

import dev.keter.spi.Location;
import dev.keter.tree.Node;


import java.util.Optional;

public final class ExpressionTreeUtils {
    private ExpressionTreeUtils() {
    }

    public static Optional<Location> extractLocation(Node node) {
        return node.getLocation()
                .map(location -> new Location(location.getLineNumber(), location.getColumnNumber()));
    }
}
