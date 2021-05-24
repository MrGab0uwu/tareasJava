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
        Cuadrado cuadrado = new Cuadrado();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        Hexagono hexagono = new Hexagono();
        System.out.println("assssssssssss");

        System.out.println(ANSI_GREEN+"¿Qué figura geometrica regular desea calcular?\nCuadrado\nRectangulo\nTriangulo\nHexagono");
        String resp = leer.nextLine();

        switch (resp.toLowerCase()) {
            case "cuadrado" -> {
                cuadrado.setLados();
                cuadrado.perimetro();
                cuadrado.area();
            }
            case "rectangulo" -> {
                rectangulo.setLados();
                rectangulo.perimetro();
                rectangulo.area();
            }
            case "triangulo" -> {
                triangulo.setLados();
                triangulo.perimetro();
                triangulo.area();
            }
            case "hexagono" -> {
                hexagono.setLados();
                hexagono.perimetro();
                hexagono.apotema();
                hexagono.area();
            }
        }

    }

}
