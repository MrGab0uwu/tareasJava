package main;

/**
 *
 * @author Jose Alberto
 */
public class HolaMundoNoRecursivoPOO {

    // Atributo de entrada
    String texto;
    int repetir;

    // Atributo de salida
    String salida;

    // Metodo constructor sin parametros
    HolaMundoNoRecursivoPOO() {
        this.texto = "";
        this.salida = "";
        this.repetir = 0;
    }

    // Metodo constructor con parametros
    HolaMundoNoRecursivoPOO(String texto, int repetir) {
        this.texto = texto;
        this.salida = "";
        this.repetir = repetir;
    }

    void setSaludo() {
        for (int i = 0; i < repetir; i++) {
            salida += texto + "\n";
        }
    }

    void showSaludo() {
        System.out.println(salida);
    }
}
