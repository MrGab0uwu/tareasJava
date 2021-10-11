package main;

import FuncionesArchivo.*;

/**
 *
 * @author gab-uwu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] contenido = {"Hola k tal desde Ubuntu 2021"};

        var archivo = new CrearArchivo("arch.txt");
        String nombreArchivo = archivo.getNombreArchivo();
        var escritor = new EscribirArchivo(nombreArchivo, contenido);
        escritor.sobreEscribirDatos();
        var leector = new LeerArchivo(nombreArchivo);
        leector.leer();

    }

}
