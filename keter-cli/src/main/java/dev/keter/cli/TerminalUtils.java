package dev.keter.cli;

import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicBoolean;

import static com.google.common.base.Preconditions.checkState;

public class TerminalUtils {
    private static final Terminal TERMINAL_INSTANCE = createTerminal();
    private static final AtomicBoolean closed = new AtomicBoolean(false);

    private TerminalUtils() {
    }

    public static Terminal getTerminal() {
        checkState(!closed.get(), "Terminal is already closed");
        return TERMINAL_INSTANCE;
    }

    private static Terminal createTerminal() {
        try {
            return TerminalBuilder.builder()
                    .name("Client")
                    .build();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static boolean isRealTerminal(Terminal terminal) {
        return !Terminal.TYPE_DUMB.equals(terminal.getType()) &&
                !Terminal.TYPE_DUMB_COLOR.equals(terminal.getType());
    }

    public static boolean isRealTerminal() {
        return isRealTerminal(getTerminal());
    }

    public static int terminalWidth() {
        return getTerminal().getWidth();
    }

    public static Charset terminalEncoding() {
        return getTerminal().encoding();
    }

    public static void closeTerminal() {
        Terminal terminal = getTerminal();

        try {
            if (closed.compareAndSet(false, true)) {
                terminal.close();
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
