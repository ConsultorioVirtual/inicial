/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import Clases.conectar;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import Clases.RegistroClase;
//ventana de registro inicial

public class Registro extends javax.swing.JFrame {
    Usuarios usuarios;
    String tipo;
    String nombre;
    String segundoNombre;
    String apellidoPaterno;
    String apellidoMaterno;
    String Contraseña;
    String Contraseña2;
     //conexion
        conectar cc=new conectar();
        Connection cn=cc.conexion();
        RegistroClase reg = new RegistroClase();
    
    public Registro() {
        initComponents();
        setTitle("REGISTRO DE USUARIO");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbUsuarios = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        txtApMat = new javax.swing.JTextField();
        txtApPat = new javax.swing.JTextField();
        txtSegundoNombre = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        pswContra1 = new javax.swing.JPasswordField();
        pswContra2 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Escriba los datos de usuario que desea registrar");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 410, 20));

        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel7.setText("Tipo de usuario");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        cmbUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un usuario", "DOCTOR" }));
        getContentPane().add(cmbUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        jLabel2.setText("Segundo nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel3.setText("Apellido paterno");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel4.setText("Apellido materno");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion del Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 440, 290));

        jLabel5.setText("Contraseña");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuarios_32.png"))); // NOI18N
        jLabel11.setText("Registro de Usuario");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel6.setText("Confirmar contraseña");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 440, 60));

        btnAceptar.setText("Aceptar");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 120, 30));

        txtApMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApMatKeyReleased(evt);
            }
        });
        getContentPane().add(txtApMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 250, -1));

        txtApPat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApPatKeyReleased(evt);
            }
        });
        getContentPane().add(txtApPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 250, -1));

        txtSegundoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSegundoNombreKeyReleased(evt);
            }
        });
        getContentPane().add(txtSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 250, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 250, -1));
        getContentPane().add(pswContra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 250, -1));
        getContentPane().add(pswContra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 250, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu Azul.png"))); // NOI18N
        jLabel8.setText("jLabel3");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 80));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_blanco.jpg"))); // NOI18N
        jLabel9.setText("jLabel8");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 460, 380));

        jLabel13.setText("Seleccione su nombre de usuario y escriba su contraseña para ingresar al sistema.");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 410, 20));

        jLabel14.setText("Seleccione su nombre de usuario y escriba su contraseña para ingresar al sistema.");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 410, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        boolean estado = true;
        tipo=cmbUsuarios.getSelectedItem().toString();
        nombre=txtNombre.getText();
        segundoNombre=txtSegundoNombre.getText();
        apellidoPaterno=txtApPat.getText();
        apellidoMaterno=txtApMat.getText();
        Contraseña=pswContra1.getText();
        Contraseña2=pswContra2.getText();
        int indice = cmbUsuarios.getSelectedIndex();
        if(reg.validarCampos(tipo, nombre, segundoNombre, apellidoPaterno, 
                apellidoMaterno, Contraseña, Contraseña2, indice)){
            if(reg.validarUsuario(nombre, segundoNombre, apellidoPaterno, apellidoMaterno)){
        reg.insertar(tipo,nombre,segundoNombre,apellidoPaterno,apellidoMaterno,
                Contraseña);
                Login l=new Login();
                l.setVisible(true);
                dispose();
            }//validarUsuario
            else{showMessageDialog(null,"Usuario duplicado");}
        }//validarCampos          
    }//GEN-LAST:event_btnAceptarMouseClicked
//mouseclicked
    
    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        String temp = txtNombre.getText();
        txtNombre.setText(temp.toUpperCase());
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApPatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApPatKeyReleased
        String temp = txtApPat.getText();
        txtApPat.setText(temp.toUpperCase());
    }//GEN-LAST:event_txtApPatKeyReleased

    private void txtSegundoNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundoNombreKeyReleased
        String temp = txtSegundoNombre.getText();
        txtSegundoNombre.setText(temp.toUpperCase());
    }//GEN-LAST:event_txtSegundoNombreKeyReleased

    private void txtApMatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApMatKeyReleased
        String temp = txtApMat.getText();
        txtApMat.setText(temp.toUpperCase());
    }//GEN-LAST:event_txtApMatKeyReleased
    
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JComboBox<String> cmbUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField pswContra1;
    private javax.swing.JPasswordField pswContra2;
    private javax.swing.JTextField txtApMat;
    private javax.swing.JTextField txtApPat;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSegundoNombre;
    // End of variables declaration//GEN-END:variables

}//clase
