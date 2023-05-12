package chapter10.opencloseprinciple.example1.refactored.sql;

import chapter10.opencloseprinciple.example1.Column;

class PreparedInsertSql implements Sql {
    public PreparedInsertSql(String table, Column[] columns) {
        
    }

    @Override
    public String generate() {
        return "";
    }

    private String placeholderList(Column[] columns) {
        return "";
    }
}
