/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultorioFuncionalidad;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apulgarin
 */
public class GenerarExcel {
    public static void Grabar(String cad, String NombreArchivo) {
        File f = new File(NombreArchivo);
        FileWriter fw;
        try {
              fw = new FileWriter(f);
              fw.write(cad);
              fw.close();
        } catch (IOException ex) {
            Logger.getLogger(GenerarExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
