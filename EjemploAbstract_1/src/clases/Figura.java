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
public abstract class Figura {

    public static final String ANSI_CYAN = "\u001B[36m"; //Color de CIU
    Scanner leer = new Scanner(System.in);
    float[] lados;
    protected float lado, area, perimetro, base, altura, apotema;

    public void setLados() {
         for (int i = 0; i < lados.length; i++) {
            System.out.println("Ingresa un lado");
            lados[i] = leer.nextFloat();
        }
    }

    abstract void perimetro();

    abstract void area();
}
