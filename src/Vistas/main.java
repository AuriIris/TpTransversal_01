/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Data.InscripcionData;
import Modelo.Conexion;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Romi
 */
public class main {
     public static void main(String[] args) {
         try {
             Conexion con =new Conexion();
             InscripcionData inscripcionData= new InscripcionData(con);
             System.out.println(inscripcionData.obtenerInscripcionesAlumno(1));
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
}
