/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Ventanas.AgregarPacienteR;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author carlos
 */
public class Paciente {
    /*Variables*/
    conectar cc=new conectar();
    Connection cn=cc.conexion();
        
    
    /*Metodos*/
        public boolean insertarP(String nombre,String segundo_nombre, String apellido_paterno,
                String apellido_materno,String domicilio,String ciudad,String estado,
        String codigo_postal, String tel_domicilio, String tel_oficina, String correo_electronico,
        String sexo, String derechohabiente, String lugar_nacimiento, String fecha_nacimiento,
        String edad, String rfc, String estado_civil, String nombre_madre, String nombre_padre,
        String nombre_pareja, String procedencia, String ocupacion, String escolaridad,
        String observaciones, String medico){
        boolean est=true;
        String idPaciente = getRowNumber("paciente")+1+"";
        String idDoctor=getidDoctor(medico)+"";
        if(segundo_nombre.equals("")){segundo_nombre="-";}
        if(apellido_materno.equals("")){apellido_materno="-";}
        if(derechohabiente.equals("ISSSTE, IMSS, ETC")){derechohabiente="";}
        try{
            PreparedStatement pst = cn.prepareStatement("INSERT INTO paciente("
                    + "id_paciente,nombre,segundo_nombre,apellido_paterno,"
                    + "apellido_materno,domicilio,ciudad,estado,codigo_postal,"
                    + "tel_domicilio,tel_oficina,correo_electronico,sexo,"
                    + "derechohabiente,lugar_nacimiento,fecha_nacimiento,edad,"
                    + "rfc,estado_civil,nombre_madre,nombre_padre,nombre_pareja,"
                    + "procedencia,ocupacion,escolaridad,observaciones,id_doctor)"
                    + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");//27 campos
               pst.setString(1,idPaciente);
               pst.setString(2,nombre);
               pst.setString(3,segundo_nombre);
               pst.setString(4,apellido_paterno);
               pst.setString(5,apellido_materno);
               pst.setString(6,domicilio);
               pst.setString(7,ciudad);
               pst.setString(8,estado);
               pst.setString(9,codigo_postal);
               pst.setString(10,tel_domicilio);
               pst.setString(11,tel_oficina);
               pst.setString(12,correo_electronico);
               pst.setString(13,sexo);
               pst.setString(14,derechohabiente);
               pst.setString(15,lugar_nacimiento);
               pst.setString(16,fecha_nacimiento);
               pst.setString(17,edad);
               pst.setString(18,rfc);
               pst.setString(19,estado_civil);
               pst.setString(20,nombre_madre);
               pst.setString(21,nombre_padre);
               pst.setString(22,nombre_pareja);
               pst.setString(23,procedencia);
               pst.setString(24,ocupacion);
               pst.setString(25,escolaridad);
               pst.setString(26,observaciones);
               pst.setString(27,idDoctor);
              int a=pst.executeUpdate();
         if(a>0){
               showMessageDialog(null,"Registro de paciente creado");
           }
           else{
                showMessageDialog(null,"Error al agregar");
                est=false;
           }
           }catch(HeadlessException | SQLException e){
               showMessageDialog(null,"telefono invalido "+e.getMessage());
               est=false;
           }  
        return est;
    }//insertarP
        
     public boolean validarCampos(String nombre, String apellido_paterno,String domicilio,
             String ciudad, String estado,String codigo_postal, String tel_domicilio, String tel_oficina,
             int sexo, String lugar_nacimiento,String fecha_nacimiento, String edad, int medico){
         boolean est = true;
         
            if(nombre.equals("")){
                showMessageDialog(null,"Ingrese un nombre");
                est = false;
                return est;}
            if(apellido_paterno.equals("")){
                showMessageDialog(null,"ingrese un apellido");
                est = false;
                return est;}
            if(domicilio.equals("")){
                showMessageDialog(null,"ingrese un domicilio");
                est = false;
                return est;}
            if(ciudad.equals("")){
                showMessageDialog(null,"ingrese una ciudad");
                est = false;
                return est;}
            if(estado.equals("")){
                showMessageDialog(null,"ingrese un estado");
                est = false;
                return est;}
            if(codigo_postal.length()>6){
                showMessageDialog(null,"Ingrese un codigo postal valido");
                est=false;
                return est;
            }
            if(tel_domicilio.equals("")){
                showMessageDialog(null,"ingrese un telefono");
                est = false;
                return est;}
            if(tel_domicilio.length()>10){
                showMessageDialog(null,"ingrese un telefono de 10 o menos digitos");
                est = false;
                return est;}
            if(tel_oficina.equals("")){
                showMessageDialog(null,"ingrese un telefono de oficina");
                est = false;
                return est;}
            if(tel_oficina.length()>10){
                showMessageDialog(null,"ingrese un telefono de 10 o menos digitos");
                est = false;
                return est;
            }
            if(sexo==0){
                showMessageDialog(null,"seleccione un sexo");
                est = false;
                return est;}
            if(lugar_nacimiento.equals("")){
                showMessageDialog(null,"ingrese un lugar de nacimiento");
                est = false;
                return est;}
            if(validarFecha(fecha_nacimiento)){
                showMessageDialog(null,"Ingrese un fecha en el formato 'aaaa-mm-dd'");
                est = false;
                return est;
            }           
            if(edad.equals("")){
                showMessageDialog(null,"ingrese una edad");
                est = false;
                return est;}
            if(medico==0){
                showMessageDialog(null,"Seleccione un medico");
                est = false;
                return est;}
         return est;
    }//validarCampos
     
    public ComboBoxModel obtenerDoctor(){
    String nombres="";
    JComboBox medicos = new JComboBox();
    medicos.addItem("Seleccione una opcion");
    try{
        String query = "select nombre, segundo_nombre, apellido_paterno,apellido_materno from usuarios \n" +
"where tipo_usuario = \"DOCTOR\"";
        
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
    String arrNombres[]= nombres.split(",");
    for(int i=0;i<arrNombres.length;i++){
        medicos.addItem(arrNombres[i]);
    }
    return medicos.getModel();
}//obtenerDoctor
 
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

    public void soloNumeros(java.awt.event.KeyEvent evt) {
        int k=(int)evt.getKeyChar();
        if (k >= 97 && k <= 122 || k>=65 && k<=90){
            showMessageDialog(null,"solo ingresar numeros");
        }
        if(k==241 || k==209){
            showMessageDialog(null,"solo ingresar numeros");
        }
    }//soloNumeros
    
        public void validarTelefono(java.awt.event.KeyEvent evt) {
        int k=(int)evt.getKeyChar();
        if (k >= 97 && k <= 122 || k>=65 && k<=90){
            showMessageDialog(null,"solo ingresar numeros o guiones");
        }
        if(k==241 || k==209){
            showMessageDialog(null,"solo ingresar numeros o guiones");
        }
    }//validarTelefono
    public boolean validarFecha(String fecha){
        //retornara verdadero si algo esta mal
        boolean est = false;
        if(fecha.equals("aaaa-mm-dd")|fecha.equals("")){
            return true;
        }   
        for(int i=0;i<fecha.length();i++){
        //revisar que solo sean numeros y -
        char k = fecha.charAt(i);
        if ( k>= 97 && k <= 122 || k>=65 && k<=90){
            showMessageDialog(null,"solo ingresar numeros o guiones");
            return true;
        }
        if(k==241 || k==209){
            showMessageDialog(null,"solo ingresar numeros o guiones");
            return true;
        }
        }//for 
        String []fec=fecha.split("-");
        if(fec.length!=3){return true;}
        if(fec[0].length()!=4){return true;}
        if(Integer.parseInt(fec[1])>12){return true;}
        if(Integer.parseInt(fec[2])>31){return true;}
        
        return est;
    } //  validarFecha 
}//clase
