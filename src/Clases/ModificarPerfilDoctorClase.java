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
 * @author carlo
 */
public class ModificarPerfilDoctorClase {
    /*Variables*/
    conectar cc=new conectar();
    Connection cn=cc.conexion();
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
                    nombre = rs.getString("d.nombre");
                    segundo_nombre = rs.getString("d.segundo_nombre");
                    apellido_paterno = rs.getString("d.apellido_paterno");
                    apellido_materno = rs.getString("d.apellido_materno");
                    domicilio = rs.getString("do.domicilio");
                    ciudad = rs.getString("do.ciudad");
                    estado = rs.getString("do.estado");
                    codigo_postal = rs.getString("do.codigo_postal");
                    tel_domicilio = rs.getString("do.tel_domicilio");
                    tel_oficina = rs.getString("do.tel_oficina");
                    tel_movil = rs.getString("do.tel_movil");
                    tel_extra = rs.getString("do.tel_extra");
                    correo_electronico = rs.getString("do.correo_electronico");
                    cedula_profecional = rs.getString("do.cedula_profecional");
                    especialidad = rs.getString("do.especialidad");
                    observaciones = rs.getString("do.observaciones");
                    }  
      Object vector[]={nombre,segundo_nombre,apellido_paterno,apellido_materno,domicilio,ciudad,estado,codigo_postal,tel_domicilio,tel_oficina,tel_movil,tel_extra,correo_electronico,cedula_profecional,especialidad,observaciones};
         return vector;               
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
        return vector1; 
    }//obtenerDatosDoctor
    
}//clase
