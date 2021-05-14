/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddevennumber;

import javax.swing.JOptionPane;

/**
 *
 * @author gab-uwu
 */
public class oddEvenComparator {
    int number;
    String evenOrOddNumber;
    
    
    public oddEvenComparator(){
        number = Integer.parseInt(JOptionPane.showInputDialog("Ingresa cualquier numero entero para\n" + "saber si es un n\u00famero par o impar"));
        setNumber(number);
        showNumber();
    }
    
    public void setNumber(int x){
        this.evenOrOddNumber = ((number%2)==0)? "El número "+number+"es par" : "El número "+number+" es impar";;
    }
   
    
    public String getNumber(){
        return evenOrOddNumber;
    }
    
    void showNumber(){
        JOptionPane.showMessageDialog(null,evenOrOddNumber);
    }
    
}
