package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class Perfil {

    @FXML
    private Button btnin;

    @FXML
    private Button btnperfil;

    @FXML
    private TextArea txtarea;

    @FXML
    void btninOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Interfaz", "TU PLAZA VIRTUAL");
    }

    @FXML
    void btnperfilOnMouseClicked(MouseEvent event) {

    }
}