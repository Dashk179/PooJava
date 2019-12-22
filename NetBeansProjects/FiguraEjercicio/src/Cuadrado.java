/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dash
 */
public class Cuadrado extends Figura{
    private int lado;
    
    
    public Cuadrado(String nombre,int numeroLados,int lados){
        super(nombre, numeroLados);
        this.lado=lados;
    
    }

    /**
     * @return the lado
     */
    public int getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public void calcularPerimetro(){
        this.perimetro=this.getLado()*4;
    }
    
    public void calcularArea(){
        this.area=this.getLado()*this.getLado();
    }
    
    @Override
    public String toString() {
        return super.toString() + "  Figura(" + "Lados"+lado+  ')';
    }
}
