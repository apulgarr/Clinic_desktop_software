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
public class InterfazCentroDiagnostico extends JFrame{
    private TituloCentroDiagnostico tcd;
    private PanelCentroDiagnosticos pcd;
    
    public InterfazCentroDiagnostico () {
        setLayout(new BorderLayout());
        
        setTitle("Clinica las americas");
        setSize(570, 350);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setResizable(false);
        
        tcd = new TituloCentroDiagnostico();
        this.add(tcd, BorderLayout.NORTH);
        
        pcd = new PanelCentroDiagnosticos();
        this.add(pcd, BorderLayout.CENTER);
    }
}
