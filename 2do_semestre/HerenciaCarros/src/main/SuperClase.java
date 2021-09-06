/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author gab-uwu
 */
public class SuperClase {

    int matricula, motor, puertas;

    public void matricula() {
        matricula = 23456;
        System.out.println("La matricula es: " + matricula);

    }

    public void motor() {
        System.out.println("Soy un motor cualquiera");
    }

    public void puertas() {
        puertas = 4;
        System.out.println("Tengo " + puertas + " puertas");
    }

}
