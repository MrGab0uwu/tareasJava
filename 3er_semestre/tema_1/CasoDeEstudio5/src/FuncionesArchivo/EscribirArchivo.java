package FuncionesArchivo;

import java.io.*;

/**
 *
 * @author gab-uwu
 */
public class EscribirArchivo {

    PrintWriter entrada;
    String nombreArchivo;
    String[] contenido;

    public EscribirArchivo(String nombreArchivo, String[] contenido) {
        this.nombreArchivo = nombreArchivo;
        this.contenido = contenido;
    }

    public void escribirDatos() {
        System.out.println("Ingresando texto...");
        try {
            entrada = new PrintWriter(new FileWriter(nombreArchivo, true));
            // Escribe en el archivo "contenido" y muestra en consola lo que va escribiendo
            for (String i : contenido) {
                entrada.println(i);
                System.out.println(i);
            }
            entrada.close(); // Aqui es cuando realmente y se crea/manipula el archivo, se termina el flujo
            System.out.println("\nSe ha modificado el archivo... Completado!");
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo: " + nombreArchivo + "no existe o no esta en la ruta indicada");
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }

    public void sobreEscribirDatos() {
        System.out.println("Ingresando texto...");
        try {
            entrada = new PrintWriter(new FileWriter(nombreArchivo));
            // Escribe en el archivo "contenido" y muestra en consola lo que va escribiendo
            for (String i : contenido) {
                entrada.println(i);
                System.out.println(i);
            }
            entrada.close(); // Aqui es cuando realmente se crea/manipula el archivo y se termina el flujo
            System.out.println("\nSe ha modificado el archivo... Completado!");
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo: " + nombreArchivo + "no existe o no esta en la ruta indicada");
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }

}
