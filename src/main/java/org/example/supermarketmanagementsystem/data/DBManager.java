package org.example.supermarketmanagementsystem.data;

import java.sql.*;

public class DBManager {

    private static DBManager instance;
    private Connection connection;

    private DBManager() {
        initializeConnection();
    }

    public static DBManager getInstance() {
        if (instance == null) {
            instance = new DBManager();
        }
        return instance;
    }

    private void initializeConnection() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/test";
        String userName = "root";
        String password = "";

        try {
            connection = DriverManager.getConnection(jdbcUrl,userName,password);
            System.out.println("Connected to the database!");
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet execute(String sql) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

//            statement.close();
            return resultSet;
        }catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error while executing sql");
            return null;
        }
    }
}
