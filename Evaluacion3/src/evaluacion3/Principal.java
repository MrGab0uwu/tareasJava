/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion3;
import java.util.Scanner;
/**
 *
 * @author JORGE SECCHI
 */
public abstract class Principal {
    Scanner leer = new Scanner(System.in);
   public double prom[] = new double [5];
   public String nom[] = new String [5];
   public double cal,sum,pro;
   public double mayor=0;
   public String nombre;
   
   public void setDatos(){
       for (int x=0;x<5;x++)
       {
           System.out.println("Nombre del Alumno");
           nom[x]=leer.nextLine();
           for(int i=1;i<=4;i++)
           {
               System.out.println("Escribe Calificación # "+i);
               cal = leer.nextDouble();
               sum = sum + cal;
           }
           leer.nextLine();
           pro = sum / 4;
           prom[x]=pro;
           sum =0;
           pro = 0;
       }
   }
   
   public void setMayor(){
       for (int x=0;x<5;x++)
       {
           if (prom[x]>mayor)
           {
               mayor = prom[x];
               nombre = nom[x];
           }
       }
   }
   
   abstract void showPromedios();
   
    
}
