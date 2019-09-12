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
public class InterfazRegistroDoctorPorPaciente extends JFrame {
    private TituloRegistroDoctorPorPaciente d;
    
    public InterfazRegistroDoctorPorPaciente () {
        setLayout(new BorderLayout());
        
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setResizable(false);
        setTitle("Clinica las americas");
        
        d = new TituloRegistroDoctorPorPaciente();
        this.add(d, BorderLayout.NORTH);
    }
}
