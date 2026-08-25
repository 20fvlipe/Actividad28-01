package main;

import model.Arma;
import model.Jugador;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Arma arma = new Arma();
        Jugador jugador = new Jugador();

        System.out.println("Introduce el nombre del Arma: ");
        arma.setNombre(scanner.nextLine());
        System.out.println("Introduce los puntos de daño: ");
        arma.setPuntosDanio(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Introduce el alias del jugador: ");
        jugador.setAlias(scanner.nextLine());
        System.out.println("Introduce los puntos de vida iniciales del jugador: ");
        jugador.setPuntosVida(scanner.nextInt());
        jugador.setArmaEquipada(arma);

        System.out.println(jugador.toString());



    }
}
