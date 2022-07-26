package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import com.upchiapas.jasai.models.ValidateUser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class Perfil extends ValidateUser {

    @FXML
    private Hyperlink hlOne;

    @FXML
    void handlehlOne(ActionEvent event) {
    }

    @FXML
    private Label txtArea2;

    @FXML
    private TextField txtA;

    @FXML
    private TextArea txtComentarios;

    @FXML
    private Button actualizarButton;

    @FXML
    private Button btnatras;

    byte visitas=13;

    @FXML
    void visit(MouseEvent event) {

    }

    @FXML
    public void actualizar(ActionEvent event) {
        registerCompany tm = new registerCompany();
        txtArea2.setText(tm.getNombreComercio());
        txtA.setText(String.valueOf(visitas));
        txtComentarios.setText("NOMBRE:DAVID R" + "\nUSUARIO: VILLO "+ "\nPASSWORD: 2905");

        visitas= (byte) (visitas+1);
    }
    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Interfaz","TU PLAZA VIRTUAL");
    }
}