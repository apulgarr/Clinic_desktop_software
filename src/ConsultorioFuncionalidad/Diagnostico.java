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
public class Diagnostico {
    private String nombrePaciente;
    private long IDPaciente;
    private String Medico;
    private int CodD;
    private String diagnosticoFinal;

    public Diagnostico(String nombrePaciente, long IDPaciente, String Medico, int CodD, String diagnosticoFinal) {
        this.nombrePaciente = nombrePaciente;
        this.IDPaciente = IDPaciente;
        this.Medico = Medico;
        this.CodD = CodD;
        this.diagnosticoFinal = diagnosticoFinal;

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

    public String getMedico() {
        return Medico;
    }

    public void setMedico(String Medico) {
        this.Medico = Medico;
    }
    
    public int getCodD () {
        return CodD;
    }
    
    public void setCodD (int CodD) {
        this.CodD = CodD;
    }

    public String getDiagnosticoFinal() {
        return diagnosticoFinal;
    }

    public void setDiagnosticoFinal(String diagnosticoFinal) {
        this.diagnosticoFinal = diagnosticoFinal;
    }
    
    public String toString () {
        return "Paciente: " + nombrePaciente + "\n" + "ID: " + IDPaciente + "\n" + "Medico: " + Medico + "\n" + "Codigo: " + CodD + "\n" + "Diagnostico: " + diagnosticoFinal;
    }
}
