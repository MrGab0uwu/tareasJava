/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosher;

import java.util.Scanner;

/**
 *
 * @author JORGE SECCHI
 */
public class DatosHer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        Alumnos alumno = new Alumnos();
        Profesor profesor = new Profesor();
        String persona;
        boolean done = false;

        while (!done) {

            System.out.println("Base de datos del TECNM Minatitlan\nA quien desea registrar ¿Alumno o Profesor?");
            persona = sc.nextLine();

            if (persona.equalsIgnoreCase("alumno")) {
                alumno.setCaptura();
                alumno.showDatos();
                done = true;
            } else if (persona.equalsIgnoreCase("profesor")) {
                profesor.setCaptura();
                profesor.showDatos();
                done = true;
            } else {
                System.out.println("Ingresa a la persona correcta\n");
            }

        }

    }

}
