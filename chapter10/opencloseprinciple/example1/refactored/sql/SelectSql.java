package chapter10.opencloseprinciple.example1.refactored.sql;

import chapter10.opencloseprinciple.example1.Column;

class SelectSql implements Sql {
    public SelectSql(String table, Column[] columns) {
        
    }

    @Override
    public String generate() {
        return "";
    }
}
