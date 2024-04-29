package edu.sergio_nolasco.evidencia1.data;
import edu.sergio_nolasco.evidencia1.process.CalculadorMedicamento;

public class Medicamento {
    String nombreQuimico;
    String nombreGenerico;
    String nombreRegistrado;
    double precioVenta;
    double precioPublico;
    String tipoPresentacion;

    /**
     * Metodo que declarta y guarda variables
     * @param nombreQuimico
     * @param nombreGenerico
     * @param nombreRegistrado
     * @param tipoPresentacion
     * @param precioPublico
     */
    public Medicamento(String nombreQuimico, String nombreGenerico, String nombreRegistrado, String tipoPresentacion,
                       double precioPublico){
        this.nombreGenerico = nombreGenerico;
        this.nombreQuimico = nombreQuimico;
        this.nombreRegistrado = nombreRegistrado;
        this.precioPublico = precioPublico;
        this.tipoPresentacion = tipoPresentacion;
        this.precioVenta = CalculadorMedicamento.calcularPrecio(precioPublico, tipoPresentacion);
    }
    public String toString() {
        return String.format("Nombre Químico: %s \n" +
                        "Nombre Genérico: %s \n" +
                        "Nombre Registrado: %s \n" +
                        "Forma Farmacéutica: %s \n" +
                        "Precio Público: %.2f \n" +
                        "Precio Venta: %.2f ", nombreQuimico, nombreGenerico, nombreRegistrado,
                tipoPresentacion, precioPublico, precioVenta);
    }
}