/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distintosmetodos;

import javax.swing.JOptionPane;

/**
 *
 * @author gab-uwu
 */
public class DistintosMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodos obj = new metodos();
        try {

            int x = Integer.parseInt(JOptionPane.showInputDialog("Se calculara una potencia dependiendo de\nel número de digitos.\nSolo se permite números enteros con un maximo de tres digitos"));
            if (x < 10) {
                JOptionPane.showMessageDialog(null, obj.metodoConParametrosConRetorno(x));
            } else if (x < 100) {
                obj.metodoConParametrosSinRetorno(x);
                obj.getTexto();
                obj.showTexto();
            } else if (x < 1000) {
                obj.setNumero(x);
                obj.getNumero();
                obj.metodoSinParametrosConRetorno();
                obj.getTexto();
                obj.showTexto();
            } else {
                obj.metodoSinParametrosSinRetorno();
                obj.getTexto();
                obj.showTexto();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, Ingrese lo indicado");
        }
    }

}
