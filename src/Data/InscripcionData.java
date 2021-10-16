package Data;

import Modelo.Alumno;
import Modelo.Conexion;
import Modelo.Inscripcion;
import Modelo.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import java.util.logging.Logger;

/**
 *
 * @author martinbordon
 */
public class InscripcionData {
    private Connection con;
    private Conexion conexion;

    public InscripcionData() {
    }

    public InscripcionData(Connection con, Conexion conexion) {
        this.con = con;
        this.conexion = conexion;
    }
    
    
    
    
public InscripcionData(Conexion conexion) {
        try {
            con = conexion.getConexion();
            this.conexion=conexion;
        } catch (SQLException ex) {
            System.out.println("Error en la conexion ");
        }
    }
    
public void guardarInscripcion(Inscripcion ins){
    String sql = "INSERT INTO inscripcion (idAlumno, idMateria, nota,activo) VALUES ( ? , ? , ?,? );";
  
    try{
          
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ins.getAlumno().getIdAlumno());
            ps.setInt(2, ins.getMateria().getIdMateria());
            ps.setDouble(3, ins.getNota());
            ps.setBoolean(4,ins.isActivo());
            
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                ins.setIdInscripcion(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar inscripcion");
            }
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una inscripcion: " + ex.getMessage());
        }
    
    }
    
public List<Inscripcion> obtenerInscripcionesMateria(int id){
        List<Inscripcion> lista= new ArrayList<>();
        String sql;
        Inscripcion ins;
        Alumno alumno;
        Materia materia;
        sql = "SELECT * FROM inscripcion,alumno,materia WHERE inscripcion.idAlumno=alumno.idAlumno and inscripcion.idMateria=materia.idMateria and materia.idMateria = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
             ps.setInt(1, id);
             ResultSet rs =ps.executeQuery();
             while (rs.next()){
                ins = new Inscripcion();
                ins.setIdInscripcion(rs.getInt(1));
                alumno=buscarAlumno(rs.getInt(2));
                ins.setAlumno(alumno);
                materia = buscarMateria(rs.getInt(3));
                ins.setMateria(materia);
                ins.setNota(rs.getDouble(4));
                lista.add(ins);
             }   
             
                
        } catch (SQLException ex) {
            System.out.println("Error al obtener ");
        }
    
        
        return lista;
 }
public Alumno buscarAlumno(int id){
         Alumno alumno=null;
         String sql = "SELECT * FROM alumno WHERE alumno.idAlumno= ?";
         
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
            System.out.println("Error al obtener ");
        }
    
         return alumno;
         
  }  

public Materia buscarMateria(int id){
         String sql;
         Materia materia;
         sql = "SELECT * FROM materia WHERE materia.idMateria= ?";
        
        materia=new Materia();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, id);
             ResultSet rs =ps.executeQuery();
             if(rs.next()){
             materia.setIdMateria(rs.getInt(1));
             materia.setNombre(rs.getString(2));
             materia.setAnio(rs.getInt(3));
             materia.setActivo(rs.getBoolean(4));}
             
        } catch (SQLException ex) {
            System.out.println("Error al obtener ");
        }
    
         return materia;
  }    

}
    
    
