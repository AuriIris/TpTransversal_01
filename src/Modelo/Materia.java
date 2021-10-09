/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author martinbordon
 */
public class Materia {
   
    private int idMateria;
    private int anio;
    private String nombre;
    private boolean activo;

    public Materia(int idMateria, int anio, String nombre, boolean activo) {
        this.idMateria = idMateria;
        this.anio = anio;
        this.nombre = nombre;
        this.activo = activo;
    }

    public Materia(int anio, String nombre, boolean activo) {
        this.anio = anio;
        this.nombre = nombre;
        this.activo = activo;
    }

    public Materia() {
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
    
}
