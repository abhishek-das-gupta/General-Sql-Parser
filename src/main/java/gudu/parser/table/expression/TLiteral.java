package gudu.parser.table.expression;

import java.util.Objects;

/**
 * Class to encapsulate literal node in an AST.
 */

public class TLiteral extends TExpression {

  private final String val;
  private final boolean quotesPresent;
  private final String castToken;

  public TLiteral(String val, boolean quotesPresent, String castToken) {
    this.val = val;
    this.quotesPresent = quotesPresent;
    this.castToken = castToken;
  }

  public String getVal() {
    return val;
  }

  @Override
  public void unparse(StringBuilder writer) {
    if (castToken != null) {
      writer.append(castToken);
      writer.append(" ");
    }
    if (quotesPresent) {
      writer.append("'");
    }
    writer.append(val);
    if (quotesPresent) {
      writer.append("'");
    }
    writer.append(" ");
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TLiteral tLiteral = (TLiteral) o;
    return Objects.equals(val, tLiteral.val);
  }

  @Override
  public int hashCode() {
    return Objects.hash(val);
  }
}
