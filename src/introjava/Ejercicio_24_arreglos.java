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
public class Ejercicio_24_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*  Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
        *   que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
        *   cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
        *   una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
        *   viceversa).
        *
        *   Matriz                                      Matriz Transpuesta
        *   [0][-2][4]                                      [0][2][-4]
        *   [2][0][2]                                       [-2]0][-2]
        *   [-4][-2][0]                                     [4][2][0]
        *
        *   En este caso la matriz es anti simétrica.
        */
        
        int matriz[][] = {{0,-2,4},{2,0,2},{-4,-2,0}};
        int matrizt[][] = {{0,2,-4},{-2,0,-2},{4,2,0}};
        int contador=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=matriz[i][j]*(-1);
                if(matriz[i][j]==matrizt[i][j]){
                    contador=contador+1;
                }
            }
        }
        if(contador==9){
            System.out.println("La matriz dada SI es anti simetrica.");
        }else{
            System.out.println("La matriz dada NO es anti simetrica");
        }
        
    }
    
}
