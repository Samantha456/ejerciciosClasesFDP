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
public class EJERCICIO12 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double c1, c2, area, hipotenusa, perimetro;
        System.out.println("Ingrese Cateto 1: ");
        c1=leer.nextDouble();
        System.out.println("Ingrese Cateto 2: ");
        c2=leer.nextDouble();
        
        hipotenusa=Math.sqrt(Math.pow(c1,2)+Math.pow(c2, 2));
        area=c1*c2/2;
        perimetro=c1+c2+hipotenusa;
        
        System.out.println("Los resultados obtenidos son: ");
        System.out.println("La Hipotenusa es: "+hipotenusa);
        System.out.println("El Area es: "+area);
        System.out.println("El perimetro es: "+perimetro);
        
    }
}
