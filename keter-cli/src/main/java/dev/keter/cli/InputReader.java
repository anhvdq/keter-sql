package dev.keter.cli;

import org.jline.reader.Completer;
import org.jline.reader.History;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.impl.completer.AggregateCompleter;
import org.jline.terminal.Terminal;
import org.jline.utils.AttributedString;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Path;

import static org.jline.reader.LineReader.*;
import static org.jline.reader.LineReader.Option.HISTORY_TIMESTAMPED;
import static org.jline.utils.AttributedStyle.BRIGHT;
import static org.jline.utils.AttributedStyle.DEFAULT;

public class InputReader implements Closeable {
    private final LineReader reader;

    public InputReader(Path historyFile, Completer... completers) throws IOException {
        reader = LineReaderBuilder.builder()
                .terminal(TerminalUtils.getTerminal())
                .variable(HISTORY_FILE, historyFile)
                .variable(SECONDARY_PROMPT_PATTERN, colored("%P -> "))
                .variable(BLINK_MATCHING_PAREN, 0)
                .parser(new InputParser())
                .highlighter(new InputHighlighter())
//                .completer(new AggregateCompleter(completers))
                .build();

        reader.unsetOpt(HISTORY_TIMESTAMPED);
    }

    public String readLine(String prompt, String buffer) {
        return reader.readLine(colored(prompt), null, buffer);
    }

    public History getHistory() {
        return reader.getHistory();
    }

    public Terminal getTerminal() {
        return reader.getTerminal();
    }

    private static String colored(String value) {
        return new AttributedString(value, DEFAULT.foreground(BRIGHT)).toAnsi();
    }

    @Override
    public void close() throws IOException {

    }
}
