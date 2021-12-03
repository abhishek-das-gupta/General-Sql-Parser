package gudu.parser.table.option;

/**
 * Class that encapsulates before journal table option.
 * */

public class TBeforeJournalOption extends TTableOption {
  private final boolean isNoTokenPresent;
  private final boolean isDualTokenPresent;
  private final boolean isBeforeTokenPresent;

  public TBeforeJournalOption(boolean isNoTokenPresent, boolean isDualTokenPresent, boolean isBeforeTokenPresent) {
    this.isNoTokenPresent = isNoTokenPresent;
    this.isDualTokenPresent = isDualTokenPresent;
    this.isBeforeTokenPresent = isBeforeTokenPresent;
  }

  public boolean isNoTokenPresent() {
    return isNoTokenPresent;
  }

  public boolean isDualTokenPresent() {
    return isDualTokenPresent;
  }

  public boolean isBeforeTokenPresent() {
    return isBeforeTokenPresent;
  }

  @Override
  public void unparse(StringBuilder writer) {
    if (isNoTokenPresent) {
      writer.append("NO ");
    } else if (isDualTokenPresent) {
      writer.append("DUAL ");
    }
    if (isBeforeTokenPresent) {
      writer.append("BEFORE ");
    }
    writer.append("JOURNAL");
  }
}
