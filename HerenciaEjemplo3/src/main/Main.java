/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import clases.Arquero;
import clases.Guerrero;
import clases.Mago;
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
        System.out.println("World of Warcraft es un videojuego de rol multijugador masivo en línea desarrollado por Blizzard Entertainment.");

        System.out.println("Ingresa el nombre tu personaje");
        String nombre = sc.nextLine();

        System.out.println("Ingresa la raza de tu personaje (Orco, Humano, Enano, Elfo, Draenei");
        String raza = sc.nextLine();

        System.out.println("Ingresa el genero de tu personaje (Hombre, Mujer)");
        String genero = sc.nextLine();

        System.out.println("Ingresa la edad de tu personaje (solo números)");
        int edad = sc.nextInt();
        sc.nextLine(); //*Agrego esto para consumir la nueva linea

        System.out.println("Ingresa la faccion de tu personaje (Horda , Alianza)");
        String faccion = sc.nextLine();

        System.out.println("Ingresa la clase de tu personaje (Mago, Guerrero, Arquero)");
        String rol = sc.nextLine();

        if (rol.equalsIgnoreCase("mago")) { //Mago
            System.out.println("Ingresa el tipo de magia de tu mago: (Fuego, Agua, Tierra, Planta, Hielo, Luz, Obscuridad)");
            String tipoMagia = sc.nextLine();

            System.out.println("Ingresa el nivel de poder de tu mago: ");
            double poder = sc.nextDouble();

            Mago mago = new Mago(nombre, raza, genero, faccion, rol, edad, tipoMagia, poder);
            mago.showDatos();
            
        } else if (rol.equalsIgnoreCase("guerrero")) { //Guerrero
            System.out.println("Ingresa el tipo de armadura de tu guerrero: (Pesada, Ligera)");
            String tipoArmadura = sc.nextLine();
            
            System.out.println("Ingresa el tipo de espada de tu guerrero: (Comun, Rara, Epica, Legendaria)");
            String tipoEspada = sc.nextLine();

            System.out.println("Ingresa el nivel de combate de tu mago: ");
            double poder = sc.nextInt();

            Guerrero guerrero = new Guerrero(nombre, raza, genero, faccion, rol, edad, tipoArmadura, tipoEspada, poder);
            guerrero.showDatos();
            
        } else if (rol.equalsIgnoreCase("arquero")) { //Arquero
            System.out.println("Ingresa el tipo del arco que usaras: (Madera, Hierro, Bronce, Plata)");
            String tipoArco = sc.nextLine();
            
            System.out.println("Ingresa el tipo de flechas que usaras: (Fuego, Agua, Tierra, Planta, Hielo, Luz, Obscuridad)");
            String tipoFlechas = sc.nextLine();
            
            System.out.println("Ingresa el nivel de arqueria: ");
            double poder = sc.nextInt();

            Arquero arquero = new Arquero(nombre, raza, genero, faccion, rol, edad, tipoArco, tipoFlechas, poder);
            arquero.showDatos();
            
        } else {
            System.out.println("Ingresa una clase valida");
        }

    }

}
