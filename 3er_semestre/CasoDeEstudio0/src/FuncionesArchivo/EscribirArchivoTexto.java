package FuncionesArchivo;

import java.io.*;

/**
 *
 * @author gab-uwu
 */
public class EscribirArchivoTexto {

    PrintWriter entrada;
    String nombreArchivo;

    public EscribirArchivoTexto(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void escribir(String[] contenido) {
        try {
            System.out.println("Ingresando datos...");
            entrada = new PrintWriter(new FileWriter(nombreArchivo, true));
            // Escribe en el archivo lo que esta en "contenido" y muestra en consola lo que va escribiendo
            for (String i : contenido) {
                entrada.println(i);
                System.out.println(i);
            }
            entrada.close(); // Aqui es cuando realmente y se crea/manipula el archivo, se termina el flujo
            System.out.println("Se ha modificado el archivo... Completado!");
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo: " + nombreArchivo + "no existe o no esta en la ruta indicada");
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }

    public void sobreEscribir(String[] contenido) {
        try {
            System.out.println("Ingresando datos...");
            entrada = new PrintWriter(new FileWriter(nombreArchivo));
            // Escribe en el archivo lo que esta en "contenido" y muestra en consola lo que va escribiendo
            for (String i : contenido) {
                entrada.println(i);
                System.out.println(i);
            }
            entrada.close(); // Aqui es cuando realmente se crea/manipula el archivo y se termina el flujo
            System.out.println("Se ha modificado el archivo... Completado!");
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo: " + nombreArchivo + "no existe o no esta en la ruta indicada");
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }

}
