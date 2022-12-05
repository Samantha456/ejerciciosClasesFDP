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
public class EXAMEN1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double califExamen, califEjercicios, califInvestigacion, calFinal;
        System.out.println("Ingrese la calificacion de Examen: ");
        califExamen=sc.nextInt();
        System.out.println("Ingrese la calificacion de los Ejercicios: ");
        califEjercicios=sc.nextInt();
        System.out.println("Ingrese la calificacion de la Investigacion: ");
        califInvestigacion=sc.nextInt();
        calFinal=califExamen*0.4+califEjercicios*0.35+califInvestigacion*0.25;
        System.out.println("La calificacion Final de la Unidad 2 es: "+calFinal);
    }
}
