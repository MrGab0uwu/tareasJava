/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosletras;

import java.util.Scanner;

/**
 *
 * @author gab-uwu
 */
public class literales {

    String[] unidadNumerador= {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
    String[] unidadDenominador = {"", "", "medio", "tercio", "cuarto", "quinto", "sexto", "septimo", "octavo", "noveno"};
    String[] unidadEspecial = {"","once","doce","trece","catroce","quince","dieciseis","diecisiete","dieciocho","diecineuve"};
    String[] decenas = {"", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
    String[] centenas = {"", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};
    String literal;
    Scanner sc = new Scanner(System.in);
    int u, d, c, m, x, y;

    public literales() {
        System.out.println("NUMERO numerador entero hasta de 4 digitos");
        x = sc.nextInt();
        System.out.println("NUMERO denominador entero hasta de 4 digitos");
        y = sc.nextInt();

        System.out.println(getMillaresN(x) + getCentenaN(x) + getDecenaN(x));
        System.out.println(getMillaresD(y) + getCentenaD(y) + getDecenaD(y));
    }

    public String getMillaresN(int a) {

        if (a > 999 && a < 10000) {
            for (int i = 0; i < 3; i++) {
                a = a / 10;
            }
            
            this.m = a % 10;//valor indice para la cadena
            
            if (m == 1) {//Si es 1 pasa ser mil
                literal = "mil ";
            } else {
                literal = unidadNumerador[m] + " mil ";
            }

        } else {//Si no se tiene un numero de 4 digitos el millar es nulo
            literal = "";
        }

        return literal;
    }

    public String getMillaresD(int b) {

        if (b > 999 & b < 10000) {
            for (int i = 0; i < 3; i++) {
                b = b / 10;
            }
            
            this.m = b % 10;//valor indice para la cadena

            if (m == 1) {//Si es 1 pasa ser mil
                literal = "mil ";
            } else {
                literal = unidadNumerador[m] + " mil ";
            }

        } else {//Si no se tiene un numero de 4 digitos el millar es nulo
            literal = "";
        }

        return literal;
    }

    //CENTENAS
    public String getCentenaN(int a) {
    int unidad = 0;
        if (a > 99) {

            for (int i = 0; i < 2; i++) {
                if (i == 1) {
                    unidad = a%10;
                }
                a = a / 10;
            }
            
            this.c = a % 10;//valor indice para la cadena
            
            if (unidad == 0) {
                literal = "cien ";
            } else {
                literal = centenas[c] + " ";
            }

        }else {
            literal = "";
        }

        return literal;
    }

    public String getCentenaD(int b) {
    int unidad = 0;
        if (b > 99) {

            for (int i = 0; i < 2; i++) {
                if (i == 1) {
                    unidad = b%10;
                }
                b = b / 10;
            }

            this.c = b % 10;//valor indice para la cadena

            if (unidad == 0) {
                literal = "centesimos";
            } else {
                literal = centenas[c] + " ";
            }

        }else {
            literal = "";
        }

        return literal;
    }

    //DECENAS
    public String getDecenaN(int a) {
    int unidad = 0;
        if (a > 9) {
            
            unidad = a%10;
            a = a / 10;
            
            this.d = a % 10;//valor indice para la cadena

            if (unidad != 0) {
                unidad =  (d*10)+unidad; 
                if (unidad > 10 && unidad < 20) {
                    literal = unidadEspecial[(unidad%10)];
                }
                else if (unidad > 20 && unidad < 30) {
                    if (unidad == 21) {
                        literal = "veintiuno-avo";
                    }else{
                        literal = "veinti" + unidadNumerador[(unidad%10)];
                    }
                }else{
                    literal = decenas[d] + "y"+ unidadNumerador[(unidad%10)];
                }
                
            }else{
                if (d == 1) {
                    literal = "diez";
                }else{
                    literal = decenas[d];
                }
            }

        }else {
            literal = unidadNumerador[a];
        }

        return literal;
    }

    public String getDecenaD(int b) {
    int unidad = 0;
        if (b > 9) {
            
            unidad = b%10;
            b = b / 10;
            
            this.d = b % 10;//valor indice para la cadena

            if (unidad != 0) {
                unidad =  (d*10)+unidad; 
                if (unidad > 10 && unidad < 20) {
                    literal = unidadEspecial[(unidad%10)]+"-avo";
                }
                else if (unidad > 20 && unidad < 30) {
                    if (unidad == 21) {
                        literal = "veintiuno-avo";
                    }else{
                        literal = "veinti" + unidadNumerador[(unidad%10)]+"-avo";
                    }
                }else{
                    literal = decenas[d] + "y" + unidadNumerador[(unidad%10)]+"-avos";
                }
                
            }else{
                if(d == 0){
                    literal = "";
                }
                else if (d == 1) {
                    literal = "diezavos";
                }else{
                    literal = decenas[d] + "-avos";
                }
            }

        }else if(b == 1){
            literal = "";
        }
        else {
            literal = unidadDenominador[b];
        }

        return literal;
    }

}
