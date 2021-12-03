package gudu.parser.table.index;


import gudu.parser.TParseTree;
import gudu.parser.table.column.TColumnDefinition;
import gudu.parser.table.column.TColumnDefinitionList;
import gudu.parser.table.expression.TLiteral;

import java.util.List;

/**
 * Class that encapsulates Primary Amp Index Node within create table AST.
 */

public class TPrimaryAmpIndex extends TIndexDefinition {

  private final boolean isIndexTokenPresent;
  private final TColumnDefinitionList indexColumnList;

  public TPrimaryAmpIndex(boolean isIndexTokenPresent, TColumnDefinitionList indexColumnList) {
    this.isIndexTokenPresent = isIndexTokenPresent;
    this.indexColumnList = indexColumnList;
  }

  public TParseTree getIndexColumnList() {
    return indexColumnList;
  }

  @Override
  public void unparse(StringBuilder writer) {
    writer.append("PRIMARY AMP ");
    if (isIndexTokenPresent) {
      writer.append("INDEX ");
    }
    writer.append("(");
    int i = 0;
    List<TColumnDefinition> indexColumns = indexColumnList.toStatementList();
    for (TColumnDefinition colDef : indexColumns) {
      writer.append(colDef.getColumnName().getVal());
      if (i != indexColumns.size() - 1) {
        writer.append(", ");
      }
      i++;
    }
    writer.append(")\n");
  }
}
