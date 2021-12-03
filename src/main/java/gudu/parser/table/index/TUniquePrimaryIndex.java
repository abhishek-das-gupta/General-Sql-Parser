package gudu.parser.table.index;

import gudu.parser.TParseTree;
import gudu.parser.table.column.TColumnDefinition;
import gudu.parser.table.column.TColumnDefinitionList;
import gudu.parser.table.expression.TLiteral;

import java.util.List;

/**
 * Class that encapsulates Unique Primary Index node in a create table AST.
 */

public class TUniquePrimaryIndex extends TIndexDefinition {
  private final boolean isUnique;
  private final boolean isPrimary;
  private final TLiteral indexName;
  private final TColumnDefinitionList indexColumnList;

  private TUniquePrimaryIndex(Builder builder) {
    this.isUnique = builder.isUnique;
    this.isPrimary = builder.isPrimary;
    this.indexName = builder.indexName;
    this.indexColumnList = builder.indexColumnList;
  }

  public boolean isUnique() {
    return isUnique;
  }

  public boolean isPrimary() {
    return isPrimary;
  }

  public TParseTree getIndexName() {
    return indexName;
  }

  public TParseTree getIndexColumnList() {
    return indexColumnList;
  }

  public static class Builder {
    private boolean isUnique;
    private boolean isPrimary;
    private TLiteral indexName;
    private TColumnDefinitionList indexColumnList;

    public Builder withIsUnique(boolean isUnique) {
      this.isUnique = isUnique;
      return this;
    }

    public Builder withIsPrimary(boolean isPrimary) {
      this.isPrimary = isPrimary;
      return this;
    }

    public Builder withIndexName(TLiteral indexName) {
      this.indexName = indexName;
      return this;
    }

    public Builder withIndexColumnList(TColumnDefinitionList indexColumnList) {
      this.indexColumnList = indexColumnList;
      return this;
    }

    public TParseTree build() {
      return new TUniquePrimaryIndex(this);
    }
  }

  @Override
  public void unparse(StringBuilder writer) {
    if (isUnique) {
      writer.append("UNIQUE ");
    }
    writer.append("PRIMARY INDEX ");
    if (indexName != null) {
      indexName.unparse(writer);
    }
    writer.append("(");
    int i = 0;
    List<TColumnDefinition> indexColumns = indexColumnList.toStatementList();
    for (TColumnDefinition colDef : indexColumns) {
      writer.append(colDef.getColumnName().getVal());
      if (i != indexColumns.size() - 1) {
        writer.append(", ");
      }
      i++;
    }
    writer.append(")\n");
  }


}
