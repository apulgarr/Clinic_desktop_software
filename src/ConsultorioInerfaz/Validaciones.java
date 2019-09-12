/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultorioInerfaz;

import ConsultorioFuncionalidad.Citas;
import static ConsultorioFuncionalidad.ContenedorCitas.listaCitas;
import static ConsultorioFuncionalidad.ContenedorDoctorPorPaciente.ldp;
import ConsultorioFuncionalidad.DoctorPorPaciente;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author apulgarin
 */
public class Validaciones {
    public void soloNumeros (JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });
    }
    
    public void limiteNumerosID (JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
            
                if (a.getText().length() > 11) {
                    e.consume();
                }
            }
        });
    }
    
    public void limiteNumerosEdad (JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {

                if (a.getText().length() > 2) {
                    e.consume();
                }
            }
        });
    }
    
    public void soloLetras (JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if(!Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE && caracter != KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }
        });
    }
    
    public void limiteNumerosCodigoNit (JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {

                if (a.getText().length() > 4) {
                    e.consume();
                }
            }
        });
    }
    
    public void eliminarPrecita (JTextField a) {
        System.out.println("entrando al log");
        long id = Long.parseLong(a.getText().trim());
        System.out.println("Entrando al id");
        Citas c = new Citas(id);
        
        System.out.println("Entrando al for");
        for (int i = 0; i < listaCitas.size(); i++) {
            c = (Citas)listaCitas.get(i);
            
            if (id == c.getID()) {
                listaCitas.remove(i);
            }
            else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }
    
    public void eliminarCita (JTextField a) {
        long id = Long.parseLong(a.getText());
        DoctorPorPaciente c = new DoctorPorPaciente(id);
        
        for (int i = 0; i < ldp.size(); i++) {
            c = (DoctorPorPaciente)ldp.get(i);
            
            if (id == c.getIDPaciente()) {
                ldp.remove(i);
            }
            else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }
}
