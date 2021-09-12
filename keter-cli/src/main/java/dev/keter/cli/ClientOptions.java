package dev.keter.cli;

import static picocli.CommandLine.Option;

public class ClientOptions {
    private static final String DEFAULT_VALUE = "(default: ${DEFAULT-VALUE})";

    @Option(names = "--mode", paramLabel = "<mode>", defaultValue = "exp", description = "Analyzer mode " + DEFAULT_VALUE)
    public String mode;

    public enum OutputFormat {
        ALIGNED,
        VERTICAL,
        TSV,
        TSV_HEADER,
        CSV,
        CSV_HEADER,
        CSV_UNQUOTED,
        CSV_HEADER_UNQUOTED,
        JSON,
        NULL
    }
}
