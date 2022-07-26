package com.upchiapas.jasai.controllers;

import com.upchiapas.jasai.HelloApplication;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import static java.awt.Desktop.getDesktop;

public class registerCompany implements Initializable{

    String item;

    String Opcion;

/*    @FXML
    private ComboBox<String> comboBoxCategoria;
*/

    @FXML
    private ComboBox<String> combobox1;

    @FXML
    void comboboxEvent(ActionEvent event){
        Object evt = event.getSource();
        if(evt.equals(combobox1)){

            Opcion = (combobox1.getSelectionModel().getSelectedItem());
            System.out.println(Opcion);

            switch(Opcion) {
                case "- SuperMercado":
                    System.out.println("Entro a surper");
                    break;
                case "- Ropa":
                    break;
                case "- Restaurante":
                    break;
                case "- Bar":
                    break;
                case "- Hospital":
                    break;
                case "- GYM":
                    break;
                case "- Farmacia":
                    break;
                case "- Entretenimiento":
                    break;
                }
            }

        }

    public void initialize(URL url, ResourceBundle resourceBundle){
      combobox1.setItems(FXCollections.observableArrayList("- SuperMercado","- Ropa","- Restaurante",
                "- Bar","- Hospital","- GYM","- Farmacia","- Entretenimiento"));

    }

    @FXML
    void openLink(ActionEvent event) {

        try {
            getDesktop().browse(new URI("https://www.google.com/mymaps/viewer?mid=12nNOk7khhSzJ_f-y-HqERVY1R5M&hl=es"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);

        }

    }

    @FXML
    private TextArea txtA;

    @FXML
    private TextField txtF;


    private Text nameOut;

    @FXML
    private TextField nameIn;
    @FXML
    private TextField myTextField1;

    @FXML
    private TextField myTextField1hA;
    @FXML
    private TextField myTextFieldmA;
    @FXML
    private TextField myTextFieldhC;
    @FXML
    private TextField myTextFieldmC;

    @FXML
    private TextField nameTextField;

    @FXML
    private Button myButton;

    private static String NombreComercio = "";
    private static String Ubicacion;
    private static byte hA;
    private static byte mA;
    private static byte hC;
    private static byte mC;

    public static String getTexto(){
        return NombreComercio;
    }

    public static void setTexto(String aTexto){
        NombreComercio = aTexto;
    }

    public String getNombreComercio() {
        return NombreComercio;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public String gethA() {
        return String.valueOf(hA);
    }

    public String getmA() {
        return String.valueOf(mA);
    }

    public String getmC() {
        return String.valueOf(mC);
    }

    public String gethC() {
        return String.valueOf(hC);
    }

    public void setNombreComercio(String nombreComercio) {
        NombreComercio = nombreComercio;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public void sethA(byte hA) {
        this.hA = hA;
    }

    public void setmA(byte mA) {
        this.mA = mA;
    }

    public void sethC(byte hC) {
        this.hC = hC;
    }

    public void setmC(byte mC) {
        this.mC = mC;
    }

    @Override
    public String toString() {
        return "registerCompany{" +
                "NombreComercio='" + NombreComercio + '\'' +
                ", Ubicacion='" + Ubicacion + '\'' +
                ", hA=" + hA +
                ", mA=" + mA +
                ", hC=" + hC +
                ", mC=" + mC +
                '}';
    }

    @FXML
    private Button btnContinue;

    @FXML
    private Button btnback;

    @FXML
    void btnbackOnMouseClick(MouseEvent event) {
        HelloApplication.setFXML("loginMenu","JASAI");
    }

    @FXML
    void btncontinuarOnMouseClick(MouseEvent event) {

        HelloApplication.setFXML("registerCompany2","JASAI");

        NombreComercio = txtF.getText();
        Ubicacion = myTextField1.getText();
        hA = Byte.parseByte(myTextField1hA.getText());
        mA = Byte.parseByte(myTextFieldmA.getText());
        hC = Byte.parseByte(myTextFieldhC.getText());
        mC = Byte.parseByte(myTextFieldmC.getText());

    }

}