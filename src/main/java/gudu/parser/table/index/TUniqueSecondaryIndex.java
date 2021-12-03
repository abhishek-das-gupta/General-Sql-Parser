package gudu.parser.table.index;


import gudu.parser.TParseTree;
import gudu.parser.table.column.TColumnDefinition;
import gudu.parser.table.column.TColumnDefinitionList;
import gudu.parser.table.expression.TLoadExpression;

import java.util.List;

/**
 * Class that encapsulates Unique Secondary Index node in a create table AST.
 */

public class TUniqueSecondaryIndex extends TIndexDefinition {
  private final TParseTree indexName;
  private final TColumnDefinitionList indexDefinitionList;
  private final TLoadExpression loadExpression;

  public TUniqueSecondaryIndex(TParseTree indexName, TColumnDefinitionList indexDefinitionList, TLoadExpression loadExpression) {
    this.indexName = indexName;
    this.indexDefinitionList = indexDefinitionList;
    this.loadExpression = loadExpression;
  }

  @Override
  public void unparse(StringBuilder writer) {
    writer.append("UNIQUE INDEX ");
    if (indexName != null) {
      indexName.unparse(writer);
    }
    writer.append("(");
    int i = 0;
    List<TColumnDefinition> indexColumns = indexDefinitionList.toStatementList();
    for (TColumnDefinition colDef : indexColumns) {
      writer.append(colDef.getColumnName().getVal());
      if (i != indexColumns.size() - 1) {
        writer.append(", ");
      }
      i++;
    }
    writer.append(") ");
    if (loadExpression != null) {
      loadExpression.unparse(writer);
    }
    writer.append("\n");
  }


}
