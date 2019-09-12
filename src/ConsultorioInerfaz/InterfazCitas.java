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
public class InterfazCitas extends JFrame {
    private TituloAsignacionCitas t;
    private AsignarCitas2 a2;
    
    public InterfazCitas () {
        setLayout(new BorderLayout());
        
        this.setTitle("Clinica las americas");
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setSize(580, 410);
        this.setResizable(false);
        
        t = new TituloAsignacionCitas();
        this.add(t, BorderLayout.NORTH);
        
        
        a2 = new AsignarCitas2();
        this.add(a2, BorderLayout.CENTER);
        
    }
}
