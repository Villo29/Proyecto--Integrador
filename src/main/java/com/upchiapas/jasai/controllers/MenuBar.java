package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MenuBar{

    @FXML
    private Button btnatras;

    @FXML
    private Button btninfo1;

    @FXML
    private Button btninfo11;

    @FXML
    private Button btninfo12;

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Interfaz","TU PLAZA VIRTUAL)");
    }

    @FXML
    void btninfo1OnMouseClicked(MouseEvent event) {

    }

    @FXML
    void voidbtninfo11OnMouseClicked(MouseEvent event){

    }

    @FXML
    void voidbtninfo12OnMouseClicked(MouseEvent event){

    }

}
