package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static java.awt.Desktop.getDesktop;

public class MenuBar1 {

    @FXML
    private Button btnatras;

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuBar","Mas chelas");
    }

    @FXML
    void openLink(ActionEvent event) {

        try {
            getDesktop().browse(new URI("https://www.google.com/maps/dir/16.6181063,-93.0876882/16.7595138,-93.1173353/@16.7045044,-93.1464169,13z/data=!4m4!4m3!1m1!4e1!1m0"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);

        }

        }

    }
