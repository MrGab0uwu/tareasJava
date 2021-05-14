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

    double poder;
    String tipoMagia;

    public Mago(String nombre, String raza, String genero, String faccion, String rol, int edad, String tipoMagia, double poder) {
        super(nombre, raza, genero, faccion, rol, edad);
        this.tipoMagia = tipoMagia;
        this.poder = poder;
    }

    @Override
    public void showDatos() {
        super.showDatos();
        System.out.println("Tipo de magia: " + tipoMagia + "\n"
                + "Nivel de magia: " + poder+"pts");
    }
}
