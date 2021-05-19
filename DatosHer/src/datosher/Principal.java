/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosher;
import java.util.Scanner;
/**
 *
 * @author JORGE SECCHI
 */
public class Principal {
    
    Scanner leer = new Scanner(System.in);
    protected String nombre, apellidop, apellidom, calle="", colonia, telefono;
    protected int edad;
    
    public void setCaptura(){
        System.out.println("Escribe tu Nombre");
        nombre = leer.nextLine();
        System.out.println("Escribe tu apellido paterno");
        apellidop=leer.next();
        System.out.println("Escribe tu apellido materno");
        apellidom=leer.next();
        System.out.println("Escribe tu edad");
        edad = leer.nextInt();
        leer.nextLine();
        System.out.println("Escribe la calle de tu direccion");
        calle = leer.nextLine();
        System.out.println("Escribe la colonia");
        colonia = leer.next();
        System.out.println("Escribe tu numero telefonico de 10 digitos");
        telefono = leer.next();
        leer.nextLine();
    }
    
    public void showDatos(){
        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Apellido paterno "+apellidop);
        System.out.println("Apellido materno "+apellidom);
        System.out.println("Edad: "+edad);
    }
    
}
