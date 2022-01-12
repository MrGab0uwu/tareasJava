package Cola;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;

public class MenuListaContacto {

    BufferedReader entrada;
    PrintWriter escritor;
    Queue<String> cola;
    String listaContactos;

    MenuListaContacto() {
        cola = new LinkedList<String>();
        listaContactos = "";
    }

    // Metodo para importar los datos del archivo de texto a la estructura tipo COLA
    void setImportarContactos(File nombreArchivo) {
        try {
            entrada = new BufferedReader(new FileReader(nombreArchivo));
            String lectura = entrada.readLine();
            while (lectura != null || "".equals(lectura)) {
                // Variables auxiliares para obtener la longitud de cada nombre
                int recorrido1;
                int recorrido2;
                // Variables para contener los nombres
                String apP = "";
                String apM = "";
                String nombre = "";

                recorrido1 = Integer.parseInt(lectura.substring(0, 2));
                recorrido1 += 6;
                nombre += lectura.substring(6, recorrido1);

                recorrido2 = Integer.parseInt(lectura.substring(2, 4));
                recorrido2 += recorrido1;
                apP += lectura.substring(recorrido1, recorrido2);

                apM += lectura.substring(recorrido2, lectura.length());

                cola.add((nombre + " " + apP + " " + apM).toUpperCase());
                lectura = entrada.readLine();
            }
            // Mensaje cuando se finaliza exitosamente la importacion
            System.out.println("Se añadio los contactos del archivo a la cola\n");
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    // Metodo para agregar a un nuevo contacto a la cola
    void setNuevoContacto(String nombreContacto) {
        cola.add(nombreContacto.toUpperCase());
        System.out.println("El contacto: " + nombreContacto + " se agrego!");
    }

    // Metodo para eliminar en este caso al primer contacto de la cola al ser de tipo FIFO
    void setEliminarContacto() {
        if (cola.peek() != null) {
            System.out.println("El contacto: " + cola.remove() + " se elimino!\n");
        } else {
            System.out.println("La cola esta vacia, por lo tanto no se puede hacer esta operación");
        }
    }

    void showConsultarContacto() {
        if (cola.peek() != null) {
            System.out.println("Contacto: " + cola.peek() + "\n");
        } else {
            System.out.println("La lista esta vacia, por lo tanto no se puede hacer esta operación\n");
        }
    }

    void showNumeroDeContactos() {
        if (cola.size() > 0) {
            int size;
            size = cola.size();
            System.out.println("El número de contactos de la pila es: " + size + "\n");
        } else {
            System.out.println("La lista esta vacia, por lo tanto no se puede hacer esta operación\n");
        }
    }

    void setListaContactos() {
        for (Object i : cola) {
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
            for (Object i : cola) {
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
