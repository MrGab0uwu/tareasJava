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

    public void setRaiz() {
        System.out.println("\u001B[33mEl primer número sera el dividendo/númerador, el segundo número sera el indice de que tan grande sera la raiz");
        super.setLeer();
        x = (int) Math.pow(a, 1.0 / b);
    }

    @Override
    public void setResul() {
        System.out.println("\u001B[36mEl resultado de la raiz a la " + b + " de " + a + " es: " + x);
    }

}
