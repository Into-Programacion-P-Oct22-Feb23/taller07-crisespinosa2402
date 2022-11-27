/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int contador = 1;
        int numeroUno = -1;
        int numeroDos = 3;
        int limite = 7;
        System.out.printf("1");
        
        do {
           if(numeroUno == -1){
               System.out.printf("%d/%d", numeroUno , numeroDos);
            }else{
               System.out.printf("+%d/%d", numeroUno , numeroDos);
                 }
            contador = contador + 1;
            numeroUno = numeroUno * -1;
            numeroDos = numeroDos + 2;
        
        }while(contador <= limite);
    }
} 
