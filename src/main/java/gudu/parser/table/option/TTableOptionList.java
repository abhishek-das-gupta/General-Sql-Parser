package gudu.parser.table.option;

import gudu.parser.TParseTree;

import java.util.List;

/**
 * Class that encapsulates all the table options of a create table.
 * */

public class TTableOptionList extends TParseTree {

  private final List<TTableOption> tableOptions;

  public TTableOptionList(List<TTableOption> tableOptions) {
    this.tableOptions = tableOptions;
  }

  public List<TTableOption> getTableOptions() {
    return tableOptions;
  }

  @Override
  public void unparse(StringBuilder writer) {
    int i = 0;
    for (TTableOption tableOption : tableOptions) {
      tableOption.unparse(writer);
      if (i != tableOptions.size() - 1) {
        writer.append(",\n");
      }
      i++;
    }
  }
}
