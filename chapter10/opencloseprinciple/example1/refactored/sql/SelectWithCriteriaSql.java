package chapter10.opencloseprinciple.example1.refactored.sql;

import chapter10.opencloseprinciple.example1.Column;
import chapter10.opencloseprinciple.example1.Criteria;

class SelectWithCriteriaSql implements Sql {
    public SelectWithCriteriaSql(
            String table, Column[] columns, Criteria criteria) {

    }

    @Override
    public String generate() {
        return "";
    }
}
