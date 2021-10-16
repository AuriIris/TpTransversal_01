package Vistas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Modelo.Alumno;
import Data.AlumnoData;
import Data.InscripcionData;
import Data.MateriaData;
import Modelo.Conexion;
import Modelo.Inscripcion;
import Modelo.Materia;
import java.time.LocalDate;
import javax.swing.JOptionPane;
public class Main {
     public static void main(String[] args) {
//         try{
//         Conexion con=new Conexion();
//          AlumnoData ad=new AlumnoData(con);
//         Alumno a = new Alumno(4568,"Romina","Auriol",true,LocalDate.of(2000,9,19));
//         ad.guardarAlumno(a);
//         }
//         catch(ClassNotFoundException ex){
//             System.out.println("en el main" + ex);
//         }
//         try{
//         Conexion con=new Conexion();
//          MateriaData ad=new MateriaData(con);
//         Materia a = new Materia(2,"Matematica",true);
//         ad.guardarMateria(a);
//         }
//         catch(ClassNotFoundException ex){
//             System.out.println("en el main" + ex);
//         }
//         try{
//          Conexion con=new Conexion();
//          AlumnoData al= new AlumnoData(con);
//          MateriaData ma=new MateriaData(con);
//          ;
//          InscripcionData ad=new InscripcionData(con);
//         Inscripcion a = new Inscripcion(al.buscarAlumno(4568),ma.buscarPorID(2),5,true);
//         ad.guardarInscripcion(a);
//         }
//         catch(ClassNotFoundException ex){
//             System.out.println("en el main" + ex);
//         }
// try{
//          Conexion con=new Conexion();
//          AlumnoData al= new AlumnoData(con);
//          //JOptionPane.showMessageDialog(null, al.buscarAlumno(1).toString());
//         //System.out.println(al.buscarAlumno(1).toString());                                                                                                                                     JOptionPane.showMessageDialog(null, al.buscarAlumno(4568).toString());
//         //al.buscarAlumno(4568),ma.buscarPorID(2),5,true);
//         //ad.guardarInscripcion(a);
//         }
//         catch(ClassNotFoundException ex){
//             System.out.println("en el main" + ex);
//         }
//            
                 try{
          Conexion con=new Conexion();
          AlumnoData al= new AlumnoData(con);
          MateriaData ma=new MateriaData(con);
          InscripcionData ad=new InscripcionData(con);
          Inscripcion a = new Inscripcion(al.buscarAlumno(1),ma.buscarPorID(2),5,true);
          ad.guardarInscripcion(a);
         }
         catch(ClassNotFoundException ex){
             System.out.println("en el main" + ex);
         }
     }
}
