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
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //esta mierda a ver si la veo al otro lado
        
        Scanner Leer = new Scanner(System.in);
        System.out.println("Le pediremos que introduzca dos numeros, pasaremos a sumarlos, y luego daremos el resultado.");
        System.out.println("Introduzca el primer numero.");
        
        int numero1, numero2, resultado ;
        numero1 = Leer.nextInt();
        
        System.out.println("Introduzca el segundo numero.");
        numero2 = Leer.nextInt();
        
        resultado = (numero1 + numero2);
        
        System.out.println("El resultado de la suma de " + numero1 + " + " + numero2 + " = " + resultado );

    }
    
}
