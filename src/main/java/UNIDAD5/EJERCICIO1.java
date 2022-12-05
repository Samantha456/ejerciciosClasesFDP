/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD5;

import java.util.Scanner;

/**
 *
 * @author Saman
 */
public class EJERCICIO1 {
    static int suma() {
        Scanner lector = new Scanner(System.in);
        int n1, n2;
        System.out.println("Ingrese el primer número: ");
        n1=lector.nextInt();
        System.out.println("Ingrese el segundo número: ");
        n2=lector.nextInt();
        return n1+n2;   
    }
    static int resta(int n1, int n2) {
        
        return n1-n2; 
    }
    static void multiplicacion() {
        Scanner lector = new Scanner(System.in);
        int n1, n2;
        System.out.println("Ingrese el primer número: ");
        n1=lector.nextInt();
        System.out.println("Ingrese el segundo número: ");
        n2=lector.nextInt();
        System.out.println("El resultado de la multiplicación es: "+(n1*n2));
    }
    static void division (int n1, int n2){
        
        System.out.println("El resultado de la division es: "+(n1/n2));
    }
    
    
    public static void main(String[] args) {
      int resultado;
      resultado=suma();   //se invoca a la función "suma"
      System.out.println("El resultado de la suma es: "+resultado);
      resultado=resta(15,8);
      System.out.println("El resultado de la resta es: "+resultado);
      multiplicacion();
      division(25,5);
    }
  
}


