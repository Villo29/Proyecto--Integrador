package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MenuRestau {

    @FXML
    private Button btnatras;

    @FXML
    private Button btninfo1;

    @FXML
    private Button btninfo2;

    @FXML
    private Button btninfo3;

    @FXML
    private Button btnvermas;

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Interfaz","TU PLAZA VIRTUAL");
    }

    @FXML
    void btninfo1OnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuResta1","LOS MAS CERCA DE TI ");
    }

    @FXML
    void btninfo3OnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuResta3","LOS MAS CERCA DE TI ");
    }
    @FXML
    void btninfo2OnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuResta2","LOS MAS CERCA DE TI ");
    }

    @FXML
    void btnvermasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("registerCompany3","VER MAS OPCIONES");
    }

}
