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
public class ENSAYO2 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        double x,y,z,a,b;
        x=3.0/2.0+10.0-3.0;
        y=7;
        z=6*2/8+Math.pow(2, 8);
        a=x*y+1-(z%y*4);
        b=(Math.sqrt(a)+z)*2/25;
        System.out.println("Valor  de x: "+x);
        System.out.println("Valor de y: "+y);
        System.out.println("Valor de z: "+z);
        System.out.println("Valor de a: "+a);
        System.out.println("Valor de b: "+b);
    }
}
