package mipersonapoo;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dash
 */
public class PruebaPersona {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre completo: ");
        String nombreCompleto = entrada.nextLine();
        
        persona1.setNombreCompleto(nombreCompleto);
        
        System.out.println("Ingrese su genero (H: Hombre, M: Mujer, X : No Definido): ");
        
        char chrGenero = entrada.nextLine().charAt(0);
       
        
        //Asignar datos al atributo genero
        
        char genero;
        switch (chrGenero){
            case 'M':
            case 'm':
                genero = 'M';
                
                break;
            case 'H':
            case 'h':
                genero = 'H';
                
                break;
            case 'X':
            case 'x':
                genero = 'X';
                
                break;
              
        }
        persona1.setGenero(chrGenero);
        
        
        
        System.out.println("Ingrese la especialidad: "); 
        String espcialidad = entrada.nextLine();
        
        persona1.setEspecialidad(espcialidad);
        
        
        persona1.mostrarMensaje();
        
        System.out.println("Prueba :v");
    }
}
