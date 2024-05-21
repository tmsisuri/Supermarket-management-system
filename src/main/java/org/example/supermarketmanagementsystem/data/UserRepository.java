package org.example.supermarketmanagementsystem.data;

import org.example.supermarketmanagementsystem.data.model.User;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private static UserRepository instance;

    private UserRepository() {
    }

    public static UserRepository getInstance() {
        if(instance == null) {
            instance = new UserRepository();
        }

        return instance;
    }

    public List<User> getUsers() {
        try {
            String sql = "SELECT * FROM mytable";
            ResultSet resultSet = DBManager.getInstance().execute(sql);

            List<User> users = new ArrayList<>();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                User user = new User(id,name);
                users.add(user);
            }
            resultSet.close();

            return users;
        } catch (SQLException e) {
            System.out.println("Error while fetching users");
            return List.of();
        }
    }
}
