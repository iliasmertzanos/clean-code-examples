package chapter10.opencloseprinciple.refactored.sql;

import chapter10.opencloseprinciple.Column;

class SelectWithMatchSql extends Sql {
    public SelectWithMatchSql(
            String table, Column[] columns, Column column, String pattern) {
        super(table, columns);
    }

    @Override
    public String generate() {
        return "";
    }
}
