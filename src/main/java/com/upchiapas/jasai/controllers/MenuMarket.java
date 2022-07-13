package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MenuMarket {

    @FXML
    private Button btnatras;

    @FXML
    void btnatras(MouseEvent event) {
        HelloApplication.setFXML("Interfaz","Tu Plaza Virtual");
    }
}
