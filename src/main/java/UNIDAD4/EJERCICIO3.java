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
public class EJERCICIO3 {
    public static void main(String[] args) {
        System.out.println("Programa que realiza una busqueda secuencial en un arreglo");
        int[] temperaturas={35,28,32,27,30};
        Scanner lector=new Scanner(System.in);
        int dato, vecesEncont=0;
        boolean encontrado=false;
        System.out.println("Ingresa el valor a buscar: ");
        dato=lector.nextInt();
        for (int i = 0; i < temperaturas.length; i++) {
            if(temperaturas[i]==dato){
                //Opción 1: Marcar en la variable booleana que se ha encontrado el dato
                encontrado=true; //Esta variable actua como una BANDERA
                //Opción 2: Mostrar la posición en que se encuentra el dato en que se está buscando
                System.out.println("El dato "+dato+" se encuentra en la posición "+i+" del arreglo");
                break; 
            } 
        }
        
       //Al finalizar el ciclo podemos comprobar el valor con que finaliza la variable BANDERA
       if(encontrado==true)
            System.out.println("El dato fue encontrado");
       else
            System.out.println("No se encontró el dato");
       
       
        //si el programa tiene varios valores que coinciden con el valor a buscar entonces.......
                double[] calificaciones={100,70,85.5,70,100,100};
                String posiciones="";
                System.out.println("Ingresa el valor a buscar: ");
                dato=lector.nextInt();
                for (int i = 0; i < calificaciones.length; i++) {
                    if(calificaciones[i]==dato){
                        //Se incrementa la variable vecesEncont cada vez que se encuentra el dato 
                        vecesEncont++;
                        //Se registran las posisiciones donde se encuentra el dato
                        posiciones+=i+",";
                    }
        }
       
                System.out.println("El dato "+dato+" se encontró "+vecesEncont+" en las posiciones "+posiciones+" del arreglo");
    }
}

