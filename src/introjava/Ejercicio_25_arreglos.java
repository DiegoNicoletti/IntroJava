/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author SHIRO
 */
public class Ejercicio_25_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
        *   donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
        *   programa que permita introducir un cuadrado por teclado y determine si este
        *   cuadrado es mágico o no. El programa deberá comprobar que los números
        *   introducidos son correctos, es decir, están entre el 1 y el 9.
        */
        
        int contador=9;
        int matriz[][] = {{0,0,0},{0,0,0},{0,0,0}};
        int pares=8, impares=1;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j > -1; j--) {
                
                if (i%2==0 && j%2==0){
                    matriz[i][j]=pares;
                    pares=pares-2;
                }    
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j > -1; j--) {
                
                if(matriz[i][j]==0){
                    matriz[i][j]=impares;
                    impares=impares+2;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
