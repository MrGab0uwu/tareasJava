package main;

import java.util.Scanner;

/**
 *
 * @author gab-uwu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        Lista obj = new Lista();

        System.out.println("Ingresa la longitud para tu arreglo");
        int longitud = sc.nextInt();
        obj.setArray(longitud);
        obj.getArray();
        obj.showArray();

    }
}
