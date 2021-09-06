/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso4;

import java.util.Scanner;

/**
 *
 * @author gab-uwu
 */
public class digitosOrden {
        int x=0;
    int[] lista = new int[4];
    Scanner leer = new Scanner(System.in);
    
    public digitosOrden(){// Funcion Constructor
        System.out.println("Ingresa un número de cuatro digitos");
        x = leer.nextInt();
        separadorDigitos(x);
        showOrden();
    }
    
    public void separadorDigitos(int x){
        for (int i = 0; i < 4; i++) {
            this.lista[3 - i] = (x%10);
             x = x/10;
        }
    }
    
    public int[] getLista(){
        return lista;
    }
    
    public void showOrden(){
        for (int i = 0; i < 3; i++) {
                if(lista[i]/*1*/ < lista[i+1]/*2*/ && lista[i] - lista[i+1] == -1){
                    if(i == 2){
                        System.out.printf("%d tiene orden ascendente\n",x);
                        break;
                    }
                }
                else if(lista[i] > lista[i+1] && lista[i] - lista[i+1] == 1){
                     if(i == 2){
                         System.out.printf("%d tiene orden descendente\n",x);
                         break;
                    }
                }
                else{
                    System.out.printf("%d No tiene orden\n",x);
                    break;
            }
            
        }
    }
}
