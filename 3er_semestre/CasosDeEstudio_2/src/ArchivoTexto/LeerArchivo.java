/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivoTexto;

import java.io.*;

/**
 *
 * @author gab-uwu
 */
public class LeerArchivo{
    
    BufferedReader entrada;
    String nombre_archivo;
    
    public LeerArchivo(String nombre_archivo) {
        this.nombre_archivo = nombre_archivo;
    }
    
    public void leerLinea() {
        String concatenacion = "";
        int sumatoria = 0;
        
        System.out.println("Analizando archivo...");
        try {
            entrada = new BufferedReader(new FileReader(nombre_archivo));
            String lectura = entrada.readLine();
            while (lectura != null) {
                boolean resultado;

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
                lectura = entrada.readLine();
            }

            System.out.println("\nSuma:\n" + sumatoria + "\nConcatenacion:\n" + concatenacion);

            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
