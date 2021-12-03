package gudu.parser.table.index;


import gudu.parser.TParseTree;

import java.util.List;

/**
 * Class that encapsulates list of <code>TIndexDefinition</code> on a table.
 */

public class TIndexDefinitionList extends TParseTree {

  private final List<TIndexDefinition> indexDefinitions;

  public TIndexDefinitionList(List<TIndexDefinition> indexDefinitions) {
    this.indexDefinitions = indexDefinitions;
  }

  @Override
  public void unparse(StringBuilder writer) {
    for (TParseTree indexDef : indexDefinitions) {
      indexDef.unparse(writer);
      writer.append("\n");
    }
  }

  public List<TIndexDefinition> toStatementList() {
    return indexDefinitions;
  }
}
