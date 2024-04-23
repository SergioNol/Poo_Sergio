package edu.sergio_nolasco.reto1.ui;
import java.util.Scanner;
import edu.sergio_nolasco.reto1.process.*;
public class CLI {
    public static void launchApp() {
        Scanner scanner = new Scanner(System.in);

        /**
         * Aqui imprime el menu de opciones para el paciente o cliente.
         */
        while (true) {
            System.out.println("Menú:");
            System.out.println("********************************************************");
            System.out.println("1. Cálculo de masa corporal (índice de masa corporal)");
            System.out.println("2. Cálculo de masa corporal magra");
            System.out.println("3. Cálculo de metabolismo basal (gasto energético basal)");
            System.out.println("4. Salir");
            System.out.println("********************************************************");

            System.out.print("Seleccione una opción (1/2/3/4): ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    new CalculadoraMasaCorporal().CalculadoraIndiceMasaCorporal(scanner);
                    break;
                case 2:
                    new CalculadoraMasaCorporalMagra().Calcular(scanner);
                    break;
                case 3:
                    new CalculadoraMetabolismoBasal().Calcular(scanner);
                    break;
                case 4:
                    System.out.println("Adiós, vuelva pronto");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione 1, 2, 3, o 4.");
            }
        }
    }
}

