package arbolbinario;

import java.util.Scanner;

public class TestArbolBinario {

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        Object letras[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"};
        int valores[] = {5, 3, 4, 2, 1, 7, 6 , 10, 8, 9, 16, 21, 20, 49, 28, 31, 19};
        boolean op1;
        op1 = false;
        int opcion;
        int nodoValor;
        Object nodoContenido;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n-------- Menú de árboles binarios --------\n"
                    + "1. Importar datos de un arreglo\n"
                    + "2. Agregar un nodo\n"
                    + "3. Recorrido inOrden\n"
                    + "4. Recorrido preOrden\n"
                    + "5. Recorrido postOrden\n"
                    + "6. Buscar un nodo\n"
                    + "7. Eliminar un nodo\n"
                    + "8. Salir\n"
                    + "Elige una opción...");
            opcion = sc.nextInt();

            if (arbol.estaVacio(arbol.raiz)) {
                if (opcion != 1 && opcion != 2) {
                    System.out.println("Primero llene con datos el arbol para usar las demas funcionalidades.");
                    continue;
                }
            }

            switch (opcion) {
                case 1:
                    if (!op1) {
                        for (int i = 0; i < letras.length; i++) {
                            arbol.insertarNodo(valores[i], letras[i]);
                        }
                    } else {
                        System.out.println("No se puede realizar dos veces esta acción");
                    }
                    op1 = true;
                    break;
                case 2:
                    System.out.println("Ingresa el valor del nodo");
                    nodoValor = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingresa el contenido del nodo");
                    nodoContenido = sc.nextLine();
                    arbol.insertarNodo(nodoValor, nodoContenido);
                    break;
                case 3:
                    if (arbol.estaVacio(arbol.raiz)) {
                        System.out.println("si");
                    } else {
                        System.out.println("---- InOrden ----");
                        arbol.inOrder(arbol.raiz);
                    }
                    break;
                case 4:
                    if (arbol.estaVacio(arbol.raiz)) {
                        System.out.println("si");
                    } else {
                        System.out.println("---- PreOrden ----");
                        arbol.preOrder(arbol.raiz);
                    }
                    break;
                case 5:
                    if (arbol.estaVacio(arbol.raiz)) {
                        System.out.println("si");
                    } else {
                        System.out.println("---- PostOrden ----");
                        arbol.postOrder(arbol.raiz);
                    }
                    break;
                case 6:
                    System.out.println("Ingrese que nodo desea buscar");
                    nodoValor = sc.nextInt();
                    System.out.println(arbol.buscarNodo(nodoValor));
                    break;
                case 7:
                    System.out.println("Ingrese que nodo desea eliminar");
                    nodoValor = sc.nextInt();
                    System.out.println(arbol.eliminarNodo(nodoValor));
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingresa una opción del 1 al 9");
                    break;
            }

        } while (opcion != 8);

    }
}
