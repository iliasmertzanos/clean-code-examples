package chapter10.opencloseprinciple.refactored.sql;

import chapter10.opencloseprinciple.Column;

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
