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
public class Cuadrado extends VariablesGlobales implements Figura {

    @Override
    public void setLados() {
        setLados();
        lado = leer.nextFloat();
    }

    @Override
    public void perimetro() {
        perimetro = lado * 4;
        System.out.println(ANSI_CYAN+"El perimetro es: " + perimetro + "u");
    }

    @Override
    public void area() {
        area = lado * lado;
        System.out.println(ANSI_CYAN+"El area del cuadrado es: " + area + "u");
    }

}
