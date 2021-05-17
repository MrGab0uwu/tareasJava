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
public class promedio {
    Scanner leer = new Scanner(System.in);
    double calif,result,prom,promGen;
    int iteraccion;
    double[][] califs = new double[100][100];
    String[] nombre = new String[100];
    
    public promedio(){
        iteraccion = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el número de alumnos que desea capturar"));
        iteracciones(iteraccion);
        
    }
    
    public void iteracciones(int iteraccion){
        
        for(int i = 0; i<iteraccion; i++){
            this.nombre[i] = JOptionPane.showInputDialog("¿Nombre del alumno #"+(i+1)+"?");
            for (int j = 0; j < 4; j++) {
                this.calif = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion número "+(j+1)+" del #"+(i+1)+" alumno"));
                this.califs[i][j] = califs[i][j] + calif;
            }       
        }
        showCalif(iteraccion);  
    }
    
    public String[] getNames(){
        return nombre;
    }
    
    public double[][] getCalif(){
        return califs;
    }
    
    void showCalif(int iteraccion){
        for (int i = 0; i < iteraccion; i++) {
             System.out.println("Nombre del alumno");
             System.out.println(nombre[i]);
            for (int j = 0; j < 4; j++) {
                JOptionPane.showMessageDialog(null,"Calificacion "+(j+1)+"\n"+califs[i][j]);
                prom = (prom + califs[i][j]);
                if (j == 3) {
                    JOptionPane.showMessageDialog(null,"Promedio de: "+nombre[i]+"\n"+prom/4);
                    prom = 0;
                }
                  promGen = (promGen + califs[i][j]);
            }
        }
        JOptionPane.showMessageDialog(null,"Promedio General:\n"+promGen/(iteraccion*4));
    }

    
}
