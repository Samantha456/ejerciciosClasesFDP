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
public class EJERCICIO7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double base, altura;
        System.out.println("Ingrese la Base: ");
        base=sc.nextDouble();
        System.out.println("Ingrese la Altura: ");
        altura=sc.nextDouble();
        
        double area=base*altura/2;
        System.out.println("El area del Triangulo es: "+area);
        
    }
}
