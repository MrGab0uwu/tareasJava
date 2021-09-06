/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivoTexto;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author gab-uwu
 */
public class CrearArchivo {
    
    String nombreArchivo = "";
    
    public void crear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del archivo");
        this.nombreArchivo = sc.nextLine();
        File archivo = new File(nombreArchivo);
    }
    
    public String nombreArchivo(){
        return nombreArchivo;
    }
    
}
