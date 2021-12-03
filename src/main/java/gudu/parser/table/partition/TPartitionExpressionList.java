package gudu.parser.table.partition;

import gudu.parser.table.index.TPTNode;

import java.util.List;

/**
 * Class that encapsulates  list of partitions expressions on a table.
 * */

public class TPartitionExpressionList extends TPTNode {
  private final List<TPartitionExpression> partitionExpressions;

  public TPartitionExpressionList(List<TPartitionExpression> partitionExpressions) {
    this.partitionExpressions = partitionExpressions;
  }

  public List<TPartitionExpression> toPartitionExpressionList() {
    return partitionExpressions;
  }

  @Override
  public void unparse(StringBuilder writer) {
    writer.append("PARTITION BY ");
    boolean isMultiLevel = partitionExpressions.size() > 1;
    if (isMultiLevel) {
      writer.append("(");
    }
    int i = 0;
    for (TPartitionExpression partitionExpression : partitionExpressions) {
      partitionExpression.unparse(writer);
      if (i != partitionExpressions.size() - 1) {
        writer.append(",\n");
      }
    }
    if (isMultiLevel) {
      writer.append(")\n");
    }
  }
}
