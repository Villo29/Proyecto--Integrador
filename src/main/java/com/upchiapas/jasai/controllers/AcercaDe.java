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

public class AcercaDe {

    @FXML
    private Button btnatras;

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Interfaz","TU PLAZA VIRTUAL ");
    }

    @FXML
    void openLinkFace1(ActionEvent event) {
        try {
            getDesktop().browse(new URI("https://www.facebook.com/JesuVid.RG"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);

        }

    }

    @FXML
    void openLinkFace2(ActionEvent event) {

        try {
            getDesktop().browse(new URI("https://www.facebook.com/Carlos.cruz.006"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);

        }


    }

    @FXML
    void openLinkFace3(ActionEvent event) {

        try {
            getDesktop().browse(new URI("https://www.facebook.com/profile.php?id=100041598095592"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);

        }



    }

    @FXML
    void openLinkFace4(ActionEvent event) {
        try {
            getDesktop().browse(new URI("https://www.facebook.com/jorge.molinagomez.79"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);

        }

    }

}
