package TestMain;

public class FactorialRecursivoPOO {
    
    int i;
    int numero;
    int factorial;
    
    FactorialRecursivoPOO(){
        numero = 0;
        i = 0;
        factorial = 1;
    }
    
    FactorialRecursivoPOO(int numero){
        this.numero = numero;
        i = numero;
        factorial = 1;
    }
    
    void setFactorial(){
        
        if (i >= 1) {
            factorial = factorial * i;
            i--;
            setFactorial();
        }
        
    }
    
    void showFactorial(){
        System.out.println(factorial);
    }
    
}
