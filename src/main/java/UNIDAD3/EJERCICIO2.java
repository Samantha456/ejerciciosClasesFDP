/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD3;

/**
 *
 * @author Saman
 */
public class EJERCICIO2 {
    public static void main(String[] args) {
        int x=181;
        int y=125;
        boolean comparacion=(x<y);
        System.out.println("x es menor que y:"+comparacion);
        
        comparacion=(x>y); //true
        System.out.println("x es mayor que y:"+comparacion);
        
        comparacion=(x==y); //false
        System.out.println("x es igual que y:"+comparacion);
        
        //|=significa "diferente de"
        comparacion=(x!=y); //true
        System.out.println("x es diferente que y:"+comparacion);
        
        comparacion=(x<=y); //false
        System.out.println("x es menor o igual que y:"+comparacion);
        
        comparacion=(x>=y); //true
        System.out.println("x es mayor o igual que y:"+comparacion);
        
        
    }
}
