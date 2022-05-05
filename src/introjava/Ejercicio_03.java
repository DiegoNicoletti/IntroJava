/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author SHIRO
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Escribir un programa que pida una frase y la muestre toda en mayúsculas y
         *   después toda en minúsculas. Nota: investigar la función toUpperCase() y
         *   toLowerCase() en Java.
         */
        
        Scanner leer = new Scanner(System.in);
        String frase, mayus, minus;
        System.out.println("Ingrese una frase.");
        frase = leer.nextLine();
        
        mayus = toUpperCase(frase);
        minus = toLowerCase(frase);
        
        System.out.println("Pasaremos a mostrar la frase en Mayusculas:");
        System.out.println(mayus);
        System.out.println(" ");
        System.out.println("Ahora mostraremos dicha frase en minusculas:");
        System.out.println(minus);

    }
    
}
