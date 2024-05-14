package org.example.supermarketmanagementsystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloController {

    @FXML
    private Button signUp;

    @FXML
    private Label label_welcome;

    @FXML
    private Label label_sing_up;

    @FXML
    void registration(MouseEvent event) throws IOException {
        Stage stage = (Stage)signUp.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view1.fxml"));
        stage.setTitle("Registration form");
        stage.setScene(new Scene(fxmlLoader.load()));
    }

    @FXML
    private Button login;

    @FXML
    void goToHomePage(MouseEvent event) throws IOException {
        Stage stage = (Stage)login.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("home-page.fxml"));
        stage.setTitle("Dashboard");
        stage.setScene(new Scene(fxmlLoader.load()));
    }

    @FXML
    public void onLogin(){
        System.out.println("Login...");
    }

}