/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class Ejercicio_21_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
        *   pida al usuario un numero a buscar en el vector. El programa mostrará donde se
        *   encuentra el numero y si se encuentra repetido
        */
        
        Scanner leer = new Scanner(System.in);
        int numero, repetido;
        System.out.println("Ingrese el tamaño de su Vector.");
        int n = leer.nextInt();
        int vector[] = new int[n];
        System.out.println("Ingrese que numero buscara(Del 1 al 5).");
        repetido = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            numero = (int)(Math.random() * 5+1);
            vector[i] = numero;
            
            if(vector[i]==repetido){
                System.out.print("{"+vector[i]+"}");
            }else{
                System.out.print("["+vector[i]+"]");
            }
        }
        
    }
    
}
