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
public class Paciente {
    private String nombre;
    private int edad;
    private String sexo;
    long identificacion;
    
    public Paciente () {
        
    }
    
    public Paciente (String nombre, int edad, String sexo, long identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.identificacion = identificacion;
    }
    
    public Paciente (long identificacion) {
        this.identificacion = identificacion;
    }
    
    public String getNombre () {
        return nombre;
    }
    
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad () {
        return edad;
    }
    
    public void setEdad (int edad) {
        this.edad = edad;
    }
    
    public String getSexo () {
        return sexo;
    }
    
    public void setSexo (String sexo) {
        this.sexo = sexo;
    }
    
    public long getIdent () {
        return identificacion;
    }
    
    public void setIdent (long identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Sexo: " + sexo + "\n" + "ID: " + identificacion;
    }
    
    
}
