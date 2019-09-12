/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultorioFuncionalidad;

import java.util.ArrayList;

/**
 *
 * @author apulgarin
 */
public class ContenedorMedicos {
    public static ArrayList <Medico> listaMedicos = new ArrayList<Medico>();

    public static ArrayList<Medico> getListaMedicos() {
        return listaMedicos;
    }

    public static void setListaMedicos(ArrayList<Medico> listaMedicos) {
        ContenedorMedicos.listaMedicos = listaMedicos;
    }
    
    
}
