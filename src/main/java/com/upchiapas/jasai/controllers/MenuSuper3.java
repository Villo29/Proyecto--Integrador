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



public class MenuSuper3 {

    @FXML
    private Button btnatras;

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuMarket","TU PLAZA VIRTUAL");

    }

    @FXML
    void openLinkSuper3(ActionEvent event) {
        try {
            getDesktop().browse(new URI("https://www.google.com/maps/dir/16.6178089,-93.1077375/Walmart+%5BLibramiento+Norte%5D,+Libramiento+Nte.+Ote.+4350,+29045+Tuxtla+Guti%C3%A9rrez,+Chis./@16.6803503,-93.1663836,12z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x85ed2783449e1a09:0xc0404ddc8a143d28!2m2!1d-93.0760156!2d16.7508494"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);

        }




    }

}
