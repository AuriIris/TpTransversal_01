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
    
    
    public void guardarAlumno(Alumno alumno) {
        try {
            String sql = "INSERT INTO alumno(legajo,nombre,apellido,fechaNac,activo) VALUES (?,?,?,?,?)";
            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setInt(1, alumno.getLegajo());
                ps.setString(2, alumno.getNombre());
                ps.setString(3, alumno.getApellido());
                ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
                ps.setBoolean(5, alumno.isActivo());
                ps.executeUpdate();
            }
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
        } catch (SQLException ex) {
             System.out.println("Error al borrar "+ex);
        }
           
      
    
    }
    public void desactivarAlumno(int id){
    String sql = "UPDATE alumno SET activo=? WHERE idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.setInt(2, id);
            ps.executeUpdate();
            ps.close();
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
    public void actualizarAlumno(Alumno alumno){
        String sql = "UPDATE alumno SET legajo=?, nombre=?, apellido=? ,fechNac=? WHERE idAlumno=?";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getLegajo());
            ps.setString(2, alumno.getNombre());
            ps.setString(3, alumno.getApellido());
            //ps.setDate(4, Date.valueOf(alumno.getFechNac()));//LocalDate a Date
            ps.setBoolean(5, alumno.isActivo());
            ps.setInt(6,alumno.getIdAlumno() );
            ps.executeUpdate();
            
            ps.close();
        } catch (SQLException ex) {
            
          }
 }

   

}