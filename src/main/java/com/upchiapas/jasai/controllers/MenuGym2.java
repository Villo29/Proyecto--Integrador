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


public class MenuGym2 {

    @FXML
    private Button btnatras;

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuGym","Los Mejores De La Zona");

    }

    @FXML
    void openLinkGym2(ActionEvent event) {

        try {
            getDesktop().browse(new URI("https://goo.gl/maps/RmZh6oRmHsxPBdNV6"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);

        }



    }

}
