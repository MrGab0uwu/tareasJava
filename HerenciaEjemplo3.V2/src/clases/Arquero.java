/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Gabriel
 */
public class Arquero extends Personaje {

    String tipoArco, tipoFlechas;

    public void setArquero(String nombre, String raza, String genero, int edad, String faccion, String rol) {
        super.getPersonaje(nombre, raza, genero, edad, faccion, rol);
        System.out.println("Ingresa el tipo del arco que usaras: (Madera, Hierro, Bronce, Plata)");
        tipoArco = sc.nextLine();

        System.out.println("Ingresa el tipo de flechas que usaras: (Fuego, Agua, Tierra, Planta, Hielo, Luz, Obscuridad)");
        tipoFlechas = sc.nextLine();

        System.out.println("Ingresa el nivel de arqueria: ");
        poder = sc.nextInt();
    }

    @Override
    public void showDatos() {
        super.showDatos();
        System.out.println("Tipo de arco: " + tipoArco + "\n"
                + "Tipo de flechas: " + tipoFlechas + "\n"
                + "Nivel de Arqueria: " + poder + "pts");
    }

}
