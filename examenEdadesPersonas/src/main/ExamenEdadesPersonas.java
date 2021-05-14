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
public class ExamenEdadesPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mayorDeEdad obj = new mayorDeEdad();
        
        int n_personas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de personas a censar"));
        
        for (int i = 0; i < n_personas; i++) {

            String genero = JOptionPane.showInputDialog("Ingrese su genero");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad #" + (+i + 1)));
            obj.setEdad(edad, genero);

        }
        obj.getMayorMujer();
        obj.getMenorMujer();
        obj.getTotalMujer();
        obj.getMayorHombre();
        obj.getMenorHombre();
        obj.getTotalHombre();

        obj.showDatos();
    }

}
