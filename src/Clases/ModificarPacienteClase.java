package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static javax.swing.JOptionPane.showMessageDialog;

public class ModificarPacienteClase {
  /*Variables*/
    conectar cc=new conectar();
    Connection cn=cc.conexion();
  /*Metodos*/

    
public Object[] obtenerDatospaciente(int id_paciente){
    String nombre = "";
    String segundo_nombre= "";    
    String apellido_paterno= "";    
    String apellido_materno= "";
    String domicilio= "";    
    String ciudad= "";    
    String estado= "";    
    String codigo_postal= "";    
    String tel_domicilio= "";
    String tel_oficina= "";
    String correo_electronico= "";    
    String sexo= "";    
    String derechohabiente= "";    
    String lugar_nacimiento= ""; 
    String fecha_nacimiento= "";
    String edad= "";
    String id_doctor="";
    String rfc= "";
    String estado_civil= "";
    String nombre_madre= "";
    String nombre_padre= "";
    String nombre_pareja= "";
    String procedencia= "";
    String ocupacion= "";
    String escolaridad= "";
    String observaciones= "";
    String vector1[]={""};
        try{
                 String query = "select * from paciente where id_paciente='"+id_paciente+"'";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    nombre= rs.getString("nombre");
                    segundo_nombre= rs.getString("segundo_nombre");
                    apellido_paterno= rs.getString("apellido_paterno");
                    apellido_materno= rs.getString("apellido_materno");
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
    }//obtenerDatospaciente

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
     
    public String obtenerDoctor(int id_doctor){
    String nombres="";
    try{
        String query = "select nombre, segundo_nombre, apellido_paterno,apellido_materno from detalle_doctor \n" +
"where id_doctor = '"+id_doctor+"'";
        
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
    
    return nombres;
}//obtenerDoctor
    
    public int obtenerIdPaciente(String nombre,String segundo_nombre, 
            String apellido_paterno, String apellido_materno){
        int id_paciente=0;
            try{
        String query = "select id_paciente from paciente\n" +
"where nombre='"+nombre+"'\n" +
"and segundo_nombre='"+segundo_nombre+"'\n" +
"and apellido_paterno='"+apellido_paterno+"'\n" +
"and apellido_materno='"+apellido_materno+"'";
        
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    id_paciente = Integer.parseInt(rs.getString("id_paciente"));
                    }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return id_paciente;
    }//obtenerIdPaciente

    
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
        //retornara verdadero si algo esta  mal
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
    
    public boolean validarCampos(String nombre, String apellido_paterno,String domicilio,
             String ciudad, String estado,String codigo_postal, String tel_domicilio, String tel_oficina,
             String lugar_nacimiento,String fecha_nacimiento, String edad){
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
            /*if(sexo.equals("")){
                showMessageDialog(null,"seleccione un sexo");
                est = false;
                return est;}*/
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
            /*if(medico.equals("")){
                showMessageDialog(null,"Seleccione un medico");
                est = false;
                return est;}*/
         return est;
    }//validarCampos

public void actualizarP(String nombre,String segundo_nombre, String apellido_paterno,
                String apellido_materno,String domicilio,String ciudad,String estado,
        String codigo_postal, String tel_domicilio, String tel_oficina, String correo_electronico,
        String derechohabiente, String lugar_nacimiento, String fecha_nacimiento,
        String edad, String rfc, String estado_civil, String nombre_madre, String nombre_padre,
        String nombre_pareja, String procedencia, String ocupacion, String escolaridad,
        String observaciones){
        
           
        
        if(segundo_nombre.equals("")){segundo_nombre="-";}
        if(apellido_materno.equals("")){apellido_materno="-";}
        if(derechohabiente.equals("ISSSTE, IMSS, ETC")){derechohabiente="";}
        int id_Paciente = obtenerIdPaciente(nombre, segundo_nombre, apellido_paterno, apellido_materno);
    
        
        
        
        try{
            PreparedStatement pst = cn.prepareStatement("UPDATE paciente SET nombre ='"+nombre+
                "',segundo_nombre = '"+segundo_nombre+
                "',apellido_paterno = '"+apellido_paterno+
                "',apellido_materno = '"+apellido_materno+
                "',domicilio = '"+domicilio+
                "',ciudad = '"+ciudad+
                "',estado = '"+estado+
                "',codigo_postal = '"+codigo_postal+
                "',tel_domicilio = '"+tel_domicilio+
                "',tel_oficina = '"+tel_oficina+
                "',correo_electronico = '"+correo_electronico+
                "',derechohabiente = '"+derechohabiente+
                "',lugar_nacimiento = '"+lugar_nacimiento+
                "',fecha_nacimiento = '"+fecha_nacimiento+
                "',edad = '"+edad+
                "',rfc = '"+rfc+
                "',estado_civil = '"+estado_civil+
                "',nombre_madre = '"+nombre_madre+
                "',nombre_padre = '"+nombre_padre+
                "',nombre_pareja = '"+nombre_pareja+
                "',procedencia = '"+procedencia+
                "',ocupacion = '"+ocupacion+
                "',escolaridad = '"+escolaridad+ 
                "',observaciones = '"+observaciones+"' WHERE id_paciente =  "+id_Paciente                    
                    
            );//24 campos
              
              int a=pst.executeUpdate();
         if(a>0){
               showMessageDialog(null,"Registro de paciente actualizado");
           }
           else{
                showMessageDialog(null,"Error al actualizar");
                
           }
           }catch(SQLException ex){
               showMessageDialog(null,ex.getMessage());
               
           }  
      
    }//ActualizarP             
}//class
