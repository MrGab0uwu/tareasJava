package FuncionesArchivo;

import java.io.*;

/**
 *
 * @author gab-uwu
 */
public class LeerArchivo {

    BufferedReader entrada;
    String nombreArchivo, nombreCompleto;

    public LeerArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        nombreCompleto = "";
        try {
            entrada = new BufferedReader(new FileReader(nombreArchivo));
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo: " + nombreArchivo + " no existe o no esta en la ruta indicada");
        }
    }

    public void setLeer() {
        System.out.println("Analizando el archivo...\n");
        char[] caracteres;
        String lectura;
        String recorrido = "";

        try {
            lectura = entrada.readLine();
            while (lectura != null) {
                String nombre ="nombre:", apellidoP="aPaterno:", apellidoM="aMaterno:";
                caracteres = lectura.toCharArray();
                int limite = 0, aux = 0;
                for (int i = 0; i < caracteres.length; i++) {
                    try {
                        recorrido += String.valueOf(caracteres[i]);
                        limite = Integer.parseInt(recorrido);
                    } catch (NumberFormatException e) {
                        aux++;
                        //02     // 02 + 07 = 09
                        switch (aux) {
                            case 3 -> {
                                for (int j = (caracteres.length - 1); j >= (i - 1); j--) {
                                    apellidoM += String.valueOf(caracteres[j]);
                                }
                            }
                            case 2 -> {
                                for (int j = i; j < (i + limite); j++) {
                                    apellidoP += String.valueOf(caracteres[j]);
                                }
                            }
                            case 1 -> {
                                for (int j = i; j < (i + limite); j++) {
                                    nombre += String.valueOf(caracteres[j]);
                                }
                            }
                        }
                        i += limite;
                        limite = 0;
                        recorrido = "";
                    }
                }
                nombreCompleto += apellidoP + " " + apellidoM + " " + nombre + "\n";
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }

    public void showLeer() {
        System.out.println(nombreCompleto);
    }
}
