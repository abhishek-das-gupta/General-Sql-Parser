package gudu.parser.table.column;


import gudu.parser.TParseTree;
import gudu.parser.table.column.attribute.TColumnAttributeList;
import gudu.parser.table.expression.TExpression;
import gudu.parser.table.expression.TLiteral;

import java.util.Objects;

/**
 * Class that encapsulates single column definition.
 * */

public class TColumnDefinition extends TParseTree {
    private final TLiteral columnName;
    private final TLiteral dataType;
    private final TColumnAttributeList columnAttributeList;

    public TColumnDefinition(TLiteral columnName, TLiteral dataType, TColumnAttributeList columnAttributeList) {
        this.columnName = columnName;
        this.dataType = dataType;
        this.columnAttributeList = columnAttributeList;
    }

    public TLiteral getColumnName() {
        return columnName;
    }

    public TLiteral getDataType() {
        return dataType;
    }

    public TColumnAttributeList getColumnAttributeList() { return columnAttributeList; }

    @Override
    public void unparse(StringBuilder writer) {
        columnName.unparse(writer);
        writer.append(" ");
        dataType.unparse(writer);
        if (columnAttributeList != null) {
            writer.append(" ");
            columnAttributeList.unparse(writer);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TColumnDefinition that = (TColumnDefinition) o;
        return Objects.equals(columnName, that.columnName) &&
                Objects.equals(dataType, that.dataType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName, dataType);
    }
}
