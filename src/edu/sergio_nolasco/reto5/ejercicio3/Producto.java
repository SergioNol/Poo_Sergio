package edu.sergio_nolasco.reto5.ejercicio3;

/**
 * En esta clase se guarda el nombre y precio del producto
 */
public class Producto {
    private String nombre;
    double precio;
    private String categoria;

    public Producto(String nombre, int precio, String categoria){
        this.nombre=nombre;
        this.precio=precio;
        this.categoria=categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void actualizarInformacion(){
    }
}
