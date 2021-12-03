package gudu.parser.table.expression;

import gudu.parser.TParseTree;

import java.util.List;

/**
 * Class that encapsulates list of <code>TExpression</code>
 * */

public class TExpressionList extends TParseTree {
  private final List<TExpression> tExpressions;

  public TExpressionList(List<TExpression> tExpressions) {
    this.tExpressions = tExpressions;
  }

  @Override
  public void unparse(StringBuilder writer) {
    int i = 0;
    for (TExpression tExpression : tExpressions) {
      tExpression.unparse(writer);
      if (i != tExpressions.size() - 1) {
        writer.append(", ");
      }
      i++;
    }
  }
}
