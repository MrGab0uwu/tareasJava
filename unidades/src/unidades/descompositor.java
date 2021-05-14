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
public class descompositor {
    int centena, decena, unidad;

    public void setCentena(int a) {
        this.centena = a / 100;
    }
    
    public void setDecena(int a) {
        centena = a / 100;
        this.decena = (a - (centena * 100)) / 10;
    }
    
    public void setUnidad(int a) {
        centena = a / 100;
        decena = (a - (centena * 100)) / 10;
        this.unidad = a - ((centena * 100) + (decena * 10));
    }
    
    public int getCentena(){
        return centena;
    }
   
    public int getDecena(){
        return decena;
    }
    
    public int getUnidad(){
        return unidad;
    }
    
    void showUnidades(){
        JOptionPane.showMessageDialog( null, "Tiene "+ centena +" Centenas\nTiene "+ decena +" Decenas\nTiene "+ unidad +" Unidades");
    }
}
