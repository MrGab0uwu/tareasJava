package TestMain;

public class FactorialNoRecursivoPOO {

    int numero;
    int factorial;

    FactorialNoRecursivoPOO() {
        numero = 0;
        factorial = 1;
    }

    FactorialNoRecursivoPOO(int numero) {
        this.numero = numero;
        factorial = 1;
    }

    void setFactorial() {
        for (int i = numero; i >= 1; i--) {
            factorial = factorial * i;
        }
    }

    void showFactorial() {
        System.out.println(factorial);
    }

}
