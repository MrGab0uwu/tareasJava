/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author gab-uwu
 */
public class Promedios {

    protected Scanner leer = new Scanner(System.in);
    protected double[][] promedios = new double[5][4];
    protected double[] promedioAlumno = new double[5];
    protected double calificacion, mejorPromedio = 0;
    protected String materia, mejorAlumno;
    protected String[] nombres = new String[5];

    public Promedios(String materia) {
        this.materia = materia;
        System.out.println("Ingresa las calificaciones de cada alumno en la materia: " + materia);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa el nombre del #"+(i+1)+" alumno");
            nombres[i] = leer.nextLine();
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingresa la calificacion #" + (j + 1) +" de la unidad "+(j+1) +" del #" + (i + 1) + " alumno");
                calificacion = leer.nextDouble();
                promedios[i][j] = calificacion;
            }leer.nextLine();
        }
    }

    public void getPromedios() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                promedioAlumno[i] = promedioAlumno[i] + promedios[i][j];
            }
            promedioAlumno[i] = (promedioAlumno[i]/4);

            if (mejorPromedio < promedioAlumno[i]) {
                mejorAlumno = nombres[i];
                mejorPromedio = promedioAlumno[i];
            }
        }
    }

    public void showPromedios() {
        for (int i = 0; i < 5; i++) {
            System.out.println("El promedio del alumno #"+(i+1)+" es: " + promedioAlumno[i]);
        }
        System.out.println("\n");
    }
}
