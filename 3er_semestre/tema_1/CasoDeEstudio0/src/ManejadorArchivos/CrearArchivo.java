package ManejadorArchivos;

import java.io.File;

/**
 *
 * @author gab-uwu
 */
public class CrearArchivo {

    File archivo;
    String nombreArchivo, path;

    public CrearArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        archivo = new File(nombreArchivo);
        path = archivo.getAbsolutePath();
        if (!archivo.exists()) {
            System.out.println("Creando el archivo... ¡Completado!");
        } else {
            System.out.println("El fichero ya existe en la ruta: " + path);
        }
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

}
