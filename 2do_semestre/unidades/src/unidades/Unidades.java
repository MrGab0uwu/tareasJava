/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidades;

import javax.swing.JOptionPane;

/**
 *
 * @author gab-uwu
 */
public class Unidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        descompositor unidad = new descompositor();
        int x = 0;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número de tres digitos"));
        
        unidad.setCentena(x);
        unidad.setDecena(x);
        unidad.setUnidad(x);
        unidad.getCentena();
        unidad.getDecena();
        unidad.getCentena();
        unidad.showUnidades();
    }
}
