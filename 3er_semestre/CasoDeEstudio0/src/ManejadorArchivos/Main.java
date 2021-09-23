package ManejadorArchivos;

import FuncionesArchivo.*;
import FuncionesArchivoBinario.*;

/**
 *
 * @author gab-uwu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // 0.0 Mostrar elementos de un arreglo de tipo texto
        System.out.println("-------------------------------------------------------------------");
        String[] contenido = {"Hola", "mundo", "desde", "Ubuntu", "20.04", "LTS"};
        System.out.println("0.0 Mostrar elementos de un arreglo de tipo texto");
        for (String i : contenido) {
            System.out.println(i + " ");
        }

        //0.1 Mostrar las lineas de un archivo de texto
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\n0.1 Mostrar las lineas de un archivo de texto");
        var archivo = new CrearArchivo("arch.txt");
        String nombreArchivo = archivo.getNombreArchivo();
        var escritor = new EscribirArchivoTexto(nombreArchivo);
        escritor.sobreEscribir(contenido);
        var leector = new LeerArchivoTexto(nombreArchivo);
        leector.showLinea();

        
        // 0.2 Mostrar los registros de un archivo binario, numero entero y un texto
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\n0.2 Mostrar los registros de un archivo binario, numero entero y un texto");
        String[] contenidoBin = {"1", "Hola", "5", "Mundo", "100", "Linux"};
        var archivoBin = new CrearArchivo("arch.dat");
        String nombreArchivoBin = archivoBin.getNombreArchivo();
        var escritorBin = new EscribirArchivoBinario(nombreArchivoBin);
        escritorBin.sobreEscribirDatos(contenidoBin);
        var leectorBin = new LeerArchivoBinario(nombreArchivoBin);
        leectorBin.setRegistro();
        leectorBin.showRegistro();

    }

}
