package main;

public class SerieDescendenteNoRecursivoPOO {

    // Atributo de entrada
    int numero;
    int casoBase;
    // Atributo de salida
    String salida;
    
    SerieDescendenteNoRecursivoPOO() {
        numero = 0;
        casoBase = 0;
        salida = "";
    }
    
    SerieDescendenteNoRecursivoPOO(int numero) {
        this.numero = numero;
        casoBase = numero;
        salida = "";
    }
    
    void setSerie() {
        for (int i = numero; i >= 1; i--) {
            salida += i+" ";
        }
    }
    
    void showSerie(){
        System.out.println("La serie descendente del número "+numero+" es: "+salida);
    }    
}
