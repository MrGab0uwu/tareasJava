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
public class dados {
    int dado_1,dado_2,puntos, ganancia;

    
    public void setTiros(int dado_1, int dado_2) {
        this.dado_1 = dado_1;
        this.dado_2 = dado_2;
    }

    public int getTiros() {
        return dado_1+dado_2;
    }

    public void setGanancia(int i) {
        this.puntos = dado_1+dado_2;
            if (i < 4) {
                switch(puntos){
                    case 7 -> ganancia+=1000;
                    case 8 -> ganancia-=8000;
                }
            }else{
                switch(puntos){
                    case 7 -> ganancia+=500;
                    case 8 -> ganancia-=8000;
                }
            }
        
    }

    public int getGanancia() {
        return ganancia;
    }
    
    
    public void showGanancia() {
        JOptionPane.showMessageDialog(null,"El saldo final es: "+ganancia);
    }
}
