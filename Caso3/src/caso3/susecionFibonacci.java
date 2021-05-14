/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso3;

import java.util.Scanner;

/**
 *
 * @author gab-uwu
 */
public class susecionFibonacci {
    Scanner sc = new Scanner(System.in);
       
        int a = 0, b = 1, c, n;
       
        public void setDatos(){
            System.out.println("Ingresa el tamaño deseado para la serie Fibonacci");
            this.n = sc.nextInt();
        }
        
        public int getDatos(){
          return n;  
        }
        
        public void showSusecion(){
            for (int i = 0; i < n; i++) {
                if (i == n-1) {
                    System.out.printf("%s.",a);
                }else{
                System.out.printf("%s, ",a);
                }
                c = a + b;
                a = b;
                b = c;
            }System.out.print("\n");
        }
}
