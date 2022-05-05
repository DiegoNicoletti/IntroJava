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
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Dada una cantidad de grados centígrados se debe mostrar su equivalente en
        *   grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        */
        
        Scanner leer = new Scanner(System.in);
        float grados, F ;
        System.out.println("Introduzca los °C deseados.");
        grados = leer.nextFloat();
        
        F =  32 + 9* grados / 5;
        System.out.println("El equivalente de "+ grados + " Celsius, pasado a grados Fahrenheit es igual a: "+ F);
    }
    
}
