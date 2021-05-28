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
public class Triangulo extends Figura {
    
    public Triangulo() {
        lados = new float[2];
        System.out.println("Ingresa el valor de la base del triangulo.");
        base = leer.nextFloat();
        System.out.println("Ingresa el valor de la altura del triangulo.");
        altura = leer.nextFloat();
        super.setLados();
        perimetro();
        area();
    }

    @Override
    public void perimetro() {
        perimetro = lados[0] + lados[1] + base;
        System.out.println(ANSI_CYAN + "El perimetro del triangulo es: " + perimetro + "u");
    }

    @Override
    public void area() {
        area = base * altura / 2;
        System.out.println(ANSI_CYAN + "El area del triangulo es: " + area + "u");
    }
}
