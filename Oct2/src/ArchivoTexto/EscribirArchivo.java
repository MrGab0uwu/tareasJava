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
public class EscribirArchivo extends CrearArchivo {

    String[] texto = {"9", "Hola", "11", "Mundo", "123"};

    public void añadirTexto() {
        super.crear();
        try {
            var salida = new PrintWriter(new FileWriter(super.nombreArchivo(), true));
            System.out.println("Ingresando o añadiendo texto...");
            salida.println("texto"); // Se escribe en el archivo lo que contiene la variable contenido
            salida.close(); // Aqui es cuando realmente se crea el archivo, se cierra el archivo y se termina el flujo
            System.out.println("Se ha modificado el archivo\nCompletado!");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public void sobreEscribir(String nombreArchivo) {
        try {
            var salida = new PrintWriter(nombreArchivo);
            System.out.println("Sobre escribiendo texto...");
            for (String i : texto) {
                salida.println(i); // Se escribe en el archivo lo que contiene la variable contenido
                System.out.println(i);
            }
            System.out.println("Completado!");
            salida.close();
            System.out.println("Se ha modificado el archivo\nCompletado!");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
