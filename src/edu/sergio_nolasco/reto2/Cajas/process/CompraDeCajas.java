package edu.sergio_nolasco.reto2.Cajas.process;


public class CompraDeCajas {

    int totalOperaciones = 0;
    int totalVentas = 0;
    int totalCompras = 0;
    double montoCaja = 0;
    double ingresosVentas = 0;
    double egresosCompras = 0;

    /**
     * Aqui se hace la operacion para sacar el total de compras de cajas ademas de agregar 1
     * al totalOperaciones
     * @param cantidad
     * @param costo
     */
    public void comprarCajas(int cantidad, double costo) {
        montoCaja -= cantidad*costo;
        egresosCompras += costo*cantidad;
        totalCompras += cantidad;
        totalOperaciones++;
        System.out.println("La compra realizada por " + cantidad + " cajas al costo " + costo +
                " es igual a " + (cantidad*costo));
    }

    /**
     * Aqui se hace la operacion para sacar el total de ventas de cajas ademas de agregar 1
     * al totalOperaciones
     * @param cantidad
     * @param precio
     */
    public void venderCajas(int cantidad, double precio) {
        montoCaja += cantidad*precio;
        ingresosVentas += precio*cantidad;
        totalVentas += cantidad
        ;
        totalOperaciones++;
        System.out.println("La venta realizada por " + cantidad + " cajas al precio de " + precio +
                " es igual a " + (cantidad*precio));
    }

    /**
     * Impresion de totales de cada variable
     */
    public void mostrarReporte() {
        System.out.println("Cantidad total de ventas: " + totalVentas);
        System.out.println("Cantidad total de compras: " + totalCompras);
        System.out.println("Ingresos generados por ventas: " + ingresosVentas);
        System.out.println("Egresos generados por compras: " + egresosCompras);
        System.out.println("Monto en la caja: " + montoCaja);
    }

    public int getTotalOperaciones() {
        return totalOperaciones;
    }

    /**
     * Se imprime mensaje de despedida
     */
    public void mostrarDespedida() {
        System.out.println("\nResumen de actividades:");
        System.out.println("Cantidad total de operaciones realizadas: " + totalOperaciones);
        System.out.println("Cantidad total de ventas: " + totalVentas);
        System.out.println("Cantidad total de compras: " + totalCompras);
        System.out.println("Monto en la caja: " + montoCaja);
        System.out.println("Ingresos generados por ventas: " + ingresosVentas);
        System.out.println("Egresos generados por compras: " + egresosCompras);
        System.out.println("Gracias por comprar y vender cajas con nosotros.");
    }
}