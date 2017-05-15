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
    
    public void insertarExpediente(String idPaciente){
        String idExpediente = getRowNumber("expediente")+"";
        
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
               pst.setString(25,idPaciente);;
              int a=pst.executeUpdate();
         if(a>0){
               showMessageDialog(null,"Registro de expediente creado");
               
           }
           else{
                showMessageDialog(null,"Error al agregar");
                
           }
           }catch(HeadlessException | SQLException e){
           }
    }//insertar expediente
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
}
