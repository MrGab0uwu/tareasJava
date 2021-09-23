package ManejadorArchivos;

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

        
        // 0.1 Mostrar elementos de un arreglo de tipo texto
        String[] contenido = {"Hola", "mundo", "desde", "Ubuntu", "20.04", "LTS"};
        System.out.println("Elementos del arreglo contenido:");
        for (String i : contenido) {
            System.out.print(i+" ");
        }

        // 0.2 Mostrar las lineas de un archivo de texto
        var archivo = new CrearArchivo("arch.txt");
        String nombreArchivo = archivo.getNombreArchivo();
        var escritor = new EscribirArchivo(nombreArchivo);
        escritor.sobreEscribir(contenido);
        var leector = new LeerArchivo(nombreArchivo);
        leector.leer();

        // 0.3 Mostrar los registros de un archivo binario, numero entero y un texto
        

    }

}
