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
public class MenuPrincipal extends JFrame {
    private TituloMenuPrincipal Titulomenu;
    private MenuPrincipalPanel menuP;
    
    public MenuPrincipal () {
        setLayout(new BorderLayout());
        this.setTitle("Clinica las americas");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        Titulomenu = new TituloMenuPrincipal();
        this.add(Titulomenu, BorderLayout.NORTH);
        
        menuP = new MenuPrincipalPanel();
        this.add(menuP, BorderLayout.CENTER);
        

        
        setBackground(Color.gray);
    }
}
