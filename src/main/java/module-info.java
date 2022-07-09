module com.upchiapas.jasai {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.upchiapas.jasai to javafx.fxml;
    exports com.upchiapas.jasai;
    exports com.upchiapas.jasai.controllers;
    opens com.upchiapas.jasai.controllers to javafx.fxml;
}