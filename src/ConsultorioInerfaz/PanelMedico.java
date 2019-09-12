/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultorioInerfaz;

import ConsultorioFuncionalidad.Consultorio;
import static ConsultorioFuncionalidad.ContenedorMedicos.*;
import ConsultorioFuncionalidad.Medico;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.border.*;
/**
 *
 * @author apulgarin
 */
public class PanelMedico extends JPanel implements ActionListener {
    private JLabel jNombre,  jEspecializacion, jConsulto, jCodigoNit;
    private JTextField txtNombre, txtEspecializacion, txtConsulto,txtCodigoNit;
    private JButton btnAñadir, btnAgregar, btnEliminar, btnGenerarConsulto, btnMostrarDoc;
  
    Validaciones v = new Validaciones();
    
    public PanelMedico (InterfazMedico interM) {
        setLayout(null);
        
        TitledBorder border = BorderFactory.createTitledBorder("");
        this.setBorder(border);
        
        setBackground(Color.LIGHT_GRAY);
        
        jNombre = new JLabel("Nombre");
        jNombre.setForeground(Color.white);
        jNombre.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
        
        jEspecializacion = new JLabel("Especialidad");
        jEspecializacion.setForeground(Color.white);
        jEspecializacion.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
        
        jConsulto = new JLabel("Consultorio");
        jConsulto.setForeground(Color.white);
        jConsulto.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
        
        jCodigoNit = new JLabel("Codigo");
        jCodigoNit.setForeground(Color.white);
        jCodigoNit.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
        
        txtNombre = new JTextField();
        txtEspecializacion = new JTextField();
        txtCodigoNit = new JTextField();
        
        txtConsulto = new JTextField("0");
        txtConsulto.setEditable(false);
        txtConsulto.setForeground(Color.blue);
        
        txtNombre.setToolTipText("Ingrese el nombre del doctor");
        txtCodigoNit.setToolTipText("Ingrese el codigo del doctor");
        txtEspecializacion.setToolTipText("Ingrese la especializacion del doctor");
        txtConsulto.setToolTipText("Consultorio del doctor");
        
        //Llamamos los metodos de la clase validacion para los KeyTyped
        v.soloLetras(txtNombre);
        v.soloLetras(txtEspecializacion);
        v.soloNumeros(txtCodigoNit);
        v.limiteNumerosCodigoNit(txtCodigoNit);
        
        add(jNombre);
        add(txtNombre);
        add(jEspecializacion);
        add(txtEspecializacion);
        add(jConsulto);
        add(txtConsulto);
        add(jCodigoNit);
        add(txtCodigoNit);
        
        btnAñadir = new JButton("Añadir");
        btnAgregar = new JButton("Agregar");
        btnMostrarDoc = new JButton("Mostrar Doc");
                
        btnEliminar = new JButton("Eliminar");
        btnGenerarConsulto = new JButton("Generar Consultorio");
        
        btnAñadir.addActionListener(this);
        btnAgregar.addActionListener(this);
        btnEliminar.addActionListener(this);
        btnGenerarConsulto.addActionListener(this);
        btnMostrarDoc.addActionListener(this);
        
        jNombre .setBounds(20, 40, 100, 30);
        jEspecializacion.setBounds(20, 100, 100, 30);
        jConsulto.setBounds(370, 100, 100, 30);
        jCodigoNit.setBounds(370, 40, 100, 30);
        
        txtNombre.setBounds(130, 40, 200, 30);
        txtEspecializacion.setBounds(130, 100, 200, 30);
        txtConsulto.setBounds(480, 100, 200, 30);
        txtCodigoNit.setBounds(480, 40, 200, 30);
        
        btnAñadir.setBounds(160, 180, 100, 50);
        btnAgregar.setBounds(20, 180, 100, 50);
        btnEliminar.setBounds(300, 180, 100, 50);
        btnGenerarConsulto.setBounds(440, 180, 100, 50);
        btnMostrarDoc.setBounds(580, 180, 100, 50);
        
        add(btnAñadir);
        add(btnAgregar);
        add(btnEliminar);
        add(btnGenerarConsulto);
        add(btnMostrarDoc);
        
        btnAgregar.setEnabled(true);
        btnAñadir.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGenerarConsulto.setEnabled(false);
              
        txtNombre.setEnabled(false);
        txtCodigoNit.setEnabled(false);
        txtConsulto.setEnabled(false);
        txtEspecializacion.setEnabled(false);
    }
    
    public void btnAgregar () {
        btnAgregar.setEnabled(false);
        btnAñadir.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGenerarConsulto.setEnabled(true);
        
        txtNombre.setEnabled(true);
        txtCodigoNit.setEnabled(true);
        txtConsulto.setEnabled(true);
        txtEspecializacion.setEnabled(true);
    }
    
    public void btnAñadir () {
        btnAgregar.setEnabled(true);
        btnAñadir.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGenerarConsulto.setEnabled(false);
        
        txtNombre.setEnabled(false);
        txtCodigoNit.setEnabled(false);
        txtConsulto.setEnabled(false);
        txtEspecializacion.setEnabled(false);
    }
    
    public void limpiarDatos () {
        txtNombre.setText("");
        txtEspecializacion.setText("");
        txtConsulto.setText("");
        txtCodigoNit.setText("");
        txtConsulto.setText("0");
        txtConsulto.setForeground(Color.blue);
    }
    
    public void getCon () {
        Consultorio consulto1 = new Consultorio();
        consulto1.generarConsultorio();
        int generar = consulto1.getConsultorio();
        String gen = String.valueOf(generar);
        txtConsulto.setText(gen);
        btnGenerarConsulto.setEnabled(false);
    }
    
    public void AñadirMedico () {

        Medico m = new Medico();
        String nom = txtNombre.getText();
        int cod = Integer.parseInt(txtCodigoNit.getText());
        String esp = txtEspecializacion.getText(); 
        int con = Integer.parseInt(txtConsulto.getText());
        
        m.setNombre(nom);
        m.setCodigoNit(cod);
        m.setEspecializacion(esp);
        m.setCon(con);
        listaMedicos.add(m);
                
        JOptionPane.showMessageDialog(null, "Medico registrado"); 
        
    }
    
    public int buscar () {
        int cod = Integer.parseInt(txtCodigoNit.getText());
        Medico m = new Medico(cod);
        
        int cont = 1;
        
        for (int i = 0; i < listaMedicos.size(); i++) {
            m = (Medico)listaMedicos.get(i);
            
            if (cod == m.getCodigoNit()) {
                cont = 0;
                break;
            }
            else {
                cont = 1;
            }
        }
        return cont;
    }
    
    @Override
    public void actionPerformed (ActionEvent e) {
        
        if (e.getSource() == btnAgregar) {
            btnAgregar();
        }
        
        if (e.getSource() == btnAñadir) {
            if (txtNombre.getText().equals("") || txtCodigoNit.getText().equals("") || txtEspecializacion.getText().equals("") || txtConsulto.getText().equals("0")) {
                JOptionPane.showMessageDialog(null, "Debes llenar todos los campos", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
                limpiarDatos();
                btnAñadir();
            }
            else {
                if (buscar() == 0) {
                    JOptionPane.showMessageDialog(null, "El medico ya se encuentra registrado", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
                    limpiarDatos();
                    btnAñadir();
                }
                else {
                    if (txtNombre.getText().equals("") || txtCodigoNit.getText().equals("") || txtEspecializacion.getText().equals("") || txtConsulto.getText().equals("0")) {
                        JOptionPane.showMessageDialog(null, "Debes llenar todos los campos", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
                        limpiarDatos();
                        btnAñadir();
                    }
                    else if (txtCodigoNit.getText().length() != 5) {
                        JOptionPane.showMessageDialog(null, "El codigo debe contener 5 digitos");
                    }
                    
                    else {   
                        if (txtEspecializacion.getText().toLowerCase().equals("general")) {
                            txtEspecializacion.setText("General");
                            AñadirMedico();
                            limpiarDatos();
                            btnAñadir();
                        }
                    
                        else if (txtEspecializacion.getText().toLowerCase().equals("pediatra")) {
                            txtEspecializacion.setText("Pediatra");
                            AñadirMedico();
                            limpiarDatos();
                            btnAñadir();
                        }
                    
                        else if (txtEspecializacion.getText().toLowerCase().equals("odontologo")) {
                            txtEspecializacion.setText("Odontologo");
                            AñadirMedico();
                            limpiarDatos();
                            btnAñadir();
                        }
                        
                        else {
                            JOptionPane.showMessageDialog(null, "Solo se permiten las categorias \n Pediatra \n Odontologo \n General" , "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
                            limpiarDatos();
                            btnAñadir();
                        }                    
                    }
                }
            }
        }
        
        if (e.getSource() == btnGenerarConsulto) {
            getCon();
        }
        
        if (e.getSource() == btnMostrarDoc) {
            if (listaMedicos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay doctores registrados");
            }
            else {
                InterfazBancoDoctores b = new InterfazBancoDoctores();
                b.setVisible(true);
            }
        }
        
        if (e.getSource() == btnEliminar) {
            if (txtCodigoNit.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Para eliminar un doctor debe ingresar su codigo");
            }
            else {
                int cod = Integer.parseInt(txtCodigoNit.getText());
                Medico m = new Medico(cod);
                
                for (int i = 0; i < listaMedicos.size(); i++) {
                    m = (Medico)listaMedicos.get(i);
                    
                    if (cod == m.getCodigoNit()) {
                        long res = JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar al doctor " + m.getNombre(), "ADVERTENCIA", JOptionPane.YES_NO_OPTION);
                        
                        if (res == YES_OPTION) {
                            listaMedicos.remove(i);
                            JOptionPane.showMessageDialog(null, "El medico se ha eliminado");
                            limpiarDatos();
                            btnAñadir();
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Operacion denegada");
                            limpiarDatos();
                            btnAñadir();
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "El medico que desea eliminar no se encuentra en la lista");
                        limpiarDatos();
                        btnAñadir();
                    }
                }
            }
        }
    }
}
