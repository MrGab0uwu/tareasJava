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
public class CarroCorriente extends SuperClase{
 
    int caballos;
    
    public CarroCorriente() {
        caballos();
        puertas();
        matricula();
        motor();
    }

    
    public void caballos(){
        System.out.println("\nTengo 200 caballos de fuerza");
    }
    
    @Override
    public void matricula() {
        matricula = 2;
        System.out.println("La matricula es: " + matricula);
    }

    @Override
    public void motor() {
        System.out.println("Soy un motor corriente");
    }
    
    @Override
        public void puertas() {
        puertas = 5;
        System.out.println("Tengo " + puertas + " puertas");
    }
}
