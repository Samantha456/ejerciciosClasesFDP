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
public class Oportunidad {
    public static void main(String[] args) {
        Scanner lector =new Scanner(System.in);
        int kilos, tamaño;
        double precioInicial;
        String Tipo;
        System.out.print("Naranja\"Lisa\"o\"Navel\": ");
        Tipo=lector.next().toUpperCase();
        System.out.print("tamaño de naranja\"1\"o\"2\": ");
        tamaño=lector.nextInt();
       
        
        
        System.out.println("Ingrese los kilos de naranja entregada: ");
        kilos=lector.nextInt();
        System.out.println("ingrese el precio inicial por kilo: ");
        precioInicial=lector.nextDouble();
        
        if(Tipo.equals("Lisa")&& tamaño ==1)
        if(Tipo.equals("Lisa")&& tamaño ==2) 
        if(Tipo.equals("Navel")&& tamaño ==1)
        if(Tipo.equals("Navel")&& tamaño ==2) 
        
            
        System.out.println("La ganancia final es de: "+(kilos*(precioInicial+2.5)));
         System.out.println("La ganancia final es de: "+(kilos*(precioInicial+3.5)));
         System.out.println("La ganancia final es de: "+(kilos*(precioInicial-1.85)));
          System.out.println("La ganancia final es de: "+(kilos*(precioInicial-2.9)));
        
    }
}
