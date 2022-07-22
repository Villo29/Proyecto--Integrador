
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

public class MenuBar3 {

    @FXML
    private Button btnatras;

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuBar","bar3");

    }

    @FXML
    void openLinkb3(ActionEvent event) {

        try {
            getDesktop().browse(new URI("https://www.google.com/maps/dir/16.6178089,-93.1077375/sonora+botanera/@16.6902134,-93.1325678,12z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x85ecd891c23ffffb:0xc6127aa363e88e33!2m2!1d-93.1114562!2d16.7601617"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);

        }


    }

}
