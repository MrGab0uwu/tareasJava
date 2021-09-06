package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author gab-uwu
 */
public class cocheDeportivo extends cocheBase {
    
    protected int caballosDeFuerza;
    protected float precio;


    public void setCaballosDeFuerza(int caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }

    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
    public void showDatos(){
        JOptionPane.showMessageDialog(null,"Marca del coche: "+getMarcaCoche()
                +"\nModelo del coche: "+getModeloCoche()
                +"\nMaterial de carrozeria del coche: "+getMaterialCarroceria()
                +"\nCaballos de fuerzo del coche: "+getCaballosDeFuerza()
                +"\nPintura del coche: "+getColorPintura()
                +"\nPrecio del coche: "+getPrecio());
    }
    
}
