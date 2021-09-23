package FuncionesArchivo;

import java.io.*;

/**
 *
 * @author gab-uwu
 */
public class LeerArchivo {

    String nombreArchivo;
    BufferedReader entrada;

    public LeerArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        try {
            entrada = new BufferedReader(new FileReader(nombreArchivo));
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo: " + nombreArchivo + " no existe o no esta en la ruta indicada");
        }
    }

    public void leer() {
        System.out.println("\nAnalizando archivo...");
        char[] caracteres;
        int[] numeradores, denominadores, multiplicaciones;
        int numeradorFinal = 0, denominadorFinal = 1;
        try {
            String lectura = entrada.readLine();
            if (lectura == null) {
                System.out.println("El fichero esta vacio");
            } else {
                while (lectura != null) {
                    caracteres = lectura.toCharArray();
                    int l = caracteres.length;
                    numeradores = new int[l];
                    denominadores = new int[l];
                    multiplicaciones = new int[l];
                    for (int i = 0; i < l; i++) {

                        try {
                            numeradores[i] = Integer.parseInt(String.valueOf(caracteres[i]));
                            denominadores[i] = Integer.parseInt(String.valueOf(caracteres[i + 1]));
                            denominadorFinal *= denominadores[i];
                            i += 1;
                        } catch (NumberFormatException ex) {
                            System.out.println(caracteres[i] + " String");
                        }
                    }
                    lectura = entrada.readLine();

                    for (int j = 0; j < l; j++) {

                        multiplicaciones[j] = numeradores[j] * (denominadorFinal / denominadores[j]);
                        numeradorFinal += multiplicaciones[j];

                        if (j == (caracteres.length - 2)) {

                            int min = numeradorFinal >= denominadorFinal ? denominadorFinal : numeradorFinal;
                            int reductor = 1;
                            for (int i = 1; i <= min; i++) {
                                if ((numeradorFinal % i == 0) && (denominadorFinal % i == 0)) {
                                    reductor = i;
                                }
                            }

                            System.out.print(numeradores[j] + "/" + denominadores[j] + " = " + (numeradorFinal / reductor) + "/" + (denominadorFinal / reductor));
                        } else {
                            System.out.print(numeradores[j] + "/" + denominadores[j] + " + ");
                        }

                        j += 1;
                    }

                    numeradorFinal = 0;
                    denominadorFinal = 1;
                    System.out.println("");
                }

            }
            entrada.close();
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }

}
