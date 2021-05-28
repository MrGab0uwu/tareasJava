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
public class Rectangulo extends Figura {

    public Rectangulo() {
        lados = new float[2];
        super.setLados();
        perimetro();
        area();
    }

    @Override
    public void perimetro() {
        perimetro = (lados[0] * 2) + (lados[1] * 2);
        System.out.println(ANSI_CYAN + "El perimetro es: " + perimetro + "u");
    }

    @Override
    public void area() {
        area = lados[0] * lados[1];
        System.out.println(ANSI_CYAN + "El area del cuadrado es: " + area + "u");
    }
}
