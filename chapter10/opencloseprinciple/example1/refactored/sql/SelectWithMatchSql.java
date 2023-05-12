package chapter10.opencloseprinciple.example1.refactored.sql;

import chapter10.opencloseprinciple.example1.Column;

class SelectWithMatchSql implements Sql {
    public SelectWithMatchSql(
            String table, Column[] columns, Column column, String pattern) {
    }

    @Override
    public String generate() {
        return "";
    }
}
