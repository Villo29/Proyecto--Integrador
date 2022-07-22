package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Interfaz {

    @FXML
    private Button btnBar;

    @FXML
    private Button btnEntre;

    @FXML
    private Button btnFarmacia;

    @FXML
    private Button btnHospital;

    @FXML
    private Button btnMarket;

    @FXML
    private Button btnRestaurant;

    @FXML
    private Button btnRopa;

    @FXML
    private Button btnacercca;

    @FXML
    private Button btngym;

    @FXML
    private Button btnin;

    @FXML
    void btnBarOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuBar","DISFRUTA DE LO BUENO");
    }

    @FXML
    void btnEntreOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuEntre","DISFRUTA DE LO BUENO");
    }

    @FXML
    void btnFarmaciaOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Menufarmacia","DISFRUTA DE LO BUENO");
    }

    @FXML
    void btnHospitalOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuHospital","DISFRUTA DE LO BUENO");
    }

    @FXML
    void btnMarketOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuMarket","DISFRUTA DE LO BUENO");
    }

    @FXML
    void btnRestaurantOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuRestau","DISFRUTA DE LO BUENO");
    }

    @FXML
    void btnRopaOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuRopa","DISFRUTA DE LO BUENO");
    }

    @FXML
    void btnacercaOnMouseClicked(MouseEvent event) {
       HelloApplication.setFXML("AcercaDe","DISFRUTA DE LO BUENO");
    }

    @FXML
    void btnacerccaOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("AcercaDe","DISFRUTA DE LO BUENO");
    }

    @FXML
    void btngymOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuGym","DISFRUTA DE LO BUENO");
    }

    @FXML
    void btninOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Perfil","DISFRUTA DE LO BUENO");
    }

}
