/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosher;

/**
 *
 * @author JORGE SECCHI
 */
public class Profesor extends Principal {

    String rfc, departamento;

    @Override
    public void setCaptura() {
        System.out.println("Escribe tu RFC");
        rfc = leer.nextLine();
        System.out.println("Escribe al departamento que perteneces: ");
        departamento = leer.nextLine();
        super.setCaptura();
    }

    @Override
    public void showDatos() {
        System.out.println("RFC: " + rfc);
        System.out.println("Departamento " + departamento);
        super.showDatos();
        leer.nextLine();
    }
}
