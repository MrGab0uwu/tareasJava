/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

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
        int array[] = {1, 9, 30, 75, 80, 101};
        String number[] = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        for (int i = 0; i < array.length; i++) {
            char chars[] = String.valueOf(array[i]).toCharArray();
            if (array[i] < 0) {
                System.out.println("Numero fuera de rango permitido");
            }
            else if (array[i] <= 9) {
                System.out.println(array[i] + " está en rango de 0 a 9");

            } else if (array[i] <= 99) {
                System.out.println(array[i] + " está en rango de 10 a 99");

            } else if (array[i] <= 999) {
                System.out.println(array[i] + " está en rango 100 a 999");

            }
            for (int j = 0; j < chars.length; j++) {
                for (int k = 0; k < chars.length; k++) {
                    if (chars[j] != (char)k) {
                        continue;   
                    }
                    System.out.println(number[k]);
                }

            }
        }

    }

}
