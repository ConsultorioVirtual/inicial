package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

public class ModificarPacienteClase {
  /*Variables*/
    conectar cc=new conectar();
    Connection cn=cc.conexion();
  /*Metodos*/

    
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
                    apellido_paterno= rs.getString("apellido_paterno");
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
    
    public int obtenerIdPaciente(String nombre,String segundo_nombre, 
            String apellido_paterno, String apellido_materno){
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
}
