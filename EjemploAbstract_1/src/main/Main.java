/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import clases.*;
import java.util.Scanner;

/**
 *
 * @author gab-uwu
 */
public class Main {

    public static final String ANSI_GREEN = "\u001B[32m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println(ANSI_GREEN + "¿Qué figura geometrica regular desea calcular?\nCuadrado\nRectangulo\nTriangulo\nHexagono");
        String resp = leer.nextLine();

        switch (resp.toLowerCase()) {
            case "cuadrado" -> {
                Cuadrado cuadrado = new Cuadrado();
            }
            case "rectangulo" -> {
                Rectangulo rectangulo = new Rectangulo();
            }
            case "triangulo" -> {
                Triangulo triangulo = new Triangulo();
            }
            case "hexagono" -> {
                Hexagono hexagono = new Hexagono();
            }
        }

    }

}
