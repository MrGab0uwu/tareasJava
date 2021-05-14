/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import herencias.Hombre;
import herencias.Mujer;
import java.util.Scanner;

/**
 *
 * @author gab-uwu
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Hombre hombre = new Hombre();
        Mujer mujer = new Mujer();
        
        System.out.println("¿Cuantas personas desea registrar?");
        int length = sc.nextInt();
        
        hombre.setPersonData(length);
        // Se obtienen los arreglos de la clase de Personas
        String[] genero = hombre.getGender();
        int[] edad = hombre.getYearsOld();
        // Objeto clase hombre
        hombre.setManData(genero, edad);
        hombre.showManData();
        // Objeto clase mujer
        mujer.setWomanData(genero, edad);
        mujer.showWomanData();
        
    }
    
}
