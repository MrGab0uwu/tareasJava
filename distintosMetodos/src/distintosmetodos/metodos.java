/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distintosmetodos;

import javax.swing.JOptionPane;
import java.lang.Math;

/**
 *
 * @author gab-uwu
 */
public class metodos {

    int num = 0;
    String texto = "";

    public String metodoConParametrosConRetorno(int x) { // Metodo que cuenta con parametros y return
        x = (int) Math.pow(x, 1);
        this.texto = "El número digitado elevado a la uno es: " + x;
        return texto;

    }

    public void metodoConParametrosSinRetorno(int x) { // Metodo que cuenta con parametros pero sin return
        x = (int) Math.pow(x, 2);
        this.texto = "El número digitado elevado al cuadrado es: " + x;
    }

    public void setNumero(int x) { //Metodo get de la variable número
        this.num = x;
    }

    public int getNumero() { //Metodo get de la variable número

        JOptionPane.showMessageDialog(null, num);
        return num;
    }

    public String metodoSinParametrosConRetorno() { // Metodo que no cuenta con parametros pero si con return
        num = (int) Math.pow(num, 3);
        this.texto = "El número digitado elevado al cubo es: " + num;
        return texto;
    }

    public void metodoSinParametrosSinRetorno() { // Metodo que no cuenta con parametros y return
        this.texto = "El número digitado no es permitido";
    }

    public String getTexto() { // Metodo get de la variable texto
        return texto;
    }

    public void showTexto() { // Metodo show de la variable texto
        JOptionPane.showMessageDialog(null, texto);
    }

}
