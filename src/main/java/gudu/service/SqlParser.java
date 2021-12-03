package gudu.service;

import gudu.antlr.TeradataCreateTableLexer;
import gudu.antlr.TeradataCreateTableParser;
import gudu.parser.TParseTree;
import gudu.visitor.TSqlAstVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Class exposed to get create table AST.
 */

public class SqlParser {

  public static TParseTree newParser(String sql) {
    TeradataCreateTableParser parser = newParser_(sql);
    ParseTree parseTree = parser.parseCreateTable();
    TSqlAstVisitor visitor = new TSqlAstVisitor();
    return visitor.visit(parseTree);
  }

  private static TeradataCreateTableParser newParser_(String sql) {
    CharStream input = CharStreams.fromString(sql);
    TeradataCreateTableLexer lexer = new TeradataCreateTableLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    return new TeradataCreateTableParser(tokens);
  }
}
