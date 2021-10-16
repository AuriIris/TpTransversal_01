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
     
     }
     catch (SQLException ex){
    System.out.println("Error al insertar: "+ex); 
    }


}


 public boolean modificadarMateria (Materia mat) {

    boolean modificada = false;
    String sql = "UPDATE materia SET nombre=?,activo=? Where idmateria=?";

    try{
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,mat.getNombre());
        ps.setInt(2, mat.getAnio());
        ps.setBoolean(3, mat.isActivo());
        ps.setInt(4,mat.getIdMateria());

         ps.executeUpdate();
        ps.close();
    }

     catch (SQLException ex){
         modificada = false;
        System.out.println("Error al Actualizar la materia: "+ex);
        }
      return modificada;

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
 public void borrarMateria (Materia mat) {

    String sql = "UPDATE materia SET activo=? WHERE idmateria=?";

    try{
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setBoolean(0, false);

        ps.executeUpdate();
        ps.close();
    }

 catch (SQLException ex){
 System.out.println("Error al Actualizar la materia: "+ex); 
 }
 }
}