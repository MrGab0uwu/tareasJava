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

        String[] textos = {"9", "Hola", "11", "Mundo", "123","Ubuntu"};

        var archivo = new CrearArchivo("arch.dat");
        String nombreArchivo = archivo.getNombreArchivo();
        var escribir = new EscribirArchivo(nombreArchivo, textos);
        var leector = new LeerArchivo(nombreArchivo);

        //List x = leer.cadenas();
        //leer.leer(x);
        
        //escribir.sobreEscribirDatos();
        escribir.escribirDatos();
        leector.leer();
    }

}
