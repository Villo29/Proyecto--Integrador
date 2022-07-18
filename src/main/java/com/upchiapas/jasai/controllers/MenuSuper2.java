package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MenuSuper2 {

    @FXML
    private Button btnatras;

    @FXML
    private Button btnubicacion;

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuMarket", "Tu Super Cercas");
    }

    @FXML
    void btnubicacionOnMouseClicked(MouseEvent event) {

    }

}
