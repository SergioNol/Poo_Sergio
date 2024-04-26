package edu.sergio_nolasco.reto1.process;
import java.util.Scanner;

/**
 * Aqui se le solicita al paciente o cliente sus datos mèdicos: el peso, altura edad y sexo.
 */
public class CalculadoraMetabolismoBasal {
    public void Calcular(Scanner scanner) {
        System.out.print("Ingrese el peso en kg ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la estatura en cm ");
        double estatura = scanner.nextDouble();

        System.out.print("Ingrese la edad ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el sexo (M/F) ");
        char sexo = scanner.next().charAt(0);

        double metabolismoBasal;
        /**
         * Depende de la edad del paciente y su sexo se hace el calculo correspondido
         */
        if (sexo == 'M' || sexo == 'm') {
            metabolismoBasal = 66.5 + (13.75 * peso) + (5.003 * estatura) - (6.775 * edad);
        } else if (sexo == 'F' || sexo == 'f') {
            metabolismoBasal = 655.1 + (9.563 * peso) + (1.85 * estatura) - (4.676 * edad);
        } else {
            System.out.println("Sexo no válido. Use M para masculino o F para femenino.");
            return;
        }

        System.out.println("Metabolismo basal calculado: " + metabolismoBasal + " kcal al día");
    }
}
