package TestMain;

// Clase FIBONACCI "NO RECURSIVA"
public class FibonacciNoRecursivo {

    // Atributos de entrada
    int inicio1;
    int inicio2;
    int nAtributos;

    // Atributo de salida
    String serie;

    // Metodo Constructor sin parametros
    FibonacciNoRecursivo() {
        inicio1 = 0;
        inicio2 = 0;
        nAtributos = 0;
        serie = "";
    }

    // Metodo Constructor con parametros "int"
    FibonacciNoRecursivo(int inicio1, int inicio2, int nAtributos) {
        this.inicio1 = inicio1;
        this.inicio2 = inicio2;
        this.nAtributos = nAtributos;
        serie = "";
    }

    // Metodo set para la iteración de la sucesipon
    void setFibonacci() {
        // Variable temporal
        int auxiliar;
        // Iteracion
        for (int i = 1; i <= nAtributos; i++) {
            // Guardar cada número de la sucesión en la variable de salida
            serie += inicio1 + " ";
            // Almacenar el valor de n2 en la variable auxiliar
            auxiliar = inicio2;
            // valor de n2 se le asigna la suma de el mismo con n1
            inicio2 += inicio1;
            // n1 se le asigna el valor de auxiliar que era el valor de n2
            inicio1 = auxiliar;
        }

    }

    // Metodo que muestra la sucesión en consola
    void showFibonacci() {
        // Mostrar la sucesión
        System.out.println(serie);
    }

}
