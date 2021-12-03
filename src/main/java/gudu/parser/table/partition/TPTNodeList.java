package gudu.parser.table.partition;

import gudu.parser.TParseTree;
import gudu.parser.table.index.TPTNode;

import java.util.List;

/**
 * Class that encapsulates list of indices/partitions within an Create TAble AST.
 * */

public class TPTNodeList extends TParseTree {

  private final List<TPTNode> tptNodes;

  public TPTNodeList(List<TPTNode> tptNodes) {
    this.tptNodes = tptNodes;
  }

  public List<TPTNode> getTptNodes() {
    return tptNodes;
  }

  @Override
  public void unparse(StringBuilder writer) {
    for (TPTNode tptNode : tptNodes) {
      tptNode.unparse(writer);
    }
  }
}
