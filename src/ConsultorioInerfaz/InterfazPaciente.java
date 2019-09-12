/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultorioInerfaz;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author apulgarin
 */
public class InterfazPaciente extends JFrame {
    private TituloPanelPaciente TituloP;
    private PanelPaciente panelPaciente;
  
    public InterfazPaciente () {
        this.setTitle("Clinica las americas");
        this.setSize(690, 330);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(false);
                
        setLayout(new BorderLayout());
        setBackground(Color.gray);
        
        TituloP = new TituloPanelPaciente();
        this.add(TituloP, BorderLayout.NORTH);
        
        panelPaciente = new PanelPaciente();
        this.add(panelPaciente, BorderLayout.CENTER);
    }
}
