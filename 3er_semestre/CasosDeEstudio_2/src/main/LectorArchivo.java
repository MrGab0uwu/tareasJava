/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import ArchivoTexto.*;

/**
 *
 * @author gab-uwu
 */
public class LectorArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        var archivo = new CrearArchivo("arch.txt");
        String n_archivo = archivo.getNombreArchivo();
        var escribir = new EscribirArchivo(n_archivo);
        var leer = new LeerArchivo(n_archivo);
        
        escribir.anidarTexto();
        leer.leerLinea();
    }
}
