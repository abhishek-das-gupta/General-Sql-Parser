package gudu.parser;

/**
 * Intermediate representation (IR) for Teradata sql AST.
 */

public abstract class TParseTree {

  public abstract void unparse(StringBuilder writer);

  @Override
  public String toString() {
    StringBuilder writer = new StringBuilder();
    this.unparse(writer);
    return writer.toString();
  }
}
