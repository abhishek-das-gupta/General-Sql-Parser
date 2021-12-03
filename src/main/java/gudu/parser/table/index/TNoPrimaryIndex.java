package gudu.parser.table.index;

/**
 * Class that encapsulates No Primary index
 */

public class TNoPrimaryIndex extends TIndexDefinition {

  @Override
  public void unparse(StringBuilder writer) {
    writer.append("NO PRIMARY INDEX");
    writer.append("\n");
  }
}
