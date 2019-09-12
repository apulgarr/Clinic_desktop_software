/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultorioInerfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author apulgarin
 */
public class InterfazMedico extends JFrame {
    private TituloPanelMedico tituloM;
    private PanelMedico panelM;
    
    public InterfazMedico () {
        this.setTitle("Clinica las americas");
        this.setSize(690, 330);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(false);
                
        setLayout(new BorderLayout());
        setBackground(Color.gray);
        
        tituloM = new TituloPanelMedico();
        this.add(tituloM, BorderLayout.NORTH);
        
        panelM = new PanelMedico(this);
        this.add(panelM, BorderLayout.CENTER);
        
    }
}
