package edu.sergio_nolasco.reto6.process;

import edu.sergio_nolasco.reto6.data.Categoria;
import edu.sergio_nolasco.reto6.data.Empleado;
import java.util.ArrayList;

/**
 * Esta clase es para generar el reporte final con los distintos datos
 */
public class OperadorDeEmpleado{
    /**
     * Este metodo sirve para calcular el total del sueldo por horas trabajadas
     * @param empleados arrayList
     * @param cantEmpleados a registrar
     */
    public static void calcularTotalSueldos(ArrayList<Empleado> empleados, int cantEmpleados) {
        double totalNomina = 0;
        double totalSueldoNormal = 0;
        double totalHorasExtras = 0;
        int totalPersonasHorasExtras = 0;
        double totalHorasLaboradas = 0;
        /**
         * Por cada empleado ingresado en el ArrayList, realiza estas sumas
         */
        for (Empleado empleado : empleados) {
            int horasTrabajadas = empleado.getHorasTrabajadas();
            double horasExtras = empleado.getHorasExtras();
            Categoria categoria = empleado.getCategoria();

            double sueldoNormal = horasTrabajadas * categoria.getSueldoBase();
            double pagoHorasExtras = horasExtras * categoria.getPagoHoraExtra();
            totalHorasLaboradas += horasTrabajadas + horasExtras;

            totalNomina += sueldoNormal + pagoHorasExtras;
            totalSueldoNormal += sueldoNormal;
            totalHorasExtras += pagoHorasExtras;

            if (horasExtras > 0) {
                totalPersonasHorasExtras++;
            }
        }

        int totalPersonasSinHorasExtras = cantEmpleados - totalPersonasHorasExtras;

        mostrarReporteFinal(totalNomina, totalSueldoNormal,
                totalHorasExtras, totalPersonasHorasExtras, totalPersonasSinHorasExtras, totalHorasLaboradas);
    }

    public static void mostrarReporteFinal(double totalNomina, double totalSueldoNormal, double totalHorasExtras,
                                           int totalPersonasHorasExtras, int totalPersonasSinHorasExtras,
                                           double totalHorasLaboradas){
        System.out.println("\n------------ Reporte de Nómina -------------");
        System.out.println("Total de la nómina de la empresa: $" + totalNomina);
        System.out.println("Total a pagar por sueldo normal: $" + totalSueldoNormal);
        System.out.println("Total a pagar por horas extras: $" + totalHorasExtras);
        System.out.println("Total de horas laboradas en la empresa: " + totalHorasLaboradas);
        System.out.println("Total de personas que tienen horas extras: " + totalPersonasHorasExtras);
        System.out.println("Total de personas que no tienen horas extras: " + totalPersonasSinHorasExtras);

    }
}