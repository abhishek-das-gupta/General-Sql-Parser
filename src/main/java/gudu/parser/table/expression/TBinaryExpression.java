package gudu.parser.table.expression;

/**
 * Class that encapsulates Binary expression tree.
 * */

public class TBinaryExpression extends TExpression {
  private final TExpression leftExpr;
  private final EOperatorToken operator;
  private final TExpression rightExpr;

  public TBinaryExpression(TExpression leftExpr, EOperatorToken operator, TExpression rightExpr) {
    this.leftExpr = leftExpr;
    this.rightExpr = rightExpr;
    this.operator = operator;
  }

  public TExpression getLeftExpr() {
    return leftExpr;
  }

  public EOperatorToken getOperator() {
    return operator;
  }

  public TExpression getRightExpr() {
    return rightExpr;
  }

  @Override
  public void unparse(StringBuilder writer) {
    leftExpr.unparse(writer);
    writer.append(" ");
    writer.append(operator.val);
    writer.append(" ");
    rightExpr.unparse(writer);
  }
}
