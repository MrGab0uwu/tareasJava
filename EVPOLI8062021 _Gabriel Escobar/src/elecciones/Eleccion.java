/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elecciones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public abstract class Eleccion {

    Scanner sc = new Scanner(System.in);
    int[] votosGenerales = new int[10];
    int candidatoVotos1, candidatoVotos2, candidatoVotos3;
    String candidatoNombre1 = " ", candidatoNombre2, candidatoNombre3, presidente, vicepresidente, tesorero;

    public void setVotos(String candidatoNombre1, String candidatoNombre2, String candidatoNombre3) {
        this.candidatoNombre1 = candidatoNombre1;
        this.candidatoNombre2 = candidatoNombre2;
        this.candidatoNombre3 = candidatoNombre3;
        for (int i = 0; i < 10; i++) {
            System.out.println("¿Por quien desea votar \n 1.- " + candidatoNombre1 + "\n 2.- " + candidatoNombre2 + "\n 3.-" + candidatoNombre3 + "? (Digite el número que pertenece al candidato)");
            votosGenerales[i] = sc.nextInt();
            if (votosGenerales[i] != 1 && votosGenerales[i] != 2 && votosGenerales[i] != 3) {
                votosGenerales[i] = 0;
                System.out.println("Voto Nulo");
            }
        }
    }

    public void getVotos() {
        for (int i = 0; i < 10; i++) {
            switch (votosGenerales[i]) {
                case 1 ->
                    candidatoVotos1++;
                case 2 ->
                    candidatoVotos2++;
                case 3 ->
                    candidatoVotos3++;
            }
        }
    }

    public void setCargos() {
        Random r = new Random();
        int rifa = r.nextInt(2);  // Entre 0 y 1.

        if (candidatoVotos1 == candidatoVotos2) {
            System.out.println("El número de votos a favor de dos o más candidatos o listas es igual, la elección se decide a la suerte, candidato :" + candidatoNombre1 + "número 0, candidato :" + candidatoNombre2 + "número 1");
            presidente = candidatoNombre3;
            switch (rifa) {
                case 0 -> {
                    vicepresidente = candidatoNombre1;
                    tesorero = candidatoNombre2;
                }
                case 1 -> {
                    vicepresidente = candidatoNombre3;
                    tesorero = candidatoNombre2;
                }
            }

        } else if (candidatoVotos2 == candidatoVotos3) {
            System.out.println("El número de votos a favor de dos o más candidatos o listas es igual, la elección se decide a la suerte, candidato :" + candidatoNombre2 + "número 0, candidato :" + candidatoNombre3 + "número 1");
            presidente = candidatoNombre1;
            switch (rifa) {
                case 0 -> {
                    vicepresidente = candidatoNombre2;
                    tesorero = candidatoNombre3;
                }
                case 1 -> {
                    vicepresidente = candidatoNombre3;
                    tesorero = candidatoNombre2;
                }
            }
        } else if (candidatoVotos3 == candidatoVotos1) {
            System.out.println("El número de votos a favor de dos o más candidatos o listas es igual, la elección se decide a la suerte, candidato :" + candidatoNombre3 + "número 0, candidato :" + candidatoNombre1 + "número 1");
            presidente = candidatoNombre2;
            switch (rifa) {
                case 0 -> {
                    vicepresidente = candidatoNombre3;
                    tesorero = candidatoNombre1;
                }
                case 1 -> {
                    vicepresidente = candidatoNombre1;
                    tesorero = candidatoNombre3;
                }
            }

        } else if (candidatoVotos1 > candidatoVotos2 && candidatoVotos2 > candidatoVotos3) { //Candidato 1
            presidente = candidatoNombre1;
            vicepresidente = candidatoNombre2;
            tesorero = candidatoNombre3;
        } else if (candidatoVotos1 > candidatoVotos2 && candidatoVotos2 < candidatoVotos3) {
            presidente = candidatoNombre1;
            vicepresidente = candidatoNombre3;
            tesorero = candidatoNombre2;
        } else if (candidatoVotos2 > candidatoVotos3 && candidatoVotos3 > candidatoVotos1) { //Candidato 2
            presidente = candidatoNombre2;
            vicepresidente = candidatoNombre3;
            tesorero = candidatoNombre1;
        } else if (candidatoVotos2 > candidatoVotos3 && candidatoVotos3 < candidatoVotos1) {
            presidente = candidatoNombre2;
            vicepresidente = candidatoNombre1;
            tesorero = candidatoNombre3;
        } else if (candidatoVotos3 > candidatoVotos1 && candidatoVotos1 > candidatoVotos2) { //Candidato 3
            presidente = candidatoNombre3;
            vicepresidente = candidatoNombre1;
            tesorero = candidatoNombre2;
        } else if (candidatoVotos3 > candidatoVotos1 && candidatoVotos1 < candidatoVotos2) {
            presidente = candidatoNombre3;
            vicepresidente = candidatoNombre2;
            tesorero = candidatoNombre1;
        }
    }

    abstract void resultadoPresidente();

    abstract void resultadoVicepresidente();

    abstract void resultadoTesorero();

}
