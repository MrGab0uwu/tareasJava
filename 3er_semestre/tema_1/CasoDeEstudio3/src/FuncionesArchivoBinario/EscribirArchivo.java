
package FuncionesArchivoBinario;

import java.io.*;

/**
 *
 * @author gab-uwu
 */
public class EscribirArchivo{
    
    ObjectOutputStream escribirOOS;
    AnidarContenido escribirANC;
    String nombreArchivo;

    public EscribirArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void escribirDatos(String[] contenido) {
        try {
            var fis = new FileOutputStream(nombreArchivo, true);
            escribirANC = new AnidarContenido(fis);
            System.out.println("Ingresando datos...");
            // Escribe en el archivo lo que esta en "contenido" y muestra en consola lo que va escribiendo
            for (String i : contenido) {
                escribirANC.writeObject(i); // Se escribe en el archivo lo que contiene la variable contenido
                System.out.println(i);
            }
            escribirANC.close(); // Aqui es cuando realmente se crea el archivo, se cierra el archivo y se termina el flujo
            System.out.println("Se ha modificado el archivo... Completado!");
        } catch (IOException ex) {
            System.out.println("No se encontro el archivo");
        }

    }

    public void sobreEscribirDatos(String[] contenido) {
        try {
            escribirOOS = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
            System.out.println("Ingresando datos...");
            // Escribe en el archivo lo que esta en "contenido" y muestra en consola lo que va escribiendo
            for (String i : contenido) {
                escribirOOS.writeObject(i); // Se escribe en el archivo lo que contiene la variable contenido
                System.out.println(i);
            }
            System.out.println("Completado!");
            escribirOOS.close();
            System.out.println("Se ha modificado el archivo... Completado!");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            System.out.println("No se encontro el archivo");
        }
    }
}
