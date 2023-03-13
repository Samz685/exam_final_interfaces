
package com.example.exm_interfaces;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;
import net.sf.jasperreports.swing.JRViewer;

import javax.swing.*;
import java.io.File;
import java.sql.Date;
import java.sql.SQLException;
import java.util.HashMap;


public class Informe {

    public static void showNotas() throws JRException, ClassNotFoundException, SQLException {

        String report = "reporte_notas.jasper";

        JasperPrint jasperPrint = JasperFillManager.fillReport(
                report, 
                null, 
                JdbcUtil.getConnection()
        );

        JRViewer viewer = new JRViewer(jasperPrint);

        JFrame frame = new JFrame("Listado de Notas");
        frame.getContentPane().add(viewer);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setSize(800, 1000);
        frame.setVisible(true);

        System.out.print("Done!");
    }

    public static void pdfReportNotas() throws JRException, ClassNotFoundException, SQLException {

        String report = "reporte_notas.jasper";

        JasperPrint jasperPrint = JasperFillManager.fillReport(
                report, 
                null, 
                JdbcUtil.getConnection()
        );
        
        JFileChooser chooser = new JFileChooser();
        int option = chooser.showSaveDialog(null);
        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            if (!path.endsWith(".pdf")) {
                path += ".pdf";
            }
            
            JRPdfExporter exp = new JRPdfExporter();
            exp.setExporterInput(new SimpleExporterInput(jasperPrint));
            exp.setExporterOutput(new SimpleOutputStreamExporterOutput(path));
            SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
            exp.setConfiguration(conf);
            exp.exportReport();
        }
        System.out.print("Done!");
    }


}
