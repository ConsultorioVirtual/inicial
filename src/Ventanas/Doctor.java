package Ventanas;
import Clases.DoctorClase;
import Clases.ModificarPacienteClase;
import Clases.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import Ventanas.AgregarPacienteR;
import java.util.Date;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;


public class Doctor extends javax.swing.JFrame {

    conectar cc=new conectar();
    Connection cn=cc.conexion();
    DefaultTableModel modelo;
    String cabeceraCitas[]={"Hora", "Paciente", "Fecha", "Doctor"};
    String cabeceraPacientes[]={"Primer nombre", "Segundo nombre", "Apellido paterno", "Apellido materno"};
    String datos[][]={};
    static int id_doct;
    java.util.Date fechasis = new Date();
    DoctorClase d = new DoctorClase();
    String fechaInic=d.obtenerFecha(fechasis+"");
    ModificarPacienteClase m = new ModificarPacienteClase();
    public Doctor(int id) {/*debe recibir el id del doctor para que solo pueda ver
        los pacientes que le corresponden*/
        id_doct=id;
        
        initComponents();
        setLocationRelativeTo(null);
        setTitle("DOCTOR");
        Tabla.setModel(d.obtenerCitas(fechaInic, id_doct));
    }
    public void tablaAgenda(){
        modelo=new DefaultTableModel(datos,cabeceraCitas);
        Tabla.setModel(modelo);
    }
    
    public void tablaPacientes(){
        modelo=new DefaultTableModel(datos,cabeceraPacientes);
        Tabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JTabbedPane();
        AgendaPanel = new javax.swing.JPanel();
        lblNuevaConsulta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        Fondo_Agenda = new javax.swing.JLabel();
        PacientePanel = new javax.swing.JPanel();
        lblModificarExpediente = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Fondo_Pacientes = new javax.swing.JLabel();
        PerfilPanel = new javax.swing.JPanel();
        lblModificarPerfil = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        Fondo_Pacientes1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblAgregarPaciente = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        Fondo_Pacientes2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnIr = new javax.swing.JButton();
        Calendar1 = new com.toedter.calendar.JCalendar();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        txtBusquedaAgenda = new javax.swing.JTextField();
        cmbPacientes = new javax.swing.JComboBox<String>();
        lblBuscar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setForeground(new java.awt.Color(0, 102, 153));
        panel.setToolTipText("");
        panel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
        });

        AgendaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNuevaConsulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNuevaConsulta.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevaConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuevaConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consulta_32.png"))); // NOI18N
        lblNuevaConsulta.setText("Nueva Consulta");
        lblNuevaConsulta.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblNuevaConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNuevaConsulta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblNuevaConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNuevaConsultaMouseClicked(evt);
            }
        });
        AgendaPanel.add(lblNuevaConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Acciones");
        AgendaPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        AgendaPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 20, 80));

        Fondo_Agenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu Azul.png"))); // NOI18N
        AgendaPanel.add(Fondo_Agenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        panel.addTab("Agenda", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calendario_64.png")), AgendaPanel); // NOI18N

        PacientePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblModificarExpediente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblModificarExpediente.setForeground(new java.awt.Color(255, 255, 255));
        lblModificarExpediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ModificarPaciente_32.png"))); // NOI18N
        lblModificarExpediente.setText("Modificar Expediente");
        lblModificarExpediente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblModificarExpediente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblModificarExpediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModificarExpedienteMouseClicked(evt);
            }
        });
        PacientePanel.add(lblModificarExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Acciones");
        PacientePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        PacientePanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 20, 80));

        Fondo_Pacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu Azul.png"))); // NOI18N
        Fondo_Pacientes.setText("jLabel4");
        PacientePanel.add(Fondo_Pacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel.addTab("Pacientes", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Paciente.png")), PacientePanel); // NOI18N

        PerfilPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblModificarPerfil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblModificarPerfil.setForeground(new java.awt.Color(255, 255, 255));
        lblModificarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ModificarPaciente_32.png"))); // NOI18N
        lblModificarPerfil.setText("Modificar Perfil");
        lblModificarPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblModificarPerfil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblModificarPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModificarPerfilMouseClicked(evt);
            }
        });
        PerfilPanel.add(lblModificarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        PerfilPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 20, 80));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Acciones");
        PerfilPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        Fondo_Pacientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu Azul.png"))); // NOI18N
        PerfilPanel.add(Fondo_Pacientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel.addTab("Mi Perfil", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Configuracion_64.png")), PerfilPanel); // NOI18N

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAgregarPaciente.setBackground(new java.awt.Color(255, 255, 255));
        lblAgregarPaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAgregarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NuevaCita_32.png"))); // NOI18N
        lblAgregarPaciente.setText("Agregar Usuario");
        lblAgregarPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblAgregarPaciente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblAgregarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarPacienteMouseClicked(evt);
            }
        });
        jPanel2.add(lblAgregarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 20, 80));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Acciones");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        Fondo_Pacientes2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu Azul.png"))); // NOI18N
        Fondo_Pacientes2.setText("jLabel4");
        jPanel2.add(Fondo_Pacientes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel.addTab("Usuarios", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/network.png")), jPanel2); // NOI18N

        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 920, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIr.setText("Ir a fecha");
        btnIr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIrMouseClicked(evt);
            }
        });
        btnIr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrActionPerformed(evt);
            }
        });
        jPanel3.add(btnIr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        Calendar1.setBackground(new java.awt.Color(255, 255, 255));
        Calendar1.setSundayForeground(new java.awt.Color(255, 255, 255));
        Calendar1.setWeekdayForeground(new java.awt.Color(0, 102, 153));
        jPanel3.add(Calendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 280));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 410, 390));

        jPanel4.setBackground(new java.awt.Color(0, 102, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 900, 270));
        jPanel4.add(txtBusquedaAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 260, 30));

        cmbPacientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una opcion" }));
        jPanel4.add(cmbPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 260, 30));

        lblBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Busqueda2_32.png"))); // NOI18N
        lblBuscar.setText("Buscar");
        jPanel4.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 90, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Busqueda_32.png"))); // NOI18N
        jLabel7.setText("Realizar Busqueda");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 920, 390));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 20, 310, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked
        if(panel.getSelectedIndex()==0){
            Tabla.setModel(d.obtenerCitas(fechaInic, id_doct));
            cmbPacientes.removeAllItems();
            cmbPacientes.addItem("Seleccione una opcion");
            cmbPacientes.addItem("Paciente");
            cmbPacientes.addItem("Fecha");
            cmbPacientes.addItem("Doctor");
        }
        if(panel.getSelectedIndex()==1){
            Tabla.setModel(d.obtenerPacientes(id_doct));
            cmbPacientes.removeAllItems();
            cmbPacientes.addItem("Seleccione una opcion");
            cmbPacientes.addItem("Paciente");
            
        }
    }//GEN-LAST:event_panelMouseClicked

    private void btnIrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrActionPerformed
        tablaAgenda();
        obtenerFecha();
        panel.setSelectedIndex(0);
    }//GEN-LAST:event_btnIrActionPerformed

    private void lblNuevaConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevaConsultaMouseClicked
        new Consulta().setVisible(true);
    }//GEN-LAST:event_lblNuevaConsultaMouseClicked

    private void lblAgregarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarPacienteMouseClicked
        new RegistroNuevo().setVisible(true);
    }//GEN-LAST:event_lblAgregarPacienteMouseClicked

    private void lblModificarPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModificarPerfilMouseClicked
        
        new PerfilDoctor(id_doct).setVisible(true);
        /*enviar el id del doctor para saber cual modificar o de cual
        recuperar datos*/
    }//GEN-LAST:event_lblModificarPerfilMouseClicked

    private void lblModificarExpedienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModificarExpedienteMouseClicked
        int columna=Tabla.getSelectedRow();
        if(columna==-1){
        showMessageDialog(null,"Seleccione un paciente");
        }
        else{
            String nombre=Tabla.getValueAt(columna,0)+"";
            String segundo_nombre=Tabla.getValueAt(columna,1)+"";
            String apellido_paterno=Tabla.getValueAt(columna,2)+"";
            String apellido_materno=Tabla.getValueAt(columna,3)+"";
            int id=m.obtenerIdPaciente(nombre, segundo_nombre, apellido_paterno, apellido_materno);
            new Expediente(id).setVisible(true);
        }
    }//GEN-LAST:event_lblModificarExpedienteMouseClicked

    private void btnIrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIrMouseClicked
        String fecha = Calendar1.getDate().toString();
        fecha=d.obtenerFecha(fecha);
        Tabla.setModel(d.obtenerCitas(fecha, id_doct));
    }//GEN-LAST:event_btnIrMouseClicked

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int columna=Tabla.getSelectedRow();
        String paciente = Tabla.getValueAt(columna,1)+"";
        String p[]= paciente.split(" ");
        if(columna==-1){
        showMessageDialog(null,"Seleccione un paciente");
        }
        else{
            String nombre=p[0];
            String segundo_nombre=p[1];
            String apellido_paterno=p[2];
            String apellido_materno=p[3];
            int id=m.obtenerIdPaciente(nombre, segundo_nombre, apellido_paterno, apellido_materno);
            new Expediente(id).setVisible(true);
        }
    }//GEN-LAST:event_TablaMouseClicked
    
    
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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor(id_doct).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgendaPanel;
    private com.toedter.calendar.JCalendar Calendar1;
    private javax.swing.JLabel Fondo_Agenda;
    private javax.swing.JLabel Fondo_Pacientes;
    private javax.swing.JLabel Fondo_Pacientes1;
    private javax.swing.JLabel Fondo_Pacientes2;
    private javax.swing.JPanel PacientePanel;
    private javax.swing.JPanel PerfilPanel;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnIr;
    private javax.swing.JComboBox<String> cmbPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblAgregarPaciente;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblModificarExpediente;
    private javax.swing.JLabel lblModificarPerfil;
    private javax.swing.JLabel lblNuevaConsulta;
    private javax.swing.JTabbedPane panel;
    private javax.swing.JTextField txtBusquedaAgenda;
    // End of variables declaration//GEN-END:variables

    public void obtenerCitas(String fecha){
        String hora="";
        String paciente="";
        String fechaAct="";
        String doct="";
        String horaArr [];
        String pacienteArr [];
        String fechaActArr [];
        String doctArr [];
        TableModel tableModel = Tabla.getModel();
        tablaAgenda();
        try{
                 String query = "select hora, paciente, fecha, doctor from citas\n" +
                "WHERE fecha= '"+ fecha +"' and estado = 1 ORDER BY hora";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    hora += rs.getString("hora")+",";
                    paciente+=rs.getString("paciente")+",";
                    fechaAct+=rs.getString("fecha")+",";
                    doct+=rs.getString("doctor")+",";
                    }
                 
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
        horaArr=hora.split(",");
        pacienteArr=paciente.split(",");
        fechaActArr=fechaAct.split(",");
        doctArr=doct.split(",");
            for(int i=0;i<horaArr.length;i++){//i=filas
                Object datos[]={horaArr[i], pacienteArr[i], fechaActArr[i], doctArr[i]};
                modelo.addRow(datos);
        }
    }//obtenerCitas
    
    public void obtenerFecha(){
        String date = Calendar1.getDate()+"";
        String meses[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String fecha[] = date.split(" ");
        for(int i=0;i<meses.length;i++){
            if(meses[i].equals(fecha[1])){
                if((i+1)<10){
                    date=fecha[5]+"-0"+(i+1)+"-"+fecha[2];
                }else
                date=fecha[5]+"-"+(i+1)+"-"+fecha[2];
            }
        }//for
            obtenerCitas(date);
    }//obtenerFecha
}//class
