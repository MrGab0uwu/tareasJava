package main;

/**
 *
 * @author Jose Alberto
 */
public class HolaMundoRecursivoPOO {

    // Atributo de entrada
    String texto;
    int repetir;

    // Atributo de salida
    String salida;

    // Metodo constructor sin parametros
    HolaMundoRecursivoPOO() {
        this.texto = "";
        this.salida = "";
        this.repetir = 0;
    }

    // Metodo constructor con parametros
    HolaMundoRecursivoPOO(String texto, int repetir) {
        this.texto = texto;
        this.salida = "";
        this.repetir = repetir;
    }

    // Metodo RECURSIVO
    void setSaludo() {
        if (repetir >= 1) {
            salida += texto + "\n";
            repetir--;
            setSaludo();
        }
    }

    // Metodo show para mostrar el saludos
    void showSaludo() {
        System.out.println(salida);
    }
}
