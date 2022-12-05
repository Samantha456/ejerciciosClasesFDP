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
public class EJERCICIO8 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int dia;
        System.out.println("Ingresa un numero del 1 al 7:");
        dia=entrada.nextInt();
        if(dia==1)
            System.out.println("LUNES");
        else{
            if(dia==2)
                System.out.println("MARTES");
            else{
                if(dia==3)
                    System.out.println("MIERCOLES");
                else{
                    if(dia==4)
                        System.out.println("JUEVES");
                    else{
                        if(dia==5)
                            System.out.println("VIERNES");
                        else{
                            if(dia==6)
                                System.out.println("SABADO");
                            else{
                                if(dia==7)
                                    System.out.println("DOMINGO");
                            }
                        }
                    }
                }
            }
        }
      
    }
 
}
