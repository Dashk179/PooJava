/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dash
 */
public class TrianguloEscaleno extends Figura {
    
    private int altura;
    private int base;
    private int ladoa;
    private int ladob;
    private int ladoc;
    
    public TrianguloEscaleno(String nombre,int numeroLados,int altura,int base,int ladoa,int ladob,int ladoc){
        super(nombre, numeroLados);
        this.altura=altura;
        this.base=base;
        this.ladoa=ladoa;
        this.ladob=ladob;
        this.ladoc=ladoc;
        this.calcularArea();
        this.calcularPerimetro();
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
     * @return the ladob
     */
    public int getLadob() {
        return ladob;
    }

    /**
     * @param ladob the ladob to set
     */
    public void setLadob(int ladob) {
        this.ladob = ladob;
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
        this.perimetro=this.getLadoa()+this.getLadob()+this.getLadoc();
    
    }
    public void calcularArea(){
        this.area=(this.getBase()*this.getAltura()/2);
        
    }
        @Override
    public String toString() {
        return super.toString() + "  Figura(" + "Altura" + altura + ", Base=" +base+  ')';
    }

}
    

