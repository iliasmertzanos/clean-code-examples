package chapter10.opencloseprinciple.example1.refactored.sql;

import chapter10.opencloseprinciple.example1.Column;

class CreateSql implements Sql {
    public CreateSql(String table, Column[] columns) {
        
    }

    @Override
    public String generate() {
        return "";
    }
}
