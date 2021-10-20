package Data;

import Modelo. *;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author martinbordon
 */
public class AlumnoData {
    private Connection con;

    public AlumnoData(Conexion conexion) {
        try {
            this.con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");
        }
    }

    public AlumnoData() {
        //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void guardarAlumno(Alumno alumno) {
     
            String sql = "INSERT INTO alumno(legajo,nombre,apellido,fechaNac,activo) VALUES (?,?,?,?,?)";
            try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                
                ps.setInt(1, alumno.getLegajo());
                ps.setString(2, alumno.getNombre());
                ps.setString(3, alumno.getApellido());
                ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
                ps.setBoolean(5, alumno.isActivo());
                ps.executeUpdate();
                
                System.out.println("Alumno guardado con exito.");
        } catch (SQLException ex) {
            System.out.println("Error al guardar "+ex);
        }
        
        
    }
    public void borrarAlumno(int id){
      String sql="DELETE FROM alumno WHERE idAlumno=?";
      PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            
            System.out.println("Alumno borrado definitivamente");
        } catch (SQLException ex) {
             System.out.println("Error al borrar "+ex);
        }
           
      
    
    }
    public List<Alumno> buscarTodosAlumnos(){
    List<Alumno> resultados;
        resultados = new ArrayList<>();
        Alumno alum= null;
        String sql = "SELECT * FROM alumno ";
    try{
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
    while(rs.next()){
        alum = new Alumno();
        alum.setIdAlumno(rs.getInt("idAlumno"));
        alum.setNombre(rs.getString("nombre"));
        alum.setActivo(rs.getBoolean("activo"));

    resultados.add(alum);
    }
    ps.close();
    }
    catch(SQLException ex){
        System.out.println("No se encontraron resultados: "+ ex);
    }
return resultados;

  }

public Alumno buscarPorID (int ID){
 Alumno alum = null;
String sql = "SELECT * FROM alumno Where idAlumno=?";
try{
PreparedStatement ps = con.prepareStatement(sql);
ps.setInt(1, ID);
ResultSet rs = ps.executeQuery();
if(rs.next()) {
 alum = new Alumno();

 alum.setIdAlumno(rs.getInt("idAlumno"));
 alum.setNombre(rs.getString("nombre"));
 alum.setActivo(rs.getBoolean("activo"));
}
}
catch(SQLException ex){
 System.out.println("Alumno no encontrado: " + ex);
}
return alum;
}
    public void desactivarAlumno(int id){
    String sql = "UPDATE alumno SET activo=? WHERE idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.setInt(2, id);
            ps.executeUpdate();
            ps.close();
            
            System.out.println("Alumno dado de baja con exito");
        } catch (SQLException ex) {
            System.out.println("Error al desactivar "+ex);
        }
    }
    
     public void activarAlumno(int id){
        String sql = "UPDATE alumno SET activo=? WHERE idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1,true);
            ps.setInt(2, id);
            ps.executeUpdate();
            
            System.out.println("Alumno dado de alta nuevamente con exito.");
        } catch (SQLException ex) {
            System.out.println("Error al desactivar "+ex);
        }
    }
     
public Alumno buscarAlumno(int id){
         Alumno alumno=null;
         String sql = "SELECT * FROM alumno Where idAlumno= ?";
         
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, id);
             ResultSet rs =ps.executeQuery();
             if(rs.next()){
             alumno=new Alumno();
             alumno.setIdAlumno(rs.getInt(1));
             alumno.setLegajo(rs.getInt(2));
             alumno.setNombre(rs.getString(3));
             alumno.setApellido(rs.getString(4));
             alumno.setFechaNac(rs.getDate(5).toLocalDate());
             alumno.setActivo(rs.getBoolean(6));
             }
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener la busqueda de alumno"+ex);
        }
    
         return alumno;
         
  }  
   public void actualizarAlumno(Alumno alumno, int ID){
 String sql = "UPDATE alumno SET legajo=?, nombre=?, apellido=?, fechaNac=? , activo=? Where idAlumno=?";
 
 try {
 PreparedStatement ps = con.prepareStatement(sql);
 ps.setInt(1, alumno.getLegajo());
 ps.setString(2, alumno.getNombre());
 ps.setString(3, alumno.getApellido());
 ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
 ps.setBoolean(5, alumno.isActivo());
 ps.setInt(6,ID);
 
 ps.executeUpdate();
 ps.close();
 
 System.out.println("Alumno modificado con exito.");
 } catch (SQLException ex) {
     System.out.println("Error al conectar con la base de datos. " + ex);
 }
   
   }
}