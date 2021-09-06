/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Personaje {

    Scanner sc = new Scanner(System.in);
    String nombre, raza, genero, faccion, rol;
    int edad;
    double poder;

    public void setPersonaje() {
        System.out.println("World of Warcraft es un videojuego de rol multijugador masivo en línea desarrollado por Blizzard Entertainment.");

        System.out.println("Ingresa el nombre tu personaje");
        nombre = sc.nextLine();

        System.out.println("Ingresa la raza de tu personaje (Orco, Humano, Enano, Elfo, Draenei");
        raza = sc.nextLine();

        System.out.println("Ingresa el sexo de tu personaje (Hombre, Mujer)");
        genero = sc.nextLine();

        System.out.println("Ingresa la edad de tu personaje (solo números)");
        edad = sc.nextInt();
        sc.nextLine(); //*Agrego esto para consumir la nueva linea

        System.out.println("Ingresa la faccion de tu personaje (Horda , Alianza)");
        faccion = sc.nextLine();

        System.out.println("Ingresa la clase de tu personaje (Mago, Guerrero, Arquero)");
        rol = sc.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public String getFaccion() {
        return faccion;
    }

    public String getRol() {
        return rol;
    }

    public void getPersonaje(String nombre, String raza, String genero, int edad, String faccion, String rol) {
        this.nombre = nombre;
        this.raza = raza;
        this.genero = genero;
        this.edad = edad;
        this.faccion = faccion;
        this.rol = rol;
    }

    public void showDatos() {
        System.out.println("\nDetalles de tu personaje:\n"
                + "Nombre: " + nombre + "\n"
                + "Raza: " + raza + "\n"
                + "Genero: " + genero + "\n"
                + "Facción: " + faccion + "\n"
                + "Rol: " + rol + "\n"
                + "Edad: " + edad);
    }
}
