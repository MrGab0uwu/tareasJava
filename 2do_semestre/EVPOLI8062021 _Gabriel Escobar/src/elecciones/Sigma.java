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
public class Sigma extends Eleccion {

    public Sigma() {
        candidatoNombre1 = "Axel F";
        candidatoNombre2 = "Arturo R";
        candidatoNombre3 = "Benjamin A";
        super.setVotos(candidatoNombre1, candidatoNombre2, candidatoNombre3);
        super.getVotos();
        super.setCargos();
    }

    @Override
    public void resultadoPresidente() {
        System.out.println("Presidente de SIGMA: " + presidente);
    }

    @Override
    public void resultadoVicepresidente() {
        System.out.println("Vicepresidente de SIGMA: " + vicepresidente);
    }

    @Override
    public void resultadoTesorero() {
        System.out.println("Tesorero de SIGMA: " + tesorero);
    }
}
