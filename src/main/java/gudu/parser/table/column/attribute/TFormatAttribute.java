package gudu.parser.table.column.attribute;

import gudu.parser.table.expression.TLiteral;

/**
 * Class that encapsulates the format type of a column.
 * */

public class TFormatAttribute extends TColumnAttribute {
  private final TLiteral formatType;

  public TFormatAttribute(TLiteral formatType) {
    this.formatType = formatType;
  }

  public TLiteral getFormatType() {
    return formatType;
  }

  @Override
  public void unparse(StringBuilder writer) {
    writer.append("FORMAT ");
    writer.append("'");
    formatType.unparse(writer);
    writer.append("'");
  }
}
