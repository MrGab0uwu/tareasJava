/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parimparcero;

import java.util.Scanner;

/**
 *
 * @author gab-uwu
 */
public class ParImparCero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = 0, cPares = 0,cImpares=0;
        String genero  = "";
        
        for (int i = 0; i <6; i++) {
            System.out.println("Ingresa cinco numeros, digita el número #"+(i+1));
            genero = sc.nextLine();
            
            if (genero.equalsIgnoreCase("masculino")) {
                cPares++;
            }else{
                cImpares++;
            }
    
        }
        System.out.printf("Hay %d hombres, %d mujeres%n",cPares,cImpares);
    }
}
