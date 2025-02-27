/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.ModificarPacienteClase;
import Clases.conectar;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author dani_
 */
public class ModificarPaciente extends javax.swing.JFrame {
//conexion
        conectar cc=new conectar();
        Connection cn=cc.conexion();
        ModificarPacienteClase m = new ModificarPacienteClase();
        Object vector[];
        static int id_pac;
    /**
     * Creates new form AgregarPacienteR
     */
    public ModificarPaciente(int id) {
        id_pac=id;
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Modificar Paciente");
        //cmbMedico.setModel(m.obtenerDoctor());
        vector=m.obtenerDatospaciente(id);
        obtenerDatos();
        
        txtPNombre.enable(false);
        txtSNombre.enable(false);
        txtApePat.enable(false);
        txtApeMat.enable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSNombre = new javax.swing.JTextField();
        txtPNombre = new javax.swing.JTextField();
        txtApeMat = new javax.swing.JTextField();
        txtApePat = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtCodigoPostal = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDomicilio = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtTelDom = new javax.swing.JTextField();
        txtTelOfi = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtDerechohabiente = new javax.swing.JTextField();
        txtrfc = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtLugarNac1 = new javax.swing.JTextField();
        txtFechaNac = new javax.swing.JTextField();
        txtEstadoCivil = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        lblPacientes = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNombrePadre = new javax.swing.JTextField();
        txtNombreMadre = new javax.swing.JTextField();
        txtNombrePareja = new javax.swing.JTextField();
        txtProcedencia = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtOcupacion = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtEscolaridad = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaObservaciones = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        lblAceptar1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCancelar = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblMedico = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Paciente");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 770, 10));

        jLabel2.setText("*Nombre(s)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel3.setText("*Apellidos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel4.setText("*Domicilio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel5.setText("*Ciudad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel6.setText("*Estado");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabel7.setText("*Codigo Postal");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        txtSNombre.setText(" ");
        txtSNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSNombreKeyReleased(evt);
            }
        });
        getContentPane().add(txtSNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 120, -1));

        txtPNombre.setText(" ");
        txtPNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPNombreKeyReleased(evt);
            }
        });
        getContentPane().add(txtPNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 110, -1));

        txtApeMat.setText(" ");
        txtApeMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApeMatKeyReleased(evt);
            }
        });
        getContentPane().add(txtApeMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 120, -1));

        txtApePat.setText(" ");
        txtApePat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApePatKeyReleased(evt);
            }
        });
        getContentPane().add(txtApePat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 110, -1));

        txtCiudad.setText(" ");
        txtCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCiudadKeyReleased(evt);
            }
        });
        getContentPane().add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 240, -1));

        txtCodigoPostal.setText(" ");
        txtCodigoPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoPostalActionPerformed(evt);
            }
        });
        txtCodigoPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoPostalKeyReleased(evt);
            }
        });
        getContentPane().add(txtCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 120, -1));

        txtEstado.setText(" ");
        txtEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEstadoKeyReleased(evt);
            }
        });
        getContentPane().add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 240, -1));

        txtDomicilio.setColumns(20);
        txtDomicilio.setRows(5);
        txtDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDomicilioKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtDomicilio);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 240, 68));

        jLabel8.setText("*Teléfono Dom");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jLabel9.setText("Telefono Oficina");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jLabel10.setText("Correo electronico");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, 20));

        jLabel11.setText("Sexo");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, 20));

        jLabel12.setText("Derechohabiente");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, 20));

        jLabel13.setText("*Fecha de Nacimiento");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, 20));

        jLabel14.setText("*Edad");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, 20));

        jLabel15.setText("Medico");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, 20));

        txtTelDom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelDomKeyReleased(evt);
            }
        });
        getContentPane().add(txtTelDom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 159, -1));

        txtTelOfi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelOfiKeyReleased(evt);
            }
        });
        getContentPane().add(txtTelOfi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 159, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 160, 20));

        jLabel23.setText("*Lugar de Nacimiento");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, 20));

        txtDerechohabiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDerechohabienteKeyReleased(evt);
            }
        });
        getContentPane().add(txtDerechohabiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 158, 20));

        txtrfc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtrfcKeyReleased(evt);
            }
        });
        getContentPane().add(txtrfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 158, 20));

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEdadKeyReleased(evt);
            }
        });
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 75, 20));

        txtLugarNac1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLugarNac1KeyReleased(evt);
            }
        });
        getContentPane().add(txtLugarNac1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 158, 20));

        txtFechaNac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFechaNacKeyReleased(evt);
            }
        });
        getContentPane().add(txtFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 158, 20));

        txtEstadoCivil.setText(" ");
        txtEstadoCivil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEstadoCivilKeyReleased(evt);
            }
        });
        getContentPane().add(txtEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 240, -1));

        jLabel24.setText("RFC");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, 20));

        lblPacientes.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        lblPacientes.setForeground(new java.awt.Color(255, 255, 255));
        lblPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Paciente.png"))); // NOI18N
        lblPacientes.setText("Modificar Paciente");
        getContentPane().add(lblPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel17.setText("Procedencia");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, -1, -1));

        jLabel18.setText("Ocupacion");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, -1));

        jLabel19.setText("Nombre de la Madre");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jLabel20.setText("Nombre del Padre");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        jLabel21.setText("Nombre de Pareja");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu Azul.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 0, 990, -1));

        txtNombrePadre.setText(" ");
        txtNombrePadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombrePadreKeyReleased(evt);
            }
        });
        getContentPane().add(txtNombrePadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 240, -1));

        txtNombreMadre.setText(" ");
        txtNombreMadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreMadreKeyReleased(evt);
            }
        });
        getContentPane().add(txtNombreMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 240, -1));

        txtNombrePareja.setText(" ");
        txtNombrePareja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreParejaKeyReleased(evt);
            }
        });
        getContentPane().add(txtNombrePareja, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 240, -1));

        txtProcedencia.setText(" ");
        txtProcedencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProcedenciaKeyReleased(evt);
            }
        });
        getContentPane().add(txtProcedencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, 240, -1));

        jLabel25.setText("Estado Civil");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        txtOcupacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOcupacionKeyReleased(evt);
            }
        });
        getContentPane().add(txtOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 230, -1));

        jLabel26.setText("Escolaridad");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, -1, -1));

        txtEscolaridad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEscolaridadKeyReleased(evt);
            }
        });
        getContentPane().add(txtEscolaridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 230, -1));

        jLabel27.setText("Observaciones");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, -1, -1));

        txtaObservaciones.setColumns(20);
        txtaObservaciones.setRows(5);
        jScrollPane2.setViewportView(txtaObservaciones);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, 230, 90));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        lblAceptar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAceptar1.setForeground(new java.awt.Color(255, 255, 255));
        lblAceptar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar_32.png"))); // NOI18N
        lblAceptar1.setText("Aceptar");
        lblAceptar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAceptar1MouseClicked(evt);
            }
        });
        jPanel1.add(lblAceptar1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, 100, 40));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setForeground(new java.awt.Color(0, 102, 153));

        lblCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCancelar.setForeground(new java.awt.Color(255, 255, 255));
        lblCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar_32.png"))); // NOI18N
        lblCancelar.setText("Cancelar");
        lblCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelarMouseClicked(evt);
            }
        });
        jPanel2.add(lblCancelar);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 630, 100, 40));
        getContentPane().add(lblSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 160, 20));
        getContentPane().add(lblMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 160, 20));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_blanco.jpg"))); // NOI18N
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 90, 830, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAceptar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAceptar1MouseClicked
        try{
        String nombre = txtPNombre.getText();
        String segundo_nombre = txtSNombre.getText();
        String apellido_paterno = txtApePat.getText();
        String apellido_materno = txtApeMat.getText();
        String domicilio = txtDomicilio.getText();
        String ciudad = txtCiudad.getText();
        String estado = txtEstado.getText();
        String codigo_postal = txtCodigoPostal.getText();
        String tel_domicilio = txtTelDom.getText();
        String tel_oficina = txtTelOfi.getText();
        String correo_electronico = txtCorreo.getText();
        String sexo = lblSexo.getText();
        String derechohabiente = txtDerechohabiente.getText();
        String lugar_nacimiento = txtLugarNac1.getText();
        String fecha_nacimiento = txtFechaNac.getText();
        String edad = txtEdad.getText();
        String rfc = txtrfc.getText();
        String estado_civil = txtEstadoCivil.getText();
        String nombre_madre = txtNombreMadre.getText();
        String nombre_padre = txtNombrePadre.getText();
        String nombre_pareja = txtNombrePareja.getText();
        String procedencia = txtProcedencia.getText();
        String ocupacion = txtOcupacion.getText();
        String escolaridad = txtEscolaridad.getText();
        String observaciones = txtaObservaciones.getText();
        String doctor = lblMedico.getText();
        
         if(m.validarCampos(nombre, apellido_paterno, domicilio, ciudad, estado, 
                codigo_postal,tel_domicilio, tel_oficina, lugar_nacimiento, 
                fecha_nacimiento, edad)){
             int respuesta=JOptionPane.showConfirmDialog(null, "¿Desea guardar los cambios?",
                 "Modificar perfil", JOptionPane.YES_NO_OPTION, 
                 JOptionPane.QUESTION_MESSAGE);
           if(respuesta==0){
           m.actualizarP(nombre, segundo_nombre, apellido_paterno, apellido_materno, 
           domicilio, ciudad, estado, codigo_postal, tel_domicilio, tel_oficina, 
           correo_electronico, derechohabiente, lugar_nacimiento, 
           fecha_nacimiento, edad, rfc, estado_civil, nombre_madre, nombre_padre, 
           nombre_pareja, procedencia, ocupacion, escolaridad, observaciones);
           }//if confirmacion
            dispose();
            
           
        }//ActualizarP
        }//if validarCampos
        catch(NumberFormatException e){showMessageDialog(null, e.getMessage());}
        
    }//GEN-LAST:event_lblAceptar1MouseClicked

    private void lblCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseClicked
        dispose();
    }//GEN-LAST:event_lblCancelarMouseClicked

    private void txtPNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPNombreKeyReleased
    String temp = txtPNombre.getText();
    txtPNombre.setText(temp.toUpperCase());
    }//GEN-LAST:event_txtPNombreKeyReleased

    private void txtSNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSNombreKeyReleased
    String temp = txtSNombre.getText();
    txtSNombre.setText(temp.toUpperCase());        // TODO add your handling code here:
    }//GEN-LAST:event_txtSNombreKeyReleased

    private void txtApePatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApePatKeyReleased
    String temp = txtApePat.getText();
    txtApePat.setText(temp.toUpperCase());        // TODO add your handling code here:
    }//GEN-LAST:event_txtApePatKeyReleased

    private void txtApeMatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeMatKeyReleased
    String temp = txtApeMat.getText();
    txtApeMat.setText(temp.toUpperCase());        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeMatKeyReleased

    private void txtDomicilioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDomicilioKeyReleased
    String temp = txtDomicilio.getText();
    txtDomicilio.setText(temp.toUpperCase());        // TODO add your handling code here:
    }//GEN-LAST:event_txtDomicilioKeyReleased

    private void txtCiudadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiudadKeyReleased
    String temp = txtCiudad.getText();
    txtCiudad.setText(temp.toUpperCase());    // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudadKeyReleased

    private void txtEstadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstadoKeyReleased
    String temp = txtEstado.getText();
    txtEstado.setText(temp.toUpperCase());        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoKeyReleased

    private void txtCodigoPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoPostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoPostalActionPerformed

    private void txtCodigoPostalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoPostalKeyReleased
    m.soloNumeros(evt);
    }//GEN-LAST:event_txtCodigoPostalKeyReleased

    private void txtTelDomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelDomKeyReleased
    m.validarTelefono(evt);
    }//GEN-LAST:event_txtTelDomKeyReleased

    private void txtEstadoCivilKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstadoCivilKeyReleased
    String temp = txtEstadoCivil.getText();
    txtEstadoCivil.setText(temp.toUpperCase());        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoCivilKeyReleased

    private void txtNombreMadreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreMadreKeyReleased
    String temp = txtNombreMadre.getText();
    txtNombreMadre.setText(temp.toUpperCase());    // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMadreKeyReleased

    private void txtNombrePadreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePadreKeyReleased
    String temp = txtNombrePadre.getText();
    txtNombrePadre.setText(temp.toUpperCase());    // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePadreKeyReleased

    private void txtNombreParejaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreParejaKeyReleased
    String temp = txtNombrePareja.getText();
    txtNombrePareja.setText(temp.toUpperCase());    // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreParejaKeyReleased

    private void txtProcedenciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProcedenciaKeyReleased
    String temp = txtProcedencia.getText();
    txtProcedencia.setText(temp.toUpperCase());        // TODO add your handling code here:
    }//GEN-LAST:event_txtProcedenciaKeyReleased

    private void txtTelOfiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelOfiKeyReleased
    m.validarTelefono(evt);  // TODO add your handling code here:
    }//GEN-LAST:event_txtTelOfiKeyReleased

    private void txtDerechohabienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDerechohabienteKeyReleased
    String temp = txtDerechohabiente.getText();
    txtDerechohabiente.setText(temp.toUpperCase());        // TODO add your handling code here:
    }//GEN-LAST:event_txtDerechohabienteKeyReleased

    private void txtLugarNac1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLugarNac1KeyReleased
    String temp = txtLugarNac1.getText();
    txtLugarNac1.setText(temp.toUpperCase());        // TODO add your handling code here:
    }//GEN-LAST:event_txtLugarNac1KeyReleased

    private void txtrfcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrfcKeyReleased
    String temp = txtrfc.getText();
    txtrfc.setText(temp.toUpperCase());        // TODO add your handling code here:
    }//GEN-LAST:event_txtrfcKeyReleased

    private void txtOcupacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOcupacionKeyReleased
    String temp = txtOcupacion.getText();
    txtOcupacion.setText(temp.toUpperCase());    // TODO add your handling code here:
    }//GEN-LAST:event_txtOcupacionKeyReleased

    private void txtEscolaridadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEscolaridadKeyReleased
    String temp = txtEscolaridad.getText();
    txtEscolaridad.setText(temp.toUpperCase());        // TODO add your handling code here:
    }//GEN-LAST:event_txtEscolaridadKeyReleased

    private void txtEdadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyReleased
    m.soloNumeros(evt);
    }//GEN-LAST:event_txtEdadKeyReleased

    private void txtFechaNacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaNacKeyReleased
    
    }//GEN-LAST:event_txtFechaNacKeyReleased

    public boolean validarCampos(String nom,String apePat,String domicilio,
                String ciudad, String estado,String telDom,String sexo,
                String LugNac,String FechaNac,int edad, String medico){
    
        if(nom.equals("")){
            showMessageDialog(null, "Ingrese el nombre");
            return false;
        }
        if(apePat.equals("")){
            showMessageDialog(null, "Ingrese un apellido");
            return false;
        }
        if(domicilio.equals("")){
            showMessageDialog(null, "Ingrese un domicilio");
            return false;
        }
        if(ciudad.equals("")){
            showMessageDialog(null, "Ingrese un ciudad");
            return false;
        }
        if(estado.equals("")){
            showMessageDialog(null, "Ingrese un estado");
            return false;
        }
        if(telDom.equals("")){
            showMessageDialog(null, "Ingrese el telefono de domicilio");
            return false;
        }
        if(sexo.equals("")){
            showMessageDialog(null, "Ingrese el sexo");
            return false;
        }
        if(LugNac.equals("")){
            showMessageDialog(null, "Ingrese el Lugar de Naciemiento");
            return false;
        }
        if(FechaNac.equals("")){
            showMessageDialog(null, "Ingrese la Fecha de Nacimiento");
            return false;
        }
        if(edad<0){
            showMessageDialog(null, "Ingrese la edad");
            return false;
        }
        if(medico.equals("")){
            showMessageDialog(null, "Seleccione al medico");
            return false;
        }
        
        return true;
        
    }
       
    public int getRowNumber(){
       int numberRow = 0;
            try{
                 String query = "select count(*) from PACIENTE ";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                   numberRow = rs.getInt("count(*)");
                    }
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
            return numberRow;
    }//getRowNumber  
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
            java.util.logging.Logger.getLogger(ModificarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarPaciente(id_pac).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAceptar1;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblMedico;
    private javax.swing.JLabel lblPacientes;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JTextField txtApeMat;
    private javax.swing.JTextField txtApePat;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDerechohabiente;
    private javax.swing.JTextArea txtDomicilio;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEscolaridad;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtLugarNac1;
    private javax.swing.JTextField txtNombreMadre;
    private javax.swing.JTextField txtNombrePadre;
    private javax.swing.JTextField txtNombrePareja;
    private javax.swing.JTextField txtOcupacion;
    private javax.swing.JTextField txtPNombre;
    private javax.swing.JTextField txtProcedencia;
    private javax.swing.JTextField txtSNombre;
    private javax.swing.JTextField txtTelDom;
    private javax.swing.JTextField txtTelOfi;
    private javax.swing.JTextArea txtaObservaciones;
    private javax.swing.JTextField txtrfc;
    // End of variables declaration//GEN-END:variables
    public void obtenerDatos(){
        txtPNombre.setText(vector[0]+"");
        txtSNombre.setText(vector[1]+"");
        txtApePat.setText(vector[2]+"");
        txtApeMat.setText(vector[3]+"");
        txtDomicilio.setText(vector[4]+"");
        txtCiudad.setText(vector[5]+"");
        txtEstado.setText(vector[6]+"");
        txtCodigoPostal.setText(vector[7]+"");
        txtTelDom.setText(vector[8]+"");
        txtTelOfi.setText(vector[9]+"");
        txtCorreo.setText(vector[10]+"");
        lblSexo.setText(vector[11]+"");
        txtDerechohabiente.setText(vector[12]+"");
        txtLugarNac1.setText(vector[13]+"");
        txtFechaNac.setText(vector[14]+"");
        txtEdad.setText(vector[15]+"");
        lblMedico.setText(vector[16]+"");
        txtrfc.setText(vector[17]+"");
        txtEstadoCivil.setText(vector[18]+"");
        txtNombreMadre.setText(vector[19]+"");
        txtNombrePadre.setText(vector[20]+"");
        txtNombrePareja.setText(vector[21]+"");
        txtProcedencia.setText(vector[22]+"");
        txtOcupacion.setText(vector[23]+"");
        txtEscolaridad.setText(vector[24]+"");
        txtaObservaciones.setText(vector[25]+"");
    }//obtenerDato
    
}
