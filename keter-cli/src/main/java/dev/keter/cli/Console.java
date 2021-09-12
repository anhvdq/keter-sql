package dev.keter.cli;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import dev.keter.parser.StatementSplitter;
import dev.keter.spi.Location;
import org.jline.reader.Completer;
import org.jline.reader.EndOfFileException;
import org.jline.reader.History;
import org.jline.reader.UserInterruptException;
import org.jline.terminal.Terminal;
import org.jline.utils.AttributedStringBuilder;
import org.jline.utils.InfoCmp;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

import picocli.CommandLine.Command;
import picocli.CommandLine.Mixin;
import picocli.CommandLine.Option;
import dev.keter.cli.Main.VersionProvider;

import static com.google.common.base.CharMatcher.whitespace;
import static com.google.common.base.StandardSystemProperty.USER_HOME;
import static com.google.common.base.Strings.isNullOrEmpty;
import static com.google.common.base.Strings.nullToEmpty;
import static java.lang.String.format;
import static java.util.Locale.ENGLISH;
import static dev.keter.parser.StatementSplitter.Statement;
import static dev.keter.parser.StatementSplitter.isEmptyStatement;
import static dev.keter.cli.ClientOptions.OutputFormat;
import static org.jline.utils.AttributedStyle.*;

@Command(
        name = "keter-cli",
        header = "Command Line interface for testing purpose",
        synopsisHeading = "%nUSAGE:%n%n",
        optionListHeading = "%nOPTIONS:%n",
        usageHelpAutoWidth = true,
        versionProvider = VersionProvider.class
)
public class Console implements Callable<Integer> {
    private static final String PROMPT_NAME = "cli";
    public static final Set<String> STATEMENT_DELIMITERS = ImmutableSet.of(";", "\\G");

    @Option(names = {"-h", "--help"}, usageHelp = true, description = "Show this help message and exit")
    public boolean usageHelpRequested;

    @Option(names = "--version", versionHelp = true, description = "Print version information and exit")
    public boolean versionInfoRequested;

    @Mixin
    public ClientOptions clientOptions;

    @Override
    public Integer call() {
        return run() ? 0 : 1;
    }

    public boolean run() {
        runConsole();
        return true;
    }

    public void runConsole() {
        // TODO: Implement completers
        try (InputReader reader = new InputReader(getHistoryFile(), (Completer) null)) {
            String remaining = "";
            while (true) {
                String commandPrompt = PROMPT_NAME + "> ";
                // read a line of input from user
                String line;
                try {
                    line = reader.readLine(commandPrompt, remaining);
                } catch (UserInterruptException e) {
                    if (!e.getPartialLine().isEmpty()) {
                        reader.getHistory().add(e.getPartialLine());
                    }
                    remaining = "";
                    continue;
                } catch (EndOfFileException e) {
                    System.out.println();
                    return;
                }

                // check for special commands -- must match InputParser
                String command = CharMatcher.is(';').or(whitespace()).trimTrailingFrom(line);
                switch (command.toLowerCase(ENGLISH)) {
                    case "exit":
                    case "quit":
                        return;
                    case "clear":
                        Terminal terminal = reader.getTerminal();
                        terminal.puts(InfoCmp.Capability.clear_screen);
                        terminal.flush();
                        continue;
                    case "history":
                        for (History.Entry entry : reader.getHistory()) {
                            System.out.println(new AttributedStringBuilder()
                                    .style(DEFAULT.foreground(CYAN))
                                    .append(format("%5d", entry.index() + 1))
                                    .style(DEFAULT)
                                    .append("  ")
                                    .append(entry.line())
                                    .toAnsi(reader.getTerminal()));
                        }
                        continue;
                    case "help":
                        System.out.println();
                        System.out.println(getHelpText());
                        continue;
                }

                // execute any complete statements
                StatementSplitter splitter = new StatementSplitter(line, STATEMENT_DELIMITERS);
                for (Statement split : splitter.getCompleteStatements()) {
                    QueryRunner.processQuery(split.statement(), System.out);
                }

                // replace remaining with trailing partial statement
                remaining = whitespace().trimTrailingFrom(splitter.getPartialStatement());
            }
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    private static Path getHistoryFile() {
        String path = System.getenv("KETER_HISTORY_FILE");
        if (!isNullOrEmpty(path)) {
            return Paths.get(path);
        }
        return Paths.get(nullToEmpty(USER_HOME.value()), ".keter_history");
    }

    private static String getHelpText() {
        return "" +
                "Supported commands:\n" +
                "QUIT\n" +
                "EXIT\n" +
                "HISTORY\n" +
                "CLEAR\n" +
                "";
    }
}
