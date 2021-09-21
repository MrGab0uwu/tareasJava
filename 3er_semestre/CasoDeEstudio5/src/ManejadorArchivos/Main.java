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
        
        String[] contenido = {"070706GABRIELESCOBARTORRES","110805ALAN MANUELBALCAZARORTIZ", "131009ANGEL GABRIELCARRIZALESHERNANDEZ","120607MIGUEL ANGELNOVELOSANCHEZ", "040808AXELCLEMENTEMARTINEZ", "070606OCTAVIOGARCIAGRACIA","150509MAURICIO ARTUROREYESHERNANDEZ"};

        var archivo = new CrearArchivo("arch.txt");
        String nombreArchivo = archivo.getNombreArchivo();
        var escritor = new EscribirArchivo(nombreArchivo,contenido);
        escritor.escribirDatos();
        var leector = new LeerArchivo(nombreArchivo);
        leector.leer();

    }

}
