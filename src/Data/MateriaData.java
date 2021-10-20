package Data;

import Modelo.Conexion;
import Modelo.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author pablo
 */
public class MateriaData {
 private Connection con;
 public MateriaData(Conexion conexion ) {

     try {
        con = conexion.getConexion();
    } catch (SQLException ex) {
       System.out.println("Error en la conexcion: "+ex);
    }
 }


 public void guardarMateria(Materia mat) {
     String sql = "INSERT INTO materia (nombre,anio,activo) VALUES (?,?,?)";

     try{
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(2,mat.getAnio());
        ps.setString(1, mat.getNombre());
        ps.setBoolean(3, mat.isActivo());
        ps.executeUpdate();
         System.out.println("Materia guardada con exito.");
     }
     catch (SQLException ex){
    System.out.println("Error al insertar: "+ex); 
    }


}


 public void modificadarMateria (Materia mat, int ID) {
 String sql = "UPDATE materia SET nombre=? , anio=? , activo=? Where idMateria=?";
 try{
 PreparedStatement ps = con.prepareStatement(sql);
 ps.setString(1,mat.getNombre());
 ps.setInt(2, mat.getAnio());
 ps.setBoolean(3, mat.isActivo());
 ps.setInt(4,ID);
 
 ps.executeUpdate();
 ps.close();
     System.out.println("Materia modificada con exito.");
 }
 catch (SQLException ex){
 System.out.println("Error al actualizar materia: "+ex);
 }
 
 }
 
public List<Materia> buscarMateriasPorNombre (String nombre){
    List<Materia> resultados;
    resultados = new ArrayList<>();
    Materia mat= null;
    String sql = "SELECT * FROM materia Where nombre like '%" + nombre + "%'";
    try{
        PreparedStatement ps = con.prepareStatement(sql);
 
        ResultSet rs = ps.executeQuery();
      while(rs.next()){
        mat = new Materia();
        mat.setIdMateria(rs.getInt("idMateria"));
        mat.setNombre(rs.getString("nombre"));
        mat.setAnio(rs.getInt("anio"));
        mat.setActivo(rs.getBoolean("activo"));

    resultados.add(mat);
    }
    ps.close();
    }
    catch(SQLException ex){
    System.out.println("No se encontraron resultados: "+ ex);
    }
    return resultados;
}

public List<Materia> buscarTodasMaterias(){
    List<Materia> resultados;
    resultados = new ArrayList<>();
    Materia mat= null;
    String sql = "SELECT * FROM materia";
    try{
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
      while(rs.next()){
        mat = new Materia();
        mat.setIdMateria(rs.getInt("idMateria"));
        mat.setNombre(rs.getString("nombre"));
        mat.setAnio(rs.getInt("anio"));
        mat.setActivo(rs.getBoolean("activo"));

    resultados.add(mat);
    }
    ps.close();
    }
    catch(SQLException ex){
    System.out.println("No se encontraron resultados: "+ ex);
    }
    return resultados;
}


public Materia buscarPorID (int ID){
    Materia mat = null;
    String sql = "SELECT * FROM materia Where idMateria=?";
    try{
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, ID);
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            mat = new Materia();

        mat.setIdMateria(rs.getInt("idMateria"));
        mat.setNombre(rs.getString("nombre"));
        mat.setAnio(rs.getInt("anio"));
        mat.setActivo(rs.getBoolean("activo"));
       }
    }
    catch(SQLException ex){
        System.out.println("Materia no encontrada: " + ex);
    }
    return mat;
}
 public void borrarMateria(int id){
 
     String sql="DELETE FROM materia WHERE idMateria=?";
     
      PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            
            System.out.println("Materia Borrada con exito.");
        } catch (SQLException ex) {
             System.out.println("Error al borrar "+ex);
        }
 }
 
 
   public void desactivarMateria(int id){
    String sql = "UPDATE materia SET activo=? WHERE idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.setInt(2, id);
            ps.executeUpdate();
            ps.close();
            
            System.out.println("Materia dada de baja con exito.");
        } catch (SQLException ex) {
            System.out.println("Error al desactivar "+ex);
        }
    }
 
   
      public void activarMateria (int id){
        String sql = "UPDATE materia SET activo=? WHERE idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1,true);
            ps.setInt(2, id);
            ps.executeUpdate();
            
            System.out.println("Materia dada de alta nuevamente.");
        } catch (SQLException ex) {
            System.out.println("Error al desactivar "+ex);
        }
    }
}