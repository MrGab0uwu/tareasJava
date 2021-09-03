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
        /* 
        var archivo = new CrearArchivo();
        var escribir = new EscribirArchivo();
        var wea = new LeerArchivo();
        
        archivo.crear();
        escribir.sobreEscribir(archivo.nombreArchivo());
        wea.leerLinea(archivo.nombreArchivo());
         */
        String nombreArchivo = "/home/gab-uwu/netbeans_texts/pruebaLineal_1";
        
        var archivo = new File(nombreArchivo); // Archivo
        try {
            // Escritores y creadores del archivo .txt
            var sobreEscribir = new PrintWriter(archivo); // Reemplaza el texto actual del archivo
            var anidarTexto = new PrintWriter(new FileWriter(archivo,true)); // Añade texto sin borrar el existete
            
            sobreEscribir.println("Hola, soy yo");
            
            sobreEscribir.close();
            
            // Lectores de linea del archivo .txt
            var leector = new BufferedReader(new FileReader(archivo)); // Lee el texto de una linea, bucle si se quiere leer todas las lineas
            
            System.out.println(leector.readLine());
            leector.close();
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        
        
        

    }

}
