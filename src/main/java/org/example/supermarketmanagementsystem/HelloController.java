package org.example.supermarketmanagementsystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

//    @FXML
//    public void signUp() {"go to Registration"}

    @FXML
    private Button signUp;

    @FXML
    void registration(MouseEvent event) throws IOException {
        Stage stage = (Stage)signUp.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view1.fxml"));
        stage.setTitle("Registration form");
        //Scene scene1 = new Scene(fxmlLoader.load());
        stage.setScene(new Scene(fxmlLoader.load()));
        //stage.show();
    }

    @FXML
    public void onLogin(){
        System.out.println("Login...");
    }

}