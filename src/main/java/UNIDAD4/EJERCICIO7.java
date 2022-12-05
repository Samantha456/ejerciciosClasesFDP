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
public class EJERCICIO7 {
    public static void main(String[] args) {
        //DECLARACIÓN DE LA MATRIZ
        String[][]alumnos=new String [4][5];

        //DECLARACIÓN DE MATRIZ CON ELEMENTOS
        String[][]profesores={{"Jose Juan","Cesar","Ivan"},
                              {"Briseida","Miguel","Kenya"},
                              {"Marcos","Nancy","Maria"}};
        
                //DECLARACIÓN DE MATRIZ CON TAMAÑO PERSONALIZADO
                int [][]respuestas_eval_docente;
                int filas, columnas;
                Scanner lector=new Scanner(System.in);
                System.out.println("Ingrese el número de filas de la matriz");
                filas=lector.nextInt();
                System.out.println("Ingrese el númuero de columnas de la matriz");
                columnas=lector.nextInt();
                respuestas_eval_docente=new int[filas][columnas];
                
                //IMPRIMIR CONTENIDO DE LA MATRIZ
                for (int i = 0; i < profesores.length; i++) {
                    for (int j = 0; j < profesores.length; j++) {
                        System.out.print(profesores[i][j]+" ");   
                    }
                    System.out.println("");   
        }
                
         for (int i = 0; i < alumnos.length; i++) {
                    for (int j = 0; j < alumnos.length; j++) {
                        System.out.print(alumnos[i][j]+" ");   
                    }
                    System.out.println("");                    
    }
          for (int i = 0; i < respuestas_eval_docente.length; i++) {
                    for (int j = 0; j < respuestas_eval_docente.length; j++) {
                        System.out.print(respuestas_eval_docente[i][j]+" ");   
                    }
                    System.out.println("");  
          } 
    }
}
