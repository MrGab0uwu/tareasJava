package FuncionesArchivo;

import java.io.*;

/**
 *
 * @author gab-uwu
 */
public class LeerArchivo {

    String nombreArchivo, fracciones;
    BufferedReader entrada;

    public LeerArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        try {
            entrada = new BufferedReader(new FileReader(nombreArchivo));
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo: " + nombreArchivo + " no existe o no esta en la ruta indicada");
        }
        fracciones = "";
    }

    public void setFracciones() {
        System.out.println("Analizando archivo...");
        try {
            // Se lee la linea del archivo de texto
            String lectura = entrada.readLine();
            if (lectura == null) {
                System.out.println("El fichero esta vacio");
            } else {
                // Variables de apoyo
                char[] caracteres;

                while (lectura != null) {
                    int[] numeradores, denominadores, multiplicaciones;
                    int numeradorFinal = 0, denominadorFinal = 1;
                    caracteres = lectura.toCharArray();
                    int l = caracteres.length;
                    numeradores = new int[l];
                    denominadores = new int[l];
                    multiplicaciones = new int[l];
                    for (int i = 0; i < l; i++) {

                        try {
                            // Se llenan los indices pares 0 2 4 ...
                            numeradores[i] = Integer.parseInt(String.valueOf(caracteres[i]));
                            // Se obtiene el valor con el indice impar ya que corresponde a las posiciones de los denominadores
                            denominadores[i] = Integer.parseInt(String.valueOf(caracteres[i + 1]));
                            denominadorFinal *= denominadores[i];
                            i += 1;
                        } catch (NumberFormatException ex) {
                            System.out.println("Formato de numero erroneo");
                        }
                    }
                    // Ciclo de multiplicacion para obtener el resultado de la suma
                    for (int j = 0; j < l; j++) {
                        // Se multiplica el numerador por el mcm divido entre el denominador
                        multiplicaciones[j] = numeradores[j] * (denominadorFinal / denominadores[j]);
                        // Se suma el primer numerador mas el siguiente numerador de la iteracion
                        numeradorFinal += multiplicaciones[j];
                        // condicional para cuando se va llegar a las ultimas dos posiciones del arreglo
                        if (j == (l - 2)) {

                            int min = numeradorFinal >= denominadorFinal ? denominadorFinal : numeradorFinal;
                            int reductor = 1;
                            // Ciclo para reducir la fraccion
                            for (int i = 1; i <= min; i++) {
                                if ((numeradorFinal % i == 0) && (denominadorFinal % i == 0)) {
                                    reductor = i;
                                }
                            }

                            // Se almacena la segunda fraccion y el resultado
                            fracciones += numeradores[j] + "/" + denominadores[j] + " = " + (numeradorFinal / reductor) + "/" + (denominadorFinal / reductor) + "\n";
                        } else {
                            // Se almacena la primera fraccion
                            fracciones += numeradores[j] + "/" + denominadores[j] + " + ";
                        }
                        j += 1;
                    }
                    // Se lee la siguiente linea de texto
                    lectura = entrada.readLine();
                }
            }
            entrada.close();
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }

    public void showFracciones() {
        System.out.println(fracciones);
    }

}
