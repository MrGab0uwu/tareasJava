/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author JORGE SECCHI
 */
public class ClasePadre {

    Scanner leer = new Scanner(System.in);
    int a, b, x;

    public void setLeer() {
        System.out.println("Escribe el primer numero");
        a = leer.nextInt();
        System.out.println("Escribe el segundo numero");
        b = leer.nextInt();
    }

    public void setResul() {
        System.out.println("El resultado es " + x);
    }

}
