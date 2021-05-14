/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso8;

import java.util.Scanner;

/**
 *
 * @author gab-uwu
 */
public class ordenInverso {
        int x=0;
    int[] lista = new int[3];
    Scanner leer = new Scanner(System.in);
    
    public ordenInverso(){// Funcion Constructor
        System.out.println("Ingresa un número de cuatro digitos");
        x = leer.nextInt();
        separadorDigitos(x);
        showOrden();
    }
    
    public void separadorDigitos(int x){
        for (int i = 0; i < 3; i++) {
            this.lista[2 - i] = (x%10);
             x = x/10;
        }
    }
    
    public int[] getLista(){
        return lista;
    }
    
    public void showOrden(){
        System.out.println("Orden original:"); 
        for (int i = 0; i < 3; i++) {
            System.out.print(lista[i]); 
        }
        System.out.println("\nOrden inverso:"); 
        for (int i = 0; i < 3; i++) {
            System.out.print(lista[3-i]);
        }
        System.out.println("\n");
    }
    
}
