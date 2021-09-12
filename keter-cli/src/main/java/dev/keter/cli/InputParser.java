package dev.keter.cli;

import com.google.common.collect.ImmutableSet;
import dev.keter.parser.StatementSplitter;
import org.jline.reader.EOFError;
import org.jline.reader.ParsedLine;
import org.jline.reader.Parser;
import org.jline.reader.SyntaxError;
import org.jline.reader.impl.DefaultParser;

import java.util.Set;

import static com.google.common.base.CharMatcher.whitespace;
import static java.util.Locale.ENGLISH;

public class InputParser implements Parser {
    private static final Set<String> SPECIAL = ImmutableSet.of("exit", "quit", "history", "help", "clear");

    @Override
    public ParsedLine parse(String line, int cursor, ParseContext context)
            throws SyntaxError {
        String command = whitespace().trimFrom(line);
        if (command.isEmpty() || SPECIAL.contains(command.toLowerCase(ENGLISH))) {
            return new DefaultParser().parse(line, cursor, context);
        }

        StatementSplitter splitter = new StatementSplitter(line, Console.STATEMENT_DELIMITERS);
        if (splitter.getCompleteStatements().isEmpty()) {
            throw new EOFError(-1, -1, null);
        }

        return new DefaultParser().parse(line, cursor, context);
    }

    @Override
    public boolean isEscapeChar(char ch) {
        return false;
    }
}
