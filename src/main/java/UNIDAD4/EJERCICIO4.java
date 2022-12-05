/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD4;

import java.util.Scanner;

/**
 *
 * @author Saman
 */
public class EJERCICIO4 {
    public static void main(String[] args) {
        System.out.println("Programa que determina cual es el número mayor almacenado en el arreglo");  
        Scanner lector=new Scanner(System.in);
        int[]estaturaAlumnos=new int[10];
        int estaturaMayor=0;
        
        //Ciclo FOR para rellenar el arreglo
        for (int i = 0; i < estaturaAlumnos.length; i++) {
            System.out.println("Ingresa la estatura del alumno "+(i+1));
            estaturaAlumnos[i]=lector.nextInt();
            
        }
        
        //Ciclo FOR Para comparar los numeros
        for (int i = 0; i < (estaturaAlumnos.length-1); i++) {
            if(estaturaAlumnos[i]<estaturaAlumnos[i+1])
                estaturaMayor=estaturaAlumnos[i+1];   
        }
        System.out.println("La mayor estatura de un alumnos es: "+estaturaMayor);
    }
  
}
