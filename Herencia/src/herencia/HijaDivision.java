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

    public void setDivision() {
        System.out.println("\u001B[33mEl primer número sera el dividendo/númerador y el segundo el divisor/denominador");
        super.setLeer();
        x = a / b;
    }

    @Override
    public void setResul() {
        System.out.println("\u001B[36mEl resultado de la división es: " + x);
    }
}
