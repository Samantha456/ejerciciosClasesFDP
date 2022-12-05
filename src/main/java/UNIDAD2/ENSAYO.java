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
public class ENSAYO {
    public static void main(String[] args) {
         Scanner lector=new Scanner(System.in);
        double calificacion1, calificacion2,calificacion3,promedio;
        System.out.println("Ingresa la primera calificacion: ");
        calificacion1=lector.nextDouble();
        System.out.println("Ingresa la segunda calificacion: ");
        calificacion2=lector.nextDouble();
        System.out.println("Ingresa la tercera calificacion: ");
        calificacion3=lector.nextDouble();
        promedio=(calificacion1+calificacion2+calificacion3)/3;
        System.out.println("El promedio de las calificaciones es: "+promedio);
    }
}
