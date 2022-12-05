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
public class EJERCICIO9 {
    public static void main(String[] args){
Scanner objeto =new Scanner (System.in);
double BM,bm,alt;
        System.out.print("Ingrese la Base Mayor: ");
        BM=objeto.nextDouble();
        System.out.print("Ingrese la Base menor: ");
        bm=objeto.nextDouble();
        System.out.print("Ingrese la altura: ");
        alt=objeto.nextDouble();
        double area= ((BM+bm)*alt)/2;
        System.out.println("El area del Trapecio es igual a: "+area);
    }
}
