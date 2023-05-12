package chapter10.opencloseprinciple.example1.refactored.sql;

import chapter10.opencloseprinciple.example1.Column;

class FindByKeySql implements Sql {
    public FindByKeySql(
            String table, Column[] columns, String keyColumn, String keyValue) {
        
    }

    @Override
    public String generate() {
        return "";
    }
}
