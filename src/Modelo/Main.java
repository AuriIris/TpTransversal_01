package Modelo;

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
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
     public static void main(String[] args) {
        
             //         try{
//         Conexion con=new Conexion();
//         AlumnoData ad=new AlumnoData(con);
//         Alumno alum = new Alumno(4568,"Romina","Auriol",true,LocalDate.of(2000,9,19));
//         ad.guardarAlumno(alum);
//         }
//         catch(ClassNotFoundException ex){
//             System.out.println("en el main" + ex);
//         }
//         
//         try{
//         Conexion con=new Conexion();
//          MateriaData ad=new MateriaData(con);
//          Materia mat = new Materia(2,"Matematica",true);
//          ad.guardarMateria(mat);
//         }
//         catch(ClassNotFoundException ex){
//             System.out.println("en el main" + ex);
//         }
//         
//         try{
//         Conexion con=new Conexion();
//
//          
//          AlumnoData al= new AlumnoData(con);
//          MateriaData ma=new MateriaData(con);
//          Alumno alum = new Alumno(4568,"Romina","Auriol",true,LocalDate.of(2000,9,19));
//          .guardarAlumno(alum);
//         
//          MateriaData matD=new MateriaData(con);
//          Materia mat = new Materia(2,"Matematica",true);
//          matD.guardarMateria(mat);
//
//
//         
//         //System.out.println(al.buscarAlumno(2).toString());
//           InscripcionData ad=new InscripcionData();
//        //  Inscripcion a = new Inscripcion(ma.buscarPorID(2),5,true);
//            
//            Inscripcion a = new Inscripcion (alum ,mat , 5, true);
//         
//         }
//         catch(ClassNotFoundException ex){
//             System.out.println("en el main" + ex);
//         }
//         
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
//                 try{
//          Conexion con=new Conexion();
//          AlumnoData al= new AlumnoData(con);
//          MateriaData ma=new MateriaData(con);
//          InscripcionData ad=new InscripcionData(con);
//          Inscripcion a = new Inscripcion(al.buscarAlumno(1),ma.buscarPorID(2),5,true);
//          ad.guardarInscripcion(a);
//         }
//         catch(ClassNotFoundException ex){
//             System.out.println("en el main" + ex);
//         }


//---------------------------------------------------------------PRUEBAS PABLO-------------------------------------------------------------------------//

 try {
Conexion con = new Conexion();

//Alumno

AlumnoData alumD = new AlumnoData(con);
Alumno alum = new Alumno(425,"Pablo","Denis",true, LocalDate.of(2000,07,04));
//alumD.guardarAlumno(alum);                                                    //Ok

Alumno alum2 = new Alumno(424,"Juan","Perez",true, LocalDate.of(2000,07,04));
//alumD.guardarAlumno(alum2);                                                   //Ok

//------------------------------------------------------------------------------------------------------------------------------------------------------//

//Materia

MateriaData matD = new MateriaData(con);
Materia mat = new Materia (2,"Matematicas",true);
//matD.guardarMateria(mat);                                                     //Ok

System.out.println("");

Materia mat2 = new Materia (1,"Lengua",true);
//matD.guardarMateria(mat2);                                                    //Ok 

//------------------------------------------------------------------------------------------------------------------------------------------------------//

//Inscripcion y Metodos//

InscripcionData insD = new InscripcionData(con);
Inscripcion ins = new Inscripcion(alum,mat2,4,true);
//insD.guardarInscripcion(ins); //No ingresa el IdDeAlumno ni materia.          //Ok

System.out.println("");

Inscripcion ins2 = new Inscripcion(alum2,mat2,5,true);
//insD.guardarInscripcion(ins2); //No ingresa el IdDeAlumno ni materia.         ///NO ASIGANA EL IDMATERIA NI IDALUMNO, PROVOCA ERRORES EN METODOS SIGIENTES
                                                                                //NO PUEDE OBTENER ID DESDE LAS BASES DE DATOS.
                                                                                
//insD.bajaInscripcion(ins);                                                    //Ok 
//insD.guardarNota(1,9);                                                        //Ok

//System.out.println(insD.obtenerInscripcionesAlumno(1));                       //NO FUNCIONA POR PROBLEMA DE OBETENER ID DESDE BASE DE DATOS.
//System.out.println(insD.obtenerInscripcionesMateria(0);                       //NO FUNCIONA POR PROBLEMA DE OBETENER ID DESDE BASE DE DATOS.


//-----------------------------------------------------------------------------------------------------------------------------------------------------//

//Metodos MateriaData;

 System.out.println("");
 
 
 
 //matD.desactivarMateria(1);                                                   //Ok PROBLEMA AL OBTENER ID DESDE LA BASE DE DATOS.
 //matD.desactivarMateria(2);                                                   //Ok PROBLEMA AL OBTENER ID DESDE LA BASE DE DATOS.
 
 //matD.activarMateria(1);                                                      //Ok PROBLEMA AL OBTENER ID DESDE LA BASE DE DATOS.
 //matD.activarMateria(2);                                                      //Ok PROBLEMA AL OBTENER ID DESDE LA BASE DE DATOS.
 
 //System.out.println(matD.buscarPorID(2));                                     //Ok PROBLEMA AL OBTENER ID DESDE LA BASE DE DATOS.
 
 System.out.println("");
 
 //System.out.println(matD.buscarMateriasPorNombre("Matematicas"));             //Ok
 
 System.out.println("");
 
//System.out.println(matD.buscarTodasMaterias());                               //Ok
 
 
 Materia mat3 = new Materia (3,"Matematica",true);
 //matD.modificadarMateria(mat3,2); //Ok                                        //OK PROBLEMA AL OBTENER ID DESDE LA BASE DE DATOS.
    
 System.out.println("");

// matD.borrarMateria(1);                                                       //Ok PROBLEMA AL OBTENER ID DESDE LA BASE DE DATOS.
// matD.borrarMateria(2);                                                       //Ok PROBLEMA AL OBTENER ID DESDE LA BASE DE DATOS.

//-------------------------------------------------------------------------------------------------------------------------------------------------------//

//alumD.desactivarAlumno(1);                                                    //Ok PROBLEMA AL OBTENER ID DESDE LA BASE DE DATOS.
//alumD.desactivarAlumno(2);                                                    //Ok PROBLEMA AL OBTENER ID DESDE LA BASE DE DATOS.

     

//alumD.activarAlumno(1);                                                       //Ok PROBLEMA AL OBTENER ID DESDE LA BASE DE DATOS.
//alumD.activarAlumno(2);                                                       //Ok PROBLEMA AL OBTENER ID DESDE LA BASE DE DATOS.

     System.out.println("");
    //System.out.println(alumD.buscarAlumno(1));                                //Ok PROBLEMA AL OBTENER ID DESDE LA BASE DE DATOS.
    //System.out.println(alumD.buscarAlumno(2));                                //Ok PROBLEMA AL OBTENER ID DESDE LA BASE DE DATOS.
     
     System.out.println("");
     
//     System.out.println(alumD.buscarTodosAlumnos());                          //Ok
     
 Alumno alum3 = new Alumno(410,"Pablo","Denis",true, LocalDate.of(2000,07,04));
 //alumD.actualizarAlumno(alum3, 1);                                            //Ok PROBLEMA AL OBTENER ID DESDE LA BASE DE DATOS.
 
  //alumD.borrarAlumno(2);                                                        //OK PROBLEMA AL OBTENER ID DESDE LA BASE DE DATOS.
 
 
    } catch (ClassNotFoundException ex) {
             Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
     
     
}
}