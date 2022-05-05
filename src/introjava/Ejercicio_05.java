/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Escribir un programa que lea un número entero por teclado y muestre por pantalla
         *   el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
         *   Math.sqrt().
         */
        Scanner leer = new Scanner(System.in); 
        double n, r;
        System.out.println("Introduzca un numero entero.");
        n = leer.nextInt();
        
        r = n*2;
        System.out.println("El doble es: "+r);
        
        r = n*3;
        System.out.println("El triple es: "+r);
        
        r = sqrt(n);
        System.out.println("La raiz cuadrada es: "+r);
        
        
    }
    
}
