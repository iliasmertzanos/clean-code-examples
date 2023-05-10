package chapter10.opencloseprinciple.refactored.sql;

import chapter10.opencloseprinciple.Column;
import chapter10.opencloseprinciple.Criteria;

class SelectWithCriteriaSql extends Sql {
    public SelectWithCriteriaSql(
            String table, Column[] columns, Criteria criteria) {
        super(table, columns);
    }

    @Override
    public String generate() {
        return "";
    }
}
