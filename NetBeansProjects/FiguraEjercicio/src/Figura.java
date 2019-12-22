/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dash
 */
public class Figura {
    private String nombre;
    private int numeroLados;
    protected int area;
    protected float perimetro;
    
    public Figura(){}
    
    public Figura(String nombre,int numeroLados){
        this.nombre=nombre;
        this.numeroLados=numeroLados;
    
    }

    /**
     * @return the numeroLados
     */
    public int getNumeroLados() {
        return numeroLados;
    }

    /**
     * @param numeroLados the numeroLados to set
     */
    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    /**
     * @return the area
     */
    public int getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(int area) {
        this.area = area;
    }

    
    public float getPerimetro() {
        return perimetro;
    }
    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }



    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      @Override
    
    public String toString(){
        return "Figura("+
                "  Nombre de la figura = " + nombre +
                "  Numero de lados = " + numeroLados +  
                ", Area = "   + area +
                ", Perimetro = "  + perimetro + 
                ")";
    
}

   
}
    

