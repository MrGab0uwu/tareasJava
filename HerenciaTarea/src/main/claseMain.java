/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import javax.swing.JOptionPane;
import clases.cocheDeportivo;


/**
 *
 * @author gab-uwu
 */
public class claseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        cocheDeportivo obj = new cocheDeportivo();
        
        String marca = JOptionPane.showInputDialog("Ingresa la marca del coche");
        obj.getMarcaCoche(marca);
        
        String modeloCoche = JOptionPane.showInputDialog("Ingresa el modelo del coche");
        obj.setModeloCoche(modeloCoche);
       
        
        String carroceria = JOptionPane.showInputDialog("Ingresa el material para la carrozeria (aluminio/fibra de carbono)");
        obj.setMaterialCarroceria(carroceria);
        
        
        int caballosFuerza = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de caballos de fuerza"));
        obj.setCaballosDeFuerza(caballosFuerza);
        
        
        String pintura = JOptionPane.showInputDialog("Ingresa la pintura del coche");
        obj.setColorPintura(pintura);
        
        float precio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el costo del coche"));
        obj.setPrecio(precio);
        
        obj.showDatos();
        
    }
    
}
