package edu.sergio_nolasco.reto4.ui;
import edu.sergio_nolasco.reto4.process.Vendedor;
import java.util.Scanner;

public class CLI {

    /**
     * Este es el menu del programa
     */
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        char option;

        do {
            System.out.println("-----Sistema de registro de ventas-----");
            System.out.println("A. Venta de boleto.");
            System.out.println("B. Mostrar datos de ventas.");
            System.out.println("S. Finalizar el programa.");

            option = scanner.next().charAt(0);

            switch (option) {
                case 'A':
                    Vendedor.realizarVenta(scanner);
                    break;
                case 'B':
                    Vendedor.mostrarDatos();
                    break;
                case 'S':
                    System.out.println("-------Fin del programa ---------- ");
                    break;
                default:
                    System.out.println("Opción no válida, inténtalo de nuevo.");
            }
        } while (option != 'S');
    }

}