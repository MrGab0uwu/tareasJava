/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesArchivoBinario;

import java.io.*;
/**
 *
 * @author gab-uwu
 */
public class AnidarContenido extends ObjectOutputStream{
    //Clase especial para arreglar el problema de añadir mas informacion a un archivo binario ya creado
    public AnidarContenido(OutputStream out) throws IOException{
        super(out);
    }
    
    public AnidarContenido() throws IOException, SecurityException{
    }
    
    @Override
    public void writeStreamHeader() throws IOException{
        reset();
    }
    
    
    
}
