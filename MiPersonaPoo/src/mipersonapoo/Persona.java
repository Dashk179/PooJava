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
public class Persona {
    
    private String nombreCompleto;
    private char genero;
    private String especialidad;

    
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    public void setNombreCompleto(String nombreCompleto){
        this.nombreCompleto= nombreCompleto;
    }
    
    
    public String getGenero(){
        String strGenero;
        switch (this.genero) {
            case 'M':
                strGenero = "Mujer";
                break;
            case 'H':
                strGenero = "Hombre";
                break;
            default:
                strGenero = "No definido";
            }
        return strGenero;
    }
    
    public void setGenero(char genero) {
        this.genero=genero;
    
    }
    
    
    public String getEspecialidad(){
        return especialidad;
    }
    
    public void setEspecialidad(String espacialidad){
    this.especialidad=espacialidad;
    }
    
    
    public void mostrarMensaje(){
    String strsMensaje;
    strsMensaje = "Nombre completo: " +nombreCompleto;
    strsMensaje +="\nGenero: " + genero;
    strsMensaje +="\nEspecialidad: " + especialidad;
    strsMensaje += "";
    System.out.println(strsMensaje);
    }
    
    
    
}
