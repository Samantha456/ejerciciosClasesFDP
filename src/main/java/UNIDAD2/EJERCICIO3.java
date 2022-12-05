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
public class EJERCICIO3 {
     public static void main(String[] args) {
         //Programa que realiza una resta
         
         Scanner leer=new Scanner(System.in);
         int valor1, valor2, resultado;
         System.out.println("Ingrese valor 1: ");
         valor1=leer.nextInt();
         System.out.println("Ingrese valor 2: ");
         valor2=leer.nextInt();
         resultado=valor1-valor2;
         System.out.println("El resultado de la resta es: "+resultado);
         
     }
}

