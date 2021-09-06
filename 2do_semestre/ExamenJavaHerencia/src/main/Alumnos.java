/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author gab-uwu
 */
public class Alumnos extends Promedios {

    public Alumnos(String materia) {
        super(materia);

    }

    public void showMejorPromedio() {
        System.out.println("Promedios de la materia :" + materia + "\n");
        super.showPromedios();
        System.out.println("El mayor promedio del curso es de"+mejorAlumno +"con :"+ mejorPromedio);
    }

}
