/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dash
 */
public class Rombo extends Figura{
    
    private int diagonalMenor;
    private int diagonalMayor;
    private int lado;
    
    public Rombo(String nombre,int numeroLados,int diagonalMenor,int diagonalMayor,int lado){
        super(nombre, numeroLados);
        this.diagonalMenor=diagonalMenor;
        this.diagonalMayor=diagonalMayor;
        this.lado=lado;
        this.calcularArea();
        this.calcularPerimetro();
    
    }

    /**
     * @return the diagonalMenor
     */
    public int getDiagonalMenor() {
        return diagonalMenor;
    }

    /**
     * @param diagonalMenor the diagonalMenor to set
     */
    public void setDiagonalMenor(int diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    /**
     * @return the diagonalMayor
     */
    public int getDiagonalMayor() {
        return diagonalMayor;
    }

    /**
     * @param diagonalMayor the diagonalMayor to set
     */
    public void setDiagonalMayor(int diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }
     public void calcularPerimetro(){
        this.perimetro=this.getLado()*4;
    }
    
    public void calcularArea(){
        this.area=(this.getDiagonalMayor()*this.getDiagonalMenor()/2);
        
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
       @Override
    public String toString() {
        return super.toString() + "  Figura(" + "Diagonal Mayor= " + diagonalMayor + ", Diagonal Menor= " +diagonalMenor+  ')';
    }
}
