/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import clases.*;

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
        
        Hexagono hexagono = new Hexagono();
        
        hexagono.setLados();
        hexagono.perimetro();
        hexagono.getPerimetro();
        hexagono.apotema();
        hexagono.getApotema();
        hexagono.area();
        
    }
    
}
