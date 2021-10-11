
package FuncionesArchivos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gab-uwu
 */
public class EscribirArchivo{
    
    PrintWriter entrada;
    String nombreArchivo;
    String[] contenido;

    public EscribirArchivo(String nombreArchivo, String[] contenido) {
        this.nombreArchivo = nombreArchivo;
        this.contenido = contenido;
    }
    
    public void escribirDatos() {
        try {
            entrada = new PrintWriter(new FileWriter(nombreArchivo, true));
            System.out.println("Ingresando texto...");
            for (String i : contenido) {
                entrada.println(i); // Se escribe en el archivo lo que contiene la variable contenido
                System.out.println(i);
            }
            entrada.close(); // Aqui es cuando realmente se crea/manipula el archivo y se termina el flujo
            System.out.println("Se ha modificado el archivo... Completado!");
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo: "+nombreArchivo+ "no existe o no esta en la ruta indicada");
        } catch (IOException ex) {
            System.out.println("Error");
        }

    }

    public void sobreEscribirDatos() {
        try {
            entrada = new PrintWriter(new FileWriter(nombreArchivo));
            System.out.println("Ingresando texto...");
            for (String i : contenido) {
                entrada.println(i); // Se escribe en el archivo lo que contiene la variable contenido
                System.out.println(i);
            }
            entrada.close(); // Aqui es cuando realmente se crea/manipula el archivo y se termina el flujo
            System.out.println("Se ha modificado el archivo... Completado!");
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo: "+nombreArchivo+ "no existe o no esta en la ruta indicada");
        } catch (IOException ex) {
            Logger.getLogger(EscribirArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
