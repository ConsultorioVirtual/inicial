package Clases;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static javax.swing.JOptionPane.showMessageDialog;


public class PerfilRecepcionistaClase {
    /*Variables*/
    conectar cc=new conectar();
    Connection cn=cc.conexion();
    /*Metodos*/
    /**
    * Este metodo retorna un vector con los datos del recepcionista
    */
    public Object[] obtenerDatosRecepcionista(int id_usuario){
        String nombre="";
        String segundo_nombre="";
        String apellido_paterno="";
        String apellido_materno="";
        String domicilio="";
        String ciudad="";
        String estado="";
        String codigo_postal="";
        String tel_domicilio="";
        String tel_oficina="";
        String tel_movil="";
        String tel_extra="";
        String correo_electronico="";
        String vector1[]={""};
        try{
                 String query = "select u.nombre,u.segundo_nombre,u.apellido_paterno,u.apellido_materno,r.domicilio,r.ciudad,r.estado,r.codigo_postal,\n" +
"r.tel_domicilio,r.tel_oficina,r.tel_movil,r.tel_extra,r.correo_electronico\n" +
"from usuarios u\n" +
"inner join recepcionista r on u.id_usuario=r.id_usuario\n" +
"where r.id_usuario='"+id_usuario+"'";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    nombre= rs.getString("u.nombre");
                    segundo_nombre= rs.getString("u.segundo_nombre");
                    apellido_paterno= rs.getString("u.apellido_paterno");
                    apellido_materno= rs.getString("u.apellido_materno");
                    domicilio= rs.getString("r.domicilio");
                    ciudad= rs.getString("r.ciudad");
                    estado= rs.getString("r.estado");
                    codigo_postal= rs.getString("r.codigo_postal");
                    tel_domicilio= rs.getString("r.tel_domicilio");
                    tel_oficina= rs.getString("r.tel_oficina");
                    tel_movil= rs.getString("r.tel_movil");
                    tel_extra= rs.getString("r.tel_extra");
                    correo_electronico= rs.getString("r.correo_electronico");
                    }
                 
      Object vector[]={nombre,segundo_nombre,apellido_paterno,apellido_materno,domicilio,ciudad,estado,codigo_postal,tel_domicilio,tel_oficina,tel_movil,tel_extra,correo_electronico};
         return vector;           
                 
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
        return vector1; 
    }//obtenerDatosRecepcionista
   
    
    
    public boolean actualizarDatosRecepcionista(String domicilio,String ciudad,String 
    estado,String codigo_postal,String tel_domicilio,String tel_oficina,
    String tel_movil,String tel_extra,String correo_electronico,int id_usuario){
        boolean est=true;
            
            try{
               PreparedStatement pst=cn.prepareStatement("update recepcionista\n" +
                                "set domicilio = '"+domicilio+"',\n" +
                                "    ciudad = '"+ciudad+"',\n" +
                                "    estado = '"+estado+"',\n" +
                                "    codigo_postal = '"+codigo_postal+"',\n" +
                                "    tel_domicilio = '"+tel_domicilio+"',\n" +
                                "    tel_oficina = '"+tel_oficina+"',\n" +
                                "    tel_movil = '"+tel_movil+"',\n" +
                                "    tel_extra = '"+tel_extra+"',\n" +
                                "    correo_electronico = '"+correo_electronico+"'\n" +
                                "where id_usuario = '"+id_usuario+"'"); 
               int a=pst.executeUpdate();
         if(a>0){
               showMessageDialog(null,"Datos actualizados");
           }
           else{
                showMessageDialog(null,"Error al actualizar");
                est = false;
           }
           }catch(HeadlessException | SQLException e){
               showMessageDialog(null,e.getMessage());
           } 
        return est;
    }//actualizarDatosRecepcionista
    
    /**
    * Este metodo da permiso para eliminar y actualizar datos de tablas en la base de datos
    */
    public void safeUpdates(){
            try{
                 String query = "SET SQL_SAFE_UPDATES = 0";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                 }
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
    }//SafeUpdates 
}//clase
