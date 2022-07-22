package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;

import static java.awt.Desktop.getDesktop;


public class MenuEntre2 {

    @FXML
    private Button btnatras;

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuEntre","Entre2");

    }

    @FXML
    void openLinkEn2(ActionEvent event) {

        try {
            getDesktop().browse(new URI("https://goo.gl/maps/oLwQFC6h2aoPjcDx5"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);

        }


    }

}
