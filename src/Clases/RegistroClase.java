//ventana de registro desde ventana de doctor
package Clases;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author carlo
 */
public class RegistroClase {
    /*Variables*/
    conectar cc=new conectar();
    Connection cn=cc.conexion();
    
    /*Metodos*/
     public void insertar(String tipo_usuario,String nombre,String segundo_nombre,
               String apellido_paterno,String apellido_materno,String contraseña){
         if(segundo_nombre.equals("")){segundo_nombre="-";}
         if(apellido_materno.equals("")){apellido_materno="-";}
         nombre=nombre.replace(" ","");
         segundo_nombre=segundo_nombre.replace(" ","");
         apellido_paterno=apellido_paterno.replace(" ","");
         apellido_materno=apellido_materno.replace(" ","");
        String id_usuario = getRowNumber("usuarios")+1+""; 
        String id_doctor = getRowNumber("doctor")+1+"";
           try{
               PreparedStatement pst=cn.prepareStatement("INSERT INTO usuarios"
        + "(id_usuario,tipo_usuario ,nombre,segundo_nombre,apellido_paterno,"
        + "apellido_materno,contraseña) VALUES(?,?,?,?,?,?,?)"); 
               pst.setString(1,id_usuario);
               pst.setString(2,tipo_usuario);
               pst.setString(3,nombre);
               pst.setString(4,segundo_nombre);
               pst.setString(5,apellido_paterno);
               pst.setString(6,apellido_materno);
               pst.setString(7,contraseña);
               int a=pst.executeUpdate();
         if(a>0){
               showMessageDialog(null,"Registro exitoso");
               if(tipo_usuario.equals("DOCTOR")){
                   insertarDoctor(id_usuario);
                   insertarDetalleDoctor(id_usuario,id_doctor,nombre,segundo_nombre,apellido_paterno,apellido_materno);
               }
               if(tipo_usuario.equals("ASISTENTE")){
                   insertarAsistente(id_usuario);
               }
           }
           else{
                showMessageDialog(null,"Error al agregar");
           }
           }catch(HeadlessException | SQLException e){
           }   
    }//insertar
    
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
    
     public boolean validarCampos(String tipo,String nombre,String 
             segundoNombre, String apellidoPaterno, String apellidoMaterno, 
             String contra, String contra2,int indice){
         
         boolean estado = true;
         if(nombre.equals("")){
            showMessageDialog(null, "Ingrese un nombre");
            estado=false;
            return estado;
        }
        if(apellidoPaterno.equals("")){
            showMessageDialog(null, "Ingrese un apellido");
            estado=false;
            return estado;
        }
        if(contra.equals("")||contra2.equals("")){
            showMessageDialog(null, "Ingrese una contraseña");
            estado=false;
            return estado;
        }
        if(!contra.equals(contra2)){
                showMessageDialog(null, "Las contraseñas no coinciden");
                estado=false;
                return estado;
            }
        if(indice==0){
            showMessageDialog(null, "Seleccione un tipo");
            estado=false;
            return estado;
        }
         return estado;
     }//validarCampos
     

    public void insertarDoctor(String id_usuario){
    String id_doctor = getRowNumber("doctor")+1+"";
    try{
               PreparedStatement pst=cn.prepareStatement("INSERT INTO doctor"
        + "(id_usuario,id_doctor,domicilio ,ciudad,estado,"
        + "codigo_postal,tel_domicilio,tel_oficina,tel_movil,tel_extra,"
         + "correo_electronico,cedula_profecional,especialidad,observaciones) "
                       + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)"); 
               pst.setString(1,id_usuario);
               pst.setString(2,id_doctor);
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
        int a=pst.executeUpdate();
         if(a>0){
               //showMessageDialog(null,"Registro de doctor creado");
           }
           else{
                showMessageDialog(null,"Error al agregar doctor");
           }
           }catch(HeadlessException | SQLException e){
           }  
}//insertarDoctor
    
public void insertarAsistente(String id_usuario){
String id_recepcionista = getRowNumber("recepcionista")+1+"";
    try{
               PreparedStatement pst=cn.prepareStatement("INSERT INTO recepcionista"
        + "(id_recepcionista,domicilio,ciudad,estado,codigo_postal,tel_domicilio,tel_oficina,\n" +
        "tel_movil,tel_extra,correo_electronico,id_usuario) "
                       + "VALUES(?,?,?,?,?,?,?,?,?,?,?)"); 
               pst.setString(1,id_recepcionista);
               pst.setString(2,null);
               pst.setString(3,null);
               pst.setString(4,null);
               pst.setString(5,null);
               pst.setString(6,null);
               pst.setString(7,null);
               pst.setString(8,null);
               pst.setString(9,null);
               pst.setString(10,null);
               pst.setString(11,id_usuario);
        int a=pst.executeUpdate();
         if(a>0){
               //showMessageDialog(null,"Registro de asistente creado");
           }
           else{
                showMessageDialog(null,"Error al agregar asistente");
           }
           }catch(HeadlessException | SQLException e){
           } 
}//insertarAsistente

     public boolean validarUsuario(String nombre,String segundo_nombre,
               String apellido_paterno,String apellido_materno){
        boolean estado = true;
        String nombreTemp="";
        String apPat="";
        try{
           String query = "select * from usuarios";
            PreparedStatement st = cn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                nombreTemp+=rs.getString("nombre")+",";
                apPat+=rs.getString("apellido_paterno")+",";
            }//while
            String nombres[]=nombreTemp.split(",");
            String apPaterno[]=apPat.split(",");
            for(int i=0;i<nombres.length;i++){
                if(nombres[i].equals(nombre)&&
                        apPaterno[i].equals(apellido_paterno)){
                estado=false;
                return estado;
                }
            }
       }//try
       catch(SQLException ex){
            System.out.println(ex.getMessage());
       }
        return estado;
    }//validarUsuario     

    private void insertarDetalleDoctor(String id_usuario, String id_doctor, 
           String nombre, String segundo_nombre, String apellido_paterno, 
           String apellido_materno) {
        
         nombre=nombre.replace(" ","");
         segundo_nombre=segundo_nombre.replace(" ","");
         apellido_paterno=apellido_paterno.replace(" ","");
         apellido_materno=apellido_materno.replace(" ","");
         
        try{
               PreparedStatement pst=cn.prepareStatement("INSERT INTO detalle_doctor"
        + "(id_usuario,id_doctor,nombre,segundo_nombre,apellido_paterno,apellido_materno) "
                       + "VALUES(?,?,?,?,?,?)"); 
               pst.setString(1,id_usuario);
               pst.setString(2,id_doctor);
               pst.setString(3,nombre);
               pst.setString(4,segundo_nombre);
               pst.setString(5,apellido_paterno);
               pst.setString(6,apellido_materno);
               int a=pst.executeUpdate();
         if(a>0){
               //showMessageDialog(null,"Registro detalle doctor creado");
           }
           else{
                showMessageDialog(null,"Error al agregar detalle doctor");
           }
           }catch(HeadlessException | SQLException e){
           }      
    }//insertarDetalleDoctor

}//class
