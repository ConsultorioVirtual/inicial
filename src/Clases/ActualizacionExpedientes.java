/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author dani_
 */
public class ActualizacionExpedientes {
    conectar cc=new conectar();
    Connection cn=cc.conexion();
    
    public int getidExpediente(int idPaciente){
        int idExpediente=0;
            try{
                 String query = "select * from expediente where paciente_id='"+idPaciente+"'";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                    while(rs.next()){
                        idExpediente= rs.getInt("id_expediente");
                    }
        }
        catch (SQLException ex){ System.out.println(ex.getMessage()); }
        return idExpediente;
    }//getidExpediente
    
    public void actualizarPatologicos(int idExpediente, String patologicos){
        
        try{
            PreparedStatement pst = cn.prepareStatement("update patologicos  set patologicos='"+ patologicos
                    +"' WHERE expediente_id ="+idExpediente);//24 campos
            int a=pst.executeUpdate();
         if(a>0){
               showMessageDialog(null,"Registro de patologicos actualizado");
           }
           else{
                showMessageDialog(null,"Error al actualizar");
                
           }
           }catch(SQLException ex){
               showMessageDialog(null,ex.getMessage());
               
           }  
    }//PATOLOGICOS
    public void actualizarNoPatologicos(int idExpediente, String NOpatologicos){
        
        try{
            PreparedStatement pst = cn.prepareStatement("update nopatologicos  set patologicos='"+ NOpatologicos
                    +"' WHERE expediente_id ="+idExpediente);//24 campos
            int a=pst.executeUpdate();
         if(a>0){
               showMessageDialog(null,"Registro de no patologicos actualizado");
           }
           else{
                showMessageDialog(null,"Error al actualizar");
                
           }
           }catch(SQLException ex){
               showMessageDialog(null,ex.getMessage());  
           }  
    }// NO PATOLOGICOS
    public void actualizarExploracionFisica(int idExpediente,String abdomen,String cabeza,String cuello,
                                        String columna_vertebral,String exploracion_ginecologica,
                                        String exploracion_neurologica,String extremidades,String genitales,
                                        String habitos_exterior,String torax,String resumen){
        
        try{
            PreparedStatement pst = cn.prepareStatement("UPDATE exploracion_fisica SET abdomen ='"+abdomen+
                "',cabeza = '"+cabeza+
                "',cuello = '"+cuello+
                "',columna_vertebral = '"+columna_vertebral+
                "',exploracion_ginecologica = '"+exploracion_ginecologica+
                "',exploracion_neurologica = '"+exploracion_neurologica+
                "',extremidades = '"+extremidades+
                "',genitales = '"+genitales+
                "',habitos_exterior = '"+torax+
                "',resumen = '"+resumen
                +"' WHERE expediente_id ="+idExpediente);//24 campos
            int a=pst.executeUpdate();
         if(a>0){
               showMessageDialog(null,"Registro de exploracion fisica actualizado");
           }
           else{
                showMessageDialog(null,"Error al actualizar");
           }
           }catch(SQLException ex){
               showMessageDialog(null,ex.getMessage());
               
           }  
    }//EXPLORACION FISICA
    public void actualizarGinecologicos(int idExpediente,String menarca,String menopausia,String formula,
                                    String f_u_m,String f_u_m_citologia,String alteracion_m_frecuencia,
                                    String alteracion_m_duracion,String alteracion_m_cantidad,String inicio_vida_sexual,
                                    String no_parejas,String tipo_anticoncepcion,String inicio_anticoncepcion,
                                    String suspencion_anticoncepcion,String observaciones){
        try{
            PreparedStatement pst = cn.prepareStatement("UPDATE exploracion_fisica SET menarca ='"+menarca+
                "',menopausia = '"+menopausia+
                "',formula = '"+formula+
                "',f_u_m= '"+f_u_m+
                "',f_u_m_citologia = '"+f_u_m_citologia+
                "',alteracion_m_frecuencia= '"+alteracion_m_frecuencia+
                "',alteracion_m_duracion = '"+alteracion_m_duracion+
                "',alteracion_m_cantidad = '"+alteracion_m_cantidad+
                "',inicio_vida_sexual = '"+inicio_vida_sexual+
                "',no_parejas = '"+no_parejas+
                "',tipo_anticoncepcion = '"+tipo_anticoncepcion+
                "',inicio_anticoncepcion = '"+inicio_anticoncepcion+
                "',suspencion_anticoncepcion = '"+suspencion_anticoncepcion+
                "',observaciones = '"+observaciones
                +"' WHERE expediente_id ="+idExpediente);
            int a=pst.executeUpdate();
         if(a>0){
               showMessageDialog(null,"Registro de ginecologicos actualizado");
           }
           else{
                showMessageDialog(null,"Error al actualizar");
           }
           }catch(SQLException ex){
               showMessageDialog(null,ex.getMessage());
               
           }  
    }//GINECOLOGICOS
    
    public void actualizarInterrogatorio(int idExpediente,String cardiovascular,String digestivo,String endocrino,
                                        String hemolintactico,String musculo_esqueletico,String piel_anexos,
                                        String reproductor,String respiracion,String sistema_nervioso,
                                        String sistemas_generales, String urinario,String resumen){
        try{
            PreparedStatement pst = cn.prepareStatement("UPDATE exploracion_fisica SET cardiovascular ='"+cardiovascular+
                "',digestivo = '"+digestivo+
                "',endocrino= '"+endocrino+
                "',hemolintactico= '"+hemolintactico+
                "',musculo_esqueletico = '"+musculo_esqueletico+
                "',piel_anexos= '"+piel_anexos+
                "',reproductor= '"+reproductor+
                "',respiracion = '"+respiracion+
                "',sistema_nervioso= '"+sistema_nervioso+
                "',sistemas_generales= '"+sistemas_generales+
                "',urinario = '"+urinario+
                "',resumen = '"+resumen
                +"' WHERE expediente_id ="+idExpediente);
            int a=pst.executeUpdate();
         if(a>0){
               showMessageDialog(null,"Registro de exploracion_fisica actualizado");
           }
           else{
                showMessageDialog(null,"Error al actualizar");
           }
           }catch(SQLException ex){
               showMessageDialog(null,ex.getMessage());
               
           }  
    }//INTERROGATORIO
   
    /**/
    public void actualizarExpediente(int idExpediente,String parto,String cesarea,String no_gestacion,String edad_gestacion,
                        String peso_nacer,String talla,String sitio_atencion_parto,String cefalico,
                        String torcico,String abdominal,String apagar_s,String silverman,String ballard,
                        String complicaciones,String anestesia_bol,String especifique_anestesia,String apnea_neonatal,
                        String hemorragias,String convulciones,String cianosis,String ictericia,String observaciones,
                        String resumen){
        try{
            PreparedStatement pst = cn.prepareStatement("UPDATE exploracion_fisica SET parto ='"+parto+
                "',cesarea = '"+cesarea+
                "',no_gestacion= '"+no_gestacion+
                "',edad_gestacion= '"+edad_gestacion+
                "',peso_nacer= '"+peso_nacer+
                "',talla= '"+talla+
                "',sitio_atencion_parto= '"+sitio_atencion_parto+
                "',cefalico = '"+cefalico+
                "',torcico= '"+torcico+
                "',abdominal= '"+abdominal+
                "',apagar_s = '"+apagar_s+
                "',silverman= '"+silverman+
                "',ballard= '"+ballard+
                "',complicaciones = '"+complicaciones+
                "',anestesia_bol= '"+anestesia_bol+
                "',especifique_anestecia = '"+especifique_anestesia+
                "',apnea_neonatal= '"+apnea_neonatal+
                "',hemorragias= '"+hemorragias+
                "',convulciones= '"+convulciones+
                "',cianosis= '"+cianosis+
                "',ictericia= '"+ictericia+
                "',observaciones= '"+observaciones+
                "',resumen = '"+resumen
                +"' WHERE id_expediente ="+idExpediente);
            int a=pst.executeUpdate();
         if(a>0){
               showMessageDialog(null,"Registro de perinatales actualizado");
           }
           else{
                showMessageDialog(null,"Error al actualizar");
           }
           }catch(SQLException ex){
               showMessageDialog(null,ex.getMessage());
               
           }  
    }//PERINATALES-EXPEDIENTE

    public void actualizarObstetricos(int idExpediente,String F_D_P,String G,String A,String P,String C,String nacidos_vivos,
                        String nacidos_muertos,String viven,String muerto_semana1,String muerto_despues,
                        String intergencia,String parto_prematuro,String malformaciones,
                        String isoinmunizacion,String atencion_prenatal,String medicacion_gestacional,
                        String examenes_complementarios,String observaciones){
        try{
            PreparedStatement pst = cn.prepareStatement("UPDATE obstetricos SET F_D_P ='"+F_D_P+
                "',G = '"+G+
                "',A= '"+A+
                "',P= '"+P+
                "',C= '"+C+
                "',nacidos_vivos= '"+nacidos_vivos+
                "',nacidos_muertos= '"+nacidos_muertos+
                "',viven= '"+viven+
                "',muerto_semana1= '"+muerto_semana1+
                "',muerto_despues= '"+muerto_despues+
                "',intergencia = '"+intergencia+
                "',parto_prematuro= '"+parto_prematuro+
                "',malformaciones= '"+malformaciones+
                "',isoinmunizacion = '"+isoinmunizacion+
                "',atencion_prenatal= '"+atencion_prenatal+
                "',medicacion_gestacional= '"+medicacion_gestacional+
                "',examenes_complementarios= '"+examenes_complementarios
                +"' WHERE expediente_id="+idExpediente);
            int a=pst.executeUpdate();
         if(a>0){
               showMessageDialog(null,"Registro de obstetricos actualizado");
           }
           else{
                showMessageDialog(null,"Error al actualizar");
           }
           }catch(SQLException ex){
               showMessageDialog(null,ex.getMessage());
               
           }  
    
    }
}
