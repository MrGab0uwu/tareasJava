/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;
import java.util.Scanner;


/**
 *
 * @author gab-uwu
 */
public class Persona {
    Scanner sc = new Scanner(System.in);
    
    int hombre = 0,hombreMayor = 0,mujer = 0,mujerMayor = 0;
    int[] yearsOld;
    String[] gender;
    
    public void setPersonData(int lenght){
        this.gender = new String[lenght];    
        this.yearsOld = new int[lenght];    
        for (int i = 0; i < lenght; i++){            
            System.out.println("Ingresa el genero de la persona #"+(i+1));
            this.gender[i] = sc.nextLine();            
        
            System.out.println("Ingresa la edad de la persona #"+(i+1));
            this.yearsOld[i] = sc.nextInt();
            
            sc.nextLine();//Limpiamos buffer de entrada
            
        }
    }
    
    public String[] getGender(){
        return gender;
    }
    
    
    public int[] getYearsOld(){
        return yearsOld;
    }
    
}
