package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MezclaDirecta {

    BufferedReader leector;
    FileWriter escritor;
    ArrayList<Integer> lista;

    MezclaDirecta() {
        leector = null;
        escritor = null;
        lista = new ArrayList();
    }

    void importarFichero(String fichero) {
        try {
            leector = new BufferedReader(new FileReader(fichero));

            String lectura;
            lectura = leector.readLine();
            while (lectura != null) {
                lista.add(Integer.parseInt(lectura));
                System.out.println(lectura);
                lectura = leector.readLine();
            }
            leector.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("Error en el archivo");
        }
    }

    void showMezclaDirecta() {

        ArrayList<Integer> listaOrdenada = mezcla(lista);
        listaOrdenada.forEach(x -> System.out.println(x));
    }

    ArrayList<Integer> mezcla(ArrayList<Integer> lista) {

        int i, j, k;
        
        if (lista.size() > 1) {
            int nElementosIzquierda;
            int nElementosDerecha;

            nElementosIzquierda = lista.size() / 2;
            nElementosDerecha = lista.size() - nElementosIzquierda;

            ArrayList<Integer> listaIzq = new ArrayList();
            ArrayList<Integer> listaDer = new ArrayList();
            // Copiar los elementos de la primera parte al listaIzq
            for (i = 0; i < nElementosIzquierda; i++) {
                listaIzq.add(lista.get(i));
            }
            // Copiar los elementos de la segunda parte al listaDer
            for (i = nElementosIzquierda; i < nElementosIzquierda + nElementosDerecha; i++) {
                listaDer.add(lista.get(i));
            }
            listaIzq = mezcla(listaIzq);
            listaDer = mezcla(listaDer);
            
            i = 0;
            j = 0;
            k = 0;
            while (listaIzq.size() != j && listaDer.size() != k) {
                if (listaIzq.get(j) < listaDer.get(k)) {
                    lista.set(i, listaIzq.get(j));
                    i++;
                    j++;
                } else {
                    lista.set(i, listaDer.get(k));
                    i++;
                    k++;
                }
            }
            // Arreglo Final
            while (listaIzq.size() != j) {
                lista.set(i, listaIzq.get(j));
                i++;
                j++;
            }
            while (listaDer.size() != k) {
                lista.set(i, listaDer.get(k));
                i++;
                k++;
            }
        }
        return lista;
    }

}
