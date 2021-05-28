/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author gab-uwu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String materia;
        
        System.out.println("Elige una materia: \n POO \nCalculo \nAlgebra Lineal");
        materia = leer.nextLine();
        
        
        Alumnos alumnos = new Alumnos(materia);
        alumnos.getPromedios();
        alumnos.showMejorPromedio();
        
    }
    
}
