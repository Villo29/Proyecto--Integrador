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

public class MenuBar2 {

    @FXML
    private Button btnatras;

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuBar","bar2");

    }

    @FXML
    void openLinkB2(ActionEvent event) {
        try {
            getDesktop().browse(new URI("https://www.google.com.mx/maps/dir//el+reyna+tuxtla/@16.7576962,-93.1467557,14.3z/data=!4m10!4m9!1m1!4e2!1m5!1m1!1s0x85ecd903737e51f3:0x667425aff95f1008!2m2!1d-93.1381841!2d16.7543771!3e0"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);

        }

    }

}

