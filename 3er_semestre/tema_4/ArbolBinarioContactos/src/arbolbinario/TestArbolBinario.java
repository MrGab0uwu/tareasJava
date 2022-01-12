package arbolbinario;

import java.util.Scanner;

public class TestArbolBinario {

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        int opcion;
        String apPat;
        Scanner sc = new Scanner(System.in);

        ListaContactos contactos = new ListaContactos();
        contactos.importarArchivo("Lista_de_contactos.txt", arbol);
        
        do {
            System.out.println("\n-------- Menú de árboles binarios --------\n"
                    + "1. Recorrido inOrden\n"
                    + "2. Recorrido preOrden\n"
                    + "3. Recorrido postOrden\n"
                    + "4. Buscar un contacto\n"
                    + "5. Eliminar un contacto\n"
                    + "6. Actualizar fichero de contactos\n"
                    + "7. Salir\n"
                    + "Elige una opción...");
            opcion = sc.nextInt();

            if (arbol.estaVacio(arbol.raiz)) {
                System.out.println("El arbol esta vacio");
            }

            switch (opcion) {
                case 1:
                    System.out.println("---- InOrden ----");
                    arbol.inOrder(arbol.raiz);
                    break;
                case 2:
                    System.out.println("---- PreOrden ----");
                    arbol.preOrder(arbol.raiz);
                    break;
                case 3:
                    System.out.println("---- PostOrden ----");
                    arbol.postOrder(arbol.raiz);
                    break;
                case 4:
                    System.out.println("---- Buscar contacto ----\nIngresa el apellido Paterno");
                    sc.nextLine();
                    apPat = sc.nextLine();
                    System.out.println(arbol.buscarNodo(apPat));
                    break;
                case 5:
                    System.out.println("---- Eliminar contacto ----\nIngresa el apellido Paterno");
                    sc.nextLine();
                    apPat = sc.nextLine();
                    System.out.println(arbol.eliminarNodo(apPat));
                    break;
                case 6:
                    contactos.reescribirArchivo("Lista_de_contactos.txt", arbol);                    
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingresa una opción del 1 al 7");
                    break;
            }

        } while (opcion != 7);

    }
}
