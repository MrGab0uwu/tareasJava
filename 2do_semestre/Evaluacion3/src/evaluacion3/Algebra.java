/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion3;

/**
 *
 * @author JORGE SECCHI
 */
public class Algebra extends Principal {

    public Algebra() {
        setDatos();
        setMayor();
        showPromedios();
    }

    @Override
    public void showPromedios() {
        System.out.println("Materia Algebra Lineal");
        System.out.println("El promedio mayor es: " + mayor);
        System.out.println("El alumno es: " + nombre);
    }

}
