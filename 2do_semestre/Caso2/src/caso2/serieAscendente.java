/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import java.util.Scanner;

/**
 *
 * @author gab-uwu
 */
public class serieAscendente {
    Scanner sc = new Scanner(System.in);
    int[] lista = new int[10];
    int aux = 0;
    public serieAscendente(){
        System.out.println("Ingresaras diez veces distintos números");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa el numero #"+(i+1));
            lista[i] = sc.nextInt();
            
        }
        
        for (int i = 0; i < 9; i++) {     
            for (int j = 0; j < 9; j++) {
                if (lista[j] > lista[j+1]) {
                   aux = lista[j];
                   lista[j] = lista[j+1];
                   lista[j+1] = aux;
                }
            }
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(lista[i]);
        }        
    }
}
