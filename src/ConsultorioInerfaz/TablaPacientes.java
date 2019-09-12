/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultorioInerfaz;

import static ConsultorioFuncionalidad.ContenedorPacientes.listaPacientes;
import ConsultorioFuncionalidad.Paciente;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author apulgarin
 */
public class TablaPacientes extends JPanel {
    private JTable tabla;
    private DefaultTableModel model1;
    JScrollPane sp;
    
    public TablaPacientes () {

        
        String[] col = {"Nombre", "Edad", "ID", "Sexo"};
        
        model1 = new DefaultTableModel(null, col);
        tabla = new JTable(model1);
        sp = new JScrollPane(tabla);
        
        add(sp);
        
        Object[] fila = new Object[4];
        Paciente p = new Paciente();
        for (int i = 0; i < listaPacientes.size(); i++) {
            p = (Paciente)listaPacientes.get(i);
            fila[0] = listaPacientes.get(i).getNombre();
            fila[1] = listaPacientes.get(i).getEdad();
            fila[2] = listaPacientes.get(i).getIdent();
            fila[3] = listaPacientes.get(i).getSexo();
            model1.addRow(fila);
        }
    }
}
