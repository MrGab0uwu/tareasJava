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
public class Mago extends Personaje {

    String tipoMagia;

    public void setMago(String nombre, String raza, String genero, int edad, String faccion, String rol) {
        super.getPersonaje(nombre, raza, genero, edad, faccion, rol);
        System.out.println("Ingresa el tipo de magia de tu mago: (Fuego, Agua, Tierra, Planta, Hielo, Luz, Obscuridad)");
        tipoMagia = sc.nextLine();

        System.out.println("Ingresa el nivel de poder de tu mago: ");
        poder = sc.nextDouble();
    }

    @Override
    public void showDatos() {
        super.showDatos();
        System.out.println("Tipo de magia: " + tipoMagia + "\n"
                + "Nivel de magia: " + poder + "pts");
    }
}
