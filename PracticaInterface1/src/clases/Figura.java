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
    
    void setLados();
    
    void perimetro();
    
    void area();
    

}
