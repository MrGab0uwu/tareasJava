package radix;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Radix {

    BufferedReader leector;
    FileWriter escritor;
    ArrayList<Integer> lista;

    Radix() {
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

    void ordenamientoRadix() {
        int ciclos = maximoDigito();
        for (int i = 0; i < ciclos; i++) {
            ordenamiento(lista, i);
        }
        for(int i :lista){
            System.out.println(i+" ");
        }
    }

    int maximoDigito() {
        int indice = 1;
        int base = 10;
        for (int i : lista) {
            while (i > base) {
                indice++;
                base *= 10;
            }
        }
        return indice;
    }

    void ordenamiento(ArrayList<Integer> lista, int posicion) {

        int indice = 0;
        int base = (int) Math.pow(10, posicion);

        ArrayList<ArrayList<Integer>> listaAux = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listaAux.add(new ArrayList<>());
        }

        for (int i : lista) {
            indice = i / base % 10;
            listaAux.get(indice).add(i);
        }

        indice = 0;
        for (ArrayList<Integer> subLista : listaAux) {
            for (int i : subLista) {
                lista.set(indice++, i);
            }
        }
    }

}
