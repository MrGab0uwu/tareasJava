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
        
        String[] contenido = {"07OCTAVIO06GARCIAAICARG","15MAURICIO ARTURO05REYESZEDNANREH", "06MARINA08CISNEROSARREUG","05SONIA08MARTINEZNAMZUG", "15PABLO FRANCISCO05VIVASSERROT"};

        var archivo = new CrearArchivo("arch.txt");
        String nombreArchivo = archivo.getNombreArchivo();
        var escritor = new EscribirArchivo(nombreArchivo,contenido);
        escritor.sobreEscribirDatos();
        var leector = new LeerArchivo(nombreArchivo);
        leector.setLeer();
        leector.showLeer();

    }

}
