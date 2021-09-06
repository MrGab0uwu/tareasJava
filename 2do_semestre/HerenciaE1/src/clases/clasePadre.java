
package clases;
import javax.swing.JOptionPane;

/* @author gab-uwu */
public class clasePadre {
    
    protected int valor1, valor2, resultado;
    
    //Este metodo pide los valores al usuario
    public void setDatos(){
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Dame el primer valor: "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Dame el segundo valor: "));
        
    }
    
    //Este metodo muestra el resultado
    public void showDatos(){
        JOptionPane.showMessageDialog(null,resultado);
    }
    
}
