package gudu.parser.table.option;

/**
 * Class that encapsulates block merge ration table option.
 * */

public class TBlockMergeRatioOption extends TTableOption {

  @Override
  public void unparse(StringBuilder writer) {
    writer.append("DEFAULT MERGEBLOCKRATIO");
  }
}
