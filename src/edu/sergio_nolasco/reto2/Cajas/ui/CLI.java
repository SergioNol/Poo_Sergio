package edu.sergio_nolasco.reto2.Cajas.ui;

import java.util.Scanner;
import edu.sergio_nolasco.reto2.Cajas.process.CompraDeCajas;

/**
 *  aqui se le pregunta al usuario que opcion desea realizar
 */
public class CLI {
    public static void showMenu() {

        Scanner scanner = new Scanner(System.in);
        CompraDeCajas controlCajasPapel = new CompraDeCajas();

        boolean salir = false;

        while (!salir) {
            System.out.println("////////////////////////////////////");
            System.out.println("Menú:");
            System.out.println("1. Comprar cajas de papel");
            System.out.println("2. Vender cajas de papel");
            System.out.println("3. Mostrar reporte");
            System.out.println("4. Salir del programa");
            System.out.print("Seleccione una opción: ");
            System.out.println("\n////////////////////////////////////");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de cajas a comprar: ");
                    int cajasCompra = scanner.nextInt();
                    System.out.print("Ingrese el costo de las cajas a comprar: ");
                    double costoCompra = scanner.nextDouble();
                    controlCajasPapel.comprarCajas(cajasCompra, costoCompra);
                    break;

                case 2:
                    System.out.print("Ingrese el número de cajas a vender: ");
                    int cajasVenta = scanner.nextInt();
                    System.out.print("Ingrese el precio de las cajas a vender: ");
                    double precioVenta = scanner.nextDouble();
                    controlCajasPapel.venderCajas(cajasVenta, precioVenta);
                    break;

                case 3:
                    controlCajasPapel.mostrarReporte();
                    break;

                case 4:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        }

        controlCajasPapel.mostrarDespedida();
    }
}