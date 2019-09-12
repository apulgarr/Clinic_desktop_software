/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultorioInerfaz;

import static ConsultorioFuncionalidad.ContenedorMedicos.listaMedicos;
import ConsultorioFuncionalidad.Medico;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author apulgarin
 */
public class TablaDoctores extends JPanel {
    private JTable tabla;
    private DefaultTableModel model1;
    private JScrollPane sp;
    
    public TablaDoctores () {
        String[] col = {"Nombre", "Codigo", "Especializacion", "Consultorio"};
        
        model1 = new DefaultTableModel(null, col);
        tabla = new JTable(model1);
        sp = new JScrollPane(tabla);
        
        add(sp);
        
        Object[] fila = new Object[4];
        Medico m = new Medico();
        for (int i = 0; i < listaMedicos.size(); i++) {
            m = (Medico)listaMedicos.get(i);
            fila[0] = listaMedicos.get(i).getNombre();
            fila[1] = listaMedicos.get(i).getCodigoNit();
            fila[2] = listaMedicos.get(i).getEspecializacion();
            fila[3] = listaMedicos.get(i).getCon();
            model1.addRow(fila);
        }
    }
}
