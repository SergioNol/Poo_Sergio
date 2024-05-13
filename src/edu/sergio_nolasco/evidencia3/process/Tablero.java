package edu.sergio_nolasco.evidencia3.process;

import edu.sergio_nolasco.evidencia3.data.*;
import edu.sergio_nolasco.evidencia3.ui.Idiomas;
import java.util.HashSet;
import java.util.Set;

/**Esta clase define el tablero y permite utilizarlo.*/
public class Tablero {

    /**Definimos todas las variables necesarias para crear el tablero y poder utilizarlo.*/
    public static char[][] tablero;
    public static Jugador jugador1;
    public static Jugador jugador2;
    public static boolean turnoJugador1;
    public static SalondeLaFama salonDeLaFama;
    public static final HashSet<String> simbolosValidos = new HashSet<>(Set.of("@", "#", "$", "%", "&", "X", "0", "?", "+", "="));
    public static Computadora juegoComputadora; // Agrega una instancia de JuegoComputadora

    /**Definimos nuestro tablero.*/
    public Tablero(boolean unJugador) {
        salonDeLaFama = new SalondeLaFama();
        turnoJugador1 = true;
        tablero = new char[3][3];
        juegoComputadora = new Computadora(); // Inicializa la instancia de JuegoComputadora
        // Inicializar el tablero
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    /**Este metodo nos permite saber si una cadena esta vacia.*/
    public static boolean cadenaVacia(String cadena) {
        return cadena.trim().isEmpty();
    }

    /**Este metodo nos permite saber si una fila esta llena.*/
    public static boolean filaLlena(int fila) {
        for (int j = 0; j < 3; j++) {
            if (tablero[fila][j] == '-') {
                return false; // Si encuentra al menos una casilla vacía, la fila no está llena
            }
        }
        return true; // Si no hay casillas vacías, la fila está llena
    }

    /**Este metodo nos permite saber si una columna esta llena.*/
    public static boolean columnaLlena(int columna) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][columna] == '-') {
                return false; // Si encuentra al menos una casilla vacía, la columna no está llena
            }
        }
        return true; // Si no hay casillas vacías, la columna está llena
    }

    /**Definimos este metodo para asignarle un simbolo a la computadora y que pueda jugar.*/
    public static void turnoComputadora() {
        if (juegoComputadora != null) {
            juegoComputadora.setSimbolo(jugador2.getSimbolo().charAt(0)); // Establece el símbolo de la computadora
            juegoComputadora.jugarTurno(tablero); // Llama al método jugarTurno de JuegoComputadora
            imprimirTablero(); // Mostrar el tablero después de que la computadora juegue
        } else {
            System.out.println(Idiomas.ERROR_INICIALIZACION);
        }
    }

    /**ESte metodo nos permite verificar que alguien haya ganado en cualquiera de las posiciones ganadoras.*/
    public static boolean verificarVictoria() {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != '-' && tablero[i][0] == tablero[i][1] && tablero[i][0] == tablero[i][2]) {
                return true; // Verificación horizontal
            }
            if (tablero[0][i] != '-' && tablero[0][i] == tablero[1][i] && tablero[0][i] == tablero[2][i]) {
                return true; // Verificación vertical
            }
        }
        if (tablero[0][0] != '-' && tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2]) {
            return true; // Verificación diagonal 1
        }
        if (tablero[0][2] != '-' && tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0]) {
            return true; // Verificación diagonal 2
        }
        return false;
    }

    /**Este metodo nos permite reconocer si el tablero esta lleno.*/
    public static boolean tableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    /**Metodo que permite reiniciar el tablero para jugar una nueva partida.*/
    public static void reiniciarTablero() {
        // Reiniciar el tablero para una nueva partida
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    /**En este metodo le damor formato a nuestro tablero para que se imprima una cuadricula con coordenadas.*/
    public static void imprimirTablero() {
        System.out.println(Idiomas.TABLERO);
        System.out.println("   1   2   3");
        System.out.println(" ╔═══╦═══╦═══╗");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "║");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tablero[i][j] + " ║");
            }
            System.out.println();
            if (i < 2) {
                System.out.println(" ╠═══╬═══╬═══╣");
            }
        }
        System.out.println(" ╚═══╩═══╩═══╝");
    }
}
