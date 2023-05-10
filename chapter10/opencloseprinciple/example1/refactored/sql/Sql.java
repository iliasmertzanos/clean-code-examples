package chapter10.opencloseprinciple.example1.refactored.sql;

import chapter10.opencloseprinciple.example1.Column;

abstract public class Sql {
   public Sql(String table, Column[] columns) {};
   abstract public String generate();
}

