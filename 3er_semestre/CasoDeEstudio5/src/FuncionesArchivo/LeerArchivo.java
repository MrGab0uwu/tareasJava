package FuncionesArchivo;

import java.io.*;

/**
 *
 * @author gab-uwu
 */
public class LeerArchivo {

    BufferedReader entrada;
    String nombreArchivo;

    public LeerArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        try {
            entrada = new BufferedReader(new FileReader(nombreArchivo));
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo: " + nombreArchivo + " no existe o no esta en la ruta indicada");
        }
    }

    public void leer() {
        System.out.println("Analizando el archivo...\n");
        char[] caracteres;
        String lectura;
        String recorrido = "";

        try {
            lectura = entrada.readLine();
            while (lectura != null) {
                caracteres = lectura.toCharArray();
                int limite = 0, aux = 6;
                for (int i = 0; i < 6; i++) {
                    if (i % 2 != 0) {
                        recorrido += String.valueOf(caracteres[i]);
                        limite += Integer.parseInt(recorrido);
                        for (int k = aux; k < (limite + aux); k++) {
                            System.out.print(caracteres[k]);
                        }
                        System.out.print(" ");
                        // 6 + 11 = 17
                        // 17 + 08 = 25
                        aux = limite + aux;
                        limite = 0;
                    } else {
                        recorrido = String.valueOf(caracteres[i]);
                    }
                }
                System.out.println("\n");
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }

}
