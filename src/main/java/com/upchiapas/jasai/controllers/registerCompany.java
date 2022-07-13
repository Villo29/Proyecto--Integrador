package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class registerCompany {

    @FXML
    private Button btnContinue;

    @FXML
    private Button btnback;

    @FXML
    void btnbackOnMouseClick(MouseEvent event) {
        HelloApplication.setFXML("loginMenu","JASAI");
    }

    @FXML
    void btncontinuarOnMouseClick(MouseEvent event) {
        HelloApplication.setFXML("registerCompany2","JASAI");
    }

}
