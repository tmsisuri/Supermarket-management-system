package org.example.supermarketmanagementsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.getIcons().add(new Image(HelloApplication.class.getResource("images/shop-flat-design-long-shadow-glyph-icon-grocery-store-coffee-house-cafe-vector-silhouette-illustration-2AEPPFP.jpg").toString()));
        stage.setTitle("Supermarket");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}