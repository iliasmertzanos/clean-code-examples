package chapter10.opencloseprinciple.refactored.sql;

import chapter10.opencloseprinciple.Column;

class PreparedInsertSql extends Sql {
    public PreparedInsertSql(String table, Column[] columns) {
        super(table, columns);
    }

    @Override
    public String generate() {
        return "";
    }

    private String placeholderList(Column[] columns) {
        return "";
    }
}
