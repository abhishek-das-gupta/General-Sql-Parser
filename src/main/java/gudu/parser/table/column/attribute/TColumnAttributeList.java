package gudu.parser.table.column.attribute;


import gudu.parser.TParseTree;

import java.util.List;

/**
 * Class that encapsulates a list of <code>TColumnAttribute</code> for a single <code>TColumnDefinition</code>.
 */

public class TColumnAttributeList extends TParseTree {
  private final List<TColumnAttribute> columnAttributes;

  public TColumnAttributeList(List<TColumnAttribute> columnAttributes) {
    this.columnAttributes = columnAttributes;
  }

  public List<TColumnAttribute> toStatementList() {
    return columnAttributes;
  }

  @Override
  public void unparse(StringBuilder writer) {
    int i = 0;
    for (TColumnAttribute columnAttribute : columnAttributes) {
      columnAttribute.unparse(writer);
      if (i != columnAttributes.size() - 1) {
        writer.append(" ");
      }
      i++;
    }
  }
}
