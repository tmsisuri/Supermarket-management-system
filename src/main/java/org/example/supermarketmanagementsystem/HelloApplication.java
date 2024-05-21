package org.example.supermarketmanagementsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.example.supermarketmanagementsystem.data.UserRepository;
import org.example.supermarketmanagementsystem.data.model.User;

import java.io.IOException;
import java.util.List;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.getIcons().add(new Image(HelloApplication.class.getResource("images/shop-flat-design-long-shadow-glyph-icon-grocery-store-coffee-house-cafe-vector-silhouette-illustration-2AEPPFP.jpg").toString()));
        stage.setTitle("Supermarket");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();

        List<User> users = UserRepository.getInstance().getUsers();
        users.forEach(user -> System.out.println(user.toString()));
    }

    public static void main(String[] args) {
        launch();
    }
}