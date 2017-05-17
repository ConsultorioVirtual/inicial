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

/**
 *
 * @author dani_
 */
public class ExtraerDatosExpediente {
    conectar cc=new conectar();
    Connection cn=cc.conexion();
    
    public Object[] obtenerDatospaciente(int id_paciente){
    String nombre = "";
    String segundo_nombre= "";    
    String apellido_paterno= "";    
    String apellido_materno= "";
    String domicilio= "";    
    String ciudad= "";    
    String estado= "";    
    String codigo_postal= "";    
    String tel_domicilio= "";
    String tel_oficina= "";
    String correo_electronico= "";    
    String sexo= "";    
    String derechohabiente= "";    
    String lugar_nacimiento= ""; 
    String fecha_nacimiento= "";
    String edad= "";
    String id_doctor="";
    String rfc= "";
    String estado_civil= "";
    String nombre_madre= "";
    String nombre_padre= "";
    String nombre_pareja= "";
    String procedencia= "";
    String ocupacion= "";
    String escolaridad= "";
    String observaciones= "";
    String vector1[]={""};
        try{
                 String query = "select * from paciente where id_paciente='"+id_paciente+"'";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    nombre= rs.getString("nombre");
                    segundo_nombre= rs.getString("segundo_nombre");
                    apellido_paterno= rs.getString("apellido_paterno");
                    apellido_materno= rs.getString("apellido_materno");
                    domicilio= rs.getString("domicilio");
                    ciudad= rs.getString("ciudad");
                    estado= rs.getString("estado");
                    codigo_postal= rs.getString("codigo_postal");
                    tel_domicilio= rs.getString("tel_domicilio");
                    tel_oficina= rs.getString("tel_oficina");
                    correo_electronico= rs.getString("correo_electronico");
                    sexo= rs.getString("sexo");
                    derechohabiente= rs.getString("derechohabiente");
                    lugar_nacimiento= rs.getString("lugar_nacimiento");
                    fecha_nacimiento= rs.getString("fecha_nacimiento");
                    edad= rs.getString("edad");
                    id_doctor=rs.getString("id_doctor");
                    rfc= rs.getString("rfc");
                    estado_civil= rs.getString("estado_civil");
                    nombre_madre= rs.getString("nombre_madre");
                    nombre_padre= rs.getString("nombre_padre");
                    nombre_pareja= rs.getString("nombre_pareja");
                    procedencia= rs.getString("procedencia");
                    ocupacion= rs.getString("ocupacion");
                    escolaridad= rs.getString("escolaridad");
                    observaciones= rs.getString("observaciones");
                    }   
      String doctor=obtenerDoctor(Integer.parseInt(id_doctor));
      
      Object vector[]={nombre,segundo_nombre,apellido_paterno,apellido_materno,
          domicilio,ciudad,estado,codigo_postal,tel_domicilio,tel_oficina,
            correo_electronico,sexo,derechohabiente,lugar_nacimiento,
            fecha_nacimiento,edad,doctor,rfc,estado_civil,
            nombre_madre,nombre_padre,nombre_pareja,procedencia,
            ocupacion,escolaridad,observaciones};
         return vector;               
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
        return vector1; 
    }//obtenerDatospaciente
    public int getidDoctor(String nombre){
       int idDoctor = 0;
       String nombres [] = nombre.split(" ");
       String nomb = nombres[0];
       String ap = nombres[2];
            try{
                 String query = "select id_doctor\n" +
                                "from detalle_doctor\n" +
                   "where nombre= \""+nomb+"\" and apellido_paterno=\""+ap+"\"";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    idDoctor = rs.getInt("id_doctor");
                    }
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
            return idDoctor;
    }//getidDoctor
    public String obtenerDoctor(int id_doctor){
    String nombres="";
    try{
        String query = "select nombre, segundo_nombre, apellido_paterno,apellido_materno from detalle_doctor \n" +
"where id_doctor = '"+id_doctor+"'";
        
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    nombres += rs.getString("nombre")+" "+
                           rs.getString("segundo_nombre")+" "+
                            rs.getString("apellido_paterno")+" "+
                            rs.getString("apellido_materno")+" "+",";
                    }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    
    return nombres;
}//obtenerDoctor
    public int obtenerIdPaciente(String nombre,String segundo_nombre,String apellido_paterno,
            String apellido_materno){
        int id_paciente=0;
            try{
                String query = "select id_paciente from paciente\n" +
                        "where nombre='"+nombre+"'\n" +
                        "and segundo_nombre='"+segundo_nombre+"'\n" +
                        "and apellido_paterno='"+apellido_paterno+"'\n" +
                        "and apellido_materno='"+apellido_materno+"'";
        
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 
                while(rs.next()){
                    id_paciente = Integer.parseInt(rs.getString("id_paciente"));
                    }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return id_paciente;
    }//obtenerIdPaciente
    
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
     /*EXPEDIENTE */
    public String obtenerDatosPatologicos(int idExpediente){
        String descripcionPatologicos="";
        try{
                 String query = "select * from patologicos where expediente_id='"+idExpediente+"'";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    descripcionPatologicos= rs.getString("patologicos");
                 }
        }
        catch (SQLException ex){ System.out.println(ex.getMessage()); }
        return descripcionPatologicos;
    }
    public String obtenerDatosNoPatologicos(int idExpediente){
        String descripcionNoPatologicos="";
        try{
                 String query = "select * from nopatologicos where expediente_id='"+idExpediente+"'";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    descripcionNoPatologicos= rs.getString("no_patologicos");
                 }
        }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
        return descripcionNoPatologicos;
    }
    public Object[] obtenerDatosExploracionFisica(int idExpediente){
        String abdomen="";
        String cabeza="";
        String cuello="";
        String columna_vertebral="";
        String exploracion_ginecologica="";
        String exploracion_neurologica="";
        String extremidades="";
        String genitales="";
        String habitos_exterior="";
        String torax="";
        String resumen="";
        String[] vector1={""};
        try{
                 String query = "select * from nopatologicos where expediente_id='"+idExpediente+"'";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    abdomen= rs.getString("abdomen");
                    cabeza= rs.getString("cabeza");
                    cuello= rs.getString("cuello");
                    columna_vertebral= rs.getString("columna_vertebral");
                    exploracion_ginecologica= rs.getString("exploracion_ginecologica");
                    exploracion_neurologica= rs.getString("exploracion_neurologica");
                    extremidades= rs.getString("extremidades");
                    genitales= rs.getString("genitales");
                    habitos_exterior= rs.getString("habitos_exterior");
                    torax= rs.getString("torax");
                    resumen= rs.getString("resumen");
                 }
                 Object vector[]={abdomen,cabeza,cuello,columna_vertebral,exploracion_ginecologica,exploracion_neurologica,
                                    extremidades,genitales,habitos_exterior,torax,resumen};
                 return vector;
        }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
        return vector1;
    }
    
    public Object[] obtenerDatosInterrogatorio(int idExpediente){
        String cardiovascular="";
        String digestivo="";
        String endocrino="";
        String hemolintactico="";
        String musculo_esqueletico="";
        String piel_anexos="";
        String reproductor="";
        String respiracion="";
        String sistema_nervioso="";
        String sistemas_generales="";
        String urinario="";
        String resumen="";
        
        String[] vector1={""};
        try{
                 String query = "select * from interrogatorio where expediente_id='"+idExpediente+"'";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    cardiovascular= rs.getString("cardiovascular");
                    digestivo= rs.getString("digestivo");
                    endocrino= rs.getString("endocrino");
                    hemolintactico=rs.getString("hemolintactico");
                    musculo_esqueletico= rs.getString("musculo_esqueletico");
                    piel_anexos= rs.getString("piel_anexos");
                    reproductor= rs.getString("reproductor");
                    respiracion= rs.getString("respiracion");
                    sistema_nervioso= rs.getString("sistema_nerviso");
                    sistemas_generales= rs.getString("sistemas_generales");
                    urinario= rs.getString("urinario");
                    resumen= rs.getString("resumen");
                 }
                 Object vector[]={cardiovascular,digestivo,endocrino,hemolintactico,musculo_esqueletico,piel_anexos,reproductor,
                                    respiracion,sistema_nervioso,sistemas_generales,urinario,resumen};
                 return vector;
        }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
        return vector1;
    }
    
    public Object[] obtenerDatosGinecologicos(int idExpediente){
        String menarca="";
        String menopausia="";
        String formula="";
        String f_u_m="";
        String f_u_m_citologia="";
        String alteracion_m_frecuencia="";
        String alteracion_m_duracion="";
        String alteracion_m_cantidad="";
        String inicio_vida_sexual="";
        String no_parejas="";
        String tipo_anticoncepcion="";
        String inicio_anticoncepcion="";
        String suspencion_anticoncepcion="";
        String observaciones="";
        String resumen="";
        String vector1[]={""};
        try{
                 String query = "select * from ginecologicos where expediente_id='"+idExpediente+"'";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    menarca= rs.getString("menarca");
                    menopausia= rs.getString("menopausia");
                    formula= rs.getString("formula");
                    f_u_m= rs.getString("f_u_m");
                    f_u_m_citologia= rs.getString("f_u_m_citologia");
                    alteracion_m_frecuencia= rs.getString("alteracion_m_frecuencia");
                    alteracion_m_duracion= rs.getString("alteracion_m_duracion");
                    alteracion_m_cantidad= rs.getString("alteracion_m_cantidad");
                    inicio_vida_sexual= rs.getString("inicio_vida_sexual");
                    no_parejas= rs.getString("no_parejas");
                    tipo_anticoncepcion= rs.getString("tipo_anticoncepcion");
                    inicio_anticoncepcion= rs.getString("inicio_anticoncepcion");
                    suspencion_anticoncepcion= rs.getString("suspencion_anticoncepcion");
                    observaciones= rs.getString("observaciones");
                    resumen= rs.getString("resumen");                  
                 }
                Object vector[]={menarca,menopausia,formula,f_u_m,f_u_m_citologia,alteracion_m_frecuencia,
                                    alteracion_m_duracion,alteracion_m_cantidad,inicio_vida_sexual,no_parejas,
                                    tipo_anticoncepcion,inicio_anticoncepcion,suspencion_anticoncepcion,
                                    observaciones,resumen};
                return vector;
        } catch (SQLException ex){ System.out.println(ex.getMessage()); }
        return vector1;
    }
    public Object[] obtenerDatosObstetricos(int idExpediente){
        String F_D_P="";
        String G="";
        String A="";
        String P="";
        String C="";
        String nacidos_vivos="";
        String nacidos_muertos="";
        String viven="";
        String muerto_semana1="";
        String muerto_despues="";
        String intergencia="";
        String parto_prematuro="";
        String malformaciones="";
        String isoinmunizacion="";
        String atencion_prenatal="";
        String medicacion_gestacional="";
        String examenes_complementarios="";
        String observaciones="";
        String vector1[]={""};
        try{
                 String query = "select * from patologicos where expediente_id='"+idExpediente+"'";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    F_D_P= rs.getString("F_D_P");
                    G= rs.getString("G"); 
                    A= rs.getString("A"); 
                    P= rs.getString("P"); 
                    C= rs.getString("C"); 
                    nacidos_vivos= rs.getString("nacidos_vivos"); 
                    nacidos_muertos= rs.getString("nacidos_muerto"); 
                    viven= rs.getString("viven"); 
                    muerto_semana1= rs.getString("muerto_semana1"); 
                    muerto_despues= rs.getString("muerto_despues"); 
                    intergencia= rs.getString("intergencia"); 
                    parto_prematuro= rs.getString("parto_prematuro"); 
                    malformaciones= rs.getString("malformaciones"); 
                    isoinmunizacion= rs.getString("isoinmunizacion"); 
                    atencion_prenatal= rs.getString("atencion_prenatal");
                    medicacion_gestacional= rs.getString("medicacion_gestacional"); 
                    examenes_complementarios= rs.getString("examenes_complementarios"); 
                    observaciones= rs.getString("observaciones");   
                 }
                Object vector[]={F_D_P,G,A,P,C,nacidos_vivos,nacidos_muertos,viven,muerto_semana1,
                                 muerto_despues,intergencia,parto_prematuro,malformaciones,
                                 isoinmunizacion,atencion_prenatal,medicacion_gestacional,
                                 examenes_complementarios,observaciones};
                return vector;
        } catch (SQLException ex){ System.out.println(ex.getMessage()); }
        return vector1;
    }
    public Object[] obtenerDatosExpediente_Perinatales(int idExpediente){
        String parto="";
        String cesarea="";
        String no_gestacion="";
        String edad_gestacion="";
        String peso_nacer="";
        String talla="";
        String sitio_atencion_parto="";
        String cefalico="";
        String torcico="";
        String abdominal="";
        String apagar_s="";
        String silverman="";
        String ballard="";
        String complicaciones="";
        String anestesia_bol="";
        String especifique_anestesia="";
        String apnea_neonatal="";
        String hemorragias="";
        String convulciones="";
        String cianosis="";
        String ictericia="";
        String observaciones="";
        String resumen="";
        String vector1[]={""};
        try{
                 String query = "select * from expediente where id_expediente='"+idExpediente+"'";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    parto= rs.getString("parto");
                    cesarea= rs.getString("cesarea");
                    no_gestacion= rs.getString("no_gestacion");
                    edad_gestacion= rs.getString("edad_gestacion");
                    peso_nacer= rs.getString("peso_nacer");
                    talla= rs.getString("talla");
                    sitio_atencion_parto= rs.getString("sitio_atencion_parto");
                    cefalico= rs.getString("cefalico");
                    torcico= rs.getString("torcico");
                    abdominal= rs.getString("abdominal");
                    apagar_s= rs.getString("apagar_s");
                    silverman= rs.getString("silverman");
                    ballard= rs.getString("ballard");
                    complicaciones= rs.getString("complicaciones");
                    anestesia_bol= rs.getString("anestesia_bol");
                    especifique_anestesia= rs.getString("especifique_anestesia");
                    apnea_neonatal= rs.getString("apnea_neonatal");
                    hemorragias= rs.getString("hemorragias");
                    convulciones= rs.getString("convulciones");
                    cianosis= rs.getString("cianosis");
                    ictericia= rs.getString("ictericia");
                    observaciones= rs.getString("observaciones");
                    resumen= rs.getString("resumen");
                 }
                Object vector[]={parto,cesarea,no_gestacion,edad_gestacion,peso_nacer,talla,
                                    sitio_atencion_parto,cefalico,torcico,abdominal,apagar_s,silverman,
                                    ballard,complicaciones,anestesia_bol,especifique_anestesia,apnea_neonatal,
                                    hemorragias,convulciones,cianosis,ictericia,observaciones,resumen};
        return vector;
        } catch (SQLException ex){ System.out.println(ex.getMessage()); }
        return vector1;
    }
}
