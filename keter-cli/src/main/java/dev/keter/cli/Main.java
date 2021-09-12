package dev.keter.cli;

import picocli.CommandLine;

import static com.google.common.base.MoreObjects.firstNonNull;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        System.exit(createCmd(new Console()).execute(args));
    }

    public static CommandLine createCmd(Object command) {
        CommandLine cmd = new CommandLine(command);

        return cmd;
    }

    public static class VersionProvider
            implements CommandLine.IVersionProvider {
        @Override
        public String[] getVersion() {
            String version = getClass().getPackage().getImplementationVersion();
            return new String[]{"CLI " + firstNonNull(version, "(version unknown)")};
        }
    }
}
