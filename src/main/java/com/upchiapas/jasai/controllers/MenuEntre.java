package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MenuEntre {

    @FXML
    private Button btnatras;

    @FXML
    private Button btninfo;

    @FXML
    private Button btninfo2;

    @FXML
    private Button btninfo3;

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Interfaz","TU PLAZA VIRTUAL");
    }

    @FXML
    void btninfo2OnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuEntre1","LOS MAS CERCA DE TI ");
    }

    @FXML
    void btninfo3OnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuEntre2","LOS MAS CERCA DE TI ");
    }

    @FXML
    void btninfoOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuEntre3","LOS MAS CERCA DE TI ");
    }

}
