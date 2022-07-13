package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import com.upchiapas.jasai.models.ValidateUser;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Login {

    @FXML
    private Button btnInicio;

    @FXML
    private Button btnSalir;

    @FXML
    private PasswordField txtcontra;

    @FXML
    private TextField txtuser;

    @FXML
    void btnSalirOnMouseClicked(MouseEvent event) {
        System.exit(1);
    }

    @FXML
    void btninicioOnMouseClick(MouseEvent event) {
        ValidateUser user= new ValidateUser();
        if (user.auntenticarUser(txtuser.getText(),txtcontra.getText())){
           HelloApplication.setFXML("Interfaz","TU PLAZA VIRTUAL");
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Usuario No Existe");
            alert.showAndWait();
        }

    }

}
