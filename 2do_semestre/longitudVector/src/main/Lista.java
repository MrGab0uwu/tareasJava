package main;

import java.util.Scanner;

/**
 *
 * @author gab-uwu
 */
public class Lista {

    Scanner sc = new Scanner(System.in);
    int arry[];

    public void setArray(int longitud) { //Datos del arreglo
        this.arry = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            System.out.println("No." + (i + 1) + " Ingresa un número para el arreglo de longitud: " + longitud);
            this.arry[i] = sc.nextInt();
        }
    }

    public int[] getArray() {
        return arry;
    }

    void showArray() {
        System.out.println("Datos del arreglo : \n");
        for (int i = 0; i < arry.length; i++) {
            System.out.println("Posición en el arreglo: " + i+", Número: " + arry[i]);
        }
    }

}
