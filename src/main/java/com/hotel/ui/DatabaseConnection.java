package com.hotel.ui;

import java.sql.*;

public class DatabaseConnection {

    private static final String jdbcUrl = "jdbc:sqlserver://localhost:1433;databaseName=hotel";
    private static final String username = "zzz";
    private static final String password = "zzz";
    private static Connection connection;

    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(jdbcUrl, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    public static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
