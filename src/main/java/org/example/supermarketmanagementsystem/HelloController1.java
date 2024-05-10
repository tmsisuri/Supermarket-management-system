package org.example.supermarketmanagementsystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController1 {
    @FXML
    private Button goBack;

    @FXML
    void goBackWelcomePage(MouseEvent event) throws IOException {
        Stage stage = (Stage)goBack.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        stage.setTitle("Supermarket");
        stage.setScene(new Scene(fxmlLoader.load()));
    }
}
