package Lista;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MenuListaContacto {

    BufferedReader entrada;
    PrintWriter escritor;
    ArrayList<String> lista;
    String listaContactos;

    MenuListaContacto() {
        lista = new ArrayList<String>();
        listaContactos = "";
    }

    void setImportarContactos(File nombreArchivo) {
        int recorrido1;
        int recorrido2;
        int recorrido3;
        String apP;
        String apM;
        String nombre;
        try {
            entrada = new BufferedReader(new FileReader(nombreArchivo));
            String lectura = entrada.readLine();
            while (lectura != null || "".equals(lectura)) {

                recorrido1 = Integer.parseInt(lectura.substring(0, 1));
                recorrido2 = Integer.parseInt(lectura.substring(2, 3));
                recorrido3 = Integer.parseInt(lectura.substring(4, 5));

                nombre = lectura.substring(recorrido1, recorrido2);
                apP = lectura.substring(recorrido2, recorrido3);
                apM = lectura.substring(recorrido3);
                
                lista.add((nombre + apP + apM).toUpperCase());
                lectura = entrada.readLine();
            }
            System.out.println("Se añadio los contactos del archivo a la pila\n");
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    void setNuevoContacto(String nombreContacto) {
        lista.add(nombreContacto.toUpperCase());
        System.out.println("El contacto: " + nombreContacto + " se agrego!");
    }

    void setEliminarContacto(String nombreContacto) {
        int indice;
        if (lista.contains(nombreContacto)) {
            indice = lista.indexOf(nombreContacto);
            lista.remove(indice);
            System.out.println("El contacto: " + nombreContacto + " se elimino!\n");
        } else {
            System.out.println("El contacto: " + nombreContacto + " no existe, por lo tanto no se puede eliminar.\n");
        }
    }

    void showConsultarContacto(String nombreContacto) {
        if (lista.contains(nombreContacto.toUpperCase())) {
            System.out.println("Contacto: " + nombreContacto + "\n");
        } else {
            System.out.println("El contacto: " + nombreContacto + " no existe, por lo tanto no se puede consultar+\n");
        }
    }

    void showNumeroDeContactos() {
        int size;
        size = lista.size();
        System.out.println("El número de contactos de la pila es: " + size + "\n");
    }

    void setListaContactos() {
        for (Object i : lista) {
            listaContactos += i + "\n";
        }
    }

    void showListaContactos() {
        setListaContactos();
        System.out.println("Lista de contactos: \n" + listaContactos);
        listaContactos = "";
    }

    void setActualizarFichero(File nombreArchivo) {
        try {
            escritor = new PrintWriter(new FileWriter(nombreArchivo));
            System.out.println("Ingresando texto...");
            for (Object i : lista) {
                escritor.println(i); // Se escribe en el archivo lo que contiene la variable contenido
                System.out.println(i);
            }
            escritor.close(); // Aqui es cuando realmente se crea/manipula el archivo y se termina el flujo
            System.out.println("Se ha modificado el archivo... Completado!");
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo: " + nombreArchivo + "no existe o no esta en la ruta indicada");
        } catch (IOException ex) {
            System.out.println("Error");
        }

    }

}
