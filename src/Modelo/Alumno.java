/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author martinbordon
 */
public class Alumno {
   private int idAlumno;
   private int legajo;
   private String nombre;
   private String apellido;
   private boolean activo;
   private LocalDate fechaNac;
    


  public Alumno(int idAlumno,int legajo, String nombre, String apellido, boolean activo, LocalDate fechaNac) {

        this.idAlumno = idAlumno;
        this.legajo=legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.activo = activo;
        this.fechaNac = fechaNac;

   }

    public Alumno(int legajo,String nombre, String apellido, boolean activo, LocalDate fechaNac) {
        this.legajo=legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.activo = activo;
        this.fechaNac = fechaNac;
    }
    
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
  
    public Alumno() {
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellido=" + apellido + ", activo=" + activo + ", fechaNac=" + fechaNac + '}';
    }
    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

}