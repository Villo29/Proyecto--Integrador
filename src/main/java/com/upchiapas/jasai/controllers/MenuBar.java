package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MenuBar {

    @FXML
    private Button btnatras;

    @FXML
    private Button btninfo;

    @FXML
    private Button btninfo1;

    @FXML
    private Button btninfo2;

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Interfaz","TU PLAZA VIRTUAL");
    }

    @FXML
    void btninfo1OnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuBar2","LOS MAS CERCA DE TI ");
    }

    @FXML
    void btninfo2OnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuBar3","LOS MAS CERCA DE TI ");
    }

    @FXML
    void btninfoOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuBar1","LOS MAS CERCA DE TI ");
    }

}
