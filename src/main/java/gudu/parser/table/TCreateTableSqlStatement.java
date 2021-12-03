package gudu.parser.table;


import gudu.parser.TParseTree;
import gudu.parser.table.column.TColumnDefinitionList;
import gudu.parser.table.expression.TLiteral;
import gudu.parser.table.option.TTableOptionList;
import gudu.parser.table.partition.TPTNodeList;

/**
 * Class that encapsulates create table AST.
 */

public class TCreateTableSqlStatement extends TParseTree {
  private final TLiteral tableName;
  private final TLiteral database;
  private final TLiteral schema;
  private final boolean isSet;
  private final boolean isMultiSet;
  private final boolean isGTT;
  private final boolean isVolatile;
  private final TTableOptionList tableOptionList;
  private final TColumnDefinitionList columnDefinitionList;
  private final TPTNodeList tptNodeList;

  private TCreateTableSqlStatement(Builder builder) {
    this.tableName = builder.tableName;
    this.database = builder.database;
    this.schema = builder.schema;
    this.isSet = builder.isSet;
    this.isMultiSet = builder.isMultiSet;
    this.isGTT = builder.isGTT;
    this.isVolatile = builder.isVolatile;
    this.tableOptionList = builder.tableOptionList;
    this.columnDefinitionList = builder.columnDefinitionList;
    this.tptNodeList = builder.tptNodeList;
  }

  public TLiteral getTableName() {
    return tableName;
  }

  public TLiteral getDatabase() {
    return database;
  }

  public TLiteral getSchema() {
    return schema;
  }

  public boolean isSet() {
    return isSet;
  }

  public boolean isMultiSet() {
    return isMultiSet;
  }

  public boolean isGTT() {
    return isGTT;
  }

  public boolean isVolatile() {
    return isVolatile;
  }

  public TTableOptionList getTableOptionList() {
    return tableOptionList;
  }

  public TColumnDefinitionList getColumnDefinitionList() {
    return columnDefinitionList;
  }

  public TPTNodeList getTptNodeList() {
    return tptNodeList;
  }

  @Override
  public String toString() {
    StringBuilder writer = new StringBuilder();
    unparse(writer);
    return writer.toString();
  }

  @Override
  public void unparse(StringBuilder writer) {
    writer.append("CREATE ");
    if (isSet) {
      writer.append("SET ");
    } else if (isMultiSet) {
      writer.append("MULTISET ");
    }
    if (isGTT) {
      writer.append("GLOBAL TEMPORARY ");
    } else if (isVolatile) {
      writer.append("VOLATILE ");
    }
    writer.append("TABLE ");
    if (database != null) {
      database.unparse(writer);
    }
    if (schema != null) {
      schema.unparse(writer);
    }
    tableName.unparse(writer);
    if (tableOptionList != null) {
      writer.append(", ");
      tableOptionList.unparse(writer);
    }
    writer.append(" ");
    columnDefinitionList.unparse(writer);
    if (tptNodeList != null) {
      tptNodeList.unparse(writer);
    }
    writer.append(";");
  }

  public static class Builder {
    private TLiteral tableName;
    private TLiteral database;
    private TLiteral schema;
    private boolean isSet;
    private boolean isMultiSet;
    private boolean isGTT;
    private boolean isVolatile;
    private TTableOptionList tableOptionList;
    private TColumnDefinitionList columnDefinitionList;
    private TPTNodeList tptNodeList;

    public Builder withTableName(TLiteral tableName) {
      this.tableName = tableName;
      return this;
    }

    public Builder withDatabase(TLiteral database) {
      this.database = tableName;
      return this;
    }

    public Builder withSchema(TLiteral schema) {
      this.schema = schema;
      return this;
    }

    public Builder withSet(boolean isSet) {
      this.isSet = isSet;
      return this;
    }

    public Builder withMultiSet(boolean isMultiSet) {
      this.isMultiSet = isMultiSet;
      return this;
    }

    public Builder withGTT(boolean isGTT) {
      this.isGTT = isGTT;
      return this;
    }

    public Builder withVolatile(boolean isVolatile) {
      this.isVolatile = isVolatile;
      return this;
    }

    public Builder withTableOptionList(TTableOptionList tableOptionList) {
      this.tableOptionList = tableOptionList;
      return this;
    }

    public Builder withTColumnDefinitionList(TColumnDefinitionList columnDefinitionList) {
      this.columnDefinitionList = columnDefinitionList;
      return this;
    }

    public Builder withTPTNodeList(TPTNodeList tptNodeList) {
      this.tptNodeList = tptNodeList;
      return this;
    }

    public TCreateTableSqlStatement build() {
      return new TCreateTableSqlStatement(this);
    }
  }
}
