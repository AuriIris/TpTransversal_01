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
                System.out.println("Inscripcion guardada con exito.");
            } else {
                System.out.println("No se pudo obtener el id luego de insertar inscripcion");
            }
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una inscripcion: " + ex.getMessage());
        }
    
    }
public List<Inscripcion> obtenerInscripciones(){
      List<Inscripcion> lista= new ArrayList<>();
        try {
          
            String sql;
            
            Alumno alumno;
            Materia materia;
            Conexion p = new Conexion();
            Inscripcion ins= new Inscripcion();
            AlumnoData al=new AlumnoData(p);
            MateriaData ma=new MateriaData(p);
            sql = "SELECT * FROM inscripcion ";
            PreparedStatement ps;
            try {
                ps = con.prepareStatement(sql);
                ResultSet rs =ps.executeQuery();
                while (rs.next()){
                    ins = new Inscripcion();
                    ins.setIdInscripcion(rs.getInt(1));
                    alumno= al.buscarAlumno(rs.getInt(2));
                    ins.setAlumno(alumno);
                    materia = ma.buscarPorID(rs.getInt(3));
                    ins.setMateria(materia);
                    ins.setNota(rs.getDouble(4));
                    lista.add(ins);
                }
            } catch (SQLException ex) {
                System.out.println("Error al obtener ");
            }
        } catch (ClassNotFoundException ex) {
             System.out.println("Error al obtener "+ ex);
        }
          return lista;
}
public List<Inscripcion> obtenerInscripcionesMateria(int id){
      List<Inscripcion> lista= new ArrayList<>();
        try {
          
            String sql;
            Inscripcion ins;
            Alumno alumno;
            Materia materia;
            Conexion p = new Conexion();
            AlumnoData al=new AlumnoData(p);
            MateriaData ma=new MateriaData(p);
            sql = "SELECT *  FROM inscripcion Where idMateria=?;";
            PreparedStatement ps;
            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                ResultSet rs =ps.executeQuery();
                while (rs.next()){
                    ins = new Inscripcion();
                    ins.setIdInscripcion(rs.getInt(1));
                    
                    alumno= al.buscarAlumno(rs.getInt(2));
                    ins.setAlumno(alumno);
                    materia = ma.buscarPorID(rs.getInt(3));
                    ins.setMateria(materia);
                    ins.setNota(rs.getDouble(4));
                    lista.add(ins);
                }
                
                
            } catch (SQLException ex) {
                System.out.println("Error al obtener ");
            }
            
            
          
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
          return lista;
}
public void bajaInscripcion(Inscripcion ins){
        String sql = "UPDATE inscripcion SET `idAlumno`=?,`idMateria`=?,`nota`=?,`activo`=? WHERE `idInscripcion`=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ins.getAlumno().getIdAlumno());
            ps.setInt(2, ins.getMateria().getIdMateria());
            ps.setDouble(3, ins.getNota());
            ps.setBoolean(4, false);
            ps.setInt(5,ins.getIdInscripcion());
            ps.executeUpdate();
            ps.close();
            
            System.out.println("Inscripcion dada de baja");
        } 
        catch (SQLException ex) {
             System.out.println("Error al obtener " + ex);
          }
 }
public void guardarNota(int id, double nota){
        String sql = "UPDATE inscripcion SET nota=? WHERE idInscripcion=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2,id);
            
            ps.executeUpdate();
            ps.close();
            
            System.out.println("Nota guardada con exito.");
        } 
        catch (SQLException ex) {
             System.out.println("Error al obtener " + ex);
          }
 }
public List<Inscripcion> obtenerInscripcionesAlumno(int id){
      List<Inscripcion> lista= new ArrayList<>();
        try {
            Inscripcion ins;
            Alumno alumno = new Alumno();
            Materia materia = new Materia();
            Conexion p = new Conexion();
            AlumnoData al=new AlumnoData(p);
            MateriaData ma=new MateriaData(p);
            String sql = "SELECT *  FROM inscripcion Where idAlumno=?;";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                
                ResultSet rs =ps.executeQuery();
                while (rs.next()){
                    ins = new Inscripcion();
                    ins.setIdInscripcion(rs.getInt(1));
                    alumno= al.buscarAlumno(rs.getInt(2));
                    ins.setAlumno(alumno);
                    materia = ma.buscarPorID(rs.getInt(3));
                    ins.setMateria(materia);
                    ins.setNota(rs.getDouble(4));
                    ins.setActivo(rs.getBoolean(5));
                    
                    lista.add(ins);
                }
                
                
            } catch (SQLException ex) {
                System.out.println("Error al obtener " + ex);
            }
            
            
          
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
          return lista;
}

}

 
    
    
