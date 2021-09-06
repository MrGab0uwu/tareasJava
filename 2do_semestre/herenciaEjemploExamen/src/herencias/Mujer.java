/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author gab-uwu
 */
public class Mujer extends Persona{
    
    public void setWomanData(String[] genero, int[] edad){
        for (int i = 0; i < genero.length ; i++) {
            
            if (genero[i].equalsIgnoreCase("mujer")){
                
                if (edad[i] < 18 ) {
                    this.mujer += 1;
                }else{
                    this.mujerMayor += 1;
                }

            }
        }
    }
    
    public void showWomanData(){
        System.out.println("Cantidad de personas que son mujeres: "+(mujerMayor+mujer)+"\n"
                + "Cantidad de mujeres mayores de los 18 años: "+mujerMayor+"\n"
                + "Cantidad de mujeres menores de los 18 años: "+mujer); 
    }
}
