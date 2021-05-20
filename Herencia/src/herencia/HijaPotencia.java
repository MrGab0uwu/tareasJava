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
public class HijaPotencia extends ClasePadre {

    public void setPotencia() {
        System.out.println("\u001B[33mEl primer número sera el que va ser aumentado, el segundo número sera el indice de que tan grande sera la potencia");
        super.setLeer();
        x = (int) Math.pow(a, b);
    }

    @Override
    public void setResul() {
        System.out.println("\u001B[36mEl resultado de elevar " + a + " a la potencia " + b + " es: " + x);
    }

}
