/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultorioInerfaz;

import ConsultorioFuncionalidad.Citas;
import static ConsultorioFuncionalidad.ContenedorCitas.listaCitas;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author apulgarin
 */
public class TablaCitas extends JPanel {
    private JTable tabla;
    private DefaultTableModel model1;
    JScrollPane sp;
    
    public TablaCitas () {
       
        String[] col = {"Nombre", "ID", "Dia", "Mes", "Motivo"};
        
        model1 = new DefaultTableModel(null, col);
        tabla = new JTable(model1);
        sp = new JScrollPane(tabla);
        
        add(sp);
        
        Object[] fila = new Object[5];
        Citas c = new Citas();
        for (int i = 0; i < listaCitas.size(); i++) {
            c = (Citas)listaCitas.get(i);
            fila[0] = listaCitas.get(i).getNombre();
            fila[1] = listaCitas.get(i).getID();
            fila[2] = listaCitas.get(i).getDiaCita();
            fila[3] = listaCitas.get(i).getMesCita();
            fila[4] = listaCitas.get(i).getTipoCita();
            model1.addRow(fila);
        }
    }
}
