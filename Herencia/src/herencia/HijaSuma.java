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
public class HijaSuma extends ClasePadre {

    public void setSuma() {
        super.setLeer();
        x = a + b;
    }

    @Override
    public void setResul() {
        System.out.println("\u001B[36mEl resultado de la suma es: " + x);
    }

}
