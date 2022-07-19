package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Interfaz {

    @FXML
    private Button btnBar;

    @FXML
    private Button btnBelleza;

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
    private Button btngym;

    @FXML
    private Button btnacercca;

    @FXML
    void btnBarOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuBar","LOS MEJORES DE TU ALREDEDOR");
    }

    @FXML
    void btnBellezaOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuBelleza","Para Ponerte Bella");
    }

    @FXML
    void btnEntreOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuEntretenimiento","Divierte Mucho");
    }

    @FXML
    void btnFarmaciaOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Menufarmacia","Todas Las Farmacias ALREDEDOR");
    }

    @FXML
    void btnHospitalOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuHospital","Hospitales Cerca de Ti");
    }

    @FXML
    void btnMarketOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuMarket","SuperMercado");
    }

    @FXML
    void btnRestaurantOnMouseClicked(MouseEvent event) {
            HelloApplication.setFXML("MenuRestau","MEJORES RESTAURANTES");
    }

    @FXML
    void btnRopaOnMouseClicked(MouseEvent event) {
            HelloApplication.setFXML("MenuRopa","Tiendas de Quesos");
    }

    @FXML
    void btngymOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuGym","Ponte Mamado");
    }

    @FXML
    void btnacercaOnMouseClicked(MouseEvent event) {
            HelloApplication.setFXML("AcercaDe","PTU");
    }


}
