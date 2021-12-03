package gudu.parser.table.option;

/**
 * Class holds information about fallback option.
 * */

public class TFallBackOption extends TTableOption {
  private final boolean isNoTokenPresent;
  private final boolean isProtectionPresent;

  public TFallBackOption(boolean isNoTokenPresent, boolean isProtectionPresent) {
    this.isNoTokenPresent = isNoTokenPresent;
    this.isProtectionPresent = isProtectionPresent;
  }

  public boolean isNoTokenPresent() {
    return isNoTokenPresent;
  }

  public boolean isProtectionPresent() {
    return isProtectionPresent;
  }

  @Override
  public void unparse(StringBuilder writer) {
    if (isNoTokenPresent) {
      writer.append("NO ");
    }
    writer.append("FALLBACK");
    if (isProtectionPresent) {
      writer.append(" PROTECTION");
    }
  }
}
