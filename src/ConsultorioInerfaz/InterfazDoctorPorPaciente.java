/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultorioInerfaz;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author apulgarin
 */
public class InterfazDoctorPorPaciente extends JFrame {
    private TituloPanelDoctorPorPaciente p;
    private PanelDoctorPorPaciente d;
    
    public InterfazDoctorPorPaciente () {
        setLayout(new BorderLayout());
        
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(1175, 335);
        setTitle("Clinica las americas");
        setResizable(false);
        
        p = new TituloPanelDoctorPorPaciente();
        this.add(p, BorderLayout.NORTH);
        
        d = new PanelDoctorPorPaciente();
        this.add(d, BorderLayout.CENTER);
    }
}
