package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class registerCompany2 {

    @FXML
    private Button btnBrowse;

    @FXML
    private Button btnBrowse1;

    @FXML
    private Button btnFinalizar;

    @FXML
    private Button btnback;

/*    @FXML
    void btnFinalizarOnMouseClick(MouseEvent event) {
        System.exit(1);
    }*/

    @FXML
    void btnFinalizarOnMouseClick(MouseEvent event) {HelloApplication.setFXML("Interfaz","TU PLAZA VIRTUAL");}

    @FXML
    void btnbackOnMouseClick(MouseEvent event) {
        HelloApplication.setFXML("registerCompany","Registre Su Compañia");
    }


}
