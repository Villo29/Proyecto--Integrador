package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class register {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnregister;

    @FXML
    private PasswordField txtpass;

    @FXML
    private TextField txtusuario;

    @FXML
    void btnBackOnMouseClick(MouseEvent event) {
        HelloApplication.setFXML("loginmenu","JASAI ");
    }

    @FXML
    void btnregisterOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("login","TU PLAZA VIRTUAL");
    }

}
