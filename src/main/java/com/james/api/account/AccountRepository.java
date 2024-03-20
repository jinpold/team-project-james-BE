package com.james.api.account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class AccountRepository {
    private static AccountRepository instance;

    static {
        try {
            instance = new AccountRepository();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Connection connection;
    private AccountRepository() throws SQLException {

        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jamesdb",
                "james",
                "password");
    }
    public static AccountRepository getInstance() {
        return instance;
    }
}
