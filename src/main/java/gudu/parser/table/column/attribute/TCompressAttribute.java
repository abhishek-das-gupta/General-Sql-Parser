package gudu.parser.table.column.attribute;

import gudu.parser.table.expression.TExpressionList;

/**
 * Class that encapsulates COMPRESS attribute of a column.
 * */

public class TCompressAttribute extends TColumnAttribute {
  private final TExpressionList tExpressionList;
  private final boolean containsBrackets;

  public TCompressAttribute(TExpressionList tExpressionList, boolean containsBrackets) {
    this.tExpressionList = tExpressionList;
    this.containsBrackets = containsBrackets;
  }

  public TExpressionList getExpressionList() {
    return tExpressionList;
  }

  @Override
  public void unparse(StringBuilder writer) {
    writer.append("COMPRESS");
    if (tExpressionList != null) {
      writer.append(" ");
      if (containsBrackets) {
        writer.append("(");
      }
      tExpressionList.unparse(writer);
      if (containsBrackets) {
        writer.append(")");
      }
    }
  }
}
