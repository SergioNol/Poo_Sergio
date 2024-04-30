package edu.sergio_nolasco.reto7.process;

/**
 * Clase para obtener la division
 */
public class Division extends Resta {

    /**
     * Metodo extendido de la clase Resta para calcular la division
     */
    @Override
    public double calcular(double n1, double n2) {
        double cociente = 0;
        while (n1 >= n2) {
            n1 = new Resta().calcular(n1, n2);
            cociente++;
        }
        return cociente;
    }
}