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
public class Ejercicio_19_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Crea una aplicación que a través de una función nos convierta una cantidad de
        *    euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
        *    libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
        *    converir que será una cadena, este no devolverá ningún valor y mostrará un
        *    mensaje indicando el cambio (void).
        *
        *    El cambio de divisas es:
        *    * 0.86 libras es un 1 €
        *    * 1.28611 dolares es un 1 €
        *    * 129.852 yenes es un 1 €
        */
        
        Scanner leer = new Scanner(System.in);
        double euros, dolares = 1.28611, yenes = 129.852 , libras  = 0.86, resultado;
        int opcion;
        System.out.println("Introduzca su cantidad de Euros.");
        euros = leer.nextInt();
        System.out.println("Elija una Opcion para cambiar la moneda:");
        System.out.println("1_Libras.");
        System.out.println("2_Dolares.");
        System.out.println("3_Yenes.");
        opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
                resultado = euros*libras;
                System.out.println("Paso a Libras: "+resultado);
                break;
            case 2:
                resultado = euros*dolares;
                System.out.println("Paso a Dolares: "+resultado);
                break;
            case 3:
                resultado = euros*yenes;
                System.out.println("Paso a Yenes: "+resultado);
                break;
        }
        
        
    }
    
}
