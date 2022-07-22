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


public class MenuEntre3 {

    @FXML
    private Button btnatras;

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuEntre","Entre3");

    }

    @FXML
    void openLinkEn3(ActionEvent event) {
        try {
            getDesktop().browse(new URI("https://www.google.com/maps/dir/16.6178089,-93.1077375/Cin%C3%A9polis+%5BPlaza+Polif%C3%B3rum%5D,+Andr%C3%A9s+Serra+Rojas+250,+El+Retiro,+29040+Tuxtla+Guti%C3%A9rrez,+Chis./@16.6795444,-93.1663836,12z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x85ed279e2a2e722f:0xc29d744d091038c7!2m2!1d-93.0813093!2d16.747547"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);

        }



    }

}
