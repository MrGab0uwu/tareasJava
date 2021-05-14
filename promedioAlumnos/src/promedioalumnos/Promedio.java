/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedioalumnos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author gab-uwu
 */
public class Promedio {
    Scanner leer = new Scanner(System.in);
    double calif,result,prom,promGen;
    double[][] califs = new double[100][4];
    String[] nombre = new String[100];
    
    public void setDatosAlumno(int x){
        for(int i = 0; i<x; i++){
            System.out.println("\n¿Nombre del alumno #"+(i+1)+"?");
            this.nombre[i] = leer.nextLine();
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingresa la calificacion número "+(j+1)+" del #"+(i+1)+" alumno");
                this.calif = leer.nextDouble();
                this.califs[i][j] = califs[i][j]+calif;
                this.promGen = (promGen + califs[i][j]);
                leer.nextLine(); // Salto de linea en el buffer por problema con scanner al leer enteros y despues cadenas
            }       
        }
    }
    
    public String[] getNames(){
        return nombre;
    }
    
    public double[][] getCalif(){
        return califs;
    }
    
    public double getPromGen(){
        return promGen;
    }
    
    
    public void showCalif(int iteraccion){
        for (int i = 0; i < iteraccion; i++) {
             System.out.println("\nNombre del alumno: "+nombre[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println("Calificacion "+(j+1)+": "+califs[i][j]);
                this.prom = (prom + califs[i][j]);
                if (j == 3) {
                    System.out.println("Promedio de "+nombre[i]+"\n"+prom/4);
                    this.prom = 0;
                }
            }
        }
        System.out.printf("Promedio General:%n%.2f%n",(promGen/(iteraccion*4)));
    }

    
}
