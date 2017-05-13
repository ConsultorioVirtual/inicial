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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class RecepcionistaClase {
  /*variables*/
    conectar cc=new conectar();
    Connection cn=cc.conexion();
    DefaultTableModel modelo;
    String cabeceraCitas[]={"Hora", "Paciente", "Fecha", "Doctor"};
    String cabeceraPacientes[]={"Primer nombre", "Segundo nombre", "Apellido paterno", "Apellido materno"};
    int x = getRowNumber("doctor");
    
    String h [][] = {{"08:00",""},{"09:00",""},{"10:00",""},{"11:00",""}
            ,{"12:00",""},{"13:00",""},{"14:00",""},{"15:00",""},{"16:00",""},
            {"17:00",""},{"18:00",""},{"19:00",""},{"20:00",""},{"21:00",""},{"22:00",""}}; 
    String doctores[]=obtenerDoctores();
    String datos[][]={};
   
  /*metodos*/
  
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
    
       public DefaultTableModel tablaAgenda(){
           DefaultTableModel mod = new DefaultTableModel(datos,cabeceraCitas);
           /*get h [i][0](las horas)*/
           for(int i=0;i<h.length;i++){
               for(int j=0;j<doctores.length;j++){
                   Object vect[]= {h[i][0],"","",doctores[j]};
                mod.addRow(vect);
               }
           }//horas
            
            
        return mod;
    }//tablaAgenda
       
       public DefaultTableModel tablaPacientes(){
        return new DefaultTableModel(datos,cabeceraPacientes);
    }//tablaPacientes
       
       public DefaultTableModel obtenerPacientes(){
           DefaultTableModel mod = tablaPacientes();
           String nombre="";
           String segNombre="";
           String apPat="";
           String apMat="";
           try{
                 String query = "select nombre, segundo_nombre, apellido_paterno,"
                         + "apellido_materno from paciente order by nombre";
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
       
       public DefaultTableModel obtenerCitas(String fechaCitas){
           DefaultTableModel mod = tablaAgenda();
           //"Hora", "Paciente", "Fecha", "Doctor"
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
"order by hora";
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
                         if(mod.getValueAt(j,0).equals(horaArr[i])&&mod.getValueAt(j,3).equals(doctorArr[i])){
                            mod.removeRow(j);
                            mod.insertRow(j, vector);
                        }
                    }
                      }//for
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
           return mod;
       }//obtenerCitas
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
    
    public String[] obtenerDoctores(){
           String nombre="";
           String doctoresArr[];
           try{
                 String query = "select nombre,segundo_nombre,apellido_paterno,"
                         + "apellido_materno from detalle_doctor";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    nombre+=rs.getString("nombre")+" ";
                    nombre+=rs.getString("segundo_nombre")+" ";
                    nombre+=rs.getString("apellido_paterno")+" ";
                    nombre+=rs.getString("apellido_materno")+",";
                    }             
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
           doctoresArr=nombre.split(",");
           return doctoresArr;
       }//obtenerDoctores
    
    
    
    
    
    
}//clase
