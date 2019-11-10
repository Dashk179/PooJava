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
public  abstract class Alumno {
   protected final String Matricula;
    protected String Nombre;
    protected double Calif1;
    protected double Calif2;
    protected double Calif3;
    protected double Promedio;
    
    public Alumno(String Matricula, String Nombre, double Calif1, double Calif2, double Calif3){
        this.Matricula = Matricula;
        this.Nombre = Nombre;
        this.Calif1 = Calif1;
        this.Calif2 = Calif2;
        this.Calif3 = Calif3;
    }
    
    public String getMatricula(){
        return this.Matricula;
    }
    
    public String getNombre(){
        return this.Nombre;
    }
    
    public double[] getCalificaciones(){
        double calif[] = new double[3];
        calif[0] = this.Calif1;
        calif[1] = this.Calif2;
        calif[2] = this.Calif3;
        return calif;
    }
    
    public double getPromedio(){
        return this.Promedio;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public void setCalificaciones(double Calif1,double Calif2, double Calif3){
        this.Calif1 = Calif1;
        this.Calif2 = Calif2;
        this.Calif3 = Calif3;
    }
   
    public abstract void CalcularPromedio();
    
    
    @Override
    public String toString(){
        return String.format("Matricula: %s%nNombre: %s%nCalificaciones: %s%nPromedio: %s%n", this.getMatricula(),this.getNombre(),this.getCalificaciones(),this.getPromedio());
    }
    
    
}
