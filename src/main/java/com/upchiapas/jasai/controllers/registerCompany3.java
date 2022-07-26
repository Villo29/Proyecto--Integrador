package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class registerCompany3 extends registerCompany2 {
    @FXML
    private Button btnatras;

    @FXML
    private Button actualiza;

    @FXML
    private Label txtArea2;

    @FXML
    private Label txtHA;

    @FXML
    private Label txtHC;


    private void sacartexto(){
        registerCompany tm = new registerCompany();
//        JOptionPane.showMessageDialog(null, "Contenido = "+tm.getTexto());
    }



/*    public MenuBarNegocio1(String nombreComercio) {
        super();
    }*/

    @FXML
    void btnatrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("MenuBarNegocio","LAS MEJORES BOTANAS");
    }

    @FXML
    void actualiza(ActionEvent event) {
        registerCompany tm = new registerCompany();
        txtArea2.setText(tm.getNombreComercio());
        txtHA.setText(tm.gethA()+":"+tm.getmA()+" HRS");
        txtHC.setText(tm.gethC()+":"+tm.getmC()+" HRS");

    }


/*    public void login(ActionEvent event){

    }*/

/*
    @FXML
    void txtAreaOnMouseClicked(MouseEvent event) {
        new MenuBarNegocio1(getNombreComercio());
        MenuBarNegocio1 lis3 = new MenuBarNegocio1(getNombreComercio());
        this.txtArea.setText("lis3");
        System.out.println(getNombreComercio());
    }*/

}