package FuncionesArchivoBinario;

import java.io.*;

/**
 *
 * @author gab-uwu
 */
public class LeerArchivo {

    FileInputStream fis;
    ObjectInputStream leerOIS;
    String nombreArchivo;

    public LeerArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    } 

    public void leer() {
        String concatenacion = "";
        int sumatoria = 0;

        System.out.println("Analizando archivo...");
        try {

            fis = new FileInputStream(nombreArchivo);
            leerOIS = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                boolean resultado;
                String lectura = (String) leerOIS.readObject();
                    try {// se controla una posible excepcion
                    Integer.parseInt(lectura);// si se logra guardar correctamente es un numero
                    resultado = true;
                } catch (NumberFormatException e) {//si no se logra guardar correctamente ocurre lo siguente:
                    resultado = false;
                }

                if (!resultado) {
                    System.out.println(lectura + " No es");
                    concatenacion += lectura + " ";
                } else {
                    System.out.println(lectura + " Si es");
                    sumatoria += Integer.parseInt(lectura);
                }
            }

            System.out.println("\nSuma:\n" + sumatoria + "\nConcatenacion:\n" + concatenacion);

            leerOIS.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error, archivo no encontrado");
        } catch (ClassNotFoundException | IOException ex) {
            System.out.println("Error");
        }
    }

}
