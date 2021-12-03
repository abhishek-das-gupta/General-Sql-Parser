package gudu.parser.table.option;

/**
 * Class that encapsulates after journal table options.
 * */

public class TAfterJournalTableOption extends TTableOption {
  private final boolean isNoTokenPresent;
  private final boolean isDualTokenPresent;

  public TAfterJournalTableOption(boolean isNoTokenPresent, boolean isDualTokenPresent) {
    this.isNoTokenPresent = isNoTokenPresent;
    this.isDualTokenPresent = isDualTokenPresent;
  }

  public boolean isNoTokenPresent() {
    return isNoTokenPresent;
  }

  public boolean isDualTokenPresent() {
    return isDualTokenPresent;
  }

  @Override
  public void unparse(StringBuilder writer) {
    if (isNoTokenPresent) {
      writer.append("NO ");
    } else if (isDualTokenPresent) {
      writer.append("DUAL ");
    }
    writer.append("AFTER JOURNAL");
  }
}
