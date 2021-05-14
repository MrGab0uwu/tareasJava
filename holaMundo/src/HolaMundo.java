
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gab-uwu
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Proporciona el nombre");
        String nombre = leer.nextLine();
        System.out.println("Proporciona el id; ");
        int id = leer.nextInt();
        System.out.println("Proporciona el precio");
        double precio = leer.nextDouble();
        System.out.println("Proporciona el envio gratuito");
        boolean envio = leer.nextBoolean();
        
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Id: " + id);
        System.out.println("Precio: " + precio);
        System.out.println("Envio gratuito: " + envio);
        
        
        
//        System.out.println("Hola Mundo");
//        int edad = 20;
//        var adulto = edad >= 18;
//        System.out.println("edad = " + edad);
//        System.out.println("adulto = " + adulto);
//        
//        String p = "cum";
//        String r = (p == p) ? "Cum" : "No cum";
//        JOptionPane.showMessageDialog(null, r);
    }
}
