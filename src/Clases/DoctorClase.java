
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DoctorClase {
    /*variables*/
    conectar cc=new conectar();
    Connection cn=cc.conexion();
    DefaultTableModel modelo;
    String cabeceraCitas[]={"Hora", "Paciente", "Fecha", "Doctor"};
    String cabeceraPacientes[]={"Primer nombre", "Segundo nombre", "Apellido paterno", "Apellido materno"};
    String datos[][]={};
    String h [][] = {{"08:00",""},{"09:00",""},{"10:00",""},{"11:00",""}
            ,{"12:00",""},{"13:00",""},{"14:00",""},{"15:00",""},{"16:00",""},
            {"17:00",""},{"18:00",""},{"19:00",""},{"20:00",""},{"21:00",""},{"22:00",""}};
    /*Metodos*/
       public DefaultTableModel tablaAgenda(){
        return new DefaultTableModel(h,cabeceraCitas);
    }//tablaAgenda
       
       public DefaultTableModel tablaPacientes(){
        return new DefaultTableModel(datos,cabeceraPacientes);
    }//tablaPacientes
    
    public DefaultTableModel obtenerPacientes(int id_doctor){
           DefaultTableModel mod = tablaPacientes();
           String nombre="";
           String segNombre="";
           String apPat="";
           String apMat="";
           try{
                 String query = "select nombre, segundo_nombre, apellido_paterno,"
                         + "apellido_materno from paciente where id_doctor='"+id_doctor+"'"
                         + "order by nombre";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    nombre += rs.getString("nombre")+",";
                    segNombre+=rs.getString("segundo_nombre")+",";
                    apPat+=rs.getString("apellido_paterno")+",";
                    apMat+=rs.getString("apellido_materno")+",";
                    }
                 String nombreArr[]=nombre.split(",");
                 String segNombArr[]=segNombre.split(",");
                 String apPatArr[]=apPat.split(",");
                 String apMatArr[]=apMat.split(",");
                 for(int i=0;i<nombreArr.length;i++){
                    Object vector[]={nombreArr[i],segNombArr[i],apPatArr[i],apMatArr[i]};
                    mod.addRow(vector);
                 }//for
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
           return mod;
       }//obtenerPacientes
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
    
    public DefaultTableModel obtenerCitas(String fechaCitas,int id_doctor){
           DefaultTableModel mod = tablaAgenda();
           String hora="";
           String paciente="";
           String fecha="";
           String doctor="";
          
           try{
                 String query = "select c.hora, p.nombre , p.segundo_nombre, p.apellido_paterno, p.apellido_materno,c.fecha,\n" +
"dd.nombre, dd.segundo_nombre, dd.apellido_paterno, dd.apellido_materno\n" +
"from citas c\n" +
"inner join paciente p on c.id_paciente=p.id_paciente\n" +
"inner join detalle_doctor dd on dd.id_doctor=c.id_doctor\n" +
"where c.estado = 1 and c.fecha=\""+fechaCitas+"\"" +
"and id_usuario = '"+id_doctor+"'order by hora";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                  while(rs.next()){
                    
                    hora += rs.getString("c.hora")+",";
                    
                    paciente+=rs.getString("p.nombre")+" ";
                    paciente+=rs.getString("p.segundo_nombre")+" ";
                    paciente+=rs.getString("p.apellido_paterno")+" ";
                    paciente+=rs.getString("p.apellido_materno")+",";
                    
                    fecha+=rs.getString("c.fecha")+",";
                    
                    doctor+=rs.getString("dd.nombre")+" ";
                    doctor+=rs.getString("dd.segundo_nombre")+" ";
                    doctor+=rs.getString("dd.apellido_paterno")+" ";
                    doctor+=rs.getString("dd.apellido_materno")+",";
                    
                    }
                 
                 String horaArr[]=hora.split(",");
                 String pacienteArr[]=paciente.split(",");
                 String fechaArr[]=fecha.split(",");
                 String doctorArr[]=doctor.split(",");     
                 for(int i=0;i<horaArr.length;i++){
                    Object vector[]={horaArr[i],pacienteArr[i],fechaArr[i],doctorArr[i]};
                        for(int j=0;j<mod.getRowCount();j++){
                         if(mod.getValueAt(j,0).equals(horaArr[i])){
                            mod.removeRow(j);
                            mod.insertRow(j, vector);
                        }
                    }
                 }//for
            }catch (SQLException ex){
                     JOptionPane.showMessageDialog(null,ex.getMessage());
              }
           return mod;
       }//obtenerCitas
       
}
