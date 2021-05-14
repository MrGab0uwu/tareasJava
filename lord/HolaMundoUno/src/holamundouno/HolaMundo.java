/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundouno;

/**
 *
 * @author gab-uwu
 */
public class HolaMundo {
    
    String palabra;
     int z = 0;
    
    public void setPalabra(int x, int y){
        z = x+y;
        this.palabra = "Hola esquizio";   
    }
    
    public String getPalabra(){
        return palabra;
    }
    
    void showPalabra(){
        System.out.println(palabra);
        System.out.println("oa = " + z);
    }
    
    
}
