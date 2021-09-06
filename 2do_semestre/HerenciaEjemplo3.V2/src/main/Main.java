/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import clases.*;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       
        Personaje personaje = new Personaje();
        personaje.setPersonaje();
        String nombre = personaje.getNombre();
        String raza = personaje.getRaza();
        String genero = personaje.getGenero();
        int edad = personaje.getEdad();
        String faccion = personaje.getFaccion();
        String rol = personaje.getRol();

        if (rol.equalsIgnoreCase("mago")) { //Mago
            Mago mago = new Mago();
            mago.setMago(nombre, raza, genero, edad, faccion, rol);
            mago.showDatos();

        } else if (rol.equalsIgnoreCase("guerrero")) { //Guerrero
            Guerrero guerrero = new Guerrero();
            guerrero.setGuerrero(nombre, raza, genero, edad, faccion, rol);
            guerrero.showDatos();

        } else if (rol.equalsIgnoreCase("arquero")) { //Arquero
            Arquero arquero = new Arquero();
            arquero.setArquero(nombre, raza, genero, edad, faccion, rol);
            arquero.showDatos();

        } else {
            System.out.println("Ingresa una palabra valida");
        }
    }
}
