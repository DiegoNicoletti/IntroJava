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
public class Ejercicio_11_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*  Considera que estás desarrollando una web para una empresa que fabrica motores
         *      (suponemos que se trata del tipo de motor de una bomba para mover fluidos).
        *       Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.
        *       El programa debe mostrar lo siguiente:
        *
        *           o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una
        *               bomba de agua”.
        *
        *           o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una
        *               bomba de gasolina”.
        *
        *           o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una
        *               bomba de hormigón”.
        *
        *           o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una
        *               bomba de pasta alimenticia”.
        *
        *           o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No
        *               existe un valor válido para tipo de bomba”
        */
        
        Scanner leer = new Scanner(System.in);
        int tipoMotor;
        System.out.println("Ingrese su tipo de motor: 1, 2, 3, 4.");
        tipoMotor = leer.nextInt();
        
        if (tipoMotor>=1 && tipoMotor<=4){
            
            switch(tipoMotor){
                
                case 1:
                    System.out.println("Es una bomba de AGUA.");
                    break;
                case 2:
                    System.out.println("Es una bomba de GASOLINA.");
                    break;
                case 3:
                    System.out.println("Es una bomba de HORMIGON.");
                    break;
                case 4:
                    System.out.println("Es una bomba de PASTA ALIMENTICIA");
                    break;
            }
        }else{
            System.out.println("No es un valor valido para un tipo de bomba.");
        }
            
    }
    
}
