package main;

/**
 *
 * @author gab-uwu
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        String number[] = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        // Declaracion e inicializacio del arreglo 'Entrada"
        int array[] = {-1, 12, 200, 43, 6, 99, -212, 989898, -122}; 
        // ciclo para evaluar el arreglo
        for (int i = 0; i < array.length; i++) {
            char digits[] = String.valueOf(array[i]).toCharArray(); // 123 = {'1','2','3'}
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
