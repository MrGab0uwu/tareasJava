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
public class Hexagono extends Figura {

    public Hexagono() {
        System.out.println("Ingresa solo la medidad de un lado ya que es un hexagono regular.");
        lado = leer.nextFloat();
        perimetro();
        apotema();
        area();
    }

    @Override
    public void perimetro() {
        perimetro = lado * 6;
        System.out.println(ANSI_CYAN + "El perimetro es: " + perimetro + "u");
    }

    public void apotema() { // c² - b² = a²
        apotema = (float) Math.sqrt((float) Math.pow(lado, 2) - (float) Math.pow((lado / 2), 2));
        System.out.println(ANSI_CYAN + "El valor de la apotema es: " + apotema + "u");
    }

    @Override
    public void area() {
        area = (perimetro * apotema) / 2;
        System.out.println(ANSI_CYAN + "El area del cuadrado es: " + area + "u");
    }

}
