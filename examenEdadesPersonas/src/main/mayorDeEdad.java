/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author gab-uwu
 */
public class mayorDeEdad {

    int ac1, ac2, ac3, ac4, ac5, ac6;//contador de edad

    public void setEdad(int edad, String genero) {

        if (genero.equalsIgnoreCase("Mujer")) {
            if (edad > 18) { // Edad mayor
                this.ac1 += 1;//mayor
            } else {
                this.ac2 += 1;//menor
            }
            this.ac3 += 1;//total
        } else if (genero.equalsIgnoreCase("Hombre")) {
            if (edad > 18) { //Edad mayor
                this.ac4 += 1;//mayor
            } else {
                this.ac5 += 1;//menor
            }
            this.ac6 += 1;//total

        } else {
            JOptionPane.showMessageDialog(null, "Ingresa un genero correcto");
        }
    }
    
    //Metodos para edades Femeninas
    public int getMayorMujer() {
        
        return ac1;
    }

    public int getMenorMujer() {

        return ac2;
    }
    
    public int getTotalMujer() {

        return ac3;
    }
    
    //Metodos para edades Masculinas
    public int getMayorHombre() {

        return ac4;
    }

    public int getMenorHombre() {

        return ac5;
    }

    public int getTotalHombre() {

        return ac6;

    }
    
    public void showDatos(){
        //Mujeres mayores de edad
        JOptionPane.showMessageDialog(null, "Mujeres mayores: " + getMayorMujer());
        //Mujeres menores de edad
        JOptionPane.showMessageDialog(null, "Mujeres menores: " + getMenorMujer());
        //Total mujeres
        JOptionPane.showMessageDialog(null, "Total de mujeres: " + getTotalMujer());

        //Hombres mayores de edad
        JOptionPane.showMessageDialog(null, "Hombres mayores: " + getMayorHombre());
        //Hombres menores de edad
        JOptionPane.showMessageDialog(null, "Hombres menores: " + getMenorHombre());
        //Total hombres
        JOptionPane.showMessageDialog(null, "Total de hombres: " + getTotalHombre());
    }

}
