
package models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.io.Serializable;



@NoArgsConstructor
@AllArgsConstructor
public class Alumno implements Serializable {
    

    String nombre;
    String apellidos;
    Double AD;
    Double SGE;
    Double DI;
    Double PMDM;
    Double PSP;
    Double EIE;
    Double HLC;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Double getAD() {
        return AD;
    }

    public void setAD(Double AD) {
        this.AD = AD;
    }

    public Double getSGE() {
        return SGE;
    }

    public void setSGE(Double SGE) {
        this.SGE = SGE;
    }

    public Double getDI() {
        return DI;
    }

    public void setDI(Double DI) {
        this.DI = DI;
    }

    public Double getPMDM() {
        return PMDM;
    }

    public void setPMDM(Double PMDM) {
        this.PMDM = PMDM;
    }

    public Double getPSP() {
        return PSP;
    }

    public void setPSP(Double PSP) {
        this.PSP = PSP;
    }

    public Double getEIE() {
        return EIE;
    }

    public void setEIE(Double EIE) {
        this.EIE = EIE;
    }

    public Double getHLC() {
        return HLC;
    }

    public void setHLC(Double HLC) {
        this.HLC = HLC;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", AD=" + AD +
                ", SGE=" + SGE +
                ", DI=" + DI +
                ", PMDM=" + PMDM +
                ", PSP=" + PSP +
                ", EIE=" + EIE +
                ", HLC=" + HLC +
                '}';
    }
}
