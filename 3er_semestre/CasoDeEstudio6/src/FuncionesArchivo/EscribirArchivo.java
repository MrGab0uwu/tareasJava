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
        try {
            entrada = new PrintWriter(new FileWriter(nombreArchivo, true));

            for (String i : contenido) {
                entrada.println(i);
                System.out.println(i);
            }
            entrada.close();

        } catch (FileNotFoundException ex) {
            System.out.println("El archivo: " + nombreArchivo + "no existe o no esta en la ruta indicada");
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }

    public void sobreEscribirDatos() {
        try {
            entrada = new PrintWriter(new FileWriter(nombreArchivo));

            for (String i : contenido) {
                entrada.println(i);
                System.out.println(i);
            }
            entrada.close();

        } catch (FileNotFoundException ex) {
            System.out.println("El archivo: " + nombreArchivo + "no existe o no esta en la ruta indicada");
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }

}
