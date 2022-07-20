package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Stack;

public class MenuEntre3 {

    @FXML
    private Button btnatras;

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuEntre","Divierte");
    }


}
