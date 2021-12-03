package gudu.parser.table.expression;

/**
 * Enums for operator tokens
 */

public enum EOperatorToken {

  AND("AND"),
  BETWEEN("BETWEEN"),
  LESS_THAN("<"),
  LESS_THAN_EQUALS("<="),
  GREATER_THAN(">"),
  GREATER_THAN_EQUALS(">=");

  String val;

  EOperatorToken(String val) {
    this.val = val;
  }

  public static EOperatorToken getOperatorEnum(String val) {
    switch (val.toLowerCase()) {
      case "and":
        return AND;
      case "between":
        return BETWEEN;
      case "<":
        return LESS_THAN;
      case "<=":
        return LESS_THAN_EQUALS;
      case ">":
        return GREATER_THAN;
      case ">=":
        return GREATER_THAN_EQUALS;
      default:
        return null;
    }
  }

}
