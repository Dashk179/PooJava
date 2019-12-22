/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dash
 */
public class Triangulo extends Figura{
    
    
    private int altura;
    private int base;
    
  
    
    
    
    public Triangulo(String nombre,int numeroLados,int altura,int base){
    super(nombre,numeroLados);
    this.altura=altura;
    this.base=base;
    this.calcularPerimetro();
    this.calcularArea();
    
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }
    
    public void calcularPerimetro(){
        this.perimetro=this.getBase()*3;
    }
    
    public void calcularArea(){
        this.area=(this.getArea()*this.getAltura()/2);
    }
        @Override
    public String toString() {
        return super.toString() + "  Figura(" + "Altura" + altura + ", Base=" +base+  ')';
    }
    
    }
    

