/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import elecciones.*;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String plantel,resp;

        do {
            System.out.println("¿En plantel desea votar?\nALFA - OMEGA - SIGMA (Digite el nombre)");
            plantel = sc.nextLine();

            switch (plantel.toLowerCase()) {
                case "alfa" -> {
                    Alfa alfa = new Alfa();
                    alfa.resultadoPresidente();
                    alfa.resultadoVicepresidente();
                    alfa.resultadoTesorero();
                }
                case "omega" -> {
                    Omega omega = new Omega();
                    omega.resultadoPresidente();
                    omega.resultadoVicepresidente();
                    omega.resultadoTesorero();
                }
                case "sigma" -> {
                    Sigma sigma = new Sigma();
                    sigma.resultadoPresidente();
                    sigma.resultadoVicepresidente();
                    sigma.resultadoTesorero();
                }
            }

            System.out.println("¿Desea seguir votando?");
            resp = sc.nextLine();
        } while (resp.equalsIgnoreCase("si"));

    }

}
