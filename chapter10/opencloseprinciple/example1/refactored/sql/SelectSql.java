package chapter10.opencloseprinciple.example1.refactored.sql;

import chapter10.opencloseprinciple.example1.Column;

class SelectSql extends Sql {
    public SelectSql(String table, Column[] columns) {
        super(table, columns);
    }

    @Override
    public String generate() {
        return "";
    }
}
