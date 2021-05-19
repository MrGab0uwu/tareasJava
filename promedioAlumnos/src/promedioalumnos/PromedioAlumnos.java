/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedioalumnos;

import java.util.Scanner;

/**
 *
 * @author gab-uwu
 */
public class PromedioAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int iteraccion;
        Promedio prom = new Promedio();
        System.out.println("Ingresa el número de alumnos que desea capturar");
        iteraccion = leer.nextInt();
        prom.getNames();
        prom.getCalif();
        prom.showCalif(iteraccion);
    }
    
}
