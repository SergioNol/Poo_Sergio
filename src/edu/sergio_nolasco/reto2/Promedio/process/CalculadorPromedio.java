package edu.sergio_nolasco.reto2.Promedio.process;

/**
 * Clase que realiza el promedio de las calificaciones
 */
public class CalculadorPromedio {

    /**
     * Metodo para calcular  el promedio del usuario
     * @param calificaciones
     * @return
     */
    public static double calcularPromedio(double[] calificaciones){
        double suma = 0;
        for (double calificacion : calificaciones){
            suma += calificacion;
        }
        return suma/calificaciones.length;

    }

}