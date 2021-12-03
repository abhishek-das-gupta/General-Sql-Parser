package gudu.parser.table.column.attribute;

import gudu.parser.table.expression.TLiteral;

/**
 * Class that encapsulates the <code>CHARACTER SET</code> attribute of a column.
 * */

public class TCharacterSetAttribute extends TColumnAttribute {
  private final TLiteral columnCharacter;

  public TCharacterSetAttribute(TLiteral columnCharacter) {
    this.columnCharacter = columnCharacter;
  }

  public TLiteral getColumnCharacter() {
    return columnCharacter;
  }

  @Override
  public void unparse(StringBuilder writer) {
    writer.append("CHARACTER SET ");
    columnCharacter.unparse(writer);
  }
}
