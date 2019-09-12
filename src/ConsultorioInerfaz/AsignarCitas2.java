/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultorioInerfaz;

import ConsultorioFuncionalidad.Citas;
import static ConsultorioFuncionalidad.ContenedorCitas.listaCitas;
import static ConsultorioFuncionalidad.ContenedorPacientes.listaPacientes;
import ConsultorioFuncionalidad.Paciente;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author apulgarin
 */
public class AsignarCitas2 extends JPanel implements ActionListener {
    private JLabel lblFecha, lblMotivo, lblID, lblNombre;
    private JTextField txtDiaCita, txtMesCita, txtAñoCita, txtMotivo, txtNom, txtIdenti;
    private JButton btnAgregar, btnLimpiar, btnInfo, btnGenerarCita, btnBuscar, btnEliminar;
    
    Calendar fecha = Calendar.getInstance();
    int mes = fecha.get(Calendar.MONTH) + 1;
    Validaciones v = new Validaciones();
    
    public AsignarCitas2 () {
       setLayout(null);
       
       setBackground(Color.lightGray);
       
       TitledBorder border = BorderFactory.createTitledBorder("Datos de la cita");
       this.setBorder(border);
       
       lblFecha = new JLabel("Fecha cita");
       lblFecha.setForeground(Color.white);
       lblFecha.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
       
       lblMotivo = new JLabel("Motivo Consulta");
       lblMotivo.setForeground(Color.white);
       lblMotivo.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
       
       lblID = new JLabel("ID");
       lblID.setForeground(Color.white);
       lblID.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
       
       lblNombre = new JLabel("Nombre");
       lblNombre.setForeground(Color.white);
       lblNombre.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD, 15 ) );
       
       txtDiaCita = new JTextField("dd");
       txtNom = new JTextField();
       txtIdenti = new JTextField();
       txtMotivo = new JTextField();
       txtMesCita = new JTextField("mm");
       txtAñoCita = new JTextField("2016");
       
       v.soloLetras(txtMotivo);
       v.soloNumeros(txtIdenti);
       v.limiteNumerosID(txtIdenti);
       
       btnAgregar = new JButton("Asignar cita");
       btnLimpiar = new JButton("Limpiar");
       btnInfo = new JButton("Informacion paciente");
       btnGenerarCita = new JButton("Generar cita");
       btnBuscar = new JButton("Buscar");
       btnLimpiar = new JButton("Limpiar");
       btnEliminar = new JButton("Eliminar");
       
       btnAgregar.addActionListener(this);
       btnLimpiar.addActionListener(this);
       btnGenerarCita.addActionListener(this);
       btnInfo.addActionListener(this);
       btnBuscar.addActionListener(this);
       btnLimpiar.addActionListener(this);
       btnEliminar.addActionListener(this);
       
       txtDiaCita.setEnabled(false);
       txtMesCita.setEnabled(false);
       txtAñoCita.setEnabled(false);
       txtNom.setEnabled(false);
       txtMotivo.setEnabled(false);
       btnGenerarCita.setEnabled(false);
       btnAgregar.setEnabled(false);
       btnEliminar.setEnabled(false);
       
       //Damos las posiciones de los elementos del JFrame 
       lblID.setBounds(20, 20, 100, 30);
       txtIdenti.setBounds(60, 20, 150, 30);
       btnBuscar.setBounds(220, 20, 100, 30);
       lblNombre.setBounds(20, 120, 100, 30);
       txtNom.setBounds(100, 120, 150, 30);
       lblMotivo.setBounds(260, 120, 150, 30);
       txtMotivo.setBounds(380, 120, 150, 30);
       lblFecha.setBounds(20, 180, 150, 30);
       txtDiaCita.setBounds(100, 180, 150, 30);
       txtMesCita.setBounds(100, 220, 150, 30);
       txtAñoCita.setBounds(100, 260, 150, 30);
       
       btnAgregar.setBounds(260, 180, 100, 50);
       btnLimpiar.setBounds(330, 300, 100, 30);
       btnInfo.setBounds(400, 180, 130, 50);
       btnGenerarCita.setBounds(400, 240, 130, 50);
       btnEliminar.setBounds(260, 240, 100, 50);
       
       add(txtAñoCita);
       add(lblFecha);
       add(txtDiaCita);
       add(txtMesCita);
       add(lblMotivo);
       add(txtMotivo);
       add(btnAgregar);
       add(btnInfo);
       add(btnGenerarCita);
       add(btnLimpiar);
       add(lblID);
       add(txtIdenti);
       add(lblNombre);
       add(txtNom);
       add(btnBuscar);
       add(btnLimpiar); 
       add(btnEliminar);
    }
    
    public void limpiar () {
        txtDiaCita.setText("");
        txtMesCita.setText("");
        txtMotivo.setText("");
        txtDiaCita.setText("dd");
        txtMesCita.setText("mm");
        txtNom.setText("");
        txtIdenti.setText("");
    }
    
    public void btnBuscar () {
        btnGenerarCita.setEnabled(true);
        txtMotivo.setEnabled(true);
    }
    
    public void btnLimpiar () {
        txtDiaCita.setEnabled(false);
        txtMesCita.setEnabled(false);
        txtAñoCita.setEnabled(false);
        txtNom.setEnabled(false);
        txtMotivo.setEnabled(false);
        btnGenerarCita.setEnabled(false);
        btnAgregar.setEnabled(false);
        btnBuscar.setEnabled(true);
        txtIdenti.setEnabled(true);
        btnEliminar.setEnabled(false);
    }
    
    
    public void AgregarCitas () {
        
        String nom = txtNom.getText();
        long id = Long.parseLong(txtIdenti.getText());
        int dd = Integer.parseInt(txtDiaCita.getText());
        int mm = Integer.parseInt(txtMesCita.getText());
        int aaaa = 2016;
        String mot = txtMotivo.getText();
        
        listaCitas.add(new Citas(nom, id, dd, mm, aaaa, mot));

        JOptionPane.showMessageDialog(null, "Cita generada");
    }
    
    //Metodo para generar el dia de su cita al paciente
    public void generarCita () {
        Citas c = new Citas();
        c.generarDia();
        int diaCita = c.getDiaCita();
        String d = String.valueOf(diaCita);
        txtDiaCita.setText(d);
        
        c.generarMes();
        int mesCita = c.getMesCita();
        
        while (mesCita < mes) {
            c.generarMes();
            mesCita = c.getMesCita();
        }
        
        String m = String.valueOf(mesCita);
        txtMesCita.setText(m);
    }
    
    public Paciente buscar () {
        long id = Long.parseLong(txtIdenti.getText());
        Paciente p = null;
        
        for (int i = 0; i < listaPacientes.size(); i++) {
            p = (Paciente)listaPacientes.get(i);
            
            if (id == p.getIdent()) {
                txtNom.setText(p.getNombre());
                btnBuscar();
                JOptionPane.showMessageDialog(null, "Operacion realizada");
                txtIdenti.setEditable(false);
                btnBuscar.setEnabled(false);
                btnEliminar.setEnabled(true);
                break;
            }
            else {
                p = null;
            }
        }
        return p;
    }
    
    public Citas PacienteRepetido () {
        long id = Long.parseLong(txtIdenti.getText());
        Citas c = null;
        
        for (int i = 0; i < listaCitas.size(); i++) {
            c = (Citas)listaCitas.get(i);
            
            if (id == c.getID()) {
                JOptionPane.showMessageDialog(null, "El paciente no puede tener dos citas activas al mismo tiempo", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
                txtIdenti.setEditable(false);
                btnBuscar.setEnabled(false);
                btnEliminar.setEnabled(true);
                break;
            }
            c = null;
        }
        return c;
    }
     
    @Override
    public void actionPerformed (ActionEvent e) {
        
        if (e.getSource() == btnGenerarCita) {
            generarCita();
            btnGenerarCita.setEnabled(false);
            btnAgregar.setEnabled(true);
        }
        
        if (e.getSource() == btnAgregar) {
            if (!txtMotivo.getText().equals("")) {
                AgregarCitas();
                btnAgregar.setEnabled(false);
            }
            else {
               JOptionPane.showMessageDialog(null, "Debe ingresar el motivo de su cita");
            }
            
        }
        
        if (e.getSource() == btnBuscar) {
            
            if (txtIdenti.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Debes ingresar la ID del paciente ", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
            }
            else {
                if (buscar() == null) {
                    long res = JOptionPane.showConfirmDialog(null, "El paciente no esta registrado. \n Desea registrarlo?", "ERROR",  JOptionPane.YES_NO_OPTION);
                            
                    if (res == YES_OPTION) {
                        InterfazPaciente ip = new InterfazPaciente();
                        ip.setVisible(true);
                        limpiar();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Operacion denegada");
                        limpiar();
                    }
                }
            }
        }
        
        if (e.getSource() == btnLimpiar) {
            limpiar();
            btnLimpiar();
            txtIdenti.setEditable(true);
        }
        
        if (e.getSource() == btnEliminar) {
            if (listaCitas.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Lista de citas vacia");
            }
            else {
                if (txtIdenti.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Para poder eliminar una cita debe ingresar el ID del usuario");
                }
                else {
                    long id = Long.parseLong(txtIdenti.getText());
                    Citas p = new Citas();
                
                    for (int i = 0; i < listaCitas.size(); i++) {
                        p = (Citas)listaCitas.get(i);
                    
                        if (id == p.getID()) {
                            long res = JOptionPane.showConfirmDialog(null, "Esta seguro que desea borrar la cita del señor " + p.getNombre(), "ADVERTENCIA", JOptionPane.YES_NO_OPTION);
                        
                            if (res == YES_OPTION) {
                                listaCitas.remove(i);
                                JOptionPane.showMessageDialog(null, "Cita eliminada");
                                limpiar();
                                btnLimpiar();
                            }
                            else {
                                JOptionPane.showMessageDialog(null, "Operacion denegada");
                                limpiar();
                                btnLimpiar();
                            }
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "El paciente no tiene citas pendientes");
                            limpiar();
                            btnLimpiar();
                        }
                    }
                }
            }
        }
        
        if (e.getSource() == btnInfo) {
            if (listaCitas.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Banco de citas vacio");
            }
            else {
                InterfazBancoCitas ib = new InterfazBancoCitas();
                ib.setVisible(true);
            }
        }
    }
    
}
