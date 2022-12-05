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
public class EJERCICIO17 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        char respuesta;
        byte opcion;
        
        do{
            System.out.println("\n===== MENU=====");
            System.out.println("Pizza Vegetariana");
            System.out.println("\t1.Pimiento");
            System.out.println("\t2.Tofu");
            System.out.println("\t3.Variedad de hongos");
            System.out.println("\t4.Pepperoni");
            System.out.println("\t5.Jamon");
            System.out.println("\t6.Salmon");
            System.out.println("\t7.Camaron");
            System.out.println("\nNumero de pizza que desea ordenar:");
            opcion=lector.nextByte();
        
            switch(opcion){
            case 1:
                System.out.println("Ha elegido una pizza vegetariana."
                +"\nLos ingredientes que lleva son: Pimiento, salsa de tomate y queso mozzarella.");
            break;
            
            case 2:
          System.out.println("Ha elegido una pizza Vegetariana."
                +"\nLos ingredientes que lleva son: Tofu, salsa de tomate y queso mozzarella.");     
                
             break;
             
            case 3:
                System.out.println("Ha elegido una pizza Vegetariana."
                +"\nLos ingredientes que lleva son: Variedad de hongos, salsa de tomate y queso mozzarella.");
        
            break;
            
            case 4:
            System.out.println("Ha elegido una pizza Vegetariana."
                    +"\nLos ingredientes que lleva son: Pepperoni, salsa de tomate y queso mozzarella.");
            
            break;
            
            case 5:
                System.out.println("Ha elegido una pizza Vegetariana."
                +"\nLos ingredientes que lleva son: Jamon, salsa de tomate y queso mozzarella.");
            
                break;
                
            case 6:
                System.out.println("Ha legido una pizza Vegetariana."
                +"\nLos ingredientes que lleva son: Salmon, salsa de tomate y queso mozzarella.");
                
                break;
                
            case 7:
                System.out.println("Ha legido una pizza Vegetariana."
                +"\nLos ingredientes que lleva son: Camaron, salsa de tomate y queso mozzarella.");
                
            break;
            default:
                System.out.println("\nLa opcion elegida no existe.");
                
        }    
            System.out.println("\n\nDesea ordenar otra pizza? (s/n)");
            respuesta=lector.next().charAt(0);
            
        } while (respuesta=='S' ||respuesta=='s');
        }
}
