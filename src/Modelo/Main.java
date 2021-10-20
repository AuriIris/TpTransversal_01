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
//insD.guardarInscripcion(ins2); //No ingresa el IdDeAlumno ni materia.         ///Ok SE OBTENDRA EN UN FUTURO DESDE LAS VISTAS.
                                                                                
//insD.bajaInscripcion(ins);                                                    //Ok 
//insD.guardarNota(1,9);                                                        //Ok

//System.out.println(insD.obtenerInscripcionesAlumno(1));                       //Ok SE OBTENDRA EN UN FUTURO DESDE LAS VISTAS.
//System.out.println(insD.obtenerInscripcionesMateria(0);                       //Ok SE OBTENDRA EN UN FUTURO DESDE LAS VISTAS.


//-----------------------------------------------------------------------------------------------------------------------------------------------------//

//Metodos MateriaData;

 System.out.println("");
 
 
 
 //matD.desactivarMateria(1);                                                   //Ok SE OBTENDRA EN UN FUTURO DESDE LAS VISTAS.
 //matD.desactivarMateria(2);                                                   //Ok SE OBTENDRA EN UN FUTURO DESDE LAS VISTAS.
 
 //matD.activarMateria(1);                                                      //Ok SE OBTENDRA EN UN FUTURO DESDE LAS VISTAS.
 //matD.activarMateria(2);                                                      //Ok SE OBTENDRA EN UN FUTURO DESDE LAS VISTAS.
 
 //System.out.println(matD.buscarPorID(2));                                     //Ok SE OBTENDRA EN UN FUTURO DESDE LAS VISTAS.
 
 System.out.println("");
 
 //System.out.println(matD.buscarMateriasPorNombre("Matematicas"));             //Ok
 
 System.out.println("");
 
//System.out.println(matD.buscarTodasMaterias());                               //Ok
 
 
 Materia mat3 = new Materia (3,"Matematica",true);
 //matD.modificadarMateria(mat3,2); //Ok                                        //SE OBTENDRA EN UN FUTURO DESDE LAS VISTAS.
    
 System.out.println("");

// matD.borrarMateria(1);                                                       //SE OBTENDRA EN UN FUTURO DESDE LAS VISTAS.
// matD.borrarMateria(2);                                                       //SE OBTENDRA EN UN FUTURO DESDE LAS VISTAS.

//-------------------------------------------------------------------------------------------------------------------------------------------------------//

//alumD.desactivarAlumno(1);                                                    //Ok SE OBTENDRA EN UN FUTURO DESDE LAS VISTAS.
//alumD.desactivarAlumno(2);                                                    //Ok SE OBTENDRA EN UN FUTURO DESDE LAS VISTAS.

     

//alumD.activarAlumno(1);                                                       //Ok SE OBTENDRA EN UN FUTURO DESDE LAS VISTAS.
//alumD.activarAlumno(2);                                                       //Ok SE OBTENDRA EN UN FUTURO DESDE LAS VISTAS.

     System.out.println("");
    //System.out.println(alumD.buscarAlumno(1));                                //Ok SE OBTENDRA EN UN FUTURO DESDE LAS VISTAS.
    //System.out.println(alumD.buscarAlumno(2));                                //Ok SE OBTENDRA EN UN FUTURO DESDE LAS VISTAS.
     
     System.out.println("");
     
//     System.out.println(alumD.buscarTodosAlumnos());                          //Ok
     
 Alumno alum3 = new Alumno(410,"Pablo","Denis",true, LocalDate.of(2000,07,04));
 //alumD.actualizarAlumno(alum3, 1);                                            //Ok SE OBTENDRA EN UN FUTURO DESDE LAS VISTAS.
 
  //alumD.borrarAlumno(2);                                                      //OK SE OBTENDRA EN UN FUTURO DESDE LAS VISTAS.
 
 
    } catch (ClassNotFoundException ex) {
             Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
     
     
}
}