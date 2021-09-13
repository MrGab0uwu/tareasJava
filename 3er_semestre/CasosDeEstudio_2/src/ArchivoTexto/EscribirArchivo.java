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
public class EscribirArchivo{

    String[] texto = {"9", "Hola", "11", "Mundo", "123"};
    PrintWriter salida;
    String nombre_archivo;

    public EscribirArchivo(String nombre_archivo) {
        this.nombre_archivo = nombre_archivo;
    }
    
    public void anidarTexto() {
        try {
            salida = new PrintWriter(new FileWriter(nombre_archivo, true));
            System.out.println("Ingresando texto...");
            for (String i : texto) {
                salida.println(i); // Se escribe en el archivo lo que contiene la variable contenido
                System.out.println(i);
            }
            salida.close(); // Aqui es cuando realmente se crea el archivo, se cierra el archivo y se termina el flujo
            System.out.println("Se ha modificado el archivo... Completado!");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public void sobreEscribir() {
        try {
            salida = new PrintWriter(nombre_archivo);
            System.out.println("Ingresando texto...");
            for (String i : texto) {
                salida.println(i); // Se escribe en el archivo lo que contiene la variable contenido
                System.out.println(i);
            }
            System.out.println("Completado!");
            salida.close();
            System.out.println("Se ha modificado el archivo... Completado!");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
