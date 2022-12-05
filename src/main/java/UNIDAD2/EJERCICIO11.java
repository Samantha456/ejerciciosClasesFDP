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
public class EJERCICIO11 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
         int cantidad,precio,total,cambio,pago;
         String nombre;
         System.out.println("Buenos dias Sr. Juan");
        System.out.println("\nIngrese el producto que desea comprar: ");
        nombre=leer.next();
        System.out.println("Ingrese el precio del producto: ");
        precio=leer.nextInt();
        System.out.println("Ingrese cantidad de productos: ");
        cantidad=leer.nextInt();
       
        total=precio*cantidad;
        
         System.out.println("El total a pagar por "+nombre+ " es: "+total);
        
        System.out.println("\nIngrese la cantidad con la que pagara: ");
        pago=leer.nextInt();
        
        
        cambio=pago-total;
        System.out.println("Su cambio es: "+cambio+" que tenga buen dia Sr. Juan");
    }
}
