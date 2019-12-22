/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dash
 */
public class Trapecio extends Figura{
    
    private int baseMayor;
    private int baseMenor;
    private int altura;
    private int ladoa;
    private int ladoc;
    
    public Trapecio(String nombre,int numeroLados,int baseMayor,int baseMenor,int altura,int ladoa,int ladoc){
        super(nombre, numeroLados);
        this.baseMayor=baseMayor;
        this.baseMenor=baseMenor;
        this.ladoa=ladoa;
        this.ladoc=ladoc;
        this.altura=altura;
        this.calcularArea();
        this.calcularPerimetro();
    
    }

    /**
     * @return the baseMayor
     */
    public int getBaseMayor() {
        return baseMayor;
    }

    /**
     * @param baseMayor the baseMayor to set
     */
    public void setBaseMayor(int baseMayor) {
        this.baseMayor = baseMayor;
    }

    /**
     * @return the baseMenor
     */
    public int getBaseMenor() {
        return baseMenor;
    }

    /**
     * @param baseMenor the baseMenor to set
     */
    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
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
    public int getLadoa() {
        return ladoa;
    }

    /**
     * @param ladoa the ladoa to set
     */
    public void setLadoa(int ladoa) {
        this.ladoa = ladoa;
    }

    /**
     * @return the ladoc
     */
    public int getLadoc() {
        return ladoc;
    }

    /**
     * @param ladoc the ladoc to set
     */
    public void setLadoc(int ladoc) {
        this.ladoc = ladoc;
    }
    
    public void calcularPerimetro(){
        this.perimetro=this.getLadoa()+this.getLadoc()+this.getBaseMayor()+this.baseMenor;
    }
    
    public void calcularArea(){
        this.area=(((this.getBaseMayor()+this.getBaseMenor())*this.getAltura())/2);
    }

      @Override
    public String toString() {
        return super.toString() + "  Figura(" + "Altura=" + altura + ", Base Mayor =" +baseMayor+ " Base Menor="+baseMenor+" LadA="+ladoa+ " LadoC="+ladoc+ ')';
    }
    
}
