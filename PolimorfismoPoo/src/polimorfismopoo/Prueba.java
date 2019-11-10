/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismopoo;

/**
 *
 * @author dash
 */
public class Prueba {

    public static void main(String[] args) {
    
        
        
        /*AlumnoSinEspecialidad as = new AlumnoSinEspecialidad("01", "Arturo", 8, 9, 10);
        as.CalcularPromedio();

        System.out.println(as.toString());
        
        as.setCalificaciones(8, 10, 7);
        as.CalcularPromedio();
        as.setNombre("Arturo Perez");
        
        System.out.println(as.toString());*/
       
 
        
        Archivo1 pruebar = new Archivo1();
        
        String nombre[]={"juan perez a ","Luis perez b "};
        double c1[]={10,6};
        double c2[]={9,7};
        double c3[]={6,5};
        double prom[]={0};
        
        
        pruebar.escribir(nombre, c1, c2, c3, prom, 1);
        pruebar.leer();
        
        
        
        
        
        
        
        
        
        
    
    }
    
    

}
