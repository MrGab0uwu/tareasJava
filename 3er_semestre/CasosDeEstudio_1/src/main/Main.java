package main;

import java.util.*;

/**
 *
 * @author gab-uwu
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String number[] = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
//        int array[] = new int[4];
        int array[] = {-1, 12, 200, 43, 6, 99, -212, 989898, -122};

//        for (int i = 0; i < array.length; i++) {
//            try {
//                System.out.println("Ingresa un número mayor o igual a 0 pero menor a 1000");
//                array[i] = sc.nextInt();
//            } catch (InputMismatchException ex) {
//                System.out.println("¡Número no permitido!");
//                array[i] = 0;
//                --i;
//                sc.nextLine();
//            }
//        }

        for (int i = 0; i < array.length; i++) {
            char digits[] = String.valueOf(array[i]).toCharArray();
            if (array[i] < 0 || array[i] > 999) {
                System.out.println(array[i] + " esta fuera del rango permitido\n");
                continue;
            } else if (array[i] <= 9) {
                System.out.println(array[i] + " está en rango de 0 a 9");
            } else if (array[i] <= 99) {
                System.out.println(array[i] + " está en rango de 10 a 99");
            } else if (array[i] <= 999) {
                System.out.println(array[i] + " está en rango 100 a 999");
            }
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < number.length; k++) {
                    int digitInt = Character.getNumericValue(digits[j]); // '1' == 1
                    if (k != digitInt) {
                        continue;
                    }
                    System.out.print(number[k] + " ");
                }
            }
            System.out.println("\n");
        }

    }

}
