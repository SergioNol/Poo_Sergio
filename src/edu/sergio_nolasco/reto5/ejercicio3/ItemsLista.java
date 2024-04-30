package edu.sergio_nolasco.reto5.ejercicio3;
import java.util.ArrayList;

/**
 * En esta clase se guarda la lista de productos
 */
public class ItemsLista {
    private ArrayList <Producto> productos;
    private double precio;
    private int cantidad;


    public int getCantidad(){
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
}