package com.upchiapas.jasai.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

public class LoginMenuController {

    @FXML
    private Button btncomercio;

    @FXML
    private Button btninicio;

    @FXML
    private Button btnregistra;

    @FXML
    void btncomercioOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void btninicioOnMouseClicked(MouseEvent event) throws IOException {

       // Login login= new Login();
       // FXMLLoader loader= new FXMLLoader();
        //AnchorPane root=(AnchorPane) loader.load(Objects.requireNonNull(getClass().getResource("login.fxml")).openStream());

       // Login login LoginInstacia=(Login)loader.getController();

    }

    @FXML
    void btnregistraOnMouseClicked(MouseEvent event) {
            System.exit(1);
    }

}
