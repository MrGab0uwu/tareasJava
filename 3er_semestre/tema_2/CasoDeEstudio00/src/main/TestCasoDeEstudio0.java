package main;

/**
 *
 * @author Jose Alberto
 */
public class TestCasoDeEstudio0 {

    public static void main(String[] args) {

        // Variable de entrada
        String mensaje;
        // Asignar mensaje
        mensaje = "Hola mundo";

        // Objeto de la clase No Recursiva
        HolaMundoNoRecursivoPOO obj = new HolaMundoNoRecursivoPOO(mensaje, 3);
        // Metodo para repetir el mensaje de forma no recursiva
        obj.setSaludo();
        // Metodo para mostrar el mensaje de salida
        obj.showSaludo();

        // Objeto de la clase Recursiva
        HolaMundoRecursivoPOO obj2 = new HolaMundoRecursivoPOO(mensaje, 3);
        // Metodo para repetir el mensaje de forma recursiva
        obj2.setSaludo();
        // Metodo para mostrar el mensaje de salida
        obj2.showSaludo();
    }

}
