/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD2;

import java.util.Scanner;

/**
 *
 * @author Saman
 */
public class EJERCICIO4 {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int nacimiento, actual, edad;
         System.out.println("Ingrese año de nacimiento: ");
         nacimiento=sc.nextInt();
         System.out.println("Ingrese año actual: ");
         actual=sc.nextInt();
         edad=actual-nacimiento;
         System.out.println("Su edad es: "+edad);
     }
}
