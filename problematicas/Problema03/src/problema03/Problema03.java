/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int contador = 1;
        int limite = 6;
        int numero = 2;
        int segundoNumero = 3;
        int tercerNumero = 2;

        do {
            System.out.printf("%d\n", numero);
            numero = numero + segundoNumero;
            segundoNumero = segundoNumero + tercerNumero;
            contador = contador + 1;

        }while(contador <= limite);
    }
}
