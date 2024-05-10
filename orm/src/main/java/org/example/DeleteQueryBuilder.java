package org.example;

import org.example.model.Column;
import org.example.model.KeywordConstraints;

public class DeleteQueryBuilder {

    private static DeleteQueryBuilder deleteQueryBuilder;

    private DeleteQueryBuilder() {
    }

    public static DeleteQueryBuilder getInstance() {
        return deleteQueryBuilder == null ? new DeleteQueryBuilder() : deleteQueryBuilder;
    }

    public String buildDeleteQuery(final Column column) {
        return String.join(" ", KeywordConstraints.DELETE.getValue(), KeywordConstraints.FROM.getValue(),
                column.getTableName(), KeywordConstraints.WHERE.getValue(), column.getColumnName(),
                KeywordConstraints.EQUALS.getValue(), KeywordConstraints.PLACEHOLDER.getValue());
    }
}
