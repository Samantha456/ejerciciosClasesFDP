/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD3;

import java.util.Scanner;

/**
 *
 * @author Saman
 */
public class EJERCICIO6 {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
         float divisor, dividendo, resultado;
        System.out.println("Ingrese el valor del divisor:");
        divisor=n.nextFloat();
        System.out.println("Ingrese el valor del dividendo");
        dividendo=n.nextFloat();
        
      if(divisor==0){
      }
      else{
          resultado=dividendo/divisor;
          System.out.println("El resultado es:"+resultado);
      }    
          
     if(dividendo>0)
            System.out.println("Es divisible");
     
     else{
         
     if(dividendo<0)
            System.out.println("No es divisible");
     
     else{
     if(dividendo!=0)
             System.out.println(" ");           
                     
         }
     }
     
     
    }
   
}  
    


