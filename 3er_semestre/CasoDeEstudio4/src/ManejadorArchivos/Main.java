
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
        
        String[] contenido = {"438798","581212","913223","458467","891912"};
        
        var archivo = new CrearArchivo("arch.txt");
        String nombreArchivo = archivo.getNombreArchivo();
        var escritor = new EscribirArchivo(nombreArchivo);
        escritor.sobreEscribir(contenido);
        var leector = new LeerArchivo(nombreArchivo);
        leector.leer();
        
    }
    
}
