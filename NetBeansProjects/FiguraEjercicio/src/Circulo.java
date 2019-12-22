/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dash
 */
public class Circulo extends Figura{
    
    private int diametro;
    double pi=3.14;
    private int radio;
    
    public Circulo(String nombre,int numeroLados,int diametro,int radio){
        super(nombre, numeroLados);
        this.diametro=diametro;
        this.radio=radio;
        this.calcularPerimetro();
        this.calcularArea();
    
    }

    /**
     * @return the diametro
     */
    public int getDiametro() {
        return diametro;
    }

    /**
     * @param diametro the diametro to set
     */
    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
      
    public int getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }

    
    public void calcularPerimetro(){
        this.perimetro=this.getDiametro()*3;
    
    }
    
    public void calcularArea(){
        this.area=this.getDiametro()*this.getRadio()/2;
    }
}

