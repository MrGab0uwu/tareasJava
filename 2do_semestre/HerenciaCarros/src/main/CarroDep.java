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
public class CarroDep extends SuperClase {

    public CarroDep() {
        caballos();
        puertas();
        matricula();
        motor();
    }

    public void caballos() {
        System.out.println("\nTengo 500 caballos de fuerza");
    }

    @Override
    public void matricula() {
        matricula = 1;
        System.out.println("La matricula es: " + matricula);
    }

    @Override
    public void motor() {
        System.out.println("Soy un motor deportivo");
    }

    @Override
    public void puertas() {
        puertas = 10;
        System.out.println("Tengo " + puertas + " puertas");
    }
}
