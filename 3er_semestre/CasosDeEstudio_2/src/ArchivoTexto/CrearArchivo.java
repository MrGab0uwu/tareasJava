/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivoTexto;

import java.io.*;

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
