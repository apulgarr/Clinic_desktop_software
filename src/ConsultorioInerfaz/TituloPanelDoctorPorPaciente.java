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
public class TituloPanelDoctorPorPaciente extends JPanel {
    private JLabel titulo;
    
    public TituloPanelDoctorPorPaciente () {
        setLayout(new FlowLayout());
        
        TitledBorder border = BorderFactory.createTitledBorder("");
        this.setBorder(border);
        
        titulo = new JLabel("Doctor por paciente");
        add(titulo);
        
        titulo.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        titulo.setForeground(Color.white);
        setBackground(Color.BLACK);
    }
}
