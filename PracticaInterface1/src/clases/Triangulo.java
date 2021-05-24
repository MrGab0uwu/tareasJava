/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author gab-uwu
 */
public class Triangulo extends VariablesGlobales implements Figura {
    
    float[] lados = new float[4];
    float area;

    @Override
    public void setLados() {
        for (int i = 0; i < lados.length; i++) {
            System.out.println("Ingresa tu lado No." + i);
            lados[i] = leer.nextInt();
        }
    }

    @Override
    public void perimetro() {
        for (int i = 0; i < lados.length; i++) {
            area = lados[i] + lados[i + 1];
        }
    }

    @Override
    public void area() {
        System.out.println("El area del cuadrado es: " + area);
    }
    
}
