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
public class ClasePadre {

    double a, b, x;
    String resultado;

    public void setLeer(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String setResul() {
        resultado = "El resultado es " + x;
        return resultado;
    }

}
