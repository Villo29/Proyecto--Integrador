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


public class MenuResta3 {

    @FXML
    private Button btnatras;

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuRestau", "Los Mejores Lugares");

    }

    @FXML
    void openLinkResta3(ActionEvent event) {


        try {
            getDesktop().browse(new URI("https://www.google.com/maps/dir//la+esquina+de+la+quinta+restaurant/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x85ecd85f29b08c33:0x5675c61a94a4b772?sa=X&ved=2ahUKEwjfg7H4x4v5AhXwK0QIHYNoCeUQ9Rd6BAhBEAM"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);

        }



    }

}
