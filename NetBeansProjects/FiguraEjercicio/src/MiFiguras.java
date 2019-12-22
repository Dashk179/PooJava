/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dash0
 */
public class MiFiguras {
    public static void main(String[] args) {
    Triangulo triangulo1 = new Triangulo("Triangulo", 3, 4, 6);
        System.out.println(triangulo1.toString());
        
    Rectangulo rectangulo1 = new Rectangulo("Rectangulo", 4, 4, 6);
        System.out.println(rectangulo1.toString());
    
    Rombo rombo1 = new Rombo("Rombo", 4, 4, 4, 4);
        System.out.println(rombo1.toString());
        
    Cuadrado cuadrado = new Cuadrado("cuadradp", 4, 4);
        System.out.println(cuadrado.toString());
     
    TrianguloEscaleno escaleno = new TrianguloEscaleno("Triangulo escaleno", 3, 6, 8, 6, 7, 8);
         System.out.println(escaleno.toString());
         
    TrianguloIsoceles trianguloIsoceles1 = new TrianguloIsoceles("Triangulo Isoceles", 3,8 , 3);
         System.out.println(trianguloIsoceles1.toString());
         
    Trapecio trapecio1 =new Trapecio("Trapecio", 4, 15, 12, 6, 0, 0);
            
         System.out.println(trapecio1.toString());
         
         
    
    
    }
   
   
}

