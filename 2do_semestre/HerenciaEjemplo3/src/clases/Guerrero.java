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
    double poder;

    public Guerrero(String nombre, String raza, String genero, String faccion, String rol, int edad, String tipoArmadura, String tipoEspada, double poder) {
        super(nombre, raza, genero, faccion, rol, edad);
        this.tipoArmadura = tipoArmadura;
        this.tipoEspada = tipoEspada;
        this.poder = poder;
    }

    @Override
    public void showDatos() {
        super.showDatos();
        System.out.println("Tipo de armadura: " + tipoArmadura + "\n"
                + "Tipo de espada: " + tipoEspada + "\n"
                + "Nivel de poder del guerrero: " + poder+"pts");
    }

}
