/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elecciones;

/**
 *
 * @author Gabriel
 */
public class Alfa extends Eleccion {

    public Alfa() {
        candidatoNombre1 = "Gabriel E";
        candidatoNombre2 = "Alan B";
        candidatoNombre3 = "Angel C";
        super.setVotos(candidatoNombre1, candidatoNombre2, candidatoNombre3);
        super.getVotos();
        super.setCargos();
    }

    @Override
    public void resultadoPresidente() {
        System.out.println("Presidente de ALFA: " + presidente);
    }

    @Override
    public void resultadoVicepresidente() {
        System.out.println("Vicepresidente de ALFA: " + vicepresidente);
    }

    @Override
    public void resultadoTesorero() {
        System.out.println("Tesorero de ALFA: " + tesorero);
    }

}
