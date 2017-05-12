/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author carlo
 */
public class ModificarPerfilDoctorClase {
 
    /*Metodos*/
    public Object[] obtenerDatosDoctor(int id_doctor){
    String nombre = "";
    String segundo_nombre = "";
    String apellido_paterno = "";
    String apellido_materno = "";
    String domicilio = "";
    String ciudad = "";
    String estado = "";
    String codigo_postal = "";
    String tel_domicilio = "";
    String tel_oficina = "";
    String tel_movil = "";
    String tel_extra = "";
    String correo_electronico = "";
    String cedula_profecional = "";
    String especialidad = "";
    String observaciones = "";
    String vector1[]={""};
        try{
                 String query = "SELECT d.nombre,d.segundo_nombre,d.apellido_paterno,d.apellido_materno,\n" +
"do.domicilio,do.ciudad,do.estado,do.codigo_postal,do.tel_domicilio,\n" +
"do.tel_oficina,do.tel_movil,do.tel_extra,do.correo_electronico,do.cedula_profecional,\n" +
"do.especialidad,do.observaciones\n" +
"FROM detalle_doctor d\n" +
"inner join doctor do \n" +
"on d.id_doctor=do.id_doctor\n" +
"where d.id_usuario='"+id_doctor+"'";
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
    }//obtenerDatosDoctor
    
}//clase
