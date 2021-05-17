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
public class Guerrero extends Personaje {

    String tipoArmadura, tipoEspada;

    public void setGuerrero(String nombre, String raza, String genero, int edad, String faccion, String rol) {
        super.getPersonaje(nombre, raza, genero, edad, faccion, rol);
        System.out.println("Ingresa el tipo de armadura de tu guerrero: (Pesada, Ligera)");
        tipoArmadura = sc.nextLine();

        System.out.println("Ingresa el tipo de espada de tu guerrero: (Comun, Rara, Epica, Legendaria)");
        tipoEspada = sc.nextLine();

        System.out.println("Ingresa el nivel de combate de tu guerrero: ");
        poder = sc.nextInt();
    }

    @Override
    public void showDatos() {
        super.showDatos();
        System.out.println("Tipo de armadura: " + tipoArmadura + "\n"
                + "Tipo de espada: " + tipoEspada + "\n"
                + "Nivel de poder del guerrero: " + poder + "pts");
    }

}
