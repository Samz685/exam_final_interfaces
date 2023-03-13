/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.example.exm_interfaces;

import models.Alumno;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
    @FXML
    private Button btnAdd;

    ArrayList<Alumno> alumnos = new ArrayList<>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {


        alumnosIniciales();


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
        tabla.getItems().clear();
        tabla.getItems().addAll(alumnos);

    }

    private void alumnosIniciales() {
        Alumno a1 = new Alumno("Sam", "Galvan", 8.8, 9.5, 10.0, 7.0, 10.0, 8.5, 10.0);
        alumnos.add(a1);
        Alumno a2 = new Alumno("Pepito", "Perez", 9.8, 7.5,5.0, 8.0, 10.0, 8.5, 10.0);
        alumnos.add(a2);
        Alumno a3 = new Alumno("Juanito", "Juarez", 5.8, 5.5, 4.0, 6.0, 10.0, 8.5, 10.0);
        alumnos.add(a3);
    }

    @FXML
    private void Cerrar(ActionEvent event) {
    }


    @FXML
    private void mostrarCarta(MouseEvent event) {
    }

    @FXML
    public void newAlumno(ActionEvent actionEvent) {

        Alumno alumno = new Alumno();
        if(textNombre.getText() !=null || textApellidos.getText() != null || textAD.getText() != null
        || textSGE.getText() != null || textDI.getText() != null || textDI.getText() != null)
        alumno.setNombre(textNombre.getText());
        alumno.setApellidos(textApellidos.getText());
        alumno.setAD(Double.valueOf(textAD.getText()));
        alumno.setSGE(Double.valueOf(textSGE.getText()));
        alumno.setDI(Double.valueOf(textDI.getText()));
        alumno.setPMDM(Double.valueOf(textPMDM.getText()));
        alumno.setPSP(Double.valueOf(textPSP.getText()));
        alumno.setEIE (Double.valueOf(textEIE .getText()));
        alumno.setHLC(Double.valueOf(textHLC.getText()));

        alumnos.add(alumno);
        actualizarTabla();




    }
}
