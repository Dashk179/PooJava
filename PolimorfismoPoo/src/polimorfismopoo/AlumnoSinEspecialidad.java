/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismopoo;

import java.util.Arrays;

/**
 *
 * @author dash
 */
public class AlumnoSinEspecialidad extends Alumno{
    
       public AlumnoSinEspecialidad(String Matricula, String Nombre, double Calif1, double Calif2, double Calif3) {
        super(Matricula, Nombre, Calif1, Calif2, Calif3);
    }
    
    @Override
    public double[] getCalificaciones(){
        double calif[] = new double[3];
        calif[0] = this.Calif1;
        calif[1] = this.Calif2;
        calif[2] = this.Calif3;
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
    
    @Override
    public void setCalificaciones(double Calif1,double Calif2, double Calif3){
        this.Calif1 = Calif1;
        this.Calif2 = Calif2;
        this.Calif3 = Calif3;
    }
   
    @Override
    public void CalcularPromedio(){
        double calif[] = this.getCalificaciones();
        super.Promedio = (calif[0] + calif[1] + calif[2])/3;
    }
    
    public void CalcularPromedio(double calif1, double calif2, double calif3){
        this.setCalificaciones(calif1, calif2, calif3);
        double calif[] = {calif1, calif2, calif3};
        super.Promedio = (calif[0] + calif[1] + calif[2])/3;
    }
    
    @Override
    public String toString(){
        return String.format("Matricula: %s%nNombre: %s%nCalificaciones: %s%nPromedio: %s%n", this.getMatricula(),this.getNombre(),Arrays.toString(this.getCalificaciones()),this.getPromedio());
    }
}

