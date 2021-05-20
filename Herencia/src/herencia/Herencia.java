/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author JORGE SECCHI
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        HijaSuma suma = new HijaSuma();
        HijaResta resta = new HijaResta();
        HijaMultiplicacion multiplicacion = new HijaMultiplicacion();
        HijaDivision division = new HijaDivision();
        HijaPotencia potencia = new HijaPotencia();
        HijaRaiz raiz = new HijaRaiz();
        boolean done = false;
        String resp = "";

        do {
            System.out.println("\u001B[32m¿Que tipo de operación desea efectuar?\n1.-Suma\n2.-Resta\n3.-Multiplicacion\n4.-Division\n5.-Potencia\n6.-Raiz\nDigite el nombre por favor");
            resp = sc.nextLine();
            switch (resp.toLowerCase()) {
                case "suma" -> {
                    suma.setSuma();
                    suma.setResul();
                    done = true;
                }
                case "resta" -> {
                    resta.setResta();
                    resta.setResul();
                    done = true;
                }
                case "multiplicacion" -> {
                    multiplicacion.setMul();
                    multiplicacion.setResul();
                    done = true;
                }
                case "division" -> {
                    division.setDivision();
                    division.setResul();
                    done = true;
                }
                case "potencia" -> {
                    potencia.setPotencia();
                    potencia.setResul();
                    done = true;
                }
                case "raiz" -> {
                    raiz.setRaiz();
                    raiz.setResul();
                    done = true;
                }
                default -> {
                    System.out.println("Error, operacion desconocida o nombre erroneo, ingresa el nombre correctamente sin acentos y sin espacios");
                }
            }
        } while (!done);

    }

}
