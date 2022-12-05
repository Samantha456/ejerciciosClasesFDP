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
public class EJERCICIO14 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int numMaterias, i=1; //iniciar variable
        double calificacion, suma=0, promedio;
        
        System.out.println("Programa que calcula el promedio de x numero de materias");
        System.out.println("Ingrese materias que lleva: ");
        numMaterias=lector.nextInt();
        
        //condición
        while(i<=numMaterias){ //mientras 
            System.out.println("Ingrese la calificacion de la materia"+i+":");
            calificacion=lector.nextDouble();  // se lee el valor de la calificación
            suma=suma+calificacion; // se suma la calificación ingresada 100+100+100=300
            i++; //incrementar variable o decrementar i=1+1=2
            //i=2+1=3
            //i=3+1=4
            
        }
        
        System.out.println("Suma de las calificaciones: "+suma);
        promedio=suma/numMaterias;
        System.out.println("El promedio de calificacion es: "+promedio);
        }
    }
   

