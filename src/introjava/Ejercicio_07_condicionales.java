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
public class Ejercicio_07_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crear un programa que dado un numero determine si es par o impar.
        
        Scanner leer = new Scanner(System.in);
        float n;
        System.out.println("Introduzca un numero.");
        n = leer.nextFloat();
        
        {
        if (n%2==0){
            System.out.println("Su numero "+n+" es par.");
        
        }else{
            System.out.println("Su numero "+n+" es impar.");
        }
            
        }
    }
    
}
