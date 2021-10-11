package TestMain;

public class serieNumericaRecursiva {

    // Atributos de entrada
    int inicio;
    int numeroSerie;
    int limite;
    int casoBase;

    // Atributo de salida
    String salida;

    // Metodo constructor sin parametros
    serieNumericaRecursiva() {
        inicio = 0;
        numeroSerie = 0;
        limite = 0;
        casoBase = 0;
        salida = "";
    }

    // Metodo constructor con parametros "int"
    serieNumericaRecursiva(int inicio, int limite) {
        this.inicio = inicio;
        numeroSerie = inicio;
        this.limite = limite;
        casoBase = limite;
        salida = "";
    }

    // Metodo iterativo para la serie numerica
    void setSerieNumerica() {
        // Variable axuiliar
        if (casoBase >= 1) {
            salida += numeroSerie + " ";
            numeroSerie++;
            casoBase--;
            setSerieNumerica();
        }
    }

    // Metodo para mostrar la serie numerica
    void showSerieNumerica() {
        // Mostrar la serie numerica
        System.out.println("La serie numerica de " + inicio + " de tamaño " + limite + " es: " + salida);
    }

}
