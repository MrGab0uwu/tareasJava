package Cola;

import java.io.File;
import java.util.Scanner;

public class TestCasoDeEstudioCola {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        File fichero = new File("Lista_de_contactos.txt");
        MenuListaContacto obj = new MenuListaContacto();

        int opcion;
        String nombreContacto;

        do {
            System.out.println(("""
                                COLA
                                1.- Exportar fichero de contactos 
                                2.- Agregar contacto
                                3.- Eliminar un contacto
                                4.- Consultar un contacto
                                5.- N\u00famero de contactos
                                6.- Listar los contactos
                                7.- Actualizar fichero de contactos
                                8.- Salir"""));
            opcion = sc.nextInt();
            switch (opcion) {

                case 1 -> {
                    obj.setImportarContactos(fichero);
                }
                case 2 -> {
                    System.out.println("Ingrese el nombre del contacto que desea agregar");
                    sc.nextLine();
                    nombreContacto = sc.nextLine();
                    obj.setNuevoContacto(nombreContacto);
                }
                case 3 -> {
                    obj.setEliminarContacto();
                }
                case 4 -> {
                    obj.showConsultarContacto();
                }
                case 5 ->{
                    obj.showNumeroDeContactos();
                }
                case 6 ->{
                    obj.showListaContactos();
                }
                case 7 ->{
                    obj.setActualizarFichero(fichero);
                }
                case 8 ->{
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Ingresa una opcion correcta");
                }
            }
        } while (opcion != 8);

    }
}
