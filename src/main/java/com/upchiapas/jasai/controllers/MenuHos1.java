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


public class MenuHos1 {

    @FXML
    private Button btnatras;

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuHospital","Los Lugares Mas Cerca");

    }

    @FXML
    void openlinkHos1(ActionEvent event) {
        try {
            getDesktop().browse(new URI("https://www.google.com/maps/dir/16.6178089,-93.1077375/hospital+regional+tuxtla/@16.6779142,-93.1352986,12z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x85ecd86012bf26d5:0x59885866900ab7ad!2m2!1d-93.1169857!2d16.7458861"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);

        }


    }

}
