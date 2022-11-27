/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombreJugador;
        String posicionJuego;
        int edadJugador;
        double estaturaJugador;
        String informacionJugadores = "";
        int salida;
        boolean bandera = true;
        double promedioEdades;
        double promedioEstatura;
        int edadSegunda = 0;
        int estaturaSegunda = 0;

        do {
            System.out.println("Ingrese el nombre del jugador por favor");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posicion dentro del juego del "
                    + "jugador por favor");
            posicionJuego = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador por favor");
            edadJugador = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador por favor");
            estaturaJugador = entrada.nextDouble();
            
            informacionJugadores = String.format("\n%s%s%d%.2f",
                    nombreJugador,posicionJuego, edadJugador, 
                    estaturaJugador);
            entrada.nextLine();
            promedioEdades = edadSegunda + edadJugador;
            promedioEstatura = estaturaSegunda + estaturaJugador;
            
            System.out.println("Ingrese (1) si desea salir del ciclo");
            salida = entrada.nextInt();
            
            if (salida == 1){
                bandera = false;
                }
        } while(bandera);
        
        System.out.printf("Listado de jugadores\n%s%sedad%destatura%.2f"
                + "\n%s\n%s",informacionJugadores, promedioEdades, 
                promedioEstatura);
    }
}
