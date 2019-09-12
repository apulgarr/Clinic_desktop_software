/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultorioInerfaz;

import static ConsultorioFuncionalidad.ContenedorDiagnosticos.historiasClinicas;
import ConsultorioFuncionalidad.Diagnostico;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author apulgarin
 */
public class PanelHistoriasClinicas extends JPanel implements ActionListener {
    private JLabel ID;
    private JTextField txtID;
    private JButton btnBuscar, btnLimpiar;
    private JTextArea diagnostico;
    private JScrollPane sp;
    
    Validaciones v = new Validaciones();
    
    public PanelHistoriasClinicas () {
        setLayout(null);
        
        setBackground(Color.lightGray);
        
        ID = new JLabel("Identificacion");
        ID.setForeground(Color.white);
        ID.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
        
        txtID = new JTextField();
        txtID.setToolTipText("Ingrese la ID del paciente");
        
        diagnostico = new JTextArea();
        sp = new JScrollPane(diagnostico);
        
        btnBuscar = new JButton("Buscar");
        btnLimpiar = new JButton("Limpiar");
        
        btnBuscar.addActionListener(this);
        btnLimpiar.addActionListener(this);
        
        ID.setBounds(40, 20, 100, 30);
        txtID.setBounds(140, 20, 100, 30);
        sp.setBounds(40, 100, 350, 150);
        btnBuscar.setBounds(280, 20, 100, 30);
        btnLimpiar.setBounds(135, 280, 100, 30);
        
        diagnostico.setEnabled(false);
        
        add(ID);
        add(txtID);
        add(sp);
        add(btnBuscar);
        add(btnLimpiar);
        
        v.soloNumeros(txtID);
        v.limiteNumerosID(txtID);
    }
    
    public void limpiarDatos() {
        txtID.setText("");
        diagnostico.setText("");
        btnBuscar.setEnabled(true);
    }
    
    public Diagnostico buscar () {
        long id = Long.parseLong(txtID.getText());
        Diagnostico d = null;
        
        for (int i = 0; i < historiasClinicas.size(); i++) {
            d = (Diagnostico)historiasClinicas.get(i);
            
            if (id == d.getIDPaciente()) {
                diagnostico.setText(d.getDiagnosticoFinal());
                JOptionPane.showMessageDialog(null, "Diagnostico encontrado");
                btnBuscar.setEnabled(false);
                break;
            }
            else {
                d = null;
            }
        }
        return d;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == btnLimpiar) {
            limpiarDatos();
        }
        
        if (e.getSource() == btnBuscar) {
            if (historiasClinicas.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay historias clinicas");
                limpiarDatos();
            }
            else {
                if (txtID.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar la ID del paciente");
            }
                else {
                    if (buscar() == null) {
                        JOptionPane.showMessageDialog(null, "La historia del paciente no existe");
                        limpiarDatos();
                    }
                }
            }
        } 
    }
}
