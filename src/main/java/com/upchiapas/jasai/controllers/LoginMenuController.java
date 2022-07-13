package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
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
        HelloApplication.setFXML("registerCompany", "Registrar Compañia");
    }

    @FXML
    void btninicioOnMouseClicked(MouseEvent event) throws IOException {

        HelloApplication.setFXML("login", "Menu Inicio");

    }

    @FXML
    void btnregistraOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("register", "Registrar Usuario");
    }

}
