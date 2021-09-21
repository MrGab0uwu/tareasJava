
package FuncionesArchivoBinario;

import java.io.File;

/**
 *
 * @author gab-uwu
 */
public class CrearArchivo {
    File archivo;
    String nombre_archivo;
    
    public CrearArchivo(String nombre_archivo){
        this.nombre_archivo = nombre_archivo;
        archivo = new File(nombre_archivo);
    }
    
    public String getNombreArchivo(){
        return nombre_archivo;
        
    }
    
}
