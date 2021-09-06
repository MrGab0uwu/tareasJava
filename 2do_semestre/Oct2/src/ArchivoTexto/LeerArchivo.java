/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivoTexto;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gab-uwu
 */
public class LeerArchivo extends CrearArchivo {

    public void leerLinea(String nombreArchivo) {
        String concatenacion = "";
        int sumatoria = 0;
        
        System.out.println("Analizando archivo...");
        try {
            var entrada = new BufferedReader(new FileReader(nombreArchivo));
            String lectura = entrada.readLine();
            while (lectura != null) {
                boolean resultado;

                try {// se controla una posible excepcion
                    Integer.parseInt(lectura);// si se logra guardar correctamente es un numero
                    resultado = true;
                } catch (NumberFormatException excepcion) {//si no se logra guardar correctamente ocurre lo siguente:
                    resultado = false;
                }

                if (!resultado) {
                    System.out.println(lectura + " No es");
                    concatenacion += lectura + " ";
                } else {
                    System.out.println(lectura + " Si es");
                    sumatoria += Integer.parseInt(lectura);
                }
                lectura = entrada.readLine();
            }

            System.out.println(sumatoria + "\n" + concatenacion);

            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
