/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import ArchivoTexto.*;
import java.io.*;

/**
 *
 * @author gab-uwu
 */
public class LectorArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        var archivo = new CrearArchivo();
//        var escribir = new EscribirArchivo();
//        var leer = new LeerArchivo();
//        
//        archivo.crear();
//        escribir.añadirTexto(archivo.nombreArchivo());
//        leer.leerLinea(archivo.nombreArchivo());

        String nombreArchivo = "/home/gab-uwu/NetBeansProjects/netbeans_texts/Archivo";
        String[] texto = {"9", "Hola", "11", "Mundo", "123", "desde", "Ubuntu"};
        String concatenacion = "";
        int sumatoria = 0;

        File archivo = new File(nombreArchivo); // Archivo
        PrintWriter sobreEscribir,anidarTexto;
        BufferedReader lector;
        
        
        System.out.println("Creando archivo de texto");
        try {
            // Escritores y creadores del archivo .txt
            sobreEscribir = new PrintWriter(archivo); // Reemplaza el texto actual del archivo
            anidarTexto = new PrintWriter(new FileWriter(archivo, true)); // Añade texto sin borrar el existete
            System.out.println("Ingresando texto...");
            for (String i : texto) {
                System.out.println(i);
                sobreEscribir.println(i);
            }
            sobreEscribir.close(); // Termina el flujo de sobre escribir
            System.out.println("¡Completado!");

            System.out.println("Analizando archivo...");
            lector = new BufferedReader(new FileReader(nombreArchivo)); // Objeto que lee
            String lectura = lector.readLine();
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
                lectura = lector.readLine();
            }

            System.out.println("\nSuma:\n" + sumatoria + "\nConcatenacion:\n" + concatenacion);

            lector.close(); // Termina el flujo de leectura
            System.out.println("\n¡Completado!");
            } catch (FileNotFoundException ex) {
                System.out.println("ERROR ¡El archivo no se encontro!");
            } catch (IOException ex) {
                System.out.println("ERROR");
            }
    }
}
