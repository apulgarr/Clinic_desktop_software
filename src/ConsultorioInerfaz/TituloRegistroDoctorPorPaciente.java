/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultorioInerfaz;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author apulgarin
 */
public class TituloRegistroDoctorPorPaciente extends JPanel {
    private JLabel titulo;
    
    public TituloRegistroDoctorPorPaciente () {
        setLayout(new FlowLayout());
        
        TitledBorder bordo = BorderFactory.createTitledBorder("");
        this.setBorder(bordo);
        
        titulo = new JLabel("Registro Doctor Por Paciente");
        add(titulo);
        
        titulo.setFont(new Font("TimesRoman", Font.ITALIC+Font.BOLD, 20 ) );
        titulo.setForeground(Color.white);
        setBackground(Color.black);
    }
}
