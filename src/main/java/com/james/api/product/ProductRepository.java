package com.james.api.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ProductRepository {
    private static ProductRepository instance;

    static {
        try {
            instance = new ProductRepository();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Connection connection;
    private ProductRepository() throws SQLException {

        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jamesdb",
                "james",
                "password");
    }
    public static ProductRepository getInstance() {
        return instance;
    }
}
