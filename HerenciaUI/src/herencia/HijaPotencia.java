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
public class HijaPotencia extends ClasePadre{
    
    public void setPotencia(double a, double b){
        super.setLeer(a, b);
        x = Math.pow(a, b);
    }
    
    @Override
    public String setResul(){
        resultado = "El resultado de elevar "+ a + " a la "+ b +" potencia es: "+x;
        return resultado;
    }
    
}
