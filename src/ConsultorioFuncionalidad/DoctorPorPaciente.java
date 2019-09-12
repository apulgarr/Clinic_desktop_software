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
public class DoctorPorPaciente {
    private String nombrePaciente;
    private long IDPaciente;
    private String nombreDoctor;
    private int CodDoctor;
    private int consultorioD;
    
    public DoctorPorPaciente () {
        
    }
    
    public DoctorPorPaciente (long IDPaciente) {
        this.IDPaciente = IDPaciente;
    }

    public DoctorPorPaciente(String nombrePaciente, long IDPaciente, String nombreDoctor, int CodDoctor, int consultorioD) {
        this.nombrePaciente = nombrePaciente;
        this.IDPaciente = IDPaciente;
        this.nombreDoctor = nombreDoctor;
        this.CodDoctor = CodDoctor;
        this.consultorioD = consultorioD;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public long getIDPaciente() {
        return IDPaciente;
    }

    public void setIDPaciente(long IDPaciente) {
        this.IDPaciente = IDPaciente;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public int getCodDoctor() {
        return CodDoctor;
    }

    public void setCodDoctor(int CodDoctor) {
        this.CodDoctor = CodDoctor;
    }
    
    public int getConsultorio () {
        return consultorioD;
    }
    
    public void setConsultorio (int consultorioD) {
        this.consultorioD = consultorioD;
    }
    
    public String toString () {
        return "Paciente: " + nombrePaciente + "\n" + "ID: " + IDPaciente + "\n" + "Medico: " + nombreDoctor + "\n" + "Codigo: " + CodDoctor + "\n" + "Consultorio: " + consultorioD;
    }
}
