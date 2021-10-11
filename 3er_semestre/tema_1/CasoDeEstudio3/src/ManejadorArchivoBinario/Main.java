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
        escribir.escribirDatos(contenido);
        var leector = new LeerArchivoNumerosDigitos(nombreArchivo);
        leector.setNumeroString();
        leector.showNumeroString();
        
    }

}
