/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.ExtraerDatosExpediente;
import Clases.conectar;
import java.sql.Connection;
/**
 *
 * @author Carlos Puga
 */
public class Expediente extends javax.swing.JFrame {
     conectar cc=new conectar();
     Connection cn=cc.conexion();
    ExtraerDatosExpediente m = new ExtraerDatosExpediente();
    Object vector[];
    Object vectorExFi[];
    Object vectorInterrogatorio[];
    String Datosnopatologicos="";
    String Datospatologicos="";
    
    Object vectorObstetricos[];
    Object vectorGinecolicos[];
    static int id_pac;
    /**
     * Creates new form Expediente
     */
    public Expediente(int id) {
        id_pac=id;
        initComponents();
        setLocationRelativeTo(null);
        setTitle("EXPEDIENTE");
        vector=m.obtenerDatospaciente(id);
        Datosnopatologicos=m.obtenerDatosNoPatologicos(m.getidExpediente(id));
        Datospatologicos=m.obtenerDatosPatologicos(m.getidExpediente(id));
        vectorExFi=m.obtenerDatosExploracionFisica(m.getidExpediente(id));
        vectorInterrogatorio = m.obtenerDatosInterrogatorio(m.getidExpediente(id));
        
        vectorGinecolicos=m.obtenerDatosGinecologicos(m.getidExpediente(id));;
        vectorObstetricos=m.obtenerDatosObstetricos(m.getidExpediente(id));
        
        obtenerDatos();
        obtenerPatologicos();
        obtenernoPatologicos();
        obtenerExploracionFisica();
        obtenerInterrogatorio();
        
        obtenerGinecologicos();;
        obtenerObstetrico();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        lblNuevaConsulta = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        txtAreaPatologicos = new javax.swing.JScrollPane();
        txtAPatologicos = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtAreaNoPAtologicos = new javax.swing.JScrollPane();
        txtANoPatologicos = new javax.swing.JTextArea();
        jLabel48 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel54 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel55 = new javax.swing.JLabel();
        txtFormulaMenstrual = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        txtFUM = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txtCitologia = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        txtFrecuencia = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        spnVidaSexual = new javax.swing.JSpinner();
        jLabel63 = new javax.swing.JLabel();
        spnNoParejas = new javax.swing.JSpinner();
        txtTipo = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtAGinecologicos = new javax.swing.JTextArea();
        jLabel47 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtInicio = new javax.swing.JTextField();
        txtSuspencion = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        spnG = new javax.swing.JSpinner();
        spnA = new javax.swing.JSpinner();
        spnP = new javax.swing.JSpinner();
        spnC = new javax.swing.JSpinner();
        spnNacidosVivos = new javax.swing.JSpinner();
        spnNacidosMuertos = new javax.swing.JSpinner();
        spnViven = new javax.swing.JSpinner();
        spnMuertoPrimeraSem = new javax.swing.JSpinner();
        spnMuertoDesPrimeraSem = new javax.swing.JSpinner();
        jLabel81 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel83 = new javax.swing.JLabel();
        txtMediacionGestional = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        txtExamenesComplementarios = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtObstetricos = new javax.swing.JTextArea();
        jLabel53 = new javax.swing.JLabel();
        txtFPP = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        txtIntergenesia = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        txtPartoPrematuro = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        txtMalformaciones = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        txtIsoinmunizacion = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        txtAtencionPrenatal = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        spnEdadGestacional = new javax.swing.JSpinner();
        spnNoGestacion = new javax.swing.JSpinner();
        txtSitioParto = new javax.swing.JTextField();
        txtTalla = new javax.swing.JTextField();
        txtPesoAlNacer = new javax.swing.JTextField();
        spnToracico = new javax.swing.JSpinner();
        spnCefalico = new javax.swing.JSpinner();
        spnAbdominal = new javax.swing.JSpinner();
        spnApgar = new javax.swing.JSpinner();
        spnSilverman = new javax.swing.JSpinner();
        spnBallard = new javax.swing.JSpinner();
        txtEspecifique = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtAreaComplicaciones = new javax.swing.JScrollPane();
        txtComplicaciones = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAPerinatales = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        txtApneaNeonatal = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        txtHemorragias = new javax.swing.JTextField();
        txtParto = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        txtConvulsiones = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        txtCianosis = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        txtAnestesia = new javax.swing.JTextField();
        txtIctericia = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtParto1 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtAreaAbdomen = new javax.swing.JTextArea();
        jLabel87 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        txtAreaCabeza = new javax.swing.JScrollPane();
        txtACabeza = new javax.swing.JTextArea();
        jLabel89 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        txtAreaCuello = new javax.swing.JScrollPane();
        txtACuello = new javax.swing.JTextArea();
        jLabel91 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        txtAreaCuello1 = new javax.swing.JScrollPane();
        txtArColumnaVertebral = new javax.swing.JTextArea();
        jLabel94 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        txtAreaCuello2 = new javax.swing.JScrollPane();
        txtAExploracionGinegologica = new javax.swing.JTextArea();
        jLabel96 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        txtAreaCuello3 = new javax.swing.JScrollPane();
        txtAExploracionNeurologica = new javax.swing.JTextArea();
        jLabel98 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        txtAreaCuello4 = new javax.swing.JScrollPane();
        txtAExtremidades = new javax.swing.JTextArea();
        jLabel100 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        txtAreaCuello5 = new javax.swing.JScrollPane();
        txtAGenitales = new javax.swing.JTextArea();
        jLabel102 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        txtAreaCuello6 = new javax.swing.JScrollPane();
        txtAHabitusExterior = new javax.swing.JTextArea();
        jLabel104 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        txtAreaCuello7 = new javax.swing.JScrollPane();
        txtATorax = new javax.swing.JTextArea();
        jLabel106 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtAResumen = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel21 = new javax.swing.JPanel();
        txtAreaCardiovascular = new javax.swing.JScrollPane();
        txtACardiovascular = new javax.swing.JTextArea();
        jLabel107 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        txtAreaDigestivo = new javax.swing.JScrollPane();
        txtADigestivo = new javax.swing.JTextArea();
        jLabel109 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        txtAreaEndocrino = new javax.swing.JScrollPane();
        txtAEndocrino = new javax.swing.JTextArea();
        jLabel111 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        txtAreaHemolinfatico = new javax.swing.JScrollPane();
        txtAHemolinfatico = new javax.swing.JTextArea();
        jLabel113 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        txtAreaMusculo = new javax.swing.JScrollPane();
        txtAMusculo_esqueletico = new javax.swing.JTextArea();
        jLabel115 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        txtAreaPiel = new javax.swing.JScrollPane();
        txtAPiel_Anexos = new javax.swing.JTextArea();
        jLabel117 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        txtAreaReproductor = new javax.swing.JScrollPane();
        txtAReproductor = new javax.swing.JTextArea();
        jLabel119 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        txtAreaRespiratorio = new javax.swing.JScrollPane();
        txtARespiracion = new javax.swing.JTextArea();
        jLabel121 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        txtAreaSistemaNervioso = new javax.swing.JScrollPane();
        txtASistema_Nervioso = new javax.swing.JTextArea();
        jLabel123 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        txtAreaSistemasGenerales = new javax.swing.JScrollPane();
        txtASistemasGenerales = new javax.swing.JTextArea();
        jLabel125 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        txtAreaCuello8 = new javax.swing.JScrollPane();
        txtAUrinario = new javax.swing.JTextArea();
        jLabel127 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtAResumenInt = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtAreaDiagnostico1 = new javax.swing.JScrollPane();
        txtAreaTratamiento = new javax.swing.JTextArea();
        txtAreaDiagnostico = new javax.swing.JScrollPane();
        jTextArea22 = new javax.swing.JTextArea();
        txtAreaSintomas = new javax.swing.JScrollPane();
        jTextArea20 = new javax.swing.JTextArea();
        jLabel133 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        txtAreaMotivoConsulta = new javax.swing.JScrollPane();
        jTextArea21 = new javax.swing.JTextArea();
        jLabel134 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtTelOfi = new javax.swing.JTextField();
        txtPNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtApePat = new javax.swing.JTextField();
        txtSNombre = new javax.swing.JTextField();
        txtApeMat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDomicilio = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        txtDerechohabiente = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtLugarNac1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCodigoPostal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTelDom = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtFechaNac = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        txtEstadoCivil = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtNombreMadre = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtNombrePadre = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtNombrePareja = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtProcedencia = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtOcupacion = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtEscolaridad = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAObservaciones = new javax.swing.JTextArea();
        txtmedico = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        lblGuardarExpediente = new javax.swing.JLabel();
        lblEliminarExpediente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Consulta");
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 73, -1, 20));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Expediente");
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        lblNuevaConsulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNuevaConsulta.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevaConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consulta_32.png"))); // NOI18N
        lblNuevaConsulta.setText("Nueva Consulta");
        lblNuevaConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNuevaConsulta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblNuevaConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNuevaConsultaMouseClicked(evt);
            }
        });
        getContentPane().add(lblNuevaConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 10, 80));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 10, 80));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAPatologicos.setColumns(20);
        txtAPatologicos.setRows(5);
        txtAreaPatologicos.setViewportView(txtAPatologicos);

        jPanel4.add(txtAreaPatologicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 570, 490));

        jLabel29.setBorder(javax.swing.BorderFactory.createTitledBorder("Antecedentes Patológicos"));
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 590, 520));

        jTabbedPane2.addTab("Patológicos", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtANoPatologicos.setColumns(20);
        txtANoPatologicos.setRows(5);
        txtANoPatologicos.setBorder(null);
        txtAreaNoPAtologicos.setViewportView(txtANoPatologicos);

        jPanel5.add(txtAreaNoPAtologicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 570, 490));

        jLabel48.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "No Patologicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel5.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 590, 520));

        jTabbedPane2.addTab("No Patológicos", jPanel5);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setText("Menarca");
        jPanel7.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));
        jPanel7.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 50, -1));

        jLabel54.setText("Menopausia");
        jPanel7.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 20));
        jPanel7.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 50, -1));

        jLabel55.setText("Fórmula menstrual");
        jPanel7.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, 20));
        jPanel7.add(txtFormulaMenstrual, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 140, -1));

        jLabel56.setText("F.U.M");
        jPanel7.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 20));
        jPanel7.add(txtFUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 180, -1));

        jLabel57.setText("F.U.Citología");
        jPanel7.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, 20));
        jPanel7.add(txtCitologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 160, -1));

        jLabel59.setText("de Frecuencia");
        jPanel7.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        jLabel60.setText("de Duracion");
        jPanel7.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, 20));

        jLabel61.setText("de Cantidad");
        jPanel7.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, 20));
        jPanel7.add(txtFrecuencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 80, -1));

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel58.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alteraciones de la mestruación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel7.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 470, 50));

        jLabel62.setText("Inicio vida sexual");
        jPanel7.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));
        jPanel7.add(spnVidaSexual, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 70, -1));

        jLabel63.setText("No. Parejas");
        jPanel7.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, 20));
        jPanel7.add(spnNoParejas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 80, -1));
        jPanel7.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 420, -1));

        jLabel67.setText("Suspención");
        jPanel7.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, 20));

        jLabel66.setText("Inicio");
        jPanel7.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 20));

        jLabel65.setText("Tipo");
        jPanel7.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));

        jLabel68.setText("Observaciones");
        jPanel7.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane6.setViewportView(jTextArea5);

        jPanel7.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 470, 250));

        txtAGinecologicos.setColumns(20);
        txtAGinecologicos.setRows(5);
        txtAGinecologicos.setBorder(null);
        jScrollPane10.setViewportView(txtAGinecologicos);

        jPanel7.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 370, 480));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setText("Resumen");
        jPanel7.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));
        jPanel7.add(txtDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 80, -1));
        jPanel7.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 80, -1));
        jPanel7.add(txtInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 150, -1));
        jPanel7.add(txtSuspencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 140, -1));

        jLabel64.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Anticoncepcion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel7.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 470, 80));

        jTabbedPane2.addTab("Ginecologicos", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel70.setText("F.P.P");
        jPanel8.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        jLabel72.setText("G");
        jPanel8.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));
        jPanel8.add(spnG, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 90, -1));
        jPanel8.add(spnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 90, -1));
        jPanel8.add(spnP, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 90, -1));
        jPanel8.add(spnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 100, -1));
        jPanel8.add(spnNacidosVivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 60, -1));
        jPanel8.add(spnNacidosMuertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 60, -1));
        jPanel8.add(spnViven, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 70, -1));
        jPanel8.add(spnMuertoPrimeraSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 60, -1));
        jPanel8.add(spnMuertoDesPrimeraSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 70, -1));

        jLabel81.setText("Muerto despues 1ra sem.");
        jPanel8.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, 20));

        jLabel80.setText("Muerto - 1ra sem.");
        jPanel8.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 20));

        jLabel79.setText("Viven");
        jPanel8.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, 20));

        jLabel78.setText("Nacidos muertos");
        jPanel8.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, 20));

        jLabel77.setText("Nacidos vivos");
        jPanel8.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, 20));

        jLabel76.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel8.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 450, 70));

        jLabel75.setText("C");
        jPanel8.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, 20));

        jLabel73.setText("A");
        jPanel8.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, 20));

        jLabel74.setText("P");
        jPanel8.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, 20));

        jLabel71.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel8.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 470, 120));

        jLabel82.setText("No. de Consultas");
        jPanel8.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, 20));
        jPanel8.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 80, -1));

        jLabel83.setText("Medicación Gestacional");
        jPanel8.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 20));
        jPanel8.add(txtMediacionGestional, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 330, -1));

        jLabel84.setText("Examenes Complementarios");
        jPanel8.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 20));
        jPanel8.add(txtExamenesComplementarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 330, -1));

        jLabel85.setText("Observaciones");
        jPanel8.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane7.setViewportView(txtObservaciones);

        jPanel8.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 470, 180));

        txtObstetricos.setColumns(20);
        txtObstetricos.setRows(5);
        txtObstetricos.setBorder(null);
        jScrollPane14.setViewportView(txtObstetricos);

        jPanel8.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 370, 480));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel53.setText("Resumen");
        jPanel8.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));
        jPanel8.add(txtFPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, -1));

        jLabel95.setText("Intergenesia");
        jPanel8.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, 20));

        txtIntergenesia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIntergenesiaActionPerformed(evt);
            }
        });
        jPanel8.add(txtIntergenesia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 30, 20));

        jLabel97.setText("Parto Prematuro");
        jPanel8.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, 20));
        jPanel8.add(txtPartoPrematuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 30, -1));

        jLabel99.setText("Malformaciones");
        jPanel8.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, 20));
        jPanel8.add(txtMalformaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 30, -1));

        jLabel101.setText("Isoinmunizacion");
        jPanel8.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 20));
        jPanel8.add(txtIsoinmunizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 30, -1));

        jLabel103.setText("Atencion Prenatal");
        jPanel8.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, 20));
        jPanel8.add(txtAtencionPrenatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 30, -1));

        jTabbedPane2.addTab("Obstetricos", jPanel8);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setText("Edad gestacional");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, 20));
        jPanel6.add(spnEdadGestacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 50, -1));
        jPanel6.add(spnNoGestacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 50, -1));
        jPanel6.add(txtSitioParto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 320, -1));
        jPanel6.add(txtTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 140, -1));
        jPanel6.add(txtPesoAlNacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 140, -1));
        jPanel6.add(spnToracico, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 80, -1));
        jPanel6.add(spnCefalico, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 80, -1));
        jPanel6.add(spnAbdominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 80, -1));
        jPanel6.add(spnApgar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 80, -1));
        jPanel6.add(spnSilverman, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 80, -1));
        jPanel6.add(spnBallard, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 80, -1));
        jPanel6.add(txtEspecifique, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 310, -1));

        jLabel46.setText("Observaciones");
        jPanel6.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jLabel44.setForeground(new java.awt.Color(102, 102, 102));
        jLabel44.setText("especifique");
        jPanel6.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 20));

        jLabel43.setText("Complicaciones:");
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel42.setText("Ballard");
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, 20));

        jLabel41.setText("Silverman/And.");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, 20));

        jLabel40.setText("Apgar");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 20));

        jLabel39.setText("Abdominal");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, 20));

        jLabel37.setText("Torácico");
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, 20));

        jLabel38.setText("Cefálico");
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 20));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setText("Perimetros (cm)");
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel34.setText("Talla");
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, 20));

        jLabel35.setText("Peso al Nacer");
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, 20));

        jLabel33.setText("Sitio de Atencion del Parto");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel32.setText("No. de gestación");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, 20));

        txtComplicaciones.setColumns(20);
        txtComplicaciones.setRows(5);
        txtAreaComplicaciones.setViewportView(txtComplicaciones);

        jPanel6.add(txtAreaComplicaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 450, 50));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane5.setViewportView(jTextArea4);

        jPanel6.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 430, 90));

        txtAPerinatales.setColumns(20);
        txtAPerinatales.setRows(5);
        txtAPerinatales.setBorder(null);
        jScrollPane4.setViewportView(txtAPerinatales);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 370, 480));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("Resumen");
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jLabel69.setText("Parto");
        jPanel6.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 20));

        jLabel86.setText("Apnea Neonatal");
        jPanel6.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));
        jPanel6.add(txtApneaNeonatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 80, -1));

        jLabel45.setText("Anestesia");
        jPanel6.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel88.setText("Hemorragias");
        jPanel6.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));
        jPanel6.add(txtHemorragias, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 80, -1));

        txtParto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPartoActionPerformed(evt);
            }
        });
        jPanel6.add(txtParto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 60, -1));

        jLabel90.setText("Convulsiones");
        jPanel6.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        txtConvulsiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConvulsionesActionPerformed(evt);
            }
        });
        jPanel6.add(txtConvulsiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 80, -1));

        jLabel92.setText("Cianosis");
        jPanel6.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, 30));
        jPanel6.add(txtCianosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 80, 20));

        jLabel93.setText("Ictericia");
        jPanel6.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, -1, -1));
        jPanel6.add(txtAnestesia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 80, -1));
        jPanel6.add(txtIctericia, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 80, -1));

        jLabel105.setText("Cesarea");
        jPanel6.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 10));

        jLabel30.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PERINATALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 580));

        txtParto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParto1ActionPerformed(evt);
            }
        });
        jPanel6.add(txtParto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 60, -1));

        jTabbedPane2.addTab("Perinatales", jPanel6);

        jPanel3.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 580));

        jTabbedPane1.addTab("Antecedentes", jPanel3);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane3.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaAbdomen.setColumns(20);
        txtAreaAbdomen.setRows(5);
        jScrollPane8.setViewportView(txtAreaAbdomen);

        jPanel10.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 470));

        jLabel87.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Abdomen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel10.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 510));

        jTabbedPane3.addTab("Abdomen", jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtACabeza.setColumns(20);
        txtACabeza.setRows(5);
        txtAreaCabeza.setViewportView(txtACabeza);

        jPanel11.add(txtAreaCabeza, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 480));

        jLabel89.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cabeza", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel11.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 510));

        jTabbedPane3.addTab("Cabeza", jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtACuello.setColumns(20);
        txtACuello.setRows(5);
        txtAreaCuello.setViewportView(txtACuello);

        jPanel12.add(txtAreaCuello, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 480));

        jLabel91.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuello", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel12.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 510));

        jTabbedPane3.addTab("Cuello", jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtArColumnaVertebral.setColumns(20);
        txtArColumnaVertebral.setRows(5);
        txtAreaCuello1.setViewportView(txtArColumnaVertebral);

        jPanel13.add(txtAreaCuello1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 480));

        jLabel94.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Columna Vertebral", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel13.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 510));

        jTabbedPane3.addTab("Columna Vertebral", jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAExploracionGinegologica.setColumns(20);
        txtAExploracionGinegologica.setRows(5);
        txtAreaCuello2.setViewportView(txtAExploracionGinegologica);

        jPanel14.add(txtAreaCuello2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 480));

        jLabel96.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Exploracion Ginecologica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel14.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 510));

        jTabbedPane3.addTab("Exploracion Ginecologica", jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAExploracionNeurologica.setColumns(20);
        txtAExploracionNeurologica.setRows(5);
        txtAreaCuello3.setViewportView(txtAExploracionNeurologica);

        jPanel15.add(txtAreaCuello3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 480));

        jLabel98.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Exploracion Neurologica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel15.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 510));

        jTabbedPane3.addTab("Exploracion Neurologica", jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAExtremidades.setColumns(20);
        txtAExtremidades.setRows(5);
        txtAreaCuello4.setViewportView(txtAExtremidades);

        jPanel16.add(txtAreaCuello4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 480));

        jLabel100.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Extremidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel16.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 510));

        jTabbedPane3.addTab("Extremidades", jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAGenitales.setColumns(20);
        txtAGenitales.setRows(5);
        txtAreaCuello5.setViewportView(txtAGenitales);

        jPanel17.add(txtAreaCuello5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 480));

        jLabel102.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Genitales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel17.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 510));

        jTabbedPane3.addTab("Genitales", jPanel17);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAHabitusExterior.setColumns(20);
        txtAHabitusExterior.setRows(5);
        txtAreaCuello6.setViewportView(txtAHabitusExterior);

        jPanel18.add(txtAreaCuello6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 480));

        jLabel104.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Habitus Exterior", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel18.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 510));

        jTabbedPane3.addTab("Habitus Exterior", jPanel18);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtATorax.setColumns(20);
        txtATorax.setRows(5);
        txtAreaCuello7.setViewportView(txtATorax);

        jPanel19.add(txtAreaCuello7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 480));

        jLabel106.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Torax", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel19.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 510));

        jTabbedPane3.addTab("Torax", jPanel19);

        jPanel9.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 520));

        txtAResumen.setColumns(20);
        txtAResumen.setRows(5);
        jScrollPane12.setViewportView(txtAResumen);

        jPanel9.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 370, 470));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Resumen");
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        jTabbedPane1.addTab("Exploracion Fisica", jPanel9);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane4.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtACardiovascular.setColumns(20);
        txtACardiovascular.setRows(5);
        txtAreaCardiovascular.setViewportView(txtACardiovascular);

        jPanel21.add(txtAreaCardiovascular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 490));

        jLabel107.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cardiovascular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel21.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 520));

        jTabbedPane4.addTab("Cardiovascular", jPanel21);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtADigestivo.setColumns(20);
        txtADigestivo.setRows(5);
        txtAreaDigestivo.setViewportView(txtADigestivo);

        jPanel22.add(txtAreaDigestivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 490));

        jLabel109.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digestivo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel22.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 520));

        jTabbedPane4.addTab("Digestivo", jPanel22);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAEndocrino.setColumns(20);
        txtAEndocrino.setRows(5);
        txtAreaEndocrino.setViewportView(txtAEndocrino);

        jPanel23.add(txtAreaEndocrino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 490));

        jLabel111.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endocrino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel23.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 520));

        jTabbedPane4.addTab("Endocrino", jPanel23);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAHemolinfatico.setColumns(20);
        txtAHemolinfatico.setRows(5);
        txtAreaHemolinfatico.setViewportView(txtAHemolinfatico);

        jPanel24.add(txtAreaHemolinfatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 490));

        jLabel113.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hemolinfatico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel24.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 520));

        jTabbedPane4.addTab("Hemolinfatico", jPanel24);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAMusculo_esqueletico.setColumns(20);
        txtAMusculo_esqueletico.setRows(5);
        txtAreaMusculo.setViewportView(txtAMusculo_esqueletico);

        jPanel25.add(txtAreaMusculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 490));

        jLabel115.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Musculo - Esqueletico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel25.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 520));

        jTabbedPane4.addTab("Musculo - Esqueletico", jPanel25);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAPiel_Anexos.setColumns(20);
        txtAPiel_Anexos.setRows(5);
        txtAreaPiel.setViewportView(txtAPiel_Anexos);

        jPanel26.add(txtAreaPiel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 490));

        jLabel117.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Piel y Anexos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel26.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 520));

        jTabbedPane4.addTab("Piel y Anexos", jPanel26);

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAReproductor.setColumns(20);
        txtAReproductor.setRows(5);
        txtAreaReproductor.setViewportView(txtAReproductor);

        jPanel27.add(txtAreaReproductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 490));

        jLabel119.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reproductor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel27.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 520));

        jTabbedPane4.addTab("Reproductor", jPanel27);

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtARespiracion.setColumns(20);
        txtARespiracion.setRows(5);
        txtAreaRespiratorio.setViewportView(txtARespiracion);

        jPanel28.add(txtAreaRespiratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 490));

        jLabel121.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Respiratorio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel28.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 520));

        jTabbedPane4.addTab("Respiratorio", jPanel28);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtASistema_Nervioso.setColumns(20);
        txtASistema_Nervioso.setRows(5);
        txtAreaSistemaNervioso.setViewportView(txtASistema_Nervioso);

        jPanel29.add(txtAreaSistemaNervioso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 490));

        jLabel123.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sistema Nervioso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel29.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 520));

        jTabbedPane4.addTab("Sistema Nervioso", jPanel29);

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtASistemasGenerales.setColumns(20);
        txtASistemasGenerales.setRows(5);
        txtAreaSistemasGenerales.setViewportView(txtASistemasGenerales);

        jPanel30.add(txtAreaSistemasGenerales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 490));

        jLabel125.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sistemas Generales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel30.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 520));

        jTabbedPane4.addTab("Sistemas Generales", jPanel30);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAUrinario.setColumns(20);
        txtAUrinario.setRows(5);
        txtAreaCuello8.setViewportView(txtAUrinario);

        jPanel31.add(txtAreaCuello8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 490));

        jLabel127.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuello", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel31.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 520));

        jTabbedPane4.addTab("Urinario", jPanel31);

        jPanel20.add(jTabbedPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 530));

        txtAResumenInt.setColumns(20);
        txtAResumenInt.setRows(5);
        jScrollPane13.setViewportView(txtAResumenInt);

        jPanel20.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 380, 490));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Resumen");
        jPanel20.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        jTabbedPane1.addTab("Interrogatorio", jPanel20);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre del Médico", "Fecha"
            }
        ));
        jScrollPane9.setViewportView(jTable2);

        jPanel32.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 490, 390));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Busqueda_32.png"))); // NOI18N
        jButton1.setText("Ver Detalles");
        jPanel32.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 140, 50));

        txtAreaTratamiento.setColumns(20);
        txtAreaTratamiento.setRows(5);
        txtAreaDiagnostico1.setViewportView(txtAreaTratamiento);

        jPanel32.add(txtAreaDiagnostico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 390, 70));

        jTextArea22.setColumns(20);
        jTextArea22.setRows(5);
        txtAreaDiagnostico.setViewportView(jTextArea22);

        jPanel32.add(txtAreaDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 390, 70));

        jTextArea20.setColumns(20);
        jTextArea20.setRows(5);
        txtAreaSintomas.setViewportView(jTextArea20);

        jPanel32.add(txtAreaSintomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 390, 70));

        jLabel133.setText("Tratamiento");
        jPanel32.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, 20));

        jLabel131.setText("Síntomas");
        jPanel32.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, -1, 20));

        jLabel132.setText("Motivo de la Consulta");
        jPanel32.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, -1, 20));

        jLabel129.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTADO DE CONSULTAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel32.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 530, 500));

        jLabel130.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESUMEN DE LA CONSULTA SELECCIONADA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel32.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 430, 500));

        jTextArea21.setColumns(20);
        jTextArea21.setRows(5);
        txtAreaMotivoConsulta.setViewportView(jTextArea21);

        jPanel32.add(txtAreaMotivoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 390, 70));

        jLabel134.setText("Diagnóstico");
        jPanel32.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, 20));

        jTabbedPane1.addTab("Consultas", jPanel32);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Telefono Oficina");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));
        jPanel2.add(txtTelOfi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 159, -1));

        txtPNombre.setText(" ");
        jPanel2.add(txtPNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 110, -1));

        jLabel3.setText("Nombre(s)");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel4.setText("Apellidos");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        txtApePat.setText(" ");
        jPanel2.add(txtApePat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 110, -1));

        txtSNombre.setText(" ");
        jPanel2.add(txtSNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 120, -1));

        txtApeMat.setText(" ");
        jPanel2.add(txtApeMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 120, -1));

        jLabel10.setText("Correo electronico");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 160, -1));

        jLabel11.setText("Sexo");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        jLabel5.setText("Domicilio");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        txtDomicilio.setColumns(20);
        txtDomicilio.setRows(5);
        jScrollPane1.setViewportView(txtDomicilio);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 240, 68));

        jLabel12.setText("Derechohabiente");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));
        jPanel2.add(txtDerechohabiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 158, -1));

        jLabel23.setText("Lugar de Nacimiento");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));
        jPanel2.add(txtLugarNac1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 158, -1));

        jLabel13.setText("Fecha de Nacimiento");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));
        jPanel2.add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 158, -1));

        txtCiudad.setText(" ");
        jPanel2.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 240, -1));

        jLabel6.setText("Ciudad");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel7.setText("Estado");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        txtEstado.setText(" ");
        jPanel2.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 240, -1));

        jLabel8.setText("Codigo Postal");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        txtCodigoPostal.setText(" ");
        jPanel2.add(txtCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 120, -1));

        jLabel14.setText("Teléfono Dom");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));
        jPanel2.add(txtTelDom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 159, -1));

        jLabel15.setText("Edad");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));
        jPanel2.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 75, -1));

        jLabel16.setText("Medico");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, -1));

        jLabel24.setText("RFC");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));
        jPanel2.add(txtFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 158, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 970, 10));

        jLabel25.setText("Estado Civil");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        txtEstadoCivil.setText(" ");
        jPanel2.add(txtEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 240, -1));

        jLabel19.setText("Nombre de la Madre");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        txtNombreMadre.setText(" ");
        jPanel2.add(txtNombreMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 240, -1));

        jLabel20.setText("Nombre del Padre");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        txtNombrePadre.setText(" ");
        jPanel2.add(txtNombrePadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 240, -1));

        jLabel21.setText("Nombre de Pareja");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        txtNombrePareja.setText(" ");
        jPanel2.add(txtNombrePareja, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 240, -1));

        jLabel17.setText("Procedencia");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        txtProcedencia.setText(" ");
        jPanel2.add(txtProcedencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 240, -1));

        jLabel18.setText("Ocupacion");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));
        jPanel2.add(txtOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 230, -1));

        jLabel26.setText("Escolaridad");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));
        jPanel2.add(txtEscolaridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 230, -1));

        jLabel27.setText("Observaciones");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, -1));

        txtAObservaciones.setColumns(20);
        txtAObservaciones.setRows(5);
        jScrollPane2.setViewportView(txtAObservaciones);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 230, 80));
        jPanel2.add(txtmedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 210, -1));
        jPanel2.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 160, -1));

        jTabbedPane1.addTab("Informacion Personal", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 610));

        lblGuardarExpediente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblGuardarExpediente.setForeground(new java.awt.Color(255, 255, 255));
        lblGuardarExpediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar_32.png"))); // NOI18N
        lblGuardarExpediente.setText("Guardar Expediente");
        lblGuardarExpediente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblGuardarExpediente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblGuardarExpediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarExpedienteMouseClicked(evt);
            }
        });
        getContentPane().add(lblGuardarExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblEliminarExpediente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEliminarExpediente.setForeground(new java.awt.Color(255, 255, 255));
        lblEliminarExpediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarCita_32.png"))); // NOI18N
        lblEliminarExpediente.setText("Eliminar Expediente");
        lblEliminarExpediente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblEliminarExpediente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblEliminarExpediente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblEliminarExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu Azul.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel49.setText("jLabel49");
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblNuevaConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevaConsultaMouseClicked
        new Consulta().setVisible(true);
    }//GEN-LAST:event_lblNuevaConsultaMouseClicked

    private void lblGuardarExpedienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarExpedienteMouseClicked
       int id_paciente= 1;
       String id_doctor= txtmedico.getText();
       int noExp = 1;
       String primer_nombre = txtPNombre.getText();
       String segundo_nombre = txtSNombre.getText();
       String apellido_paterno = txtApePat.getText();
       String apellido_materno = txtApeMat.getText();
       String domicilio= txtDomicilio.getText();
       String ciudad = txtCiudad.getText();
       String estado = txtEstado.getText();
       String codigo_postal = txtCodigoPostal.getText();
       String telefono_dom = txtTelDom.getText();
       String telefono_oficina = txtTelOfi.getText();
       String correo= txtCorreo.getText();
       String sexo = txtSexo.getText();
       String derechohabiente = txtDerechohabiente.getText();
       String lugar_nacimiento = txtLugarNac1.getText();
       String fecha_nacimiento = txtFechaNac.getText();
       int edad=Integer.parseInt(txtEdad.getText());
       String rfc = txtRFC.getText();
       String edo_civil = txtEstadoCivil.getText();
       String nombre_madre = txtNombreMadre.getText();
       String nombre_padre = txtNombrePadre.getText();
       String nombre_pareja = txtNombrePareja.getText();
       String procedencia = txtProcedencia.getText();
       String ocupacion= txtOcupacion.getText();
       String escolaridad = txtEscolaridad.getText();
       String observaciones = txtAObservaciones.getText();
       
       
    }//GEN-LAST:event_lblGuardarExpedienteMouseClicked

    private void txtPartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPartoActionPerformed

    private void txtConvulsionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConvulsionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConvulsionesActionPerformed

    private void txtIntergenesiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIntergenesiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIntergenesiaActionPerformed

    private void txtParto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParto1ActionPerformed

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
            java.util.logging.Logger.getLogger(Expediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Expediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Expediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Expediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Expediente(id_pac).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea20;
    private javax.swing.JTextArea jTextArea21;
    private javax.swing.JTextArea jTextArea22;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JLabel lblEliminarExpediente;
    private javax.swing.JLabel lblGuardarExpediente;
    private javax.swing.JLabel lblNuevaConsulta;
    private javax.swing.JSpinner spnA;
    private javax.swing.JSpinner spnAbdominal;
    private javax.swing.JSpinner spnApgar;
    private javax.swing.JSpinner spnBallard;
    private javax.swing.JSpinner spnC;
    private javax.swing.JSpinner spnCefalico;
    private javax.swing.JSpinner spnEdadGestacional;
    private javax.swing.JSpinner spnG;
    private javax.swing.JSpinner spnMuertoDesPrimeraSem;
    private javax.swing.JSpinner spnMuertoPrimeraSem;
    private javax.swing.JSpinner spnNacidosMuertos;
    private javax.swing.JSpinner spnNacidosVivos;
    private javax.swing.JSpinner spnNoGestacion;
    private javax.swing.JSpinner spnNoParejas;
    private javax.swing.JSpinner spnP;
    private javax.swing.JSpinner spnSilverman;
    private javax.swing.JSpinner spnToracico;
    private javax.swing.JSpinner spnVidaSexual;
    private javax.swing.JSpinner spnViven;
    private javax.swing.JTextArea txtACabeza;
    private javax.swing.JTextArea txtACardiovascular;
    private javax.swing.JTextArea txtACuello;
    private javax.swing.JTextArea txtADigestivo;
    private javax.swing.JTextArea txtAEndocrino;
    private javax.swing.JTextArea txtAExploracionGinegologica;
    private javax.swing.JTextArea txtAExploracionNeurologica;
    private javax.swing.JTextArea txtAExtremidades;
    private javax.swing.JTextArea txtAGenitales;
    private javax.swing.JTextArea txtAGinecologicos;
    private javax.swing.JTextArea txtAHabitusExterior;
    private javax.swing.JTextArea txtAHemolinfatico;
    private javax.swing.JTextArea txtAMusculo_esqueletico;
    private javax.swing.JTextArea txtANoPatologicos;
    private javax.swing.JTextArea txtAObservaciones;
    private javax.swing.JTextArea txtAPatologicos;
    private javax.swing.JTextArea txtAPerinatales;
    private javax.swing.JTextArea txtAPiel_Anexos;
    private javax.swing.JTextArea txtAReproductor;
    private javax.swing.JTextArea txtARespiracion;
    private javax.swing.JTextArea txtAResumen;
    private javax.swing.JTextArea txtAResumenInt;
    private javax.swing.JTextArea txtASistema_Nervioso;
    private javax.swing.JTextArea txtASistemasGenerales;
    private javax.swing.JTextArea txtATorax;
    private javax.swing.JTextArea txtAUrinario;
    private javax.swing.JTextField txtAnestesia;
    private javax.swing.JTextField txtApeMat;
    private javax.swing.JTextField txtApePat;
    private javax.swing.JTextField txtApneaNeonatal;
    private javax.swing.JTextArea txtArColumnaVertebral;
    private javax.swing.JTextArea txtAreaAbdomen;
    private javax.swing.JScrollPane txtAreaCabeza;
    private javax.swing.JScrollPane txtAreaCardiovascular;
    private javax.swing.JScrollPane txtAreaComplicaciones;
    private javax.swing.JScrollPane txtAreaCuello;
    private javax.swing.JScrollPane txtAreaCuello1;
    private javax.swing.JScrollPane txtAreaCuello2;
    private javax.swing.JScrollPane txtAreaCuello3;
    private javax.swing.JScrollPane txtAreaCuello4;
    private javax.swing.JScrollPane txtAreaCuello5;
    private javax.swing.JScrollPane txtAreaCuello6;
    private javax.swing.JScrollPane txtAreaCuello7;
    private javax.swing.JScrollPane txtAreaCuello8;
    private javax.swing.JScrollPane txtAreaDiagnostico;
    private javax.swing.JScrollPane txtAreaDiagnostico1;
    private javax.swing.JScrollPane txtAreaDigestivo;
    private javax.swing.JScrollPane txtAreaEndocrino;
    private javax.swing.JScrollPane txtAreaHemolinfatico;
    private javax.swing.JScrollPane txtAreaMotivoConsulta;
    private javax.swing.JScrollPane txtAreaMusculo;
    private javax.swing.JScrollPane txtAreaNoPAtologicos;
    private javax.swing.JScrollPane txtAreaPatologicos;
    private javax.swing.JScrollPane txtAreaPiel;
    private javax.swing.JScrollPane txtAreaReproductor;
    private javax.swing.JScrollPane txtAreaRespiratorio;
    private javax.swing.JScrollPane txtAreaSintomas;
    private javax.swing.JScrollPane txtAreaSistemaNervioso;
    private javax.swing.JScrollPane txtAreaSistemasGenerales;
    private javax.swing.JTextArea txtAreaTratamiento;
    private javax.swing.JTextField txtAtencionPrenatal;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCianosis;
    private javax.swing.JTextField txtCitologia;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextArea txtComplicaciones;
    private javax.swing.JTextField txtConvulsiones;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDerechohabiente;
    private javax.swing.JTextArea txtDomicilio;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEscolaridad;
    private javax.swing.JTextField txtEspecifique;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtExamenesComplementarios;
    private javax.swing.JTextField txtFPP;
    private javax.swing.JTextField txtFUM;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtFormulaMenstrual;
    private javax.swing.JTextField txtFrecuencia;
    private javax.swing.JTextField txtHemorragias;
    private javax.swing.JTextField txtIctericia;
    private javax.swing.JTextField txtInicio;
    private javax.swing.JTextField txtIntergenesia;
    private javax.swing.JTextField txtIsoinmunizacion;
    private javax.swing.JTextField txtLugarNac1;
    private javax.swing.JTextField txtMalformaciones;
    private javax.swing.JTextField txtMediacionGestional;
    private javax.swing.JTextField txtNombreMadre;
    private javax.swing.JTextField txtNombrePadre;
    private javax.swing.JTextField txtNombrePareja;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextArea txtObstetricos;
    private javax.swing.JTextField txtOcupacion;
    private javax.swing.JTextField txtPNombre;
    private javax.swing.JTextField txtParto;
    private javax.swing.JTextField txtParto1;
    private javax.swing.JTextField txtPartoPrematuro;
    private javax.swing.JTextField txtPesoAlNacer;
    private javax.swing.JTextField txtProcedencia;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtSNombre;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtSitioParto;
    private javax.swing.JTextField txtSuspencion;
    private javax.swing.JTextField txtTalla;
    private javax.swing.JTextField txtTelDom;
    private javax.swing.JTextField txtTelOfi;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtmedico;
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
        txtSexo.setText(vector[11]+"");
        txtDerechohabiente.setText(vector[12]+"");
        txtLugarNac1.setText(vector[13]+"");
        txtFechaNac.setText(vector[14]+"");
        txtEdad.setText(vector[15]+"");
        txtmedico.setText(vector[16]+"");
        txtRFC.setText(vector[17]+"");
        txtEstadoCivil.setText(vector[18]+"");
        txtNombreMadre.setText(vector[19]+"");
        txtNombrePadre.setText(vector[20]+"");
        txtNombrePareja.setText(vector[21]+"");
        txtProcedencia.setText(vector[22]+"");
        txtOcupacion.setText(vector[23]+"");
        txtEscolaridad.setText(vector[24]+"");
        txtAObservaciones.setText(vector[25]+"");
    }//obtenerDato

public void obtenernoPatologicos(){
    txtANoPatologicos.setText(Datosnopatologicos);
}
public void obtenerPatologicos(){
    txtAPatologicos.setText(Datospatologicos);
}
public void obtenerExploracionFisica(){
    txtAreaAbdomen.setText(vectorExFi[0]+"");
    txtACabeza.setText(vectorExFi[1]+"");
    txtACuello.setText(vectorExFi[2]+"");
    txtArColumnaVertebral.setText(vectorExFi[3]+"");
    txtAExploracionGinegologica.setText(vectorExFi[4]+"");
    txtAExploracionNeurologica.setText(vectorExFi[5]+"");
    txtAExtremidades.setText(vectorExFi[6]+"");
    txtAGenitales.setText(vectorExFi[7]+"");
    txtAHabitusExterior.setText(vectorExFi[8]+"");
    txtATorax.setText(vectorExFi[9]+"");
    txtAResumen.setText(vectorExFi[10]+"");
}
public void obtenerInterrogatorio(){
    txtACardiovascular.setText(vectorInterrogatorio[0]+"");
    txtADigestivo.setText(vectorInterrogatorio[1]+"");
    txtAEndocrino.setText(vectorInterrogatorio[2]+"");
    txtAHemolinfatico.setText(vectorInterrogatorio[3]+"");
    txtAMusculo_esqueletico.setText(vectorInterrogatorio[4]+"");
    txtAPiel_Anexos.setText(vectorInterrogatorio[5]+"");
    txtAReproductor.setText(vectorInterrogatorio[6]+"");
    txtARespiracion.setText(vectorInterrogatorio[7]+"");
    txtASistema_Nervioso.setText(vectorInterrogatorio[8]+"");
    txtASistemasGenerales.setText(vectorInterrogatorio[9]+"");
    txtAUrinario.setText(vectorInterrogatorio[10]+"");
    txtAResumenInt.setText(vectorInterrogatorio[11]+"");
}

public void obtenerObstetrico(){
    
}

public void obtenerGinecologicos(){
    
}

public void actualizarAntecedentes(){
 
//ANTECEDENTES 
     //Patologicos
        String patologicos = txtAPatologicos.getText();
     
    //No patologicos
        String noPatologicos = txtANoPatologicos.getText();
     
    //Ginecologicos
        String menarca = spnMenarca.getValue()+"";
        String menopausia = spnMenopausia.getValue()+"";
        String formulaMestrual = txtFormulaMenstrual.getText();
        String fum = txtFUM.getText();
        String fuCitologia = txtCitologia.getText();
        String frecuencia = txtFrecuencia.getText();
        String duracion = txtDuracion.getText();
        String cantidad = txtCantidad.getText();
        String inicioVidaSexual = spnVidaSexual.getValue()+"";
        String noParejas = spnNoParejas.getValue()+"";
        String tipo = txtTipo.getText();
        String inicio = txtInicio.getText();
        String suspension = txtSuspencion.getText();
        String observacionesGinecologicos = jTextArea5.getText();
   
    //Obstetricos
        String fpp = txtFPP.getText();
        String g = spnG.getValue()+"";
        String a = spnA.getValue()+"";
        String p = spnP.getValue()+"";
        String c = spnC.getValue()+"";
        String nacidosVivos = spnNacidosVivos.getValue()+"";
        String nacidosMuertos = spnNacidosMuertos.getValue()+"";
        String viven = spnViven.getValue()+"";
        String muertoPrimSem = spnMuertoPrimeraSem.getValue()+"";             
        String muertoDesPrimSem = spnMuertoDesPrimeraSem.getValue()+"";
        String intergenesia = txtIntergenesia.getText();
        String partoPrematuro = txtPartoPrematuro.getText();
        String malformaciones = txtMalformaciones.getText();
        String isoinmunizacion = txtIsoinmunizacion.getText();
        String atencionPrenatal = txtAtencionPrenatal.getText();
        String noConsulta = jSpinner3.getValue()+"";
        String medicacionGestacional = txtMedicacionGestional.getText();
        String examenesComplementarios = txtExamenesComplementarios.getText();
        String observacionesObstetricos = txtObservaciones.getText();
}

public void actualizarPerinatales(){
        int idExpediente= a.getidExpediente(id_pac);
        String parto=txtParto.getText();
        String cesarea=txtCesarea.getText();
        String no_gestacion=spnNoGestacion.getValue().toString();
        String edad_gestacion=spnEdadGestacional.getValue().toString();
        String peso_nacer=txtPesoAlNacer.getText();
        String talla=txtTalla.getText();
        String sitio_atencion_parto=txtSitioParto.getText();
        String cefalico=spnCefalico.getValue().toString();
        String torcico=spnToracico.getValue().toString();
        String abdominal=spnAbdominal.getValue().toString();
        String apagar_s=spnApgar.getValue().toString();
        String silverman=spnSilverman.getValue().toString();
        String ballard=spnBallard.getValue().toString();
        String complicaciones=txtComplicaciones.getText();
        String anestesia_bol=txtAnestesia.getText();
        String especifique_anestesia=txtTipo.getText();
        String apnea_neonatal=txtApneaNeonatal.getText();
        String hemorragias=txtHemorragias.getText();
        String convulciones=txtConvulsiones.getText();
        String cianosis=txtCianosis.getText();
        String ictericia=txtIctericia.getText();
        String observaciones=txtObservaciones.getText();
        String resumen=txtAPerinatales.getText();
        
        a.actualizarExpediente(idExpediente,parto,cesarea, no_gestacion,edad_gestacion,
                        peso_nacer,talla,sitio_atencion_parto,cefalico,
                         torcico,abdominal,apagar_s,silverman,ballard,
                        complicaciones,anestesia_bol,especifique_anestesia,apnea_neonatal,
                        hemorragias,convulciones,cianosis,ictericia,observaciones,resumen);
   }

public void actualizarInterrogatorio(){
    int idExpediente= a.getidExpediente(id_pac);
    String cardiovascular=txtACardiovascular.getText();
    String digestivo=txtADigestivo.getText();
    String endocrino=txtAEndocrino.getText();
    String hemolintactico=txtAHemolinfatico.getText();
    String musculo_esqueletico=txtAMusculo_esqueletico.getText();
    String piel_anexos=txtAPiel_Anexos.getText();
    String reproductor=txtAReproductor.getText();
    String respiracion=txtARespiracion.getText();
    String sistema_nervioso=txtASistema_Nervioso.getText();
    String sistemas_generales=txtASistemasGenerales.getText();
    String urinario=txtAUrinario.getText();
    String resumen=txtAResumen.getText();
    
    a.actualizarInterrogatorio(idExpediente,cardiovascular,digestivo,endocrino,
                                        hemolintactico,musculo_esqueletico,piel_anexos,
                                        reproductor,respiracion,sistema_nervioso,
                                        sistemas_generales,urinario,resumen);
    
}

public void actualizarExploracionFisica(){
    int idExpediente=a.getidExpediente(id_pac);
    String abdomen=txtAreaAbdomen.getText();
    String cabeza=txtACabeza.getText();
    String cuello=txtACuello.getText();
    String columna_vertebral=txtArColumnaVertebral.getText();
    String exploracion_ginecologica=txtAExploracionGinegologica.getText();
    String exploracion_neurologica=txtAExploracionNeurologica.getText();
    String extremidades=txtAExtremidades.getText();
    String genitales=txtAGenitales.getText();
    String habitos_exterior=txtAHabitusExterior.getText();
    String torax=txtATorax.getText();
    String resumen=txtAResumen.getText(); 
    a.actualizarExploracionFisica(idExpediente, abdomen, cabeza, cuello, columna_vertebral, exploracion_ginecologica, exploracion_neurologica, extremidades, genitales, habitos_exterior, torax, resumen); 
}                       


}



