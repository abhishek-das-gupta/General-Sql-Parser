package gudu.parser.table.expression;

/**
 * Class that encapsulates <code>loading</code> in <code>TUniqueSecondaryIndex</code>
 */

public class TLoadExpression extends TLiteral {
  private final boolean noToken;

  public TLoadExpression(boolean noToken) {
    super("", false, null);
    this.noToken = noToken;
  }

  @Override
  public void unparse(StringBuilder writer) {
    writer.append("WITH ").append(noToken ? "NO " : "").append("LOAD ENTITY");
  }

}
