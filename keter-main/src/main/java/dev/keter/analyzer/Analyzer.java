package dev.keter.analyzer;

import dev.keter.parser.ParsingException;
import dev.keter.parser.ParsingOptions;
import dev.keter.parser.SqlParser;
import dev.keter.plan.AnalyzeNode;
import dev.keter.spi.KeterException;
import dev.keter.spi.Location;
import dev.keter.tree.Expression;

import static dev.keter.spi.StandardErrorCode.SYNTAX_ERROR;

public class Analyzer {
    private Analyzer() {
    }

    public static AnalyzeNode analyzeFunction(String exp) {
        SqlParser parser = new SqlParser();
        try {
            Expression expression = parser.createExpression(exp, new ParsingOptions(ParsingOptions.DecimalLiteralTreatment.AS_DOUBLE));
            FunctionAnalyzer analyzer = new FunctionAnalyzer();
            return analyzer.analyze(expression);
        } catch (
                ParsingException e) {
            throw new KeterException(SYNTAX_ERROR, new Location(e.getLineNumber(), e.getColumnNumber()), e.getErrorMessage(), e);
        }
    }
}
