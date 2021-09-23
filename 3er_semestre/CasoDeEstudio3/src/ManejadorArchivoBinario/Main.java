package ManejadorArchivoBinario;

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

        String[] contenido = {"9", "Hola", "11", "Mundo", "123","desde","Ubuntu"};

        var archivo = new CrearArchivo("arch.dat");
        String nombreArchivo = archivo.getNombreArchivo();
        var escribir = new EscribirArchivo(nombreArchivo);
        escribir.sobreEscribirDatos(contenido);
        var leector = new LeerArchivo(nombreArchivo);
        leector.leer();
        leector.showLeer();
        
    }

}
