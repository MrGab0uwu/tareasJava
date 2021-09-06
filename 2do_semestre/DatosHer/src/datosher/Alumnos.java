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
    String carrera;
    
    @Override
    public void setCaptura() {
        System.out.println("Escribe tu numero de control: ");
        nc = leer.nextDouble();
        leer.nextLine();
        System.out.println("Escribe la carrera que estas cursando: ");
        carrera = leer.nextLine();
        super.setCaptura();
    }

    @Override
    public void showDatos() {
        System.out.println("NControl " + nc);
        System.out.println("Carrera" + carrera);
        super.showDatos();
        leer.nextLine();
    }
}
