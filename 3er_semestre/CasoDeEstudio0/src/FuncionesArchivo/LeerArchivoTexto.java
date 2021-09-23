package FuncionesArchivo;

import java.io.*;

/**
 *
 * @author gab-uwu
 */
public class LeerArchivoTexto {

    String nombreArchivo;
    BufferedReader entrada;

    public LeerArchivoTexto(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        try {
            entrada = new BufferedReader(new FileReader(nombreArchivo));
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo: " + nombreArchivo + " no existe o no esta en la ruta indicada");
        }
    }

    public void showLinea() {
        System.out.println("\nAnalizando archivo...");
        try {
            String lectura = entrada.readLine();
            if (lectura == null) {
                System.out.println("El fichero esta vacio");
            } else {
                while (lectura != null) {
                    
                    System.out.println(lectura);
                    
                    lectura = entrada.readLine();
                }

            }
            entrada.close();
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }
    

}
