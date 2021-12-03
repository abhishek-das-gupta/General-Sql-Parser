package gudu.parser.table.column.attribute;

/**
 * Class that encapsulates NOT NULL attribute of a column
 * */

public class TNotNullAttribute extends TColumnAttribute {

  private final boolean isNotNull;

  public TNotNullAttribute(boolean isNotNull) {
    this.isNotNull = isNotNull;
  }

  public boolean isNotNull() {
    return isNotNull;
  }

  @Override
  public void unparse(StringBuilder writer) {
    if (isNotNull) {
      writer.append("NOT NULL");
    }
  }
}
