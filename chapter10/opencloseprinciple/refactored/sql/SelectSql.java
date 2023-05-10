package chapter10.opencloseprinciple.refactored.sql;

import chapter10.opencloseprinciple.Column;

class SelectSql extends Sql {
    public SelectSql(String table, Column[] columns) {
        super(table, columns);
    }

    @Override
    public String generate() {
        return "";
    }
}
