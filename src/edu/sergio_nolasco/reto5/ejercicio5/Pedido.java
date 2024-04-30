package edu.sergio_nolasco.reto5.ejercicio5;
import java.util.ArrayList;

/**
 * Esta clase maneja el pedido
 */
public class Pedido {
    private int numeroPedido;
    private ArrayList<Producto> productos;
    private int cantidad;
    private double total;

    public Pedido(int numeroPedido, ArrayList<Producto> productos, int cantidad, double total) {
        this.numeroPedido = numeroPedido;
        this.productos = productos;
        this.cantidad = cantidad;
        this.total = total;
    }

    /**
     * Aqui se procesa la compra
     */
    public void procesarCompra() {
    }

    /**
     * Aqui se calcula el total de impuestos
     * @return
     */
    public double totalImpuesto() {
        return total;
    }

    /**
     * Aqui se deberia imprimir el ticket
     */
    public void mostrarTicket() {
    }
}