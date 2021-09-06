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
public class HijaSumar extends ClasePadre {

    public void setSuma(double a, double b) {
        super.setLeer(a, b);
        x = a + b;
    }

    @Override
    public String setResul() {
        resultado = "El resultado de sumar " + a + " mas " + b + " es: " + x;
        return resultado;
    }

}
