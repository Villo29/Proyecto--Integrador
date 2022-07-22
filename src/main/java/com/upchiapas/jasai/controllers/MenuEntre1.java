package com.upchiapas.jasai.controllers;

import javafx.application.HostServices;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URISyntaxException;

public class MenuEntre1 {
    HostServices hostServices;

    @FXML
    private Button btnatras;

    @FXML
    private Hyperlink link;

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void linkOnMouseLinked(MouseEvent event) throws URISyntaxException, IOException {
        hostServices.showDocument(link.getText());
    }
    public void setHostServices(HostServices hostServices){
        this.hostServices = hostServices;
    }

}
