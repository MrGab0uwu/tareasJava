/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casodeestudio10;

import java.util.Scanner;

/**
 *
 * @author gab-uwu
 */
public class serieNumerica {
    Scanner sc = new Scanner(System.in);
    int x = 0, y=0;
   
    
    public void GetDatos (){
        
        System.out.println("Ingresa El Valor En Que Se Inicia El Rango:");
        x = sc.nextInt();
        System.out.println("Ingresa El Segundo Valor En Que Se Inicia El Rango:");
        y = sc.nextInt();
        System.out.println("Serie númerica: ");
        

    }
    public void showSerie (){
        if (x > y) {
            for (int i = x; i >= y ; i--){
                System.out.print(i+" ");
            }
        }else{
            for (int i = x; i <= y ; i++){
                System.out.print(i+" ");
            }            
        }
    }
    
}
