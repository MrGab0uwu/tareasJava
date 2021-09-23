/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author gab-uwu
 */
public class NumerosDigitos {
    
    int[] numeros;
    String[] nombreDigito;
    String numerosDigitos;
    
    public NumerosDigitos(int[] numeros, String[] nombreDigito ){
        this.numeros = numeros; 
        this.nombreDigito = nombreDigito;
        numerosDigitos = "";
    }
    
    public void setNumeroDato(){
                // ciclo para evaluar el arreglo conforme a su longitud
        for (int i = 0; i < numeros.length; i++) {
            // Arreglo que obtiene todos los caracteres de cada indice del arreglo
            char digits[] = String.valueOf(numeros[i]).toCharArray(); // "123456" = {'1','2','3','4','5','6'}
            // Revisa si el numero en el indice i es menor que 0 o mayor que 999
            if (numeros[i] < 0 || numeros[i] > 999) {
                numerosDigitos += numeros[i]+" esta fuera del rango permitido\n\n";
                // Si se cumple la condicion, se salta al siguiente indice del arreglo
                continue;
                // Revisa si el numero en el indice i es menor o igual que 9
            } else if (numeros[i] <= 9) {
                numerosDigitos += numeros[i]+" esta en rango de 0 a 9\n";
                // Revisa si el numero en el indice i es menor o igual que 99
            } else if (numeros[i] <= 99) {
                numerosDigitos += numeros[i]+" esta en rango de 10 a 99\n";
                // Revisa si el numero en el indice i es menor o igual que 999
            } else if (numeros[i] <= 999) {
                numerosDigitos += numeros[i]+" esta en rango de 100 a 990\n";
            }
            // Ciclo que se iterara conforme a la longitud del arreglo digits
            for (int j = 0; j < digits.length; j++) {
                // Ciclo que se iterara diez veces
                for (int k = 0; k < nombreDigito.length; k++) {
                    // Variable temporal que obtiene el valor de digits[j] mediante Character.getNumericValue
                    int digitInt = Character.getNumericValue(digits[j]); // '1' == 1
                    // Si el indice k coincide con el numero almacenado en digitInt
                    if (k != digitInt) {
                        // Si es diferente se salta la iteracion y empieza la siguiente
                        continue;
                    }
                    numerosDigitos+=nombreDigito[k]+ " ";
                }
            }
            numerosDigitos+="\n\n";
        }
    }
    
    public void showNumeroDato(){
        // Se imprime los resultados de si es o no es y el nombre de cada digito
        System.out.println(numerosDigitos);
    }
    
    
}
