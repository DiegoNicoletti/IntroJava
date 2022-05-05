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
public class Ejercicio_22_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*  Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
        *       cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        */
        
        Scanner leer = new Scanner(System.in);
        int n, numero, dig1=0, dig2=0, dig3=0, dig4=0, dig5=0;
        System.out.println("Ingrese el tamaño de su vector.");
        n = leer.nextInt();
        int vector[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            numero = (int)(Math.random() * 100000+1);
            vector[i]=numero;
            
            if(vector[i]>=1 && vector[i]<=9){
                dig1=dig1+1;
            }else if(vector[i]>=10 && vector[i]<=99){
                dig2=dig2+1;
            }else if(vector[i]>=100 && vector[i]<=999){
                dig3=dig3+1;
            }else if(vector[i]>=1000 && vector[i]<=9999){
                dig4=dig4+1;
            }else if(vector[i]>=10000 && vector[i]<=99999){
                dig5=dig5+1;
            }
        }
            System.out.println("Numeros de 1 digito: "+dig1);
            System.out.println("Numeros de 2 digito: "+dig2);
            System.out.println("Numeros de 3 digito: "+dig3);
            System.out.println("Numeros de 4 digito: "+dig4);
            System.out.println("Numeros de 5 digito: "+dig5);
    }
    
}
