/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.UsuarioData;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author matias
 */
public class ventanaLogin extends javax.swing.JFrame {
    UsuarioData udata =new UsuarioData();
    
    
    public ventanaLogin() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfondo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jfondo.setBackground(new java.awt.Color(0, 0, 0));
        jfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTRASEÑA");
        jfondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 740, 260, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO");
        jfondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 650, 170, 40));

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });
        jfondo.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 790, 190, 40));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jfondo.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 700, 190, 40));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton2.setText("Conectar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jfondo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 860, 190, 50));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoventanausuario.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentResized(evt);
            }
        });
        jfondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentResized
     // Obtén el tamaño actual del JLabel 
    int width = jLabel1.getWidth();
    int height = jLabel1.getHeight();

    // Obtén el icono actual del JLabel
    ImageIcon iconoactual = (ImageIcon) jLabel1.getIcon();

    // Obtén la imagen actual del icono
    Image imagenactual = iconoactual.getImage();

    // Redimensiona la imagen del icono para que coincida con el tamaño actual
    Image escaladodeimagen = imagenactual.getScaledInstance(width, height, Image.SCALE_DEFAULT);

    // Crea un nuevo ImageIcon redimensionado y configúralo en el JLabel
    ImageIcon redimensionado = new ImageIcon(escaladodeimagen);

    // Establece el nuevo ImageIcon en el JLabel
    jLabel1.setIcon(redimensionado);
                                            
    }//GEN-LAST:event_jLabel1ComponentResized

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String usuario = jTextField1.getText();
        char[] contrasenaCharArray = jPasswordField1.getPassword();
        String contraseña = new String(contrasenaCharArray);
        System.out.println(contraseña);
        udata.Login(usuario, contraseña);
        if (udata.Login(usuario, contraseña)==true) {
        pantallaCarga ventanaSecundaria = new pantallaCarga();
        ventanaSecundaria.setVisible(true);
        this.dispose(); // Cierra la ventana actual
    } else
        {
          ventanaLogin ventanacarga = new ventanaLogin();
        ventanacarga.setVisible(true);
        jTextField1.setText(""); // Limpiar el campo de texto
        JOptionPane.showMessageDialog(this, "Usuario incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
        this.setVisible(true); // Volver a mostrar la ventana actual
         this.dispose(); // Cierra la ventana actual
  
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
       char c= evt.getKeyChar();
        if((Character.isDigit(c) || c == KeyEvent.VK_SPACE )){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyTyped
         char c= evt.getKeyChar();
        if( c == KeyEvent.VK_SPACE ){
            evt.consume();
    }//GEN-LAST:event_jPasswordField1KeyTyped
    }
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
            java.util.logging.Logger.getLogger(ventanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jfondo;
    // End of variables declaration//GEN-END:variables
}
