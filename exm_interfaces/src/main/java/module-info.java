module com.example.exm_interfaces {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires lombok;
    requires org.hibernate.orm.core;
    requires java.naming;
    requires java.sql;
    requires java.base;
    requires jasperreports;
    requires javafx.swing;


    opens com.example.exm_interfaces to javafx.fxml, javafx.swing, java.sql;
    opens models;
    exports com.example.exm_interfaces;
}