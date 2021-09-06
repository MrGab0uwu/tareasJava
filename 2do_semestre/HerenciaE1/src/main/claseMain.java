/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import clases.claseHija_Suma;
import clases.claseHija_Resta;
import javax.swing.JOptionPane;

/**
 *
 * @author gab-uwu
 */
public class claseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        claseHija_Suma obj = new claseHija_Suma();
        claseHija_Resta obj2 = new claseHija_Resta();
        
        obj.setDatos();
        obj.suma();
        JOptionPane.showMessageDialog(null,"El resultado de la suma es: ");
        obj.showDatos();
        
        obj2.setDatos();
        obj2.resta();
        JOptionPane.showMessageDialog(null,"El resultado de la resta es: ");
        obj2.showDatos();
    }
    
}
