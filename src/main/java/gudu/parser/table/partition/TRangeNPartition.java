package gudu.parser.table.partition;

import gudu.parser.TParseTree;
import gudu.parser.table.expression.TExpression;
import gudu.parser.table.expression.TLiteral;

import java.util.List;

/**
 * Class that encapsulates RANGE_N partition AST node.
 */

public class TRangeNPartition extends TPartitionExpression {
  private final TExpression partitionColumn;
  private final TRangeExpressionList rangeExpressionList;

  public TRangeNPartition(TExpression partitionColumn, TRangeExpressionList rangeExpressions) {
    this.partitionColumn = partitionColumn;
    this.rangeExpressionList = rangeExpressions;
  }

  public TExpression getPartitionColumn() {
    return partitionColumn;
  }

  public TRangeExpressionList getRangeExpressionList() {
    return rangeExpressionList;
  }

  @Override
  public void unparse(StringBuilder writer) {
    writer.append("RANGE_N");
    writer.append("( ");
    partitionColumn.unparse(writer);
    writer.append(" BETWEEN ");
    rangeExpressionList.unparse(writer);
    writer.append(" )");
  }

  public static class TRangeExpressionList extends TParseTree {
    private final List<TRangeExpression> rangeExpressions;

    public TRangeExpressionList(List<TRangeExpression> rangeExpressions) {
      this.rangeExpressions = rangeExpressions;
    }

    public List<TRangeExpression> getRangeExpressions() {
      return rangeExpressions;
    }

    public void unparse(StringBuilder writer) {
      int i = 0;
      for (TRangeExpression rangeExpression : rangeExpressions) {
        rangeExpression.unparse(writer);
        if (i != rangeExpressions.size() - 1) {
          writer.append(", ");
        }
        i++;
      }
    }
  }

  public static class TRangeExpression extends TParseTree {
    private final TExpression startExpression;
    private final TExpression endExpression;
    private final TRangeSize rangeSize;

    public TRangeExpression(TExpression startExpression, TExpression endExpression, TRangeSize rangeSize) {
      this.startExpression = startExpression;
      this.endExpression = endExpression;
      this.rangeSize = rangeSize;
    }

    public TExpression getStartExpression() {
      return startExpression;
    }

    public TExpression getEndExpression() {
      return endExpression;
    }

    public TRangeSize getRangeSize() {
      return rangeSize;
    }

    @Override
    public void unparse(StringBuilder writer) {
      startExpression.unparse(writer);
      writer.append("AND ");
      endExpression.unparse(writer);
      if (rangeSize != null) {
        rangeSize.unparse(writer);
      }
    }
  }

  public static class TRangeSize extends TParseTree {
    private final boolean isIntervalTokenPresent;
    private final TLiteral rangeSize;
    private final TLiteral rangeType;

    public TRangeSize(boolean isIntervalTokenPresent, TLiteral rangeSize, TLiteral rangeType) {
      this.isIntervalTokenPresent = isIntervalTokenPresent;
      this.rangeSize = rangeSize;
      this.rangeType = rangeType;
    }

    public boolean isIntervalTokenPresent() {
      return isIntervalTokenPresent;
    }

    public TLiteral getRangeSize() {
      return rangeSize;
    }

    public TLiteral getRangeType() {
      return rangeType;
    }

    @Override
    public void unparse(StringBuilder writer) {
      writer.append("EACH ");
      if (isIntervalTokenPresent) {
        writer.append("INTERVAL ");
      }
      rangeSize.unparse(writer);
      if (rangeType != null) {
        rangeType.unparse(writer);
      }
    }
  }
}
