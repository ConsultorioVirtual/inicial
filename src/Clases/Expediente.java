/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author dani_
 */
public class Expediente {
    conectar cc=new conectar();
    Connection cn=cc.conexion();
    
    public int getRowNumber(String tabla){
       int numberRow = 0;
            try{
                 String query = "select count(*) from "+tabla;
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
    public void insertarExpediente(String idPaciente){
        
        String idExpediente = getRowNumber("expediente")+1+"";
        
        try{
            PreparedStatement pst = cn.prepareStatement("INSERT INTO expediente(id_expediente,"
                    + " parto , cesarea,no_gestacion,edad_gestacion ,peso_nacer,"
                    + "talla,sitio_atencion_parto,cefalico,torcico,abdominal, apagar_s,"
                    + "silverman,ballard,complicaciones,anestesia_bol,especifique_anestesia,"
                    + "apnea_neonatal,hemorragias,convulsiones,cianosis,ictericia,observaciones,"
                    + "resumen,paciente_id)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");//25 campos
               pst.setString(1,idExpediente);
               pst.setString(2,null);
               pst.setString(3,null);
               pst.setString(4,null);
               pst.setString(5,null);
               pst.setString(6,null);
               pst.setString(7,null);
               pst.setString(8,null);
               pst.setString(9,null);
               pst.setString(10,null);
               pst.setString(11,null);
               pst.setString(12,null);
               pst.setString(13,null);
               pst.setString(14,null);
               pst.setString(15,null);
               pst.setString(16,null);
               pst.setString(17,null);
               pst.setString(18,null);
               pst.setString(19,null);
               pst.setString(20,null);
               pst.setString(21,null);
               pst.setString(22,null);
               pst.setString(23,null);
               pst.setString(24,null);
               pst.setString(25,idPaciente);
              int a=pst.executeUpdate();
         if(a>0){
               //showMessageDialog(null,"Registro de expediente creado");
               insertarGinecologicos(idExpediente);
               insertarExploracionFisica(idExpediente);
               insertarObstetricos(idExpediente);
               insertarPatologicos(idExpediente);
               insertarNoPatologicos(idExpediente);
               insertarInterrogatorio(idExpediente);
           }
           else{
                showMessageDialog(null,"Error al agregar");
                
           }
           }catch(HeadlessException | SQLException e){
           }
    }//insertar expediente
    public void insertarGinecologicos(String idExpediente){
          
        try{
            PreparedStatement pst = cn.prepareStatement("INSERT INTO ginecologicos(expediente_id,menarca,"
                    + "menopausia,formula_mentrual,f_u_m,f_u_m_citologia,ateracion_m_frecuencia,"
                    + "ateracion_m_duracion,ateracion_m_cantidad,inicio_vida_sexual,no_parejas,"
                    + "tipo_anticoncepcion,inicio_anticoncepcion,suspencion_anticoncepcion,observaciones,resumen)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");//16 campos
               pst.setString(1,idExpediente);
               pst.setString(2,null);
               pst.setString(3,null);
               pst.setString(4,null);
               pst.setString(5,null);
               pst.setString(6,null);
               pst.setString(7,null);
               pst.setString(8,null);
               pst.setString(9,null);
               pst.setString(10,null);
               pst.setString(11, null);
               pst.setString(12,null);
               pst.setString(13,null);
               pst.setString(14,null);
               pst.setString(15,null);
               pst.setString(16,null);
           int a=pst.executeUpdate();
         if(a>0){
               //showMessageDialog(null,"2. GINECOLOGICOS");
           }
           else{
                showMessageDialog(null,"Error al agregar gine");
                
           }
           }catch(HeadlessException | SQLException e){
           }
    }
    public void insertarExploracionFisica(String idExpediente){
        try{
             PreparedStatement pst = cn.prepareStatement("INSERT INTO exploracion_fisica(abdomen,cabeza,"
                     + "cuello,columna_vertebral,exploracion_ginecologica,exploracion_neurologica,"
                     + "extremidades,genitales,habitos_experior,torax,resumen,expediente_id)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
               pst.setString(1,null);
               pst.setString(2,null);
               pst.setString(3,null);
               pst.setString(4,null);
               pst.setString(5,null);
               pst.setString(6,null);
               pst.setString(7,null);
               pst.setString(8,null);
               pst.setString(9,null);
               pst.setString(10,null);
               pst.setString(11, null);
               pst.setString(12,idExpediente);
           int a=pst.executeUpdate();
         if(a>0){
               //showMessageDialog(null,"3. EXPLORACION FISICA");
           }
           else{
                showMessageDialog(null,"Error al agregar ");
                
           }   
        }
        catch(HeadlessException | SQLException e){}
    }
    public void insertarObstetricos(String idExpediente){
        try{
             PreparedStatement pst = cn.prepareStatement("INSERT INTO obstetricos(expediente_id,F_D_P,G,A,P,C,"
                     + "nacidos_vivos,nacidos_muertos,viven,muerto_semana1,muerto_despues,intergencia,"
                     + "parto_prematuro,malformaciones,isoinmunizacion,atencion_prenatal,no_consultas,"
                     + "medicacion_gestacional,examenes_complementarios,observaciones,resumen)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
               pst.setString(1,idExpediente);
               pst.setString(2,null);
               pst.setString(3,null);
               pst.setString(4,null);
               pst.setString(5,null);
               pst.setString(6,null);
               pst.setString(7,null);
               pst.setString(8,null);
               pst.setString(9,null);
               pst.setString(10,null);
               pst.setString(11,null);
               pst.setString(12,null);
               pst.setString(13,null);
               pst.setString(14,null);
               pst.setString(15,null);
               pst.setString(16,null);
               pst.setString(17,null);
               pst.setString(18,null);
               pst.setString(19,null);
               pst.setString(20,null);
               pst.setString(21,null);
           int a=pst.executeUpdate();
         if(a>0){
              // showMessageDialog(null,"4. OBSTETRICO");
           }
           else{
                showMessageDialog(null,"Error al agregar");
                
           }   
        }
        catch(HeadlessException | SQLException e){}
    }
    
    public void insertarPatologicos(String idExpediente){
       
    try{
            PreparedStatement pst = cn.prepareStatement("INSERT INTO patologicos(expediente_id ,patologicos)"
                    + "VALUES(?,?)");//12 campos
               pst.setString(1,idExpediente);
               pst.setString(2,null);
           int a=pst.executeUpdate();
         if(a>0){
               //showMessageDialog(null,"5. PATO");
           }
           else{
                showMessageDialog(null,"Error al agregar ");
                
           }
           }catch(HeadlessException | SQLException e){
           }
    }
    public void insertarNoPatologicos(String idExpediente){
        
        try{
            PreparedStatement pst = cn.prepareStatement("INSERT INTO noPatologicos(expediente_id ,no_patologicos)"
                    + "VALUES(?,?)");//12 campos
               pst.setString(1,idExpediente);
               pst.setString(2,null);
           int a=pst.executeUpdate();
         if(a>0){
               //showMessageDialog(null,"6. NO PATO");
           }
           else{
                showMessageDialog(null,"Error al agregar");
                
           }
           }catch(HeadlessException | SQLException e){
           }
    }
    public void insertarInterrogatorio(String idExpediente){
        try{
            PreparedStatement pst = cn.prepareStatement("INSERT INTO interrogatorio(expediente_id,"
                    + "cardiovascular,digestivo,endocrino,hemolintactico,musculo_esqueletico,"
                    + "piel_anexos, reproductor,respiracion,sistema_nervioso,sistemas_generales,"
                    + "urinario,resumen)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");//13 campos
               pst.setString(1,idExpediente);
               pst.setString(2,null);
               pst.setString(3,null);
               pst.setString(4,null);
               pst.setString(5,null);
               pst.setString(6,null);
               pst.setString(7,null);
               pst.setString(8,null);
               pst.setString(9,null);
               pst.setString(10,null);
               pst.setString(11,null);
               pst.setString(12,null);
               pst.setString(13,null);
           int a=pst.executeUpdate();
         if(a>0){
              // showMessageDialog(null,"7. INTERROGATORIO");
           }
           else{
                showMessageDialog(null,"Error al agregar");
                
           }
           }catch(HeadlessException | SQLException e){
           }
    }//interrogatorio
    
    public void insertarConsulta(String idExpediente,String idDoctor,String idPaciente){
        try{
            PreparedStatement pst = cn.prepareStatement("INSERT INTO consulta(id_consulta,"
                    + "fecha,hora,motivo_consulta,sintomas,aparatos_sistemas,peso,"
                    + "tallafrecuencia_resp,presion_arterial,temperatura,frecuencia_cardiac,"
                    + "oximetria,exploracion_fisica,estudios_labooratorio,diagnostico,"
                    + "terapeutica,tratamiento,doctor_id,paciente_id)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");//13 campos
               pst.setString(1,idExpediente);
               pst.setString(2,null);
               pst.setString(3,null);
               pst.setString(4,null);
               pst.setString(5,null);
               pst.setString(6,null);
               pst.setString(7,null);
               pst.setString(8,null);
               pst.setString(9,null);
               pst.setString(10,null);
               pst.setString(11,null);
               pst.setString(12,null);
               pst.setString(13,null);
               pst.setString(14,null);
               pst.setString(15,null);
               pst.setString(16,null);
               pst.setString(17,null);
               pst.setString(18,null);
               pst.setString(19,null);
               pst.setString(20,null);
           int a=pst.executeUpdate();
         if(a>0){
               showMessageDialog(null,"Registro de interrogatorio creado");
           }
           else{
                showMessageDialog(null,"Error al agregar");
                
           }
           }catch(HeadlessException | SQLException e){
           }
    }
}
