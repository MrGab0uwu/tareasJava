/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayormenor;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author gab-uwu
 */
public class MayorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int x = 5;
        System.out.println("GIVE ME A NUMER");
        int y  = sc.nextInt();
        y = y>x?y:0;
        System.out.println("WEON ADIOS"+y);
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
