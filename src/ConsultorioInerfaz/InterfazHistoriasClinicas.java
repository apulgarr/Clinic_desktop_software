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
public class InterfazHistoriasClinicas extends JFrame {
    private TituloPanelHistoriasClinicas c;
    private PanelHistoriasClinicas h;
    
    public InterfazHistoriasClinicas () {
        setLayout(new BorderLayout());
        
        this.setSize(450, 400);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(false);
        
        c = new TituloPanelHistoriasClinicas();
        this.add(c, BorderLayout.NORTH);
        
        h = new PanelHistoriasClinicas();
        this.add(h, BorderLayout.CENTER);
    }
}
