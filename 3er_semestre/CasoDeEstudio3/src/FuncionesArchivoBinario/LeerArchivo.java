package FuncionesArchivoBinario;

import java.io.*;

/**
 *
 * @author gab-uwu
 */
public class LeerArchivo {

    FileInputStream fis;
    ObjectInputStream leerOIS;
    String nombreArchivo, concatenacion, salida;
    int sumatoria;

    public LeerArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        concatenacion = "";
        salida = "";
        sumatoria = 0;
    }

    public void setNumeroString() {

        System.out.println("\nAnalizando archivo...");
        try {
            // objetos con sus respectivas clases para el manejo de la lectura del archivo binario
            fis = new FileInputStream(nombreArchivo);
            leerOIS = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                // Se lee el objeto/linea del archivo binario
                String lectura = (String) leerOIS.readObject();
                // se controla una posible excepcion
                try {
                    // Se intenta transformar a un numero
                    Integer.parseInt(lectura);
                    // Se concatena si es numero
                    sumatoria += Integer.parseInt(lectura);
                    // Se almacena la lectura para imprimirse despues
                    salida += lectura + " Si es\n";
                    //si no se logra transformar no es un numero:
                } catch (NumberFormatException e) {
                    // Se concatena si no es numero
                    concatenacion += lectura + " ";
                    // Se almacena la lectura para imprimirse despues
                    salida += lectura + " No es\n";
                }
            }

            leerOIS.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error, archivo no encontrado");
        } catch (ClassNotFoundException | IOException ex) {
            System.out.println("Error");
        }
    }
    
    
    public void showNumeroString(){
        System.out.println(salida);
        System.out.println("Suma: " + sumatoria + "\nConcatenacion: " + concatenacion);
    }

}
