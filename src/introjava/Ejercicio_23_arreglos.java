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
public class Ejercicio_23_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
        *   la traspuesta de la matriz.
        */
        
        int matriz[][]= new int[4][4];
        int matrizt[][]= new int[4][4];
        int numero;
        
        System.out.println("Matriz Original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                numero = (int)(Math.random()*10);
                matriz[i][j]=numero;
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("Matris Transpuesta:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizt[j][i]=matriz[i][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               System.out.print("["+matrizt[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
}
