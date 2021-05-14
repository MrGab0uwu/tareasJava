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
    String nombre,raza,genero,faccion,rol;
    int edad;
    
    public Personaje(String nombre, String raza, String genero, String faccion, String rol, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.genero = genero;
        this.faccion = faccion;
        this.rol = rol;
        this.edad = edad;
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

    public String getFaccion() {
        return faccion;
    }

    public String getRol() {
        return rol;
    }

    public int getEdad() {
        return edad;
    }

    public void showDatos(){
        System.out.println("\nDetalles de tu personaje:\n"
                +"Nombre: "+nombre+"\n"
                + "Raza: "+raza+"\n"
                + "Genero: "+genero+"\n"
                + "Facción: "+faccion+"\n"
                + "Rol: "+rol+"\n"        
                + "Edad: "+edad);
    }
}
