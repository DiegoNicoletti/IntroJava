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
public class Ejercicio_16_bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
        *   tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
        *   con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
        *   carácter tiene que ser X y el último tiene que ser una O.
        *
        *   Las secuencias leídas que respeten el formato se consideran correctas, la
        *   secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
        *   secuencia distinta de FDE, que no respete el formato se considera incorrecta.
        *
        *   Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
        *   correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
        *   se utilizan las siguientes funciones de Java Substring(), Length(), equals().
        */
        
        Scanner leer = new Scanner(System.in);
        String primera, ultima, FDE = "&&&&&", frase;
        int correctas = 0, incorrectas = 0, largo;
        
            while(true){
        
                System.out.println("Ingrese su codigo.");
                frase=leer.next();
                frase = frase.toUpperCase();
                largo = frase.length();
                
                if(largo>5){
                    
                    System.out.println("Codigo incorrecto.");
                    incorrectas = incorrectas +1;
                    
                }else if(largo<=5){
                    
                    primera = frase.substring(0, 1);
                    ultima = frase.substring(largo-1, largo);
                    System.out.println("Primera: "+primera+" Ultima: "+ultima);
                    
                    if(primera.equals("X") && ultima.equals("O")){
                        
                        System.out.println("Codigo correcto.");
                        correctas = correctas +1;
                        
                    }else if(frase.equals(FDE)){
                        
                        correctas = correctas +1;
                        System.out.println("Fin del bucle.");
                        break;
                        
                    }else{
                        incorrectas = incorrectas +1;
                        System.out.println("Codigo incorrecto");
                    }
                    
                } 
        }
            System.out.println("Codigos Correctos: "+correctas);
            System.out.println("Codigos Incorrectos: "+incorrectas);
    }
}
