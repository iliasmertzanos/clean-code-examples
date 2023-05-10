package chapter10.opencloseprinciple.refactored.sql;

import chapter10.opencloseprinciple.Column;

class InsertSql extends Sql {
    public InsertSql(String table, Column[] columns, Object[] fields) {
        super(table, columns);
    }

    @Override
    public String generate() {
        return "";
    }

    private String valuesList(Object[] fields, final Column[] columns) {
        return "";
    }
}
