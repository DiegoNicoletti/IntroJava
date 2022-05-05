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
public class Ejercicio_18_bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
            número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
            5 *****
            3 ***
            11 ***********
            2 **
         */
        Scanner leer = new Scanner(System.in);
        int n1, n2, n3, n4;
        System.out.println("Ingrese el N°1");
        n1 = leer.nextInt();
        System.out.println("Ingrese el N°2");
        n2 = leer.nextInt();
        System.out.println("Ingrese el N°3");
        n3 = leer.nextInt();
        System.out.println("Ingrese el N°4");
        n4 = leer.nextInt();

        if (n1 >= 1 && n1 <= 20) {
            for (int i = 0; i < n1; i++) {
                if (i == 0) {
                    System.out.print(n1 + "*");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

        if (n2 >= 1 && n2 <= 20) {
            for (int i = 0; i < n2; i++) {
                if (i == 0) {
                    System.out.print(n2 + "*");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");

        }

        if (n3 >= 1 && n3 <= 20) {
            for (int i = 0; i < n3; i++) {
                if (i == 0) {
                    System.out.print(n3 + "*");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");

        }

        if (n4 >= 1 && n4 <= 20) {
            for (int i = 0; i < n4; i++) {
                if (i == 0) {
                    System.out.print(n4 + "*");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

}
