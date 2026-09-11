package com.example.web;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/simpledb", "root", "your_password"
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
