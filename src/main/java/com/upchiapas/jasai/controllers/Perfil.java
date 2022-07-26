package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import com.upchiapas.jasai.models.ValidateUser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class Perfil extends ValidateUser {

    @FXML
    private Button actualizarButton;

    @FXML
    private Button btnatras;

    @FXML
    private Label txtArea2;

    @FXML
    private TextArea txtComentarios;

    @FXML
    private Label txtlabel;

    @FXML
    void actualizar(ActionEvent event) {
        registerCompany tm = new registerCompany();
        txtArea2.setText(tm.getNombreComercio());
        //txtA.setText(String.valueOf(visitas));
        txtComentarios.setText("NOMBRE:DAVID R" + "\nUSUARIO: VILLO "+ "\nPASSWORD: 2905");

       // visitas= (byte) (visitas+1);
    }

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Interfaz","TU PLAZA VIRTUAL");

    }

    @FXML
    void visit(MouseEvent event) {

    }

}
