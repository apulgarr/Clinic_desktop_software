/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultorioInerfaz;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author apulgarin
 */
public class Login extends javax.swing.JFrame {
    
    public static String user = "andres";
    public static String pass = "1234";
    
    Validaciones v = new Validaciones();

    public Login () {
        initComponents();
        
        v.limiteNumerosID(txtPass);
        v.soloLetras(txtUsuario);
        this.setTitle("Clinica las americas");
        this.setSize(400, 330);
        this.setResizable(false);
    } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(128, 101, 128, 26);

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        getContentPane().add(txtPass);
        txtPass.setBounds(128, 170, 128, 26);

        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(163, 79, 48, 16);

        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(149, 148, 71, 16);

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(139, 229, 95, 29);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ConsultorioInerfaz/FondoInicio.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 410, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String usuario = txtUsuario.getText().trim();        
        String contraseña = new String(txtPass.getPassword());
        
        txtUsuario.setToolTipText("Ingrese usuario");
        txtPass.setToolTipText("Ingrese Contraseña");
        
        if( usuario.equalsIgnoreCase(user) && contraseña.equalsIgnoreCase(pass)) {
            MenuPrincipal b = new MenuPrincipal();
            b.setVisible(true);
            dispose();
        }
        
        else if( usuario.isEmpty() && contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese Usuario y Contraseña");
        }
        
        else if( usuario != user && contraseña != pass ) {
            JOptionPane.showMessageDialog(null, "Usuario y Contraseña Incorrectos", "Error Al Ingresar", JOptionPane.ERROR_MESSAGE);
        }
        
        else if( usuario != user ) {
            JOptionPane.showMessageDialog(null, "Usuario Incorrecto", "Usuario No Existe", JOptionPane.ERROR_MESSAGE);
        }
        
        else if( contraseña != pass) {
            JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "Contraseña Mal Escrita", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
