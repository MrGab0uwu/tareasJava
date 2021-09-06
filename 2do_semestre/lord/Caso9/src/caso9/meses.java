/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso9;

import java.util.Scanner;

/**
 *
 * @author gab-uwu
 */
public class meses {

    Scanner sc = new Scanner(System.in);
    int x = 0;
   
    public meses() {
        System.out.println("Ingresa un número entero del 1 al 12 para saber el mes del año");
        x = sc.nextInt();
        meses(x);
    }

    public void meses(int x) {

        switch (x) {
            
            case 1 -> System.out.println("1. ENERO");
            case 2 -> System.out.println("2. FEBRERO");
            case 3 -> System.out.println("3. MARZO");
            case 4 -> System.out.println("4. ABRIL");
            case 5 -> System.out.println("5. MAYO");
            case 6 -> System.out.println("6. JUNIO");
            case 7 -> System.out.println("7. JULIO");
            case 8 -> System.out.println("8. AGOSTO");
            case 9 -> System.out.println("9. SEPTIEMBRE");
            case 10 -> System.out.println("10. OCTUBRE");
            case 11 -> System.out.println("11. NOVIEMBRE");
            case 12 -> System.out.println("12. DICIEMBRE");
            
            default ->
                System.out.println("No existe un mes con ese número");
        }
    }

}
