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
    double poder;

    public Arquero(String nombre, String raza, String genero, String faccion, String rol, int edad, String tipoArco, String tipoFlechas, double poder) {
        super(nombre, raza, genero, faccion, rol, edad);
        this.tipoArco = tipoArco;
        this.tipoFlechas = tipoFlechas;
        this.poder = poder;
    }

    @Override
    public void showDatos() {
        super.showDatos();
        System.out.println("Tipo de arco: " + tipoArco + "\n"
                + "Tipo de flechas: " + tipoFlechas + "\n"
                + "Nivel de Arqueria: " + poder+"pts");
    }

}
