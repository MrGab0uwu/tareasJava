/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion;

/**
 *
 * @author gab-uwu
 */
public class Suma {
    int suma,resta,multi,division;
    
    public void setOperaciones(int a, int b){
        this.suma = a+b;
        this.resta = a-b;
        this.multi = a*b;
        this.division = a/b;
    }
    
    public int getOperaciones(){
        return suma+resta+multi+division;
    }
    
    void showOperaciones(){
        System.out.println("Resultado de la suma es: " + suma + "\nResultado de la resta es:" + resta + "\nResultado de la multi es:" + multi + "\nResultado de la divison es:" + division);
    }
    
}
