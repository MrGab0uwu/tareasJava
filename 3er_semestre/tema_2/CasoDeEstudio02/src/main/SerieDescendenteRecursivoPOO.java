package main;

public class SerieDescendenteRecursivoPOO {

    // Atributo de entrada
    int numero;
    int casoBase;
    // Atributo de salida
    String salida;
    
    SerieDescendenteRecursivoPOO() {
        numero = 0;
        casoBase = 0;
        salida = "";
    }
    
    SerieDescendenteRecursivoPOO(int numero) {
        this.numero = numero;
        casoBase = numero;
        salida = "";
    }
    
    void setSerie() {
        if (casoBase >= 1) {
            salida += casoBase+" ";
            casoBase--;
            setSerie();
        }
    }
    
    void showSerie(){
        System.out.println("La serie descendente del número "+numero+" es: "+salida);
    }    
}
