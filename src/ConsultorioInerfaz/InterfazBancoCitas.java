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
public class InterfazBancoCitas extends JFrame {
    private TituloTablaCitas ttc;
    private TablaCitas tc;
    
    public InterfazBancoCitas () {
        setLayout(new BorderLayout());
        
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setResizable(false);
        
        ttc = new TituloTablaCitas();
        this.add(ttc, BorderLayout.NORTH);
        
        tc = new TablaCitas();
        this.add(tc, BorderLayout.CENTER);
    }
}
