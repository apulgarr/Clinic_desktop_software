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
public class Medico {
    private String nombre;
    private int CodigoNit;
    private String especializacion;
    private Consultorio consultorio;
    private int con;
    
    public Medico () {
        
    }
    
    public Medico (int CodigoNit) {
        this.CodigoNit = CodigoNit;
    }
    
    public Medico (String nombre, int CodigoNit, String especializacion, Consultorio consultorio) {
        this.nombre = nombre;
        this.CodigoNit = CodigoNit;
        this.especializacion = especializacion;
        this.consultorio = consultorio;
    }
    
    public String getNombre () {
        return nombre;
    }
    
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    
    public int getCodigoNit () {
        return CodigoNit;
    }
    
    public void setCodigoNit (int CodigoNit) {
        this.CodigoNit = CodigoNit;
    }
    
    public String getEspecializacion () {
        return especializacion;
    }
    
    public void setEspecializacion (String especializacion) {
        this.especializacion = especializacion;
    }
    
    public Consultorio getConsultorio () {
        return consultorio;
    }
    
    public void setConsultorio (Consultorio consultorio) {
        this.consultorio = consultorio;
    }
    
    public int getCon () {
        return con;
    }
    
    public void setCon (int con) {
        this.con = con;
    }
    
    public String toString () {
        return "Nombre: " + nombre + "\n" + "Codigo: " + CodigoNit + "\n" + "Especializacion: " + especializacion + "\n" + "Consultorio: " + consultorio;
    }
}
