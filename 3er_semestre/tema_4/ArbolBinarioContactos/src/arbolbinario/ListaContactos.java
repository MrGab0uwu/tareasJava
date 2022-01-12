package arbolbinario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListaContactos {

    BufferedReader entrada;
    PrintWriter escritor;

    ListaContactos() {
        entrada = null;
        escritor = null;
    }

    void importarArchivo(String fichero, ArbolBinario arbol) {
        try {
            entrada = new BufferedReader(new FileReader(fichero));
            String lectura = entrada.readLine();
            System.out.println("Importando datos del fichero "+ fichero);
            
            while (lectura != null || "".equals(lectura)) {
                // Variables auxiliares para obtener la longitud de cada nombre
                int recorrido1;
                int recorrido2;
                String llave;
                // Variables para contener los nombres
                String apP = "";
                String apM = "";
                String nombre = "";

                llave = lectura.substring(0, 6);

                recorrido1 = Integer.parseInt(lectura.substring(0, 2));
                recorrido1 += 6;
                apP += lectura.substring(6, recorrido1);

                recorrido2 = Integer.parseInt(lectura.substring(2, 4));
                recorrido2 += recorrido1;
                apM += lectura.substring(recorrido1, recorrido2);

                nombre += lectura.substring(recorrido2, lectura.length());

                arbol.insertarNodo(llave, apP, apM, nombre);
                lectura = entrada.readLine();
            }
            entrada.close();
            System.out.println("¡Se ha importado el fichero de contactos!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListaContactos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ListaContactos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void reescribirArchivo(String fichero, ArbolBinario arbol) {
        try {
            escritor = new PrintWriter(new FileWriter(fichero));
            System.out.println("Ingresando texto...");

            postOrder(arbol.raiz);
            
            escritor.close(); // Aqui es cuando realmente se crea/manipula el archivo y se termina el flujo
            System.out.println("Se ha modificado el archivo... Completado!");
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe o no esta en la ruta indicada");
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }

    void postOrder(NodoArbol nodo) {
        if (nodo == null) {
        } else {
            String contacto;
            contacto = nodo.getLlave() + nodo.getApPat() + nodo.getApMat() + nodo.getNombre();
            postOrder(nodo.getNodoDerecho());
            escritor.println(contacto);
            postOrder(nodo.getNodoIzquierdo());
        }
    }
}
