package dev.keter.cli;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import dev.keter.analyzer.Analyzer;
import dev.keter.plan.AnalyzeNode;
import dev.keter.spi.KeterException;
import dev.keter.spi.Location;
import org.jline.utils.AttributedStringBuilder;

import java.io.PrintStream;
import java.util.List;

import static org.jline.utils.AttributedStyle.*;
import static org.jline.utils.AttributedStyle.DEFAULT;

public class QueryRunner {
    private QueryRunner() {
    }

    public static void processQuery(String query, PrintStream out) {
        try {
            AnalyzeNode result = Analyzer.analyzeFunction(query);
            out.println(AnalyzePrinter.print(result));
        } catch (KeterException e) {
            renderError(query, e.getMessage(), e.getLocation().orElse(null), out);
        }
    }

    private static void renderError(String query, String message, Location location, PrintStream out) {
        out.printf("Analyze failed: %s%n", message);
        if (location != null) {
            List<String> lines = ImmutableList.copyOf(Splitter.on('\n').split(query).iterator());

            String errorLine = lines.get(location.getLineNumber() - 1);
            String good = errorLine.substring(0, location.getColumnNumber() - 1);
            String bad = errorLine.substring(location.getColumnNumber() - 1);

            if ((location.getLineNumber() == lines.size()) && bad.trim().isEmpty()) {
                bad = " <EOF>";
            }

            AttributedStringBuilder builder = new AttributedStringBuilder();

            builder.style(DEFAULT.foreground(CYAN));
            for (int i = 1; i < location.getLineNumber(); i++) {
                builder.append(lines.get(i - 1)).append("\n");
            }
            builder.append(good);

            builder.style(DEFAULT.foreground(RED));
            builder.append(bad).append("\n");
            for (int i = location.getLineNumber(); i < lines.size(); i++) {
                builder.append(lines.get(i)).append("\n");
            }

            builder.style(DEFAULT);
            out.print(builder.toAnsi());
        }

        out.println();
    }
}
