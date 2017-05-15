/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author dani_
 */
public class conectar {
        Connection conectar=null;
public Connection conexion(){   
  try{
      /*Revisen la contraseña cuando usen el codigo*/
    Class.forName("org.gjt.mm.mysql.Driver");//.newInstance();
    //conectar=DriverManager.getConnection("jdbc:mysql://localhost/dbconsultorio","root","");
    conectar=DriverManager.getConnection("jdbc:mysql://localhost/dbconsultorio","root","ABD2017");
    //conectar=DriverManager.getConnection("jdbc:mysql://localhost/dbconsultorio","root","abd2017");
  }
  catch(SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error de conexion de la base de datos");
   }
  catch(ClassNotFoundException ex) {   }
        return conectar;
    }

    public void txtApMatKeyTyped(KeyEvent evt) {
    }

    public void txtApMatKeyReleased(KeyEvent evt) {
    }
    //ID

    public void txtApMatKeyPressed(KeyEvent evt) {
    }
}
