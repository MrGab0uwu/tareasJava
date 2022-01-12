package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MezclaNatural {

    BufferedReader leector;
    FileWriter escritor;
    ArrayList<Integer> lista;

    MezclaNatural() {
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

    void mezclaNatural(ArrayList<Integer> lista) {
        int izquierda;
        int izq;
        int derecha;
        int der;
        boolean ordenado;
        ordenado = false;
        izquierda = 0;
        izq=0;
        derecha = lista.size()-1;
        der=derecha;
        
        do {
            ordenado=true;
            izquierda = 0;
            while(izquierda < derecha){
                izq = izquierda;
                // Compara de forma consecutiva si el número actual es menpr que el sucesor, asi hasta que el número actual sea mayor
                while(izq < derecha && lista.get(izq)<= lista.get(izq+1)){
                    izq++;
                }
                der=izq+1;
                while(der==derecha-1 || der< derecha && lista.get(der)<=lista.get(der+1)){
                    der++;
                }
                if (der<=derecha) {
                    ArrayList<Integer> listaOrdenada = mezclaDirecta(lista);
                    ordenado = false;
                }
                izquierda = izq;
            }
        } while (!ordenado);
        
        
    }

    ArrayList<Integer> mezclaDirecta(ArrayList<Integer> lista) {

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
            listaIzq = mezclaDirecta(listaIzq);
            listaDer = mezclaDirecta(listaDer);
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

    
    void showMezclaNatural(){
        mezclaNatural(lista);
        for(int i: lista){
            System.out.println(i);
        }
    }

}
