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
public class Ejercicio_08_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
        *   pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
        *   investigar la función equals() en Java.
        */
        
        Scanner leer = new Scanner(System.in);
        String frase, respuesta, clave;
        System.out.println("Introduzca una frase.");
        frase = leer.next();
        clave = "eureka";
        
        System.out.println(frase.equals(clave)); 
    }

    
    }
