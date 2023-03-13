/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.example.exm_interfaces;

import com.example.exm_interfaces.models.Alumno;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Syzer
 */
public class PantallaNotas implements Initializable {

    @FXML
    private MenuItem menuSalir;
    @FXML
    private TextField textNombre;
    @FXML
    private Button btnEstadistica;
    @FXML
    private Label detalle;
    @FXML
    private TableView<Alumno> tabla;

    @FXML
    private TextField textApellidos;
    @FXML
    private TextField textAD;
    @FXML
    private TextField textSGE;
    @FXML
    private TextField textDI;
    @FXML
    private TextField textPMDM;
    @FXML
    private TextField textPSP;
    @FXML
    private TextField textEIE;
    @FXML
    private TextField textHLC;
    @FXML
    private TableColumn<Alumno, String> cNombre;
    @FXML
    private TableColumn<Alumno, String> cApellidos;
    @FXML
    private TableColumn<Alumno, Double> cAD;
    @FXML
    private TableColumn<Alumno, Double> cSGE;
    @FXML
    private TableColumn<Alumno, Double> cDI;
    @FXML
    private TableColumn<Alumno, Double> cPMDM;
    @FXML
    private TableColumn<Alumno, Double> cPSP;
    @FXML
    private TableColumn<Alumno, Double> cEIE;
    @FXML
    private TableColumn<Alumno, Double> cHLC;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> items = FXCollections.observableArrayList();


        cNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        cApellidos.setCellValueFactory(new PropertyValueFactory("apellidos"));
        cAD.setCellValueFactory(new PropertyValueFactory("AD"));
        cSGE.setCellValueFactory(new PropertyValueFactory("SGE"));
        cDI.setCellValueFactory(new PropertyValueFactory("nombre"));
        cPMDM.setCellValueFactory(new PropertyValueFactory("apellidos"));
        cPSP.setCellValueFactory(new PropertyValueFactory("AD"));
        cEIE.setCellValueFactory(new PropertyValueFactory("SGE"));
        cHLC.setCellValueFactory(new PropertyValueFactory("SGE"));
        

      
        

        actualizarTabla();
    }    

    
        private void actualizarTabla() {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        
        Alumno a1 = new Alumno("Sam", "Galvan", 8.8, 9.5, 10.0, 7.0, 10.0, 8.5, 10.0);
        alumnos.add(a1);
        Alumno a2 = new Alumno("Pepito", "Perez", 9.8, 7.5,5.0, 8.0, 10.0, 8.5, 10.0);
        alumnos.add(a2);
        Alumno a3 = new Alumno("Juanito", "Juarez", 5.8, 5.5, 4.0, 6.0, 10.0, 8.5, 10.0);
        alumnos.add(a3);
        tabla.getItems().clear();
        tabla.getItems().addAll(alumnos);

    }

    @FXML
    private void Cerrar(ActionEvent event) {
    }


    @FXML
    private void mostrarCarta(MouseEvent event) {
    }
    
}
