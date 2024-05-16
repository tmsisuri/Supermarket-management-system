package org.example.supermarketmanagementsystem;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/test";
        String userName = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);
        System.out.println("test");
    }
}
