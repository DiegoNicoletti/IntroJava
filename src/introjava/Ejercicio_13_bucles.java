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
public class Ejercicio_13_bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*  Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
        *    solicite números al usuario hasta que la suma de los números introducidos supere el
        *   límite inicial.
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor positivo como limite.");
        int limite, num, suma;
        suma = 0;
        limite = leer.nextInt();
        
        while(suma<limite) {
            System.out.println("Ingrese un numero.");
            num = leer.nextInt();
            suma = suma + num;
            
        }
        
        System.out.println("La suma dio: "+suma+" Y el limite era de: "+limite);
        
    }
    
}
