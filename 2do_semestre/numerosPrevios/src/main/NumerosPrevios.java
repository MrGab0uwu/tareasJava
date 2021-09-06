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
public class NumerosPrevios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        sucesor obj = new sucesor(); 
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número: "));
        obj.setSucesion(x);
        obj.getSucesion();
        obj.showSucesion();
    }
    
}
