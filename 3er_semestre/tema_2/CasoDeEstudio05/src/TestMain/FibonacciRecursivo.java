package TestMain;

// Clase FIBONACCI "RECURSIVO"
public class FibonacciRecursivo {

    // Atributos de entrada
    int inicio1;
    int inicio2;
    int nAtributos;

    // Atributo de salida
    String serie;

    // Metodo Constructor sin parametros
    FibonacciRecursivo() {
        inicio1 = 0;
        inicio2 = 0;
        nAtributos = 0;
        serie = "";
    }

    // Metodo Constructor con parametros "int"
    FibonacciRecursivo(int inicio1, int inicio2, int nAtributos) {
        this.inicio1 = inicio1;
        this.inicio2 = inicio2;
        this.nAtributos = nAtributos;
        serie = "";
    }
    
    // Metodo set para la recursividad de la sucesipon
    void setFibonacci() {
        // Variable temporal
        int auxiliar;
        // Caso Base
        if (nAtributos != 0) {
            // Guardar cada número de la sucesión en la variable de salida
            serie += inicio1 + " ";
            // Almacenar el valor de n2 en la variable auxiliar
            auxiliar = inicio2;
            // valor de n2 se le asigna la suma de el mismo con n1
            inicio2 += inicio1;
            // n1 se le asigna el valor de auxiliar que era el valor de n2
            inicio1 = auxiliar;
            // Decrementa en 1 la proxima vez que se invocque (en la condicion)
            nAtributos--;
            setFibonacci();
        }
    }

    // Metodo que muestra la sucesión en consola
    void showFibonacci() {
        // Mostrar la sucesión
        System.out.println(serie);
    }

}
