package edu.sergio_nolasco.evidencia3.process;
import edu.sergio_nolasco.evidencia3.ui.Idiomas;
import java.util.Random;

/**
 * En esta clase definimos los turnos de la computadora
 */
public class Computadora {
    private char simbolo;

    public Computadora() {}

    public void setSimbolo(char simbolo){
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return this.simbolo;
    }

    /**Este método sirve para que la computadora genere una posición aleatoria en el tablero para colocar
     * el simbolo
     */
    public void jugarTurno(char[][] tablero) {
        Random random = new Random();
        int fila, columna;
        do {
            fila = random.nextInt(3);
            columna = random.nextInt(3);
        } while (tablero[fila][columna] != '-');

        tablero[fila][columna] = simbolo;
        fila = fila + 1;
        columna = columna + 1;
        System.out.println(Idiomas.COMPUTADORA_VICTORIA + fila + "][" + columna + "]");
    }
}