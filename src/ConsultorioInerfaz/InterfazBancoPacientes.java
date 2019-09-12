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
public class InterfazBancoPacientes extends JFrame {
    private TituloTablaPacientes ttp;
    private TablaPacientes tp;
    
    public InterfazBancoPacientes () {
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(600, 600);
        setResizable(false);
        
        ttp = new TituloTablaPacientes();
        this.add(ttp, BorderLayout.NORTH);
        
        tp = new TablaPacientes();
        this.add(tp, BorderLayout.CENTER);
    }
}
