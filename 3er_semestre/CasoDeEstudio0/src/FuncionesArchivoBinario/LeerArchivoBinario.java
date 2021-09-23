package FuncionesArchivoBinario;

import java.io.*;

/**
 *
 * @author gab-uwu
 */
public class LeerArchivoBinario {

    FileInputStream fis;
    ObjectInputStream leerOIS;
    String nombreArchivo, salida;

    public LeerArchivoBinario(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        salida = "";
    }

    public void setRegistro() {

        System.out.println("\nAnalizando archivo...");
        try {
            // objetos con sus respectivas clases para el manejo de la lectura del archivo binario
            fis = new FileInputStream(nombreArchivo);
            leerOIS = new ObjectInputStream(fis);
            // Variable de apoyo
            int i = 1;
            // Ciclo que evalua los datos hasta que disponga de igual o menos de 0 datos
            while (fis.available() > 0) {
                i++;
                // Se lee el objeto/linea del archivo binario
                String lectura = (String) leerOIS.readObject();
                if (i % 2 != 0) {
                    salida += lectura + "\n";
                } else {
                    salida += lectura + " ";
                }
            }
            // Fin del flujo
            leerOIS.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error, archivo no encontrado");
        } catch (ClassNotFoundException | IOException ex) {
            System.out.println("Error");
        }
    }

    public void showRegistro() {
        System.out.println(salida);
    }

}
