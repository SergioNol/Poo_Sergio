package edu.sergio_nolasco.reto1.process;

import java.util.Scanner;

public class CalculadoraMasaCorporalMagra {
    /**
     * Aqui se le pide al paciente su peso,estatura y sexo
     * @param scanner
     */
    public void Calcular(Scanner scanner) {
        System.out.print("Ingrese el peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la estatura en cm: ");
        double estatura = scanner.nextDouble();

        System.out.print("Ingrese el sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        double masaCorporalMagra;

        if (sexo == 'M' || sexo == 'm') {
            masaCorporalMagra = (1.10 * peso) - 128 * (Math.pow(peso, 2) / Math.pow(estatura, 2));
        } else if (sexo == 'F' || sexo == 'f') {
            masaCorporalMagra = (1.07 * peso) - 148 * (Math.pow(peso, 2) / Math.pow(estatura, 2));
        } else {
            System.out.println("Respuesta no válida || Use M || O use F");
            return;
        }

        System.out.println("Masa corporal magra calculada: " + masaCorporalMagra + " kg");
    }
}
