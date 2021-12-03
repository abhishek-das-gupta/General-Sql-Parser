package gudu.parser.table.column;

import gudu.parser.TParseTree;

import java.util.List;

/**
 * Class that encapsulates list of <code>TColumnDefinition</code>.
 * */

public class TColumnDefinitionList extends TParseTree {
    private final List<TColumnDefinition> columns;

    public TColumnDefinitionList(List<TColumnDefinition> columns) {
        this.columns = columns;
    }

    public List<TColumnDefinition> toStatementList() {
        return this.columns;
    }

    @Override
    public void unparse(StringBuilder writer) {
        writer.append("(\n");
        for (TColumnDefinition colDef: columns) {
            colDef.unparse(writer);
            writer.append(",\n");
        }
        writer.append(")\n");
    }
}
