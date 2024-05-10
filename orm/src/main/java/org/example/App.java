package org.example;

import org.example.model.Column;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        DeleteQueryBuilder deleteQueryBuilder =  DeleteQueryBuilder.getInstance();

        System.out.println(deleteQueryBuilder.buildDeleteQuery(new Column("id", "story")));
    }
}
