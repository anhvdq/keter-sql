package dev.keter.cli;

import dev.keter.parser.SqlBaseLexer;
import dev.keter.parser.StatementSplitter;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;
import org.jline.reader.Highlighter;
import org.jline.reader.LineReader;
import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStringBuilder;
import org.jline.utils.AttributedStyle;

import java.util.Set;
import java.util.regex.Pattern;

import static com.google.common.collect.ImmutableSet.toImmutableSet;
import static java.util.Locale.ENGLISH;
import static org.jline.utils.AttributedStyle.*;
import static dev.keter.ReservedIdentifiers.sqlKeywords;

public class InputHighlighter implements Highlighter {
    private static final AttributedStyle KEYWORD_STYLE = BOLD;
    private static final AttributedStyle STRING_STYLE = DEFAULT.foreground(GREEN);
    private static final AttributedStyle NUMBER_STYLE = DEFAULT.foreground(CYAN);
    private static final AttributedStyle COMMENT_STYLE = DEFAULT.foreground(BRIGHT).italic();
    private static final AttributedStyle ERROR_STYLE = DEFAULT.foreground(RED);

    private static final Set<String> KEYWORDS = sqlKeywords().stream()
            .map(keyword -> keyword.toLowerCase(ENGLISH))
            .collect(toImmutableSet());

    @Override
    public AttributedString highlight(LineReader lineReader, String s) {
        TokenSource tokens = StatementSplitter.getLexer(s, Console.STATEMENT_DELIMITERS);
        AttributedStringBuilder builder = new AttributedStringBuilder();

        boolean error = false;
        while (true) {
            Token token = tokens.nextToken();
            int type = token.getType();
            if (type == Token.EOF) {
                break;
            }
            String text = token.getText();

            if (error || (type == SqlBaseLexer.UNRECOGNIZED)) {
                error = true;
                builder.styled(ERROR_STYLE, text);
            } else if (isKeyword(text)) {
                builder.styled(KEYWORD_STYLE, text);
            } else if (isString(type)) {
                builder.styled(STRING_STYLE, text);
            } else if (isNumber(type)) {
                builder.styled(NUMBER_STYLE, text);
            } else if (isComment(type)) {
                builder.styled(COMMENT_STYLE, text);
            } else {
                builder.append(text);
            }
        }

        return builder.toAttributedString();
    }

    @Override
    public void setErrorPattern(Pattern pattern) {
    }

    @Override
    public void setErrorIndex(int i) {
    }

    private static boolean isKeyword(String text) {
        return KEYWORDS.contains(text.toLowerCase(ENGLISH));
    }

    private static boolean isString(int type) {
        return (type == SqlBaseLexer.STRING) ||
                (type == SqlBaseLexer.UNICODE_STRING);
    }

    private static boolean isNumber(int type) {
        return (type == SqlBaseLexer.INTEGER_VALUE) ||
                (type == SqlBaseLexer.DOUBLE_VALUE) ||
                (type == SqlBaseLexer.DECIMAL_VALUE);
    }

    private static boolean isComment(int type) {
        return (type == SqlBaseLexer.SIMPLE_COMMENT) ||
                (type == SqlBaseLexer.BRACKETED_COMMENT);
    }
}
