
package FuncionesArchivos;

import java.io.*;

/**
 *
 * @author gab-uwu
 */
public class LeerArchivo{
    
    BufferedReader entrada;
    String nombreArchivo;
    
    public LeerArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        try {
            entrada = new BufferedReader(new FileReader(nombreArchivo));
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo: "+nombreArchivo+ "no existe o no esta en la ruta indicada");
        }
    }
    
    public void leer() {
        String concatenacion = "";
        int sumatoria = 0;
        
        System.out.println("Analizando archivo...");
        try {
            String lectura = entrada.readLine();
            while (lectura != null || "".equals(lectura)) {

                try {// se controla una posible excepcion
                    Integer.parseInt(lectura);// si se logra guardar correctamente es un numero
                    System.out.println(lectura + " Si es");
                    sumatoria += Integer.parseInt(lectura);
                } catch (NumberFormatException e) {//si no se logra guardar correctamente ocurre lo siguente:
                    System.out.println(lectura + " No es");
                    concatenacion += lectura + " ";
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
