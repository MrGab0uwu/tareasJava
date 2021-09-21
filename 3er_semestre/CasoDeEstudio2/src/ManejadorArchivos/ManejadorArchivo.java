/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejadorArchivos;

import FuncionesArchivos.LeerArchivo;
import FuncionesArchivos.CrearArchivo;
import FuncionesArchivos.EscribirArchivo;

/**
 *
 * @author gab-uwu
 */
public class ManejadorArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] contenido = {"9", "Hola", "11", "Mundo", "123"};
        
        var archivo = new CrearArchivo("arch2.txt");
        String nombreArchivo = archivo.getNombreArchivo();
        var escribir = new EscribirArchivo(nombreArchivo,contenido);
        escribir.escribirDatos();
        var leector = new LeerArchivo(nombreArchivo);
        leector.leer();
    }
}
