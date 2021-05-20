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
public class HijaDivision extends ClasePadre {

    public void setDivision(double a, double b) {
        super.setLeer(a, b);
        x = a / b;
    }

    @Override
    public String setResul() {
        resultado = "El resultado de dividr: " + a + " entre " + b + " es: " + x;
        return resultado;
    }

}
