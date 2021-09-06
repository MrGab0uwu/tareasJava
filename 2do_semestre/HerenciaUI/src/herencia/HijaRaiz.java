/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author gab-uwu
 */
public class HijaRaiz extends ClasePadre {

    public void setRaiz(double a, double b) {
        super.setLeer(a, b);
        x = Math.pow(a, 1.0 / b);
    }

    @Override
    public String setResul() {
        resultado = "El resultado de la raiz a la " + b + " de " + a + "\nes: " + x;
        return resultado;
    }

}
