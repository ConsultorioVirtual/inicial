package Clases;

import com.mxrck.autocompleter.TextAutoCompleter;
import com.toedter.calendar.JDateChooser;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;


public class CitasClase {
    /*Variables*/
    conectar cc=new conectar();
    Connection cn=cc.conexion();
    java.util.Date fecha = new Date();
       
    /*Metodos*/
     
    public boolean validarCampos(String fecha,String paciente){
        boolean estCampos = true;
        if(fecha.equals("")|fecha.equals("HH:MM")){
            showMessageDialog(null,"Ingrese una hora");
            return false;
        }
        if(paciente.equals("")){
            showMessageDialog(null,"Ingrese un paciente");
            return false;
        }
        return estCampos;
    }//validarCampos
    
    public String obtenerNombreDoctor(String nombrePaciente){
    int idPaciente = obtenerIdPaciente(nombrePaciente);
    int idDoctor = obtenerIdDoctor(idPaciente);
    String nombreDoctor="";
    
    try{
                 String query = "select nombre,segundo_nombre, apellido_paterno, "
                         + "apellido_materno\n" +
                                "from detalle_doctor\n" +
                                "where id_doctor="+idDoctor;
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    nombreDoctor += rs.getString("nombre")+" "+
                           rs.getString("segundo_nombre")+" "+
                            rs.getString("apellido_paterno")+" "+
                            rs.getString("apellido_materno")+" ";
                    }
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
    return nombreDoctor;
}//obtenerNombreDoctor

    public void obtenerPacientes(JTextField txtPaciente) {
       TextAutoCompleter AutoCompletado = new TextAutoCompleter(txtPaciente);
    String nombres="";
    try{
                 String query = "select nombre, segundo_nombre, apellido_paterno,"
                         + "apellido_materno from paciente";
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
          AutoCompletado.addItem(arrNombres[i]);
        }
     }//obtenerPacientes
    
    public String obtenerFecha(JDateChooser dateC){
        String date = dateC.getDate()+"";
        String meses[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String fecha[] = date.split(" ");
        for(int i=0;i<meses.length;i++){
            if(meses[i].equals(fecha[1])){
                if((i+1)<10){
                    date=fecha[5]+"-0"+(i+1)+"-"+fecha[2];
                }else
                date=fecha[5]+"-"+(i+1)+"-"+fecha[2];
            }
        }//for
            return date;
    }//obtenerFecha
    
    public String obtenerFecha(String date){
        String meses[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String fecha[] = date.split(" ");
        for(int i=0;i<meses.length;i++){
            if(meses[i].equals(fecha[1])){
                if((i+1)<10){
                    date=fecha[5]+"-0"+(i+1)+"-"+fecha[2];
                }else
                date=fecha[5]+"-"+(i+1)+"-"+fecha[2];
            }
        }//for
            return date;
    }//obtenerFecha
    
    public String obtenerHora(String date){
        String fecha[] = date.split(" ");
        String hora=fecha[3];
        return hora;
    }//obtenerHora
    
    public int obtenerIdDoctor(int idPaciente){
        int id=0;
            try{
                 String query = "select id_doctor\n" +
                                "from paciente\n" +
                                "where id_paciente="+idPaciente;
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    id=Integer.parseInt( rs.getString("id_doctor"));
                    }
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
        return id;
    }//obtenerIdMedico
    
    public int obtenerIdPaciente(String nombre){
        int id=0;
        String nombres[]= nombre.split(" ");
            try{
                 String query = "select id_paciente from paciente where nombre ="
                         + " '"+nombres[0]+"' and apellido_paterno = '"+nombres[2]+"'";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    id=Integer.parseInt( rs.getString("id_paciente"));
                    }
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
        return id;
    }//obtenerIdPaciente
    
    public boolean insertarCita(String fecha, String hora, int id_paciente){
        boolean estado=true;
        String id_citas=getRowNumber("citas")+1+"";
        int idDoctor = obtenerIdDoctor(id_paciente);
        if(validarDisponibilidad(idDoctor, fecha, hora)){
            try{
               PreparedStatement pst=cn.prepareStatement("INSERT INTO citas"
        + "(id_citas, fecha, hora, estado, id_paciente, id_doctor) VALUES(?,?,?,?,?,?)"); 
               pst.setString(1,id_citas);
               pst.setString(2,fecha);
               pst.setString(3,hora);
               pst.setString(4,"1");
               pst.setString(5,id_paciente+"");
               pst.setString(6,idDoctor+"");
               int a=pst.executeUpdate();
         if(a>0){
               showMessageDialog(null,"Cita registrada");
           }
           else{
                showMessageDialog(null,"Error al agregar");
                estado = false;
           }
           }catch(HeadlessException | SQLException e){
           } 
        }
        else{
            showMessageDialog(null,"Doctor ocupado");
            return false;
        }
        return estado;
    }//insertarCita
    
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
 /**
 * Este metodo devuelve verdadero si esta disponible el doctor, fecha y hora
 */  
public boolean validarDisponibilidad(int id_doctor, String fecha, String hora){
    boolean disp=true;
    int numberRow = 0;
        try{
                 String query = "select count(*) from citas\n" +
                                "where estado = 1 and id_doctor='"+id_doctor+"'\n" +
                                "and fecha='"+fecha+"'\n" +
                                "and hora='"+hora+"'";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                   numberRow = rs.getInt("count(*)");
                    }
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
        if(numberRow>0){
            disp=false;
            return disp;
        }
    return disp;
}//validarDisponibilidad         

 /**
 * Este metodo devuelve verdadero la fecha y hora no han pasado
 */
    public boolean validarFechayHora(String text, Date date) {
     boolean valido=true;
        String fechaSist[] = obtenerFecha(fecha+"").split("-");
        String fechaCita[] = obtenerFecha(date+"").split("-");
        String horaSist[] = obtenerHora(fecha+"").split(":");
        String horaCita[] = text.split(":");
        int horaSis=Integer.parseInt(horaSist[0]);
        int minSis=Integer.parseInt(horaSist[1]);
        int horaCit=Integer.parseInt(horaCita[0]);
        int minCit=Integer.parseInt(horaCita[1]);
        int yearSist=Integer.parseInt(fechaSist[0]);
        int monthSist=Integer.parseInt(fechaSist[1]);
        int daySist=Integer.parseInt(fechaSist[2]);
        int yearDate=Integer.parseInt(fechaCita[0]);
        int monthDate=Integer.parseInt(fechaCita[1]);
        int dayDate=Integer.parseInt(fechaCita[2]);
        if(yearDate<yearSist){
            showMessageDialog(null,"Fecha no disponible");
            valido=false;
            return valido;
        }
        if(yearDate==yearSist && monthDate<monthSist){
            showMessageDialog(null,"Fecha no disponible");
            valido=false;
            return valido;
        }
        if(yearDate==yearSist && monthDate==monthSist && dayDate<daySist){
            showMessageDialog(null,"Fecha no disponible");
            valido=false;
            return valido;
        }
        if(yearDate==yearSist && monthDate==monthSist && dayDate==daySist){
            //verificar la hora
            if(horaCit<horaSis){
            showMessageDialog(null,"Fecha no disponible");
            valido=false;
            return valido;
        }
            if(horaCit==horaSis && minCit<=horaSis){
            showMessageDialog(null,"Fecha no disponible");
            valido=false;
            return valido;
        }
        }
     return valido;
    }
    
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
    
    
     /**
    * Este metodo cancela las citas
    */
        public boolean cancelarCita(String hora,String fecha,String nombre,
                String segundo_nombre, String apellido_paterno,
                String apellido_materno){
            safeUpdates();
        boolean estado=true;
        
            try{
               PreparedStatement pst=cn.prepareStatement("update citas\n" +
                            "set estado=0\n" +
                            "where hora = '"+hora+"'\n" +
                            "and fecha = '"+fecha+"'\n" +
                            "and id_paciente in \n" +
                            "(select id_paciente from paciente where \n" +
                            "nombre='"+nombre+"'\n" +
                            "and segundo_nombre = '"+segundo_nombre+"'\n" +
                            "and apellido_paterno = '"+apellido_paterno+"'\n" +
                            "and apellido_materno = '"+apellido_materno+"');"); 
               int a=pst.executeUpdate();
         if(a>0){
               showMessageDialog(null,"Cita cancelada");
           }
           else{
                showMessageDialog(null,"Error al cancelar");
                estado = false;
           }
           }catch(HeadlessException | SQLException e){
               showMessageDialog(null,e.getMessage());
           } 
        return estado;
    }//cancelarCita

}//clase
