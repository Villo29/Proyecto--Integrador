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



public class MenuSuper2 {

    @FXML
    private Button btnatras;

    @FXML
    private Button btnubicacion;

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
            HelloApplication.setFXML("MenuMarket","LOS MEJORES Y CERCA DE TI");
    }

    @FXML
    void btnubicacionOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuMarket","TU PLAZA VIRTUAL");

    }

    @FXML
    void openLinkSuper2(ActionEvent event) {

        try {
            getDesktop().browse(new URI("https://www.google.com/maps/dir/16.6178089,-93.1077375/Soriana+H%C3%ADper+%5BPlaza+Poliforum%5D,+Plaza+Polif%C3%B3rum,+Blvd.+%C3%81ngel+Albino+Corzo+250,+Zona+Sin+Asignaci%C3%B3n+de+Nombre+de+Col+24,+29040+Tuxtla+Guti%C3%A9rrez,+Chis./@16.6795444,-93.1663836,12z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x85ed277586462d39:0xeda6cb480b65db0a!2m2!1d-93.0813115!2d16.7482833"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);

        }




    }

    }