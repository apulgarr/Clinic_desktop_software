/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultorioInerfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author apulgarin
 */
public class MenuPrincipalPanel extends JPanel implements ActionListener {
    private JButton btnPacientes, btnMedicos, btnHorarios, btnDoctorPorPaciente, btnCentroDiagnosticos, btnHistoriasClinicas;
    
    public MenuPrincipalPanel () {
       
        setLayout(new GridLayout(2,3));
        
        setBackground(Color.lightGray);
        
        TitledBorder border = BorderFactory.createTitledBorder("");
        this.setBorder(border);
        
        btnPacientes = new JButton();
        btnMedicos = new JButton();
        btnHorarios = new JButton();
        btnDoctorPorPaciente = new JButton();
        btnCentroDiagnosticos = new JButton();
        btnHistoriasClinicas = new JButton();
        
        //Vamos a cargar las imagenes
        Icon img = new ImageIcon(getClass().getResource("Doctorinicio.png"));
        btnMedicos.setIcon(img);
        btnMedicos.setToolTipText("Registro medicos");
        
        Icon i = new ImageIcon(getClass().getResource("PacienteInici.png"));
        btnPacientes.setIcon(i);
        btnPacientes.setToolTipText("Registro pacientes");
        
        Icon e = new ImageIcon(getClass().getResource("PacDocInicio.png"));
        btnDoctorPorPaciente.setIcon(e);
        btnDoctorPorPaciente.setToolTipText("Asignar doctor");
        
        Icon f = new ImageIcon(getClass().getResource("Calendar.png"));
        btnHorarios.setIcon(f);
        btnHorarios.setToolTipText("Registro Pre citas");
        
        Icon h = new ImageIcon(getClass().getResource("CitaInicio.png"));
        btnCentroDiagnosticos.setIcon(h);
        btnCentroDiagnosticos.setToolTipText("Centro de diagnosticos");
        
        Icon t = new ImageIcon(getClass().getResource("AreaInicio.png"));
        btnHistoriasClinicas.setIcon(t);
        btnHistoriasClinicas.setToolTipText("Banco de historias clinicas");
        
        btnDoctorPorPaciente.addActionListener(this);
        btnPacientes.addActionListener(this);
        btnMedicos.addActionListener(this);
        btnHorarios.addActionListener(this);
        btnCentroDiagnosticos.addActionListener(this);
        btnHistoriasClinicas.addActionListener(this);
        
        add(btnPacientes);
        add(btnMedicos);
        add(btnHorarios);
        add(btnDoctorPorPaciente);
        add(btnCentroDiagnosticos);
        add(btnHistoriasClinicas);
    }
    
    @Override
    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == btnPacientes) {
            InterfazPaciente interP = new InterfazPaciente();
            interP.setVisible(true);
        }
        
        if (e.getSource() == btnMedicos) {
            InterfazMedico interM = new InterfazMedico();
            interM.setVisible(true);
        }
        
        if (e.getSource() == btnHorarios) {
            InterfazCitas interC = new InterfazCitas();
            interC.setVisible(true);
        }
        
        if (e.getSource() == btnDoctorPorPaciente) {
            InterfazDoctorPorPaciente p = new InterfazDoctorPorPaciente();
            p.setVisible(true);
        }
        
        if (e.getSource() == btnCentroDiagnosticos) {
            InterfazCentroDiagnostico icd = new InterfazCentroDiagnostico();
            icd.setVisible(true);
        }
        
        if (e.getSource() == btnHistoriasClinicas) {
            InterfazHistoriasClinicas c = new InterfazHistoriasClinicas();
            c.setVisible(true);
        }
    } 
}
