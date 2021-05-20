/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author JORGE SECCHI
 */
public class HijaMul extends ClasePadre {

    public void setMul(double a, double b) {
        super.setLeer(a, b);
        x = a * b;
    }

    @Override
    public String setResul() {
        resultado = "El resultado de multiplicar " + a + " por " + b + " es: " + x;
        return resultado;
    }

}
