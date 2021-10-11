package TestMain;

public class TestFactorialPOO {

    // Metodo MAIN
    public static void main(String[] args) {

        // Objeto de la clase NO RECURSIVA
        FactorialNoRecursivoPOO factorial = new FactorialNoRecursivoPOO(4);
        // Evaluar el factorial de forma "ITERATIVA"
        factorial.setFactorial();
        factorial.showFactorial();

        // Objeto de la clase RECURSIVA
        FactorialRecursivoPOO factorial2 = new FactorialRecursivoPOO(4);
        // Evaluar el factorial de forma "RECURSIVA"
        factorial2.setFactorial();
        // Mostrar el resultado del factorial
        factorial2.showFactorial();
    }

}
