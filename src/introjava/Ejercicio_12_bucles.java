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
public class Ejercicio_12_bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
        *   la nota se pedirá de nuevo hasta que la nota sea correcta.
        */
        
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Escriba un numero del 0 al 10.");
        num = leer.nextInt();
        
        while(num>10 || num<0){
            System.out.println("Nota incorrecta. Ingresela nuevamente.");
            num = leer.nextInt();
        }
        System.out.println("Nota correcta.");
        
     
    }
}


        

        
            
    

