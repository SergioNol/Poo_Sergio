package edu.sergio_nolasco.reto3.FilasYColumnas.ui;
import java.util.Scanner;
import edu.sergio_nolasco.reto3.FilasYColumnas.process.ContadorNumeros;

public class CLI {

    public static void launchApp(){
        System.out.println("------------------------------------------------------");
        System.out.println("Bienvenido a la aplicacion de lista de pares e impares");
        System.out.println("-------------------------------------------------------");
        int filas;
        int columnas;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Ingresa el numero deseado de filas: ");
            filas = scanner.nextInt();
            System.out.println("Ingresa el numero deseado de columnas: ");
            columnas = scanner.nextInt();
            if (filas != columnas){
                System.out.println("Los datos deben ser iguales, favor de volver a ingresar datos iguales");
            }
        }while (filas != columnas);

        ContadorNumeros.tablaCompleta(filas, columnas);
    }

}