package Pila;

import java.io.*;
import java.util.Stack;

public class MenuListaContacto {

    BufferedReader entrada;
    PrintWriter escritor;
    Stack pila;
    String listaContactos;

    MenuListaContacto() {
        pila = new Stack();
        listaContactos = "";
    }

    void setImportarContactos(File nombreArchivo) {
        try {
            entrada = new BufferedReader(new FileReader(nombreArchivo));
            String lectura = entrada.readLine();
            while (lectura != null || "".equals(lectura)) {
                char[] texto;
                texto = lectura.toCharArray();
                int recorrido1;
                int recorrido2;
                String apP = "";
                String apM = "";
                String nombre = "";

                recorrido1 = Integer.parseInt(lectura.substring(0, 2));
                for (int i = 6; i < (recorrido1 + 6); i++) {
                    nombre += texto[i];
                }

                recorrido2 = Integer.parseInt(lectura.substring(2, 4));
                for (int i = (recorrido1 + 6); i < (recorrido1 + recorrido2 + 6); i++) {
                    apP += texto[i];
                }
                
                for (int i = (recorrido1 + recorrido2 + 6); i < texto.length; i++) {
                    apM += texto[i];
                }

                pila.add((nombre + " " + apP + " " + apM).toUpperCase());
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
        nombreContacto = nombreContacto.toUpperCase();
        pila.push(nombreContacto);
        System.out.println("El contacto: " + nombreContacto + " se agrego!");
    }

    void setEliminarContacto(String nombreContacto) {
        nombreContacto = nombreContacto.toUpperCase();
        int indice;
        if (pila.contains(nombreContacto)) {
            indice = pila.indexOf(nombreContacto);
            pila.remove(indice);
            System.out.println("El contacto: " + nombreContacto + " se elimino!\n");
        } else {
            System.out.println("El contacto: " + nombreContacto + " no existe, por lo tanto no se puede eliminar.\n");
        }
    }

    void showConsultarContacto(String nombreContacto) {
        nombreContacto = nombreContacto.toUpperCase();
        if (pila.contains(nombreContacto)) {
            System.out.println("Contacto: " + nombreContacto + "\n");
        } else {
            System.out.println("El contacto: " + nombreContacto + " no existe, por lo tanto no se puede consultar+\n");
        }
    }

    void showNumeroDeContactos() {
        int size;
        size = pila.size();
        System.out.println("El número de contactos de la pila es: " + size + "\n");
    }

    void setListaContactos() {
        for (Object i : pila) {
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
            for (Object i : pila) {
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
