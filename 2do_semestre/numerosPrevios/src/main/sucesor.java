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
public class sucesor {
    int sucesion=1;


    public void setSucesion(int x) {
        for (int i = 0; i <= x; i++) {
          this.sucesion *= i ;
        }
       
    }
    
    public int getSucesion() {
        return sucesion;
    }

    void showSucesion(){
        JOptionPane.showMessageDialog(null,"La sucesión factorial es: "+sucesion);
    }
    
    
    
    
}
