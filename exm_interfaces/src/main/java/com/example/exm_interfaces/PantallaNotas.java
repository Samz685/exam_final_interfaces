/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.example.exm_interfaces;

import javafx.event.Event;
import javafx.scene.control.*;
import models.Alumno;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import net.sf.jasperreports.engine.JRException;

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
    Alumno alumnoActual = new Alumno();
    @FXML
    private Button btnInforme;


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
        cDI.setCellValueFactory(new PropertyValueFactory("DI"));
        cPMDM.setCellValueFactory(new PropertyValueFactory("PMDM"));
        cPSP.setCellValueFactory(new PropertyValueFactory("AD"));
        cEIE.setCellValueFactory(new PropertyValueFactory("SGE"));
        cHLC.setCellValueFactory(new PropertyValueFactory("SGE"));

        actualizarTabla();


    }


    //Aqui alimentamos la tabla con el array que vamos rellenando
    private void actualizarTabla() {
        tabla.getItems().clear();
        tabla.getItems().addAll(alumnos);

    }

    //Aqui introducimos los alumnos por defecto en el array
    private void alumnosIniciales() {
        Alumno a1 = new Alumno("Sam", "Galvan", 8.8, 9.5, 10.0, 7.0, 10.0, 8.5, 10.0);
        alumnos.add(a1);
        Alumno a2 = new Alumno("Pepito", "Perez", 9.8, 7.5, 5.0, 8.0, 10.0, 8.5, 10.0);
        alumnos.add(a2);
        Alumno a3 = new Alumno("Juanito", "Juarez", 5.8, 4.5, 4.0, 6.0, 10.0, 8.5, 10.0);
        alumnos.add(a3);
    }

    @FXML
    private void Cerrar(ActionEvent event) {
    }


    @Deprecated
    private void mostrarCarta(MouseEvent event) {
    }

    @FXML
    public void newAlumno(ActionEvent actionEvent) {
        Alumno alumno = new Alumno();

        //Aqui nos aseguramos de que los cajetines no están vacios
        if (!textNombre.getText().isEmpty()
                && !textApellidos.getText().isEmpty()
                && !textAD.getText().isEmpty()
                && !textSGE.getText().isEmpty()
                && !textDI.getText().isEmpty()
                && !textPMDM.getText().isEmpty()
                && !textPSP.getText().isEmpty()
                && !textEIE.getText().isEmpty()
                && !textHLC.getText().isEmpty()) {

            String nombre = textNombre.getText();
            String apellidos = textApellidos.getText();
            Double AD = Double.valueOf(textAD.getText());
            Double SGE = Double.valueOf(textSGE.getText());
            Double DI = Double.valueOf(textDI.getText());
            Double PMDM = Double.valueOf(textPMDM.getText());
            Double PSP = Double.valueOf(textPSP.getText());
            Double EIE = Double.valueOf(textEIE.getText());
            Double HLC = Double.valueOf(textHLC.getText());

            //Aqui nos aseguramos de que los valores introducidos sean entre 0 y 10
            if (AD >= 0 && AD <= 10 && SGE >= 0 && SGE <= 10 && DI >= 0 && DI <= 10
                    && PMDM >= 0 && PMDM <= 10 && PSP >= 0 && PSP <= 10 && EIE >= 0 && EIE <= 10
                    && HLC >= 0 && HLC <= 10) {
                alumno.setNombre(textNombre.getText());
                alumno.setApellidos(textApellidos.getText());
                alumno.setAD(Double.valueOf(textAD.getText()));
                alumno.setSGE(Double.valueOf(textSGE.getText()));
                alumno.setDI(Double.valueOf(textDI.getText()));
                alumno.setPMDM(Double.valueOf(textPMDM.getText()));
                alumno.setPSP(Double.valueOf(textPSP.getText()));
                alumno.setEIE(Double.valueOf(textEIE.getText()));
                alumno.setHLC(Double.valueOf(textHLC.getText()));
                alumnos.add(alumno);
                actualizarTabla();
            } else {
                detalle.setText("Las notas tienen que tener un valor entre 0 y 10");
            }
        } else {
            detalle.setText("No puedes dejar ningun campo vacio");

        }
    }

    private void infoAlumno() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información Alumno");
        alert.setHeaderText(alumnoActual.getNombre()+" "+alumnoActual.getApellidos());
        if (!suspendida()){
            alert.setContentText("Nota media: "+alumnoActual.media()+ "\n" +
                                "TODAS LAS ASIGNATURAS APROBADAS");
        } else{
            alert.setContentText("Nota media: "+alumnoActual.media()+ "\n" +
                    "Asignaturas suspensas: " +alumnoActual.numSuspendidas());

        }


        alert.showAndWait();

    }

    @FXML
    public void mostrarAlumno(MouseEvent event) {
        alumnoActual = tabla.getSelectionModel().getSelectedItem();
        System.out.println(alumnoActual.media());
        System.out.println(alumnoActual.numSuspendidas());
        System.out.println(alumnoActual.toString());
        System.out.println(suspendida());
        infoAlumno();
    }

    public Boolean suspendida() {

        if (alumnoActual.numSuspendidas() == 0) {
            return false;
        } else {
            return true;
        }
    }

    @FXML
    public void generarInforme(ActionEvent actionEvent) {

        try {
            Informe.showNotas();
        } catch (JRException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PantallaNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Informe.pdfReportNotas();
        } catch (JRException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PantallaNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}