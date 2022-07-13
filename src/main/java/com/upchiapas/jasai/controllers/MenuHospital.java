package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MenuHospital {

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
        HelloApplication.setFXML("Interfaz","Tu Plaza Virtual");
    }

    @FXML
    void btninfo1OnMouseClicked(MouseEvent event) {

    }

    @FXML
    void btninfo2OnMouseClicked(MouseEvent event) {

    }

    @FXML
    void btninfo3OnMouseClicked(MouseEvent event) {

    }

}
