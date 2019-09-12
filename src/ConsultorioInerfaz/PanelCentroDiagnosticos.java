/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultorioInerfaz;

import static ConsultorioFuncionalidad.ContenedorDiagnosticos.historiasClinicas;
import static ConsultorioFuncionalidad.ContenedorDoctorPorPaciente.ldp;
import ConsultorioFuncionalidad.Diagnostico;
import ConsultorioFuncionalidad.DoctorPorPaciente;
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
public class PanelCentroDiagnosticos extends JPanel implements ActionListener {
    private JLabel ID, NombreP, NombreD, codigoD;
    private JButton btnBuscar, btnAgregar;
    private JTextArea historialClinico;
    private JTextField txtIDP, txtNombreP, txtNombreD, txtCodigoD;
    private JScrollPane sp;
    
    Validaciones v = new Validaciones();
    
    public PanelCentroDiagnosticos () {
        setLayout(null);
        setBackground(Color.lightGray);
        
        ID = new JLabel("ID.Paciente");
        ID.setForeground(Color.white);
        ID.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
        
        NombreP = new JLabel("Nombre");
        NombreP.setForeground(Color.white);
        NombreP.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
        
        NombreD = new JLabel("Medico");
        NombreD.setForeground(Color.white);
        NombreD.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
        
        codigoD = new JLabel("Cod.Medico");
        codigoD.setForeground(Color.white);
        codigoD.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
        
        historialClinico = new JTextArea("Diagnostico del paciente");
        historialClinico.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
        sp = new JScrollPane(historialClinico);
        
        txtIDP = new JTextField();
        txtNombreP = new JTextField();
        txtNombreD = new JTextField();
        txtCodigoD = new JTextField();
        
        txtIDP.setToolTipText("Ingrese la ID del paciente");
        txtNombreP.setToolTipText("Nombre del paciente");
        txtNombreD.setToolTipText("Nombre del doctor");
        txtCodigoD.setToolTipText("Codigo del doctor");
        
        
        txtNombreP.setEnabled(false);
        txtNombreD.setEnabled(false);
        txtCodigoD.setEnabled(false);
        
        btnBuscar = new JButton("Buscar");
        btnAgregar = new JButton("Agregar");
        btnBuscar.addActionListener(this);
        btnAgregar.addActionListener(this);
        
        btnAgregar.setEnabled(false);
        
        ID.setBounds(20, 20, 150, 30);
        NombreP.setBounds(20, 60, 100, 30);
        codigoD.setBounds(20, 120, 150, 30);
        NombreD.setBounds(20, 160, 100, 30);
        
        txtIDP.setBounds(110, 20, 150, 30);
        txtNombreP.setBounds(110, 60, 150, 30);
        txtCodigoD.setBounds(110, 120, 150, 30);
        txtNombreD.setBounds(110, 160, 150, 30);
        sp.setBounds(320, 20, 200, 165);
        
        btnBuscar.setBounds(200, 220, 100, 30);
        btnAgregar.setBounds(330, 220, 100, 30);
        
        add(ID);
        add(NombreP);
        add(codigoD);
        add(NombreD);
        add(txtIDP);
        add(txtNombreP);
        add(txtCodigoD);
        add(txtNombreD);
        add(sp);
        add(btnBuscar);
        add(btnAgregar);
        
        //Llamamos al metodo para validar los txt
        v.soloNumeros(txtIDP);
        v.soloNumeros(txtCodigoD);
        v.limiteNumerosCodigoNit(txtCodigoD);
        v.limiteNumerosID(txtIDP);
    }
    
    public void limpiarDatos () {
        txtNombreD.setText("");
        txtNombreP.setText("");
        txtIDP.setText("");
        txtCodigoD.setText("");
        historialClinico.setText("");
    }
    
    public DoctorPorPaciente Buscar () {
        long IDP = Long.parseLong(txtIDP.getText());
        DoctorPorPaciente dpp = null;
        
        for (int i = 0; i < ldp.size(); i++) {
            dpp = (DoctorPorPaciente)ldp.get(i);
            
            if (IDP == dpp.getIDPaciente()) {
                String c = String.valueOf(dpp.getCodDoctor());
                
                txtNombreP.setText(dpp.getNombrePaciente());
                txtNombreD.setText(dpp.getNombreDoctor());
                txtCodigoD.setText(c);
                break;
            }
            else {
                dpp = null;
            }
        }
        return dpp;
    }
    
    public void AgregarDiagnostico () {
        String nomP = txtNombreP.getText();
        long idP = Long.parseLong(txtIDP.getText());
        String nomD = txtNombreD.getText();
        int CodD = Integer.parseInt(txtCodigoD.getText());
        String diag = historialClinico.getText();
        
        Diagnostico d = new Diagnostico(nomP, idP, nomD, CodD, diag);
        historiasClinicas.add(d);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnBuscar) {                        
            if (ldp.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Asegurese de que hayan citas registradas");
                limpiarDatos();
            }
            else {
                if (txtIDP.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe primero buscar la cita ");
                }
                else {
                    if (Buscar() == null) {
                        JOptionPane.showConfirmDialog(null, "No se encontro registro ", "Error", JOptionPane.ERROR_MESSAGE);
                        limpiarDatos();
                    }                   
                    else {
                        JOptionPane.showMessageDialog(null, "Operacion realizada");
                        btnAgregar.setEnabled(true);
                        btnBuscar.setEnabled(false);
                    }
                }
            }
        }
        
        if (e.getSource() == btnAgregar) {
            if (Buscar() != null && !historialClinico.getText().equals("")) {
                AgregarDiagnostico();
                JOptionPane.showMessageDialog(null, "Diagnostico generado");
                btnAgregar.setEnabled(false);
                btnBuscar.setEnabled(true);
                v.eliminarPrecita(txtIDP);
                v.eliminarCita(txtIDP);
                JOptionPane.showMessageDialog(null, "El paciente ha completado su cita");
                limpiarDatos();
            }
        }
    }
}
