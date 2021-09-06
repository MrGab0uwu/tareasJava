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
public class Hombre extends Persona{
    
    public void setManData(String[] genero, int[] edad){
        for (int i = 0; i < genero.length ; i++) {
            
            if (genero[i].equalsIgnoreCase("hombre")){
                
                if (edad[i] < 18 ) {
                    this.hombre += 1;
                }else{
                    this.hombreMayor += 1;
                }

            }
            
        }
    }
    
    public void showManData(){
        System.out.println("Cantidad de personas que son hombres: "+(hombreMayor+hombre)+"\n"
                + "Cantidad de hombres mayores de los 18 años: "+hombreMayor+"\n"
                + "Cantidad de hombres menores de los 18 años: "+hombre); 
    }
    
}
