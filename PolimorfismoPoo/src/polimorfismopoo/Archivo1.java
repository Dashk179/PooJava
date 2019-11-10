/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismopoo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author dash
 */
public class Archivo1 {
    
    
    
    
    public void escribir(String nombre[], double c1[], double c2[], double c3[], double prom[], int cont){
        FileOutputStream destino = null;
        File f1 = new File("/home/dash/Documentos/poo/Prueba.txt");
        try {
            destino = new FileOutputStream(f1);
            int i = 0;
            while(i < cont){
                String strNombre = nombre[i];
                for (int j=0; j<strNombre.length(); j++){
                    char c = strNombre.charAt(j);
                    destino.write((byte) c);
                }
                destino.write(',');
                String strC1 = String.valueOf(c1[i]);
                for (int j=0; j<strC1.length(); j++){
                    char c = strC1.charAt(j);
                    destino.write((byte) c);
                }
                destino.write(',');
                String strC2 = String.valueOf(c2[i]);
                for (int j=0; j<strC2.length(); j++){
                    char c = strC2.charAt(j);
                    destino.write((byte) c);
                }
                destino.write(',');
                String strC3 = String.valueOf(c3[i]);
                for (int j=0; j<strC3.length(); j++){
                    char c = strC3.charAt(j);
                    destino.write((byte) c);
                }
                destino.write(',');
                String strProm = String.valueOf(prom[i]);
                for (int j=0; j<strProm.length(); j++){
                    char c = strProm.charAt(j);
                    destino.write((byte) c);
                }
                destino.write('\n');
                i++;
            }   
        }
        catch (IOException er){
            System.out.println("Excepcion en los flujos "+ er.getMessage());
        }
        finally{
            try{
                destino.close();
            }
            catch (IOException er) {
                er.printStackTrace();
            }
        }
    }
    
    
    
    
    public void leer(){
        FileInputStream origen = null;
        File f1 = new File("/home/dash/Documentos/poo/Prueba.txt");
        try {
            origen = new FileInputStream(f1);
            int c;
            String linea[] = new String[1000];
            int i = 0;
            while((c = origen.read()) != -1){
                if (linea[i]==null)
                    linea [i] = "";
                if (c != System.getProperty("line.separator").charAt(0)){
                    linea[i] = linea[i] + (char)c;
                }
                else{
                    String datos[] = linea[i].split(","); 
                    System.out.println(i+1  + ") "+ datos[0] + ": "+ datos[1] );
                            i++;
                }
            }
        } catch (IOException er) {
            System.out.println("Excepcion en los flujos " +er.getMessage());
        }
        finally{
            try {
                origen.close();
            } 
            catch (IOException er) {
                er.printStackTrace();
            }
        }
    }
    
    public AlumnoSinEspecialidad[] leerAlumno(){
        AlumnoSinEspecialidad[] ase = new AlumnoSinEspecialidad[100];
        FileInputStream origen = null;
        File f1 = new File ("/home/dash/Documentos/poo/Prueba.txt");
        try {
            origen= new FileInputStream(f1);
            int c;
        String linea[] = new String[1000];
        int i = 0;
        while ((c = origen.read()) != -1 ){
            if (linea[i]==null)
                linea[i] = "";
            if (c != System.getProperty("linea.separator").charAt(0)) {
                linea[i] = linea[i] + (char) c;
            }
            else {
                    String datos[] = linea[i].split(","); 
            ase[i] = new AlumnoSinEspecialidad(datos[0],datos[1],
                    Double.valueOf(datos[2]).doubleValue(),
                    Double.valueOf(datos[2]).doubleValue(),
                    Double.valueOf(datos[2]).doubleValue());
            ase[i].CalcularPromedio();
            i++;
            }
        }
    
        }
    catch(IOException er){
        System.out.println("Exepcion en los flujos "+er.getMessage());
    }
        finally{
            try {
                origen.close();
            } 
            catch (IOException er) {
                er.printStackTrace();
            }
        }
        return ase;
    }
    
    public void escribirAlumno(AlumnoSinEspecialidad ase[], int cont){
        FileOutputStream destino = null;
        File f1 = new File("/home/dash/Documentos/poo/Prueba.txt");
        try {
            destino = new FileOutputStream(f1);
            int i = 0;
            while (i < cont) {
                String strMatricula = ase [i].getMatricula();
                for (int j=0; j<strMatricula.length();j++) {
                    char c = strMatricula.charAt(j);
                    destino.write((byte)c);
                    
                }
                    
                    
            }
            destino.write(',');
            String strNombre = ase[i].getNombre();
            for (int j=0; j<strNombre.length(); j++) {
                char c =strNombre.charAt(j);
                destino.write((byte)c);
            }
            destino.write(',');
            double calif[] = ase[i].getCalificaciones();
            String strc1 = String.valueOf(calif[0]);
            for (int j=0; j<strc1.length();j++) {
                char c = strc1.charAt(j);
                destino.write((byte)c);
            }
            destino.write(',');
            String strc2 = String.valueOf(calif[1]);
            
            for (int j=0; j<strc1.length();j++) {
                char c = strc2.charAt(j);
                destino.write((byte)c);
            }
            destino.write(',');
            String strc3 = String.valueOf(calif[2]);
            
            for (int j=0; j<strc1.length();j++) {
                char c = strc3.charAt(j);
                destino.write((byte)c);
            }
            destino.write(',');
            String strprom = String.valueOf(ase[i].getPromedio());
            
            for (int j=0; j<strprom.length();j++) {
                char c = strprom.charAt(j);
                destino.write((byte)c);
            }
            destino.write(System.getProperty("Linea.separador").charAt(i));
            i++;
            
        } catch (IOException er) {
            System.out.println("Excepcion en los flujos"+er.getMessage());
        }
        finally{
            try {
                destino.close();
            } catch (IOException er) {
                er.printStackTrace();
            }
        }
    }
    
}

