/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablasmultiplicar;

import java.util.Scanner;

/**
 *
 * @author gab-uwu
 */
public class tablas {

    int x;

    public tablas() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un número para generar su tabla de multiplicar del 1 al 10");
        x = leer.nextInt();
        setNumero(x);
    }

    public void setNumero(int x) {
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d * %d = " + (x*i) +"\n",x,i);
        }
    }
}
