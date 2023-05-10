package chapter10.opencloseprinciple.refactored.sql;

import chapter10.opencloseprinciple.Column;

class CreateSql extends Sql {
    public CreateSql(String table, Column[] columns) {
        super(table, columns);
    }

    @Override
    public String generate() {
        return "";
    }
}
