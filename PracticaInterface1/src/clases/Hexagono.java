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
public class Hexagono extends VariablesGlobales implements Figura {

    float apotema = 0;

    @Override
    public void setLados() {
        System.out.println("Ingresa solo la medidad de un lado ya que es un hexagono regular.");
        lado = leer.nextInt();
    }

    @Override
    public void perimetro() {
        perimetro = lado * 6;
        System.out.println("El perimetro es: " + perimetro);
    }

    public void apotema() { // c² - b² = a²
        apotema = (float) Math.sqrt((float) Math.pow(lado, 2) - (float) Math.pow((lado / 2), 2));
        System.out.println("El valor de la apotema es: " + apotema);
    }
    
    public float getApotema(){
        return apotema;
    }
    

    @Override
    public void area() {
        area = (perimetro * apotema) / 2;
        System.out.println("El area del cuadrado es: " + area);
    }

}
