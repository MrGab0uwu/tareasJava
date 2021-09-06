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
public class HijaRestar extends ClasePadre {

    public void setResta(double a, double b) {
        super.setLeer(a, b);
        x = a - b;
    }

    @Override
    public String setResul() {
        resultado = "El resultado de restar " + a + " menos " + b + " es " + x;
        return resultado;
    }

}
