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
public class Consultorio {
    private int numeroConsultorio;
    
    public void generarConsultorio () {
        this.numeroConsultorio = (int) (Math.random()*400)+100;
    }
    
    public int getConsultorio () {
        return numeroConsultorio;
    }
}
