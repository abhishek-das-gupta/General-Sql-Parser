package gudu.parser.table.option;

/**
 * Class that encapsulates checksum table option.
 * */

public class TChecksumOption extends TTableOption {

  @Override
  public void unparse(StringBuilder writer) {
    writer.append("CHECKSUM = ");
    writer.append("DEFAULT");
  }
}
