package edu.sergio_nolasco.reto5.ejercicio5;
import java.util.ArrayList;

/**
 * Esta clase es el carrito de productos
 */
public class Carrito {
    private ArrayList<Producto> productos;
    private  int cantidad;
    public Carrito() {
        this.productos = new ArrayList<>();
    }

    /**
     * Este metodo sirve para agregar productos
     * @param producto
     */
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    /**
     * Este metodo sirve para eliminar productos
     * @param producto
     */
    public void eliminarProducto(Producto producto) {
        this.productos.remove(producto);
    }

    /**
     * En este metodo se puede cambiar la cant de productos del mismo tipo
     * @param producto
     * @param cantidad
     */
    public void modificarCantidad(Producto producto, int cantidad) {
        producto.setStock(cantidad);
    }
}