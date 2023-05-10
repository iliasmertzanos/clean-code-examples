package chapter10.opencloseprinciple.example1.refactored.sql;

import chapter10.opencloseprinciple.example1.Column;

class FindByKeySql extends Sql {
    public FindByKeySql(
            String table, Column[] columns, String keyColumn, String keyValue) {
        super(table, columns);
    }

    @Override
    public String generate() {
        return "";
    }
}
