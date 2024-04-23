package edu.sergio_nolasco.reto1.process;
import java.util.Scanner;
public class CalculadoraMasaCorporal {
    /**
     * Este metodo para calcular el indice de masa corporal de una persona en base a su peso
     * y altura.
     * @param estatura estatura del paciente en cm
     * @param peso peso del paciente en Kg
     * @return indice de masa corporal
     */
    /**
     * Aqui se le solicita al paciente su peso y estatura y ademas se hace el calculo para pasar de cm a metros
     */
    public void CalculadoraIndiceMasaCorporal(Scanner scanner) {
        System.out.print("Ingrese el peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la estatura en cm: ");
        double estatura = scanner.nextDouble() / 100;

        double imc = peso / (estatura * estatura);

        System.out.println("IMC calculado: " + imc);

        /**
         * Aqui dependiendo del resultado del calculo se arroja si su peso es bajo hasta si tiene obesidad morbida
         */
        if (imc < 18.9) {
            System.out.println("Su peso es bajo");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Su peso es normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Usted tiene Sobrepeso");
        } else if (imc >= 30 && imc <= 34.99) {
            System.out.println("Usted tiene obesidad leve");
        } else if (imc >= 35 && imc <= 39.99) {
            System.out.println("Usted tiene obesidad media");
        } else {
            System.out.println("Usted tiene obesidad mórbida");
        }
    }
}

