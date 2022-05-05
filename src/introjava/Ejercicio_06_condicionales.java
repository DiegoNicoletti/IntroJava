/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import static java.lang.Math.max;
import static java.lang.Math.min;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class Ejercicio_06_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Implementar un programa que dado dos números enteros determine cuál es el
         *  mayor y lo muestre por pantalla.
         */
        
        Scanner leer = new Scanner(System.in);
        int n1, n2, max, min;
        System.out.println("Introduzca un numero");
        n1 = leer.nextInt();
        System.out.println("Introduzca el siguiente numero");
        n2 = leer.nextInt();
        
        max = max(n1, n2);
        min = min(n1, n2);
        
        System.out.println("El mayor es: "+max);
        System.out.println("El menor es: "+min);
    }
    
}
