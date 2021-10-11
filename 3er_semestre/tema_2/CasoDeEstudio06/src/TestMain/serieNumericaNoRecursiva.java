package TestMain;

public class serieNumericaNoRecursiva {

    // Atributos de entrada
    int inicio;
    int limite;

    // Atributo de salida
    String salida;

    // Metodo constructor sin parametros
    serieNumericaNoRecursiva() {
        inicio = 0;
        limite = 0;
        salida = "";
    }

    // Metodo constructor con parametros "int"
    serieNumericaNoRecursiva(int inicio, int limite) {
        this.inicio = inicio;
        this.limite = limite;
        salida = "";
    }

    // Metodo iterativo para la serie numerica
    void setSerieNumerica() {
        // Variable axuiliar
        int numero;
        numero = inicio;
        for (int i = 1; i <= limite; i++) {
            salida += numero + " ";
            numero++;
        }

    }

    // Metodo para mostrar la serie numerica
    void showSerieNumerica() {
        // Mostrar la serie numerica
        System.out.println("La serie numerica de " + inicio + " de tamaño " + limite + " es: " + salida);
    }

}
