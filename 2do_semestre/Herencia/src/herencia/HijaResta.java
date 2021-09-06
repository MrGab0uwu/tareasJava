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
public class HijaResta extends ClasePadre {

    public void setResta() {
        super.setLeer();
        x = a - b;
    }

    @Override
    public void setResul() {
        System.out.println("\u001B[36mEl resultado de la resta es: " + x);
    }

}
