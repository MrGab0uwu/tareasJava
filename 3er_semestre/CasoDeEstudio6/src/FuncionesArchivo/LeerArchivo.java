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
        String lectura;
        char[] caracteres;
        try {
            lectura = entrada.readLine();
            while(lectura!=null){
                caracteres = lectura.toCharArray();
                for (char i : caracteres) {
                    System.out.print(i);
                }
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (IOException ex) {
            System.out.println("Error");
        }
        
    }

}
