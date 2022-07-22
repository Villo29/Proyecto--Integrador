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



public class MenuSuper1 {

    @FXML
    private Button btnatras;

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuMarket","LOS MEJORES Y CERCAS DE TI");
    }

    @FXML
    void openLinkSuper1(ActionEvent event) {

        try {
            getDesktop().browse(new URI("https://www.google.com/maps/dir/16.6178089,-93.1077375/CHEDRAUI+TUXTLA+NORTE,+Libramiento+Nte.+Ote.+126,+La+Pimienta,+29034+Tuxtla+Guti%C3%A9rrez,+Chis./@16.6960611,-93.1815566,12z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x85ecd8958edd05eb:0x8941fae3d1a2a428!2m2!1d-93.1125145!2d16.7698856"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);

        }



    }

}


