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
public class Omega extends Eleccion {

    public Omega() {
        candidatoNombre1 = "Novelo S";
        candidatoNombre2 = "Clemente M";
        candidatoNombre3 = "Morgan H";
        super.setVotos(candidatoNombre1, candidatoNombre2, candidatoNombre3);
        super.getVotos();
        super.setCargos();
    }

    @Override
    public void resultadoPresidente() {
        System.out.println("Presidente de OMEGA: " + presidente);
    }

    @Override
    public void resultadoVicepresidente() {
        System.out.println("Vicepresidente de OMEGA: " + vicepresidente);
    }

    @Override
    public void resultadoTesorero() {
        System.out.println("Tesorero de OMEGA: " + tesorero);
    }
}
