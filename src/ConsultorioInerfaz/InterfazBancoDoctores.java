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
public class InterfazBancoDoctores extends JFrame {
    private TituloTablaDoctores tm;
    private TablaDoctores td;
    
    public InterfazBancoDoctores () {
        setLayout(new BorderLayout());
        
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(600, 600);
        setResizable(false);
        
        tm = new TituloTablaDoctores();
        this.add(tm, BorderLayout.NORTH); 
        
        td = new TablaDoctores();
        this.add(td, BorderLayout.CENTER);
    }
}
