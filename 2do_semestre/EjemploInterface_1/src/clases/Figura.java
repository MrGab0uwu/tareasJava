/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author gab-uwu
 */
public interface Figura {
    Scanner leer = new Scanner(System.in);
    
    default void setLados(){
        System.out.println("Ingresa el valor de un lado");
    }
    
    void perimetro();
    
    void area(); 

}
