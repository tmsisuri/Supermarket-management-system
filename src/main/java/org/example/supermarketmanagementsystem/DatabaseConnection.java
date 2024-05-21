package org.example.supermarketmanagementsystem;

import org.example.supermarketmanagementsystem.data.DBManager;

import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/test";
        String userName = "root";
        String password = "";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(jdbcUrl,userName,password);

            System.out.println("Connected to the database!");
            System.out.println("test");

            Statement statement = connection.createStatement();

            String sql = "SELECT * FROM mytable";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            resultSet.close();

            statement.close();
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the connection
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Disconnected from the database.");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
