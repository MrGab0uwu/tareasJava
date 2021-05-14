
package metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author gab-uwu
 */
public class metodoConstructor {
    
    char centena,decena,unidad;    
    
    public metodoConstructor(){
        String[] options = {"Centena","Decena","Unidad"};
        
        String x = JOptionPane.showInputDialog("Ingresa un número de tres digitos");
        
        setCentena(x);
        setDecena(x);
        setUnidad(x);
        
        int selector = JOptionPane.showOptionDialog(null,"¿Que desea obtener?","Selecciona",0,JOptionPane.QUESTION_MESSAGE,null,options,"");
        
        switch(options[selector]){
            
            case "Centena" -> {
                JOptionPane.showMessageDialog(null,"El número "+x+", tiene: "+centena+" centena(s)","Resultado",JOptionPane.INFORMATION_MESSAGE);
            }
            case "Decena" -> {
                JOptionPane.showMessageDialog(null,"El número "+x+", tiene: "+decena+" decena(s)","Resultado",JOptionPane.INFORMATION_MESSAGE);
            }
                
            case "Unidad" -> {
                JOptionPane.showMessageDialog(null,"El número "+x+", tiene: "+unidad+" unidade(s)","Resultado",JOptionPane.INFORMATION_MESSAGE);
            }
            default -> JOptionPane.showMessageDialog(null,"Ingresa correctamente los datos","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void setCentena(String a) {
        this.centena = a.charAt(0);
    }
    
    public void setDecena(String a) {
        this.decena = a.charAt(1);
    }
    
    public void setUnidad(String a) {
        this.unidad = a.charAt(2);
    }
    
    
    public int getCentena(){
        return centena;
    }
   
    public int getDecena(){
        return decena;
    }
    
    public int getUnidad(){
        return unidad;
    }

}
