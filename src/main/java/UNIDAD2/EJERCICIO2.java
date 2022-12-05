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
public class EJERCICIO2 {
    public static void main(String[] args){
        //SUMA
        Scanner sc=new Scanner(System.in);
        int num1, num2, resultado;
        System.out.println("Numero 1: ");
        num1=sc.nextInt();
        System.out.println("Numero 2: ");
        num2=sc.nextInt();
        resultado=num1+num2;
        System.out.println("El resultado es: "+resultado);
    }
}
