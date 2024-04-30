package edu.sergio_nolasco.reto6.ui;

import edu.sergio_nolasco.reto6.data.Categoria;
import edu.sergio_nolasco.reto6.data.Empleado;
import edu.sergio_nolasco.reto6.process.OperadorDeEmpleado;

import java.util.ArrayList;
import java.util.Scanner;

public class CLI {

    /**
     * Metodo para registrar a los usuarios
     * @param empleados ArrayList
     * @param empleadoVentas nuevo construtor de Ventas
     * @param administrador nuevo construtor de Administrador
     * @param gerente nuevo construtor de Gerente
     */
    public static void launchApp(ArrayList<Empleado> empleados,
                                 Categoria empleadoVentas, Categoria administrador, Categoria gerente) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Registro de Empleados----");
        System.out.println("Ingrese la cantidad de Empleados a capturar: ");
        /**
         * Metodo para convertir una cadena en un numero entero
         */
        int cantidadEmpleados = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("\nEmpleado #" + (i + 1));
            System.out.print("Nombre completo: ");
            String nombre = scanner.nextLine();
            System.out.print("Horas trabajadas: ");
            int horasTrabajadas = Integer.parseInt(scanner.nextLine());
            System.out.print("Horas extras trabajadas: ");
            int horasExtras = Integer.parseInt(scanner.nextLine());

            System.out.println("Seleccione la categoría (ingrese el número):");
            System.out.println("1.Empleado Ventas");
            System.out.println("2.Administrador");
            System.out.println("3.Gerente");
            Categoria categoriaSeleccionada = switch (scanner.nextInt()) {
                case 1 -> empleadoVentas;
                case 2 -> administrador;
                case 3 -> gerente;
                default -> {
                    System.out.println("Opción inválida, se asignará la categoría por defecto.(Empleado Ventas)");
                    yield empleadoVentas;
                }
            };

            empleados.add(new Empleado(nombre, horasTrabajadas, horasExtras, categoriaSeleccionada));


        }
        mostrarDatos(empleados, empleadoVentas, administrador, gerente,cantidadEmpleados);
    }

    /**
     * Metodo para poder mostrar los datos de los empleados registrados
     * registrado(s)
     * @param empleados arrayList
     */
    public static void mostrarDatos(ArrayList<Empleado> empleados,
                                    Categoria empleadoVentas, Categoria administrador, Categoria gerente,
                                    int cantEmpleados){

        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
        }

        OperadorDeEmpleado.calcularTotalSueldos(empleados, cantEmpleados);

    }
}