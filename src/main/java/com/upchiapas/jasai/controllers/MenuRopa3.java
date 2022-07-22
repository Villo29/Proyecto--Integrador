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


public class MenuRopa3 {

    @FXML
    private Button btnatras;

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuRopa", "LOS MEJORES BOLSOS");

    }

    @FXML
    void openLinkRopa3(ActionEvent event) {
        try {
            getDesktop().browse(new URI("https://www.google.com/maps/dir/16.6178089,-93.1077375/Pista+De+Motocross+La+Bondad,+29000,+Julio+Cesar+Garc%C3%ADa+C%C3%A1ceres,+Sin+Nombre,+Tuxtla+Guti%C3%A9rrez,+Chis./@16.6861833,-93.2057616,12z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x85ecda3402ee33e7:0xbcc7912640ae16ee!2m2!1d-93.1935437!2d16.7402955"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);

        }





    }

}
