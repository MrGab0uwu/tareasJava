/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion;

import java.util.Scanner;

/**
 *
 * @author gab-uwu
 */
public class Operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=0,y=0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el primer número");
        x = leer.nextInt();
        System.out.println("Ingresa el segundo número");
        y = leer.nextInt();
        
        Suma operation = new Suma();
        operation.setOperaciones(x,y);
        operation.getOperaciones();
        operation.showOperaciones();
    }
    
}
