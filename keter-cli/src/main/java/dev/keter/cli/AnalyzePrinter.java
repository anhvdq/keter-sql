package dev.keter.cli;

import com.google.common.base.Strings;
import dev.keter.plan.AnalyzeNode;

import static java.lang.String.format;

public class AnalyzePrinter {
    private AnalyzePrinter() {
    }

    public static String print(AnalyzeNode node) {
        return print(node, 0);
    }

    private static String print(AnalyzeNode node, int level) {
        StringBuilder builder = new StringBuilder();
        String spaces = Strings.repeat("   ", level);
        spaces = spaces.isEmpty() ? spaces : spaces + "|";
        if (node.getValue().isPresent()) {
            builder.append(format(spaces + "- %s = %s\n", node.getName(), node.getValue().get()));
        } else {
            builder.append(format(spaces + "- %s: %s\n", node.getName(), node.getReturnType().name()));
            node.getParams().forEach(param -> builder.append(print(param, level + 1)));
        }

        return builder.toString();
    }
}
