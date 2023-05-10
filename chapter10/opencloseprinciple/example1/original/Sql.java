package chapter10.opencloseprinciple.example1.original;


import chapter10.opencloseprinciple.example1.Column;
import chapter10.opencloseprinciple.example1.Criteria;

public abstract class Sql {
    public abstract String create();

    public abstract String insert(Object[] fields);

    public abstract String selectAll();

    public abstract String findByKey(String keyColumn, String keyValue);

    public abstract String select(Column column, String pattern);

    public abstract String select(Criteria criteria);

    public abstract String preparedInsert();

    private String columnList(Column[] columns) {
        return "";
    }

    private String valuesList(Object[] fields, final Column[] columns) {
        return "";
    }

    private String selectWithCriteria(String criteria) {
        return "";
    }

    private String placeholderList(Column[] columns) {
        return "";
    }
}