package chapter10.opencloseprinciple.refactored.sql;

import chapter10.opencloseprinciple.Column;

abstract public class Sql {
   public Sql(String table, Column[] columns) {};
   abstract public String generate();
}

