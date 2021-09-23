package FuncionesArchivo;

import java.io.*;

/**
 *
 * @author gab-uwu
 */
public class LeerArchivoFracciones {

    String nombreArchivo, sumaFracciones;
    BufferedReader entrada;

    public LeerArchivoFracciones(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        try {
            entrada = new BufferedReader(new FileReader(nombreArchivo));
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo: " + nombreArchivo + " no existe o no esta en la ruta indicada");
        }
        sumaFracciones = "";
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
                            // Se llenan los indices pares 0 2 4 para ambos arreglos
                            numeradores[i] = Integer.parseInt(String.valueOf(caracteres[i]));
                            // Se obtiene el valor del siguiente indice que corresponde al denominador
                            denominadores[i] = Integer.parseInt(String.valueOf(caracteres[i + 1]));
                            // Se multiplica los denominadores para conseguir el mcm
                            denominadorFinal *= denominadores[i];
                            // Aumento necesario para ir de dos en dos eje 1234 = 12 - (i+1) - 34
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
                            // Min sera el numero mayor entre el numerador y el denominador
                            int min = numeradorFinal >= denominadorFinal ? denominadorFinal : numeradorFinal;
                            int reductor = 1;
                            // Ciclo para reducir la fraccion en base al numero mayor entre numerador y el denominador
                            for (int i = 1; i <= min; i++) {
                                if ((numeradorFinal % i == 0) && (denominadorFinal % i == 0)) {
                                    // Se obtiene el maximo comun divisor para reducir la fraccion
                                    reductor = i;
                                }
                            }

                            // Se almacena la segunda fraccion y el resultado
                            sumaFracciones += numeradores[j] + "/" + denominadores[j] + " = " + (numeradorFinal / reductor) + "/" + (denominadorFinal / reductor) + "\n";
                        } else {
                            // Se almacena la primera fraccion
                            sumaFracciones += numeradores[j] + "/" + denominadores[j] + " + ";
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
        System.out.println(sumaFracciones);
    }

}
