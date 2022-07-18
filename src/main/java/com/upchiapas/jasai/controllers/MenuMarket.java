package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MenuMarket {

    @FXML
    private Button btnatras;

    @FXML
    private Button btninfo1;
    @FXML
    private Button btninfo2;

    @FXML
    void btnatras(MouseEvent event) {
        HelloApplication.setFXML("Interfaz","TU PLAZA VIRTUAL");
    }

    @FXML
    void btninfo1OnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuSuper1","Promoxiones Chedrahui");
    }

    @FXML
    void btninfo2OnMouseClicked(MouseEvent event){
        HelloApplication.setFXML("MenuSuper2", "Promoxiones La Comer");
    }


}
