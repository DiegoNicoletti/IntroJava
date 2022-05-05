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
public class Ejercicio_15_bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Realizar un programa que pida dos números enteros positivos por teclado y
        *   muestre por pantalla el siguiente menú:
        *   MENU
        *   1. Sumar
        *   2. Restar
        *   3. Multiplicar
        *   4. Dividir
        *   5. Salir
        *   Elija opción:
        *
        *   El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
        *   pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
        *   opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
        *   del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
        *   ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
        *   carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
        */
        
        Scanner leer = new Scanner(System.in);
        float n1, n2, resultado;
        int opcion;
        String fin;
        fin = null;
        
        System.out.println("Ingrese el primer numero.");
        n1 = leer.nextFloat();
        System.out.println("Ingrese el segundo numero.");
        n2 = leer.nextFloat();
        
            System.out.println("    Menu:");
            System.out.println("1_Suma.");
            System.out.println("2_Resta.");
            System.out.println("3_Multiplicar.");
            System.out.println("4_Dividir.");
            System.out.println("5_Salir.");
           
            while(!"s".equals(fin)){
            
            resultado = 0;
            opcion = leer.nextInt();
            
            switch(opcion){
                
                case 1:
                    resultado = n1+n2;
                    System.out.println("Resultado: "+resultado);
                    continue;
                    
                case 2:
                    resultado = n1-n2;
                    System.out.println("Resultado: "+resultado);
                    continue;
                    
                case 3:
                    resultado = n1*n2;
                    System.out.println("Resultado: "+resultado);
                    continue;
                    
                case 4:
                    resultado = n1/n2;
                    System.out.println("Resultado: "+resultado);
                    continue;
                    
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (s/n)?");
                    fin = leer.next();
                    if(fin=="s"){
                        break;
                    }else{
                        System.out.println("Sigue.");
                        continue;
                    }
              }
           }
       }
        
       }
    
    

