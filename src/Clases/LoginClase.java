
package Clases;

import com.mxrck.autocompleter.TextAutoCompleter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;


public class LoginClase {
  /*Variables*/
    conectar cc=new conectar();
    Connection cn=cc.conexion();
    /*Metodos*/
    
    public String login(String nombre, String contraseña){
    String nombres="";
    String contraseñas="";
    String tipos="";
    String usuario="";
    try{
                 String query = "select * from usuarios";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    nombres += rs.getString("nombre")+" "+
                           rs.getString("apellido_paterno")+",";
                    contraseñas+=rs.getString("contraseña")+",";
                    tipos+=rs.getString("tipo_usuario")+",";
                    }
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
     String nombresArr[]=nombres.split(",");
     String contraseñasArr[]=contraseñas.split(",");
     String tiposArr[]=tipos.split(",");
     for(int i=0;i<nombresArr.length;i++){
         if(nombre.equals(nombresArr[i])&&contraseña.equals(contraseñasArr[i])){
             return tiposArr[i];
         }
     }
    return "USUARIO O CONTRASEÑA NO VALIDO";
}//login
    
    public void itemsUsuario(JTextField txtUsuario){
    TextAutoCompleter AutoCompletado = new TextAutoCompleter(txtUsuario);
    String nombres="";
    try{
                 String query = "select nombre, apellido_paterno from usuarios";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    nombres += rs.getString("nombre")+" "+
                               rs.getString("apellido_paterno")+",";
                    }
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
    String arrNombres[]= nombres.split(",");
    for(int i=0;i<arrNombres.length;i++){
        AutoCompletado.addItem(arrNombres[i]);
        }
    }//itemsUsuario
 
public int getId(String nombre, String apellido_paterno){
    int id=0;
        
        try{
                 String query = "select id_usuario from usuarios\n" +
                                "where nombre='"+nombre+"'\n" +
                                "and apellido_paterno='"+apellido_paterno+"'";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    id = Integer.parseInt(rs.getString("id_usuario"));
                    }
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              } 
    return id;
}
    
}//clase
