package edu.sergio_nolasco.reto2.Promedio.ui;

import edu.sergio_nolasco.reto2.Promedio.process.CalculadorPromedio;

import java.util.Scanner;
public class CLI {
    /**
     * Este metodo pide la cantidad de calificaciones a ingresar
     */
    public static void launchApp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de calificaciones a ingresar: ");
        int cantidadCalificaciones = scanner.nextInt();

        /**
         * Este arreglo almacena las calificaciones
          */
        double[] calificaciones = new double[cantidadCalificaciones];

        /**
         * Aqui se le iran pidiendo las calificaciones al usuario una por una depdendiendo
         * la cantidad de calificaciones que va a ingresar
         */
        for (int i = 0; i < cantidadCalificaciones; i++) {
            System.out.println("Por favor ingrese la calificación num: " + (i + 1));
            calificaciones[i] = scanner.nextDouble();
        }

        double promedio = CalculadorPromedio.calcularPromedio(calificaciones);

        System.out.println("El promedio final es: " + promedio);
    }


}