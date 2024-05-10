package org.example.model;

public final class Column {

    private final String columnName;
    private final String tableName;

    public Column(final String columnName, final String tableName) {
        this.columnName = columnName;
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public String getTableName() {
        return tableName;
    }
}
