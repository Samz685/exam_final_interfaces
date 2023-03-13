module com.example.exm_interfaces {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exm_interfaces to javafx.fxml;
    exports com.example.exm_interfaces;
}