/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultorioInerfaz;

import ConsultorioFuncionalidad.Citas;
import static ConsultorioFuncionalidad.ContenedorCitas.listaCitas;
import static ConsultorioFuncionalidad.ContenedorDoctorPorPaciente.ldp;
import static ConsultorioFuncionalidad.ContenedorMedicos.listaMedicos;
import ConsultorioFuncionalidad.DoctorPorPaciente;
import ConsultorioFuncionalidad.Medico;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author apulgarin
 */
public class PanelDoctorPorPaciente extends JPanel implements ActionListener {
    private JLabel paciente, doctor, lblNombreP, lblIDp, lblNombreD, lblCodD, lblConsultorio, lblTablaDp;
    private JTextField txtNombreP, txtIDp, txtNombreD, txtCodD, txtConsulD;
    private JButton btnBuscar, btnAgregar, btnActualizar;
    private JTable tabla;
    private DefaultTableModel model1;
    private JScrollPane sp;
    
    Validaciones v = new Validaciones();
    
    public PanelDoctorPorPaciente () {
        setLayout(null);
        
        setBackground(Color.lightGray);
        
        TitledBorder border = BorderFactory.createTitledBorder("");
        this.setBorder(border);
        
        //Creamos todos los elementos del panel
        paciente = new JLabel("Paciente");
        paciente.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 25 ) );
        
        doctor = new JLabel("Doctor");
        doctor.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 25));
        
        lblNombreP = new JLabel("Nombre");
        lblNombreP.setForeground(Color.white);
        lblNombreP.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
        
        lblIDp = new JLabel("ID");
        lblIDp.setForeground(Color.white);
        lblIDp.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
        
        lblNombreD = new JLabel("Nombre");
        lblNombreD.setForeground(Color.white);
        lblNombreD.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
        
        lblCodD = new JLabel("Codigo");
        lblCodD.setForeground(Color.white);
        lblCodD.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
        
        lblConsultorio = new JLabel("Consultorio");
        lblConsultorio.setForeground(Color.white);
        lblConsultorio.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
        
        lblTablaDp = new JLabel("Citas");
        lblTablaDp.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 25));
        
        txtNombreP = new JTextField();
        txtIDp = new JTextField();
        txtNombreD = new JTextField();
        txtCodD = new JTextField();
        txtConsulD = new JTextField();
        
        txtNombreP.setToolTipText("nombre del paciente");
        txtIDp.setToolTipText("Ingrese la ID del paciente");
        txtNombreD.setToolTipText("Nombre del doctor");
        txtCodD.setToolTipText("Ingrese Codigo del doctor");
        txtConsulD.setToolTipText("Consultorio del medico");
        
        txtNombreP.setEditable(false);
        txtNombreD.setEditable(false);
        txtConsulD.setEditable(false);
        
        btnBuscar = new JButton("Buscar");
        btnAgregar = new JButton("Agregar");
        btnActualizar = new JButton("Actualizar");
        
        btnBuscar.addActionListener(this);
        btnAgregar.addActionListener(this);
        btnActualizar.addActionListener(this);
        btnAgregar.setEnabled(false);
        
        //Añadimos la posicion de cada elemento
        lblTablaDp.setBounds(850, 20, 100, 30);
        paciente.setBounds(40, 20, 100, 30);
        doctor.setBounds(440, 20, 100, 30);
        lblNombreP.setBounds(20, 100, 100, 30);
        lblIDp.setBounds(20, 60, 100, 30);
        txtNombreP.setBounds(80, 100, 150, 30);
        txtIDp.setBounds(80, 60, 150, 30);
        lblNombreD.setBounds(360, 100, 100, 30);
        lblCodD.setBounds(360, 60, 100, 30);
        txtNombreD.setBounds(440, 100, 150, 30);
        txtCodD.setBounds(440, 60, 150, 30);
        lblConsultorio.setBounds(360, 140, 100, 30);
        txtConsulD.setBounds(440, 140, 150, 30);
        btnBuscar.setBounds(100, 200, 150, 30);
        btnAgregar.setBounds(350, 200, 150, 30);
        btnActualizar.setBounds(830, 230, 150, 30);
        
        //Agregamos los elemtos
        add(lblTablaDp);
        add(paciente);
        add(doctor);
        add(lblNombreP);
        add(lblIDp);
        add(txtNombreP);
        add(txtIDp);
        add(lblNombreD);
        add(lblCodD);
        add(txtNombreD);
        add(txtCodD);
        add(lblConsultorio);
        add(txtConsulD);
        add(btnBuscar);
        add(btnAgregar);
        add(btnActualizar);
        
        
        //Tabla donde mostraremos el doctor con su respectivo paciente
        String[] col = {"Paciente", "ID.Paciente", "Medico", "Cod.Medico", "Consultorio"};
        String[][] data = {};
        model1 = new DefaultTableModel(data, col);
        tabla = new JTable(model1);
        sp = new JScrollPane(tabla);
        
        sp.setBounds(650, 60, 500, 165);
        add(sp);
        
        //Llamamos los metodos KeyTyped
        v.soloNumeros(txtIDp);
        v.soloNumeros(txtCodD);  
        v.limiteNumerosCodigoNit(txtCodD);
        v.limiteNumerosID(txtIDp);
    }
    
    public void agregarFilas () {
        Object[] fila = new Object[5];
        DoctorPorPaciente dpp = new DoctorPorPaciente();
        
        for (int i = 0; i < ldp.size(); i++) {
            dpp = (DoctorPorPaciente)ldp.get(i);
            fila[0] = ldp.get(i).getNombrePaciente();
            fila[1] = ldp.get(i).getIDPaciente();
            fila[2] = ldp.get(i).getNombreDoctor();
            fila[3] = ldp.get(i).getCodDoctor();
            fila[4] = ldp.get(i).getConsultorio();
            model1.addRow(fila);
        }
    }
    public void agregarF () {
        model1.addRow(new Object[]{txtNombreP.getText(), txtIDp.getText(), txtNombreD.getText(), txtCodD.getText(), txtConsulD.getText()});    
    }
    
    public Citas BuscarPaciente () {
        long IDP = Long.parseLong(txtIDp.getText());
        
        Citas c = null;
        
        for (int i = 0; i < listaCitas.size(); i++) {
            c = (Citas)listaCitas.get(i);
            
            if (IDP == c.getID()) {
                txtNombreP.setText(c.getNombre());
                break;
            }
            else {
                c = null;
            }
        }
        return c;
    }
    
    public void limpiarDatos () {
        txtCodD.setText("");
        txtIDp.setText("");
        txtNombreP.setText("");
        txtNombreD.setText("");
        txtConsulD.setText("");
        txtIDp.setEnabled(true);
        txtCodD.setEnabled(true);
    }
    
    public Medico BuscarDoctor () {
        int CodD = Integer.parseInt(txtCodD.getText());
        
        Medico m = null;
        for (int i = 0; i < listaMedicos.size(); i++) {
            m = (Medico)listaMedicos.get(i);
            
            if (CodD == m.getCodigoNit()) {
                txtNombreD.setText(m.getNombre());
                String con = String.valueOf(m.getCon());
                txtConsulD.setText(con);
                break;
            }
            else {
                m = null;
            }
        }
        return m;
    }
    
    public void Agregar () {
        String nomP = txtNombreP.getText();
        long IDp = Long.parseLong(txtIDp.getText());
        String nomD = txtNombreD.getText();
        int CodD = Integer.parseInt(txtCodD.getText());
        int con = Integer.parseInt(txtConsulD.getText());
        
        DoctorPorPaciente dpp = new DoctorPorPaciente(nomP, IDp, nomD, CodD, con);
        ldp.add(dpp);
    }
    
   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnBuscar) {
            if (listaCitas.isEmpty() || listaMedicos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Asegurese de que hayan citas registradas y medicos");
                limpiarDatos();
            }
            else {
                if (txtCodD.getText().equals("") || txtIDp.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe primero buscar la cita del paciente y su doctor");
                }
                else {
                    if (BuscarDoctor() == null) {
                        long res = JOptionPane.showConfirmDialog(null, "El doctor no esta registrado \n Desea registrarlo?", "Error", JOptionPane.YES_NO_OPTION);
                        
                        if (res == YES_OPTION) {
                            InterfazMedico im = new InterfazMedico();
                            im.setVisible(true);
                        }
                    }
                    
                    else if (BuscarPaciente() == null) {
                        long resp = JOptionPane.showConfirmDialog(null, "El paciente no esta registrado en el banco de preCitas. \n Desea registrarlo?", "Error", JOptionPane.YES_NO_OPTION);
                        
                        if (resp == YES_OPTION) {
                            InterfazCitas ic = new InterfazCitas();
                            ic.setVisible(true);
                        }
                    }
                    
                    if (BuscarPaciente() != null && BuscarDoctor() != null) {
                        JOptionPane.showMessageDialog(null, "Operacion realizada");
                        btnAgregar.setEnabled(true);
                        btnBuscar.setEnabled(false);
                    }
                }
            }  
        }
        
        if (e.getSource() == btnAgregar) {          
            Agregar();
            agregarF();
            btnAgregar.setEnabled(false);
            btnBuscar.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Doctor asignado", "", JOptionPane.INFORMATION_MESSAGE);
            limpiarDatos();
            btnActualizar.setEnabled(false);
        }
        
        if (e.getSource() == btnActualizar) {
            agregarFilas();
            btnActualizar.setEnabled(false);
        }
    }
    
}
