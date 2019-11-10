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
public class AlumnoConEspecialidad extends AlumnoSinEspecialidad{

      private double Calif4;
    
    public AlumnoConEspecialidad(String Matricula, String Nombre, double Calif1, double Calif2, double Calif3,double Calif4) {
        super(Matricula, Nombre, Calif1, Calif2, Calif3);
        this.Calif4 =  Calif4;
    }
    
   @Override
    public double[] getCalificaciones(){
        double calif[] = new double[4];
        calif[0] = this.Calif1;
        calif[1] = this.Calif2;
        calif[2] = this.Calif3;
        calif[3] = this.Calif4;
        return calif;
    }
    
    @Override
    public double getPromedio(){
        return this.Promedio;
    }
    
    @Override
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public void setCalificaciones(double Calif1,double Calif2, double Calif3, double Calif4){
        this.Calif1 = Calif1;
        this.Calif2 = Calif2;
        this.Calif3 = Calif3;
        this.Calif4 = Calif4;
    }
   
    @Override
    public void CalcularPromedio(){
        double calif[] = this.getCalificaciones();
        super.Promedio = (this.Calif1 + this.Calif2 + this.Calif3 + this.Calif4)/4;
    }
    
    public void CalcularPromedio(double calif1, double calif2, double calif3, double calif4){
        this.setCalificaciones(calif1, calif2, calif3, calif4);
        double calif[] = {calif1, calif2, calif3, calif4};
        super.Promedio = (calif[0] + calif[1] + calif[2] + calif[3])/4;
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
   
//    
    
    
}
