package encapsulamientopoo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dash
 */
public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Arturo","Perez",true);
        
        System.out.println(persona1.toString());
        System.out.println("");
        
        
        
        System.out.println("Actualizamos el nombre: ");
        persona1.setNombre("juan");
       
        System.out.println(persona1.getNombre());
        System.out.println("");
        System.out.println(persona1.toString());
        System.out.println("");
        
        
        System.out.println("Actualizamos el apellido: ");
        persona1.setApellido("Lopez");
        System.out.println(persona1.getApellido());
        System.out.println("");
        System.out.println(persona1.toString());
    }
}
