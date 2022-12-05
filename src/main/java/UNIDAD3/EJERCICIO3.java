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
public class EJERCICIO3 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int edad;
        System.out.println("\t\tPrograma que determina si usted es mayor de edad");
        System.out.println("Ingrese su edad");
        edad=lector.nextInt();
        
        if(edad>=18)
            //SI ES VERDADERO
            System.out.println("Eres MAYOR de edad");
        else
            //SI ES FALSO
            System.out.println("Eres MENOR de edad");
       
    }
  
}
