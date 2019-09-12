/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultorioInerfaz;
 
import static ConsultorioFuncionalidad.ContenedorPacientes.*;
import ConsultorioFuncionalidad.Paciente;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.Color;
import static javax.swing.JOptionPane.YES_OPTION;


/**
 *
 * @author apulgarin
 */
public class PanelPaciente extends JPanel implements ActionListener {
    private JLabel jNombre,  jEdad, jIdent, jSexo;
    private JTextField txtNombre, txtEdad, txtIdent, txtSexo;
    private JButton btnAñadir, btnEliminar, btnAgregar, btnMostrarPacientes;
    
    Validaciones v = new Validaciones();
    
    public PanelPaciente () {
        //Quitamos la posicion por defecto 
        setLayout(null);
        
        
        TitledBorder border = BorderFactory.createTitledBorder("");
        this.setBorder(border);
        
        setBackground(Color.lightGray);
        
        //Creacion del JLabel con sus respectivas fuentes y color.
        jNombre = new JLabel("Nombre");
        jNombre.setForeground(Color.white);
        jNombre.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
        
        jEdad = new JLabel("Edad");
        jEdad.setForeground(Color.white);
        jEdad.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
        jIdent = new JLabel("ID");
        jIdent.setForeground(Color.white);
        jIdent.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
        jSexo = new JLabel("Sexo");
        jSexo.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
        jSexo.setForeground(Color.white);
        
        //Creacion de las cajas de texto TextField
        txtNombre = new JTextField();
        txtEdad = new JTextField();
        txtIdent = new JTextField();
        txtSexo = new JTextField();
        
        txtNombre.setToolTipText("Ingrese el nombre del paciente");
        txtEdad.setToolTipText("Ingrese la edad del paciente");
        txtIdent.setToolTipText("Ingrese la ID del paciente");
        txtSexo.setToolTipText("Ingrese el sexo del paciente");
        
        //Implementamos los oyentes de teclado para no permitir entrada de ciertos datos
        
        v.soloNumeros(txtIdent);
        v.soloNumeros(txtEdad);
        v.limiteNumerosID(txtIdent);
        v.limiteNumerosEdad(txtEdad);
        v.soloLetras(txtNombre);
        v.soloLetras(txtSexo);
        
        add(jNombre);
        add(txtNombre);
        add(jEdad);
        add(txtEdad);
        add(jIdent);
        add(txtIdent);
        add(jSexo);
        add(txtSexo);
        

        
        //Creacion de los botones
        btnAñadir = new JButton("Añadir");
        btnEliminar = new JButton("Eliminar");
        btnAgregar = new JButton("Agregar");
        btnMostrarPacientes = new JButton("Mostrar \n Pacientes");
        
        btnAñadir.addActionListener(this);
        btnEliminar.addActionListener(this);
        btnAgregar.addActionListener(this);
        btnMostrarPacientes.addActionListener(this);
        
        //Posicion de los JLabel de la interfaz
        jNombre .setBounds(20, 40, 100, 30);
        jEdad.setBounds(20, 100, 100, 30);
        jIdent.setBounds(370, 40, 100, 30);
        jSexo.setBounds(370, 100, 100, 30);
        
        //Posicion de las cajas de texto de la interfaz
        txtNombre.setBounds(130, 40, 200, 30);
        txtEdad.setBounds(130, 100, 200, 30);
        txtIdent.setBounds(450, 40, 200, 30);
        txtSexo.setBounds(450, 100, 200, 30);
        
        //Posicion de los botones de la interfaz
        btnAñadir.setBounds(360, 180, 100, 50);
        btnEliminar.setBounds(220, 180, 100, 50);
        btnAgregar.setBounds(80, 180, 100, 50);
        btnMostrarPacientes.setBounds(500, 180, 100, 50);
        
        //Anadimos los botones
        add(btnAñadir);
        add(btnEliminar);
        add(btnAgregar);
        add(btnMostrarPacientes);
        
        txtNombre.setEnabled(false);
        txtEdad.setEnabled(false);
        txtIdent.setEnabled(false);
        txtSexo.setEnabled(false);
        
        btnAgregar.setEnabled(true);
        btnAñadir.setEnabled(false);
        btnEliminar.setEnabled(false);
    }
    
    public void limpiarDatos () {
        txtNombre.setText("");
        txtEdad.setText("");
        txtIdent.setText("");
        txtSexo.setText("");
    }
    
    public void btnAgregar () {
        btnAgregar.setEnabled(false);
        btnAñadir.setEnabled(true);
        
        txtNombre.setEnabled(true);
        txtEdad.setEnabled(true);
        txtIdent.setEnabled(true);
        txtSexo.setEnabled(true);
        
    }
    
    public void btnAñadir () {
        btnAgregar.setEnabled(true);
        btnAñadir.setEnabled(false);
        
        txtNombre.setEnabled(false);
        txtEdad.setEnabled(false);
        txtIdent.setEnabled(false);
        txtSexo.setEnabled(false);
    }
    
    public void AñadirPacientes () {
               
        String nom = txtNombre.getText();
        int ed = Integer.parseInt(txtEdad.getText());
        String sexo = txtSexo.getText();
        long id = Long.parseLong(txtIdent.getText());

        listaPacientes.add(new Paciente(nom, ed, sexo, id));
             
        JOptionPane.showMessageDialog(null,"Paciente registrado satisfactoriamente");
        btnAñadir();
    }
    
    public int buscar () {
        long id = Long.parseLong(txtIdent.getText());
        Paciente p = new Paciente(id);
        
        int cont = 1;
        
        if (listaPacientes.size() >= 1) {
        for (int i = 0; i < listaPacientes.size(); i++) {
            p = (Paciente)listaPacientes.get(i);
            
            if (id == p.getIdent()) {
                cont = 0;
                break;
            }
            else {
                cont = 1;
            }
        }
        }
        return cont;
    }
    
    @Override
    public void actionPerformed (ActionEvent e) {
        
        if (e.getSource() == btnAgregar) {
            btnAgregar();
            
            if (listaPacientes.isEmpty()) {
                btnEliminar.setEnabled(false);
            }
            else {
                btnEliminar.setEnabled(true);
            }
        }

        if (e.getSource() == btnAñadir) {             
            
            if (txtNombre.getText().equals("") || txtEdad.getText().equals("") || txtIdent.getText().equals("") || txtSexo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Debes llenar todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);
                limpiarDatos();
                btnAñadir();
            }
            else {
                if (buscar() == 0) {
                    JOptionPane.showMessageDialog(null, "El paciente ya existe", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    if (txtNombre.getText().equals("") || txtEdad.getText().equals("") || txtIdent.getText().equals("") || txtSexo.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Debes llenar todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);
                        limpiarDatos();
                        btnAñadir();
                    }
                    else if (txtIdent.getText().length() < 6) {
                        JOptionPane.showMessageDialog(null, "La ID debe contener mas de 6 digitos");
                        limpiarDatos();
                        btnAñadir();
                    }
            
                    else if (txtSexo.getText().toLowerCase().equals("mujer") || txtSexo.getText().equals("femenino")) {
                        txtSexo.setText("Femenino");
                        AñadirPacientes();
                        limpiarDatos();
                        btnAñadir();
                    }
            
                    else if (txtSexo.getText().toLowerCase().equals("hombre") || txtSexo.getText().equals("masculino")) {
                        txtSexo.setText("Masculino");
                        AñadirPacientes();
                        limpiarDatos();
                        btnAñadir();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Error", "Sexo erroneo", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        
        if (e.getSource() == btnEliminar ) {
            long id = Long.parseLong(txtIdent.getText());
            Paciente p = new Paciente();
            
            if (listaPacientes.isEmpty()) {
                btnEliminar.setEnabled(false);
            }
            
            else {
                if (txtIdent.equals("")) {
                    JOptionPane.showMessageDialog(null, "Para eliminar un paciente debe ingresar solo su ID");
                }
                else {
                    for (int i = 0; i < listaPacientes.size(); i++) {
                        p = (Paciente)listaPacientes.get(i);
                        if (id == p.getIdent()) {
                            long res = JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar el paciente " + p.getNombre(), "ADVERTENCIA", JOptionPane.YES_NO_OPTION);
                            
                            if (res == YES_OPTION) {
                                listaPacientes.remove(i);
                                JOptionPane.showMessageDialog(null, "Paciente eliminado");
                            }
                            else {
                                JOptionPane.showMessageDialog(null, "Operacion denegada");
                            }
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "El paciente que desea eliminar no existe");
                            limpiarDatos();
                            btnAñadir();
                        }
                    }
                }
            }
        }
        
        if (e.getSource() == btnMostrarPacientes) {
            if (listaPacientes.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay pacientes registrados");
            }
            else {
                InterfazBancoPacientes b = new InterfazBancoPacientes();
                b.setVisible(true);
            }
        }
    }
}
