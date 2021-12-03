package gudu.parser.table.column.attribute;

/**
 * Class that encapsulates the case specific attribute of a column.
 * */

public class TCaseSpecificAttribute extends TColumnAttribute {
  private final boolean isCaseSpecific;
  private final boolean isCsTokenPresent;

  public TCaseSpecificAttribute(boolean isCaseSpecific, boolean isCsTokenPresent) {
    this.isCaseSpecific = isCaseSpecific;
    this.isCsTokenPresent = isCsTokenPresent;
  }

  public boolean isCaseSpecific() {
    return isCaseSpecific;
  }

  @Override
  public void unparse(StringBuilder writer) {
    if (!isCaseSpecific) {
      writer.append("NOT ");
    }
    if (isCsTokenPresent) {
      writer.append("CS");
    } else {
      writer.append("CASESPECIFIC");
    }
  }
}
