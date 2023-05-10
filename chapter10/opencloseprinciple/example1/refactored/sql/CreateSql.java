package chapter10.opencloseprinciple.example1.refactored.sql;

import chapter10.opencloseprinciple.example1.Column;

class CreateSql extends Sql {
    public CreateSql(String table, Column[] columns) {
        super(table, columns);
    }

    @Override
    public String generate() {
        return "";
    }
}
