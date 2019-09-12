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
public class Registro {
    private Paciente paciente;
    private Medico medico;
    private Diagnostico diagnostico;
    private Citas fecha;
    
    public Registro (Paciente paciente, Medico medico, Diagnostico diagnostico, Citas fecha) {
        this.paciente = paciente;
        this.medico = medico;
        this.diagnostico = diagnostico;
        this.fecha = fecha;
    }
    
    public Paciente getPaciente () {
        return paciente;
    }
    
    public void setPaciente (Paciente paciente) {
        this.paciente = paciente;
    }
    
    public Medico getMedico () {
        return medico;
    }
    
    public void setMedico (Medico medico) {
        this.medico = medico;
    }
    
    public Diagnostico getDiagnostico () {
        return diagnostico;
    }
    
    public void setDiagnostico (Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }
    
    public Citas getFechaCita () {
        return fecha;
    }
    
    public void setFechaCita (Citas fecha) {
        this.fecha = fecha;
    }
}
