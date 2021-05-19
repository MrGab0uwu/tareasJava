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
public class Alumnos extends Principal {

    double nc;
    
    @Override
    public void setCaptura() {
        super.setCaptura();
        System.out.println("Escribe tu numero de control");
        nc = leer.nextDouble();
    }

    @Override
    public void showDatos() {
        super.showDatos();
        System.out.println("NControl " + nc);
        leer.nextLine();
    }
}
