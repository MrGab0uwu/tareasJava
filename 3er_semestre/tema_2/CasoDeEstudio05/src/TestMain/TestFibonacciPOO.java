package TestMain;

public class TestFibonacciPOO {

    public static void main(String[] args) {
        // Objeto de la clase Fibonacci ITERATIVA
        var obj = new FibonacciNoRecursivo(0, 1, 10);
        // Metodo para iterar la sucesión
        obj.setFibonacci();
        // Metodo para mostrar la sucesión
        obj.showFibonacci();

        // Objeto de la clase Fibonacci RECURSIVA
        var obj2 = new FibonacciRecursivo(0, 1, 10);
        // Metodo recursivo para la sucesión
        obj2.setFibonacci();
        // Metodo para mostrar la sucesión
        obj2.showFibonacci();
    }

}
