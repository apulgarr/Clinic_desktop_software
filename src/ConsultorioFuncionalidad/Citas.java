/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultorioFuncionalidad;

/**
 *
 * @author apulgarin
 */
public class Citas {
    private String nombre;
    private long ID;
    private int DiaCita;
    private int MesCita;
    private int Año;
    private String tipoCita;
    
    public Citas () {
    }
    
    public Citas (long ID) {
        this.ID = ID;
    }
    
    public Citas (String nombre, long ID, int DiaCita, int MesCita, int Año, String tipoCita) {
        this.nombre = nombre;
        this.ID = ID;
        this.DiaCita = DiaCita;
        this.MesCita = MesCita;
        this.Año = 2016;
        this.tipoCita = tipoCita;
    }
    
    public void generarDia () {
        this.DiaCita = (int) (Math.random()*30)+1;
    }
    
    public void generarMes () {
        this.MesCita = (int) (Math.random()*12)+1; 
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public long getID () {
        return ID;
    }

    public void setID (long ID) {
        this.ID = ID;
    }

    public int getDiaCita () {
        return DiaCita;
    }

    public void setDiaCita (int DiaCita) {
        this.DiaCita = DiaCita;
    }

    public int getMesCita () {
        return MesCita;
    }

    public void setMesCita (int MesCita) {
        this.MesCita = MesCita;
    }

    public int getAño () {
        return Año;
    }

    public void setAño (int Año) {
        this.Año = 2016;
    }

    public String getTipoCita () {
        return tipoCita;
    }

    public void setTipoCita (String tipoCita) {
        this.tipoCita = tipoCita;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" + "ID: " + ID + "\n" + "Fecha cita: " + DiaCita + "/" + MesCita + "/" + Año + "\n" + "Motivo: " + tipoCita;
    }
    
    
    
}

 
