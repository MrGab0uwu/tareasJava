package main;

/**
 *
 * @author gab-uwu
 */
public class Main {

    public static void main(String[] args) {
        // Declaracion e inicializacio del arreglo "numeros"
        int numeros[] = {-1, 12, 200, 43, 6, 99, -212, 989898, -122}; 
        // Arreglo que sirve como apoyo para el nombre de los digitos
        String nombreDigito[] = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        
        NumerosDigitos obj = new NumerosDigitos(numeros, nombreDigito);
        
        // Algoritmo para la revision de cada digito del arreglo numeros
        obj.setNumeroDato();
        // Mostrar el resultado de setNumerosCadenas
        obj.showNumeroDato();

    }

}
