package chapter10.opencloseprinciple.example1.refactored.sql;

import chapter10.opencloseprinciple.example1.Column;

class InsertSql implements Sql {
    public InsertSql(String table, Column[] columns, Object[] fields) {
        
    }

    @Override
    public String generate() {
        return "";
    }

    private String valuesList(Object[] fields, final Column[] columns) {
        return "";
    }
}
