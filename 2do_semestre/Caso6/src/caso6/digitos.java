/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso6;

import java.util.Scanner;

/**
 *
 * @author gab-uwu
 */
public class digitos {
    Scanner sc  = new Scanner(System.in);
    int x = 0,c = 0,d = 0,u = 0,y = 0;
    public digitos(){
        System.out.println("Ingresa un número de tres digitos");
        x = sc.nextInt();
        y = x;
        if (x < 1000) {
            //Unidad
            u = x%10;
            x = x/10;
            
            //Decena
            d = x%10;
            x = x/10;
            
            //Centena
            c = x%10;
            
            System.out.printf("El numero %d tiene %d Centenas, %d Decenas y %d Unidades%n",y,c,d,u);
        }else{
            System.out.println("Ingresa un número de tres digitos");
        }
    }
    
}
