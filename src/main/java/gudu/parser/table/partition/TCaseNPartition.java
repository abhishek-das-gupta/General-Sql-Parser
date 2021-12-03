package gudu.parser.table.partition;

import gudu.parser.table.expression.TExpressionList;

/**
 * Class that encapsulates CASE_N partition AST.
 * */

public class TCaseNPartition extends TPartitionExpression {
  private final TExpressionList caseExpressionList;
  private final boolean isNoCaseTokenPresent;
  private final boolean isUnknownTokenPresent;

  public TCaseNPartition(TExpressionList caseExpressions, boolean isNoCaseTokenPresent, boolean isUnknowTokenPresent) {
    this.caseExpressionList = caseExpressions;
    this.isNoCaseTokenPresent = isNoCaseTokenPresent;
    this.isUnknownTokenPresent = isUnknowTokenPresent;
  }

  public TExpressionList getCaseExpressions() {
    return caseExpressionList;
  }

  public boolean isNoCaseTokenPresent() {
    return isNoCaseTokenPresent;
  }

  public boolean isUnknownTokenPresent() {
    return isUnknownTokenPresent;
  }

  @Override
  public void unparse(StringBuilder writer) {
    writer.append("CASE_N(");
    caseExpressionList.unparse(writer);
    if (isNoCaseTokenPresent) {
      writer.append(", ");
      writer.append("NO CASE");
    }
    if (isUnknownTokenPresent) {
      writer.append(", ");
      writer.append("UNKNOWN");
    }
    writer.append(")");
  }
}
