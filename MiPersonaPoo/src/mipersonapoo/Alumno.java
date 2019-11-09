package mipersonapoo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dash
 */
public class Alumno {
    
    String matricula;
    String nombre;
    
    
    
    public Alumno(String matricula,String nombre){
    this.matricula=matricula;
    this.nombre=nombre;
    }
    
  public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula=matricula;
    }
    
}
