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
public class TiroDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dados obj = new dados();
        for (int i = 0; i < 7; i++) {
            int d1 = Integer.parseInt(JOptionPane.showInputDialog("Dado 1 Tiro:"+(i+1)));
            int d2 = Integer.parseInt(JOptionPane.showInputDialog("Dado 2 Tiro:"+(i+1))); 
            if (d1 < 7 && d1 > 0 && d2 > 0 && d2 < 7) {
                obj.setTiros(d1,d2);
                obj.getTiros();
                obj.setGanancia(i);
                obj.getGanancia();
            }else{
                i-=1;
                JOptionPane.showMessageDialog(null,"Ingresa un número correcto");
            }
        }
        obj.showGanancia();
        
    }
    
}
