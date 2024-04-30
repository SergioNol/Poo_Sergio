package edu.sergio_nolasco.reto6.data;

public class Categoria {
    private String nombre;
    private String clave;
    private double sueldoBase;
    private double pagoHoraExtra;

    /**
     * Constructor de la categoria
     * @param nombre de la categoría
     * @param clave unica
     * @param sueldoBase de cada categoria
     * @param pagoHoraExtra de cada categoría
     */
    public Categoria(String nombre, String clave, double sueldoBase, double pagoHoraExtra) {
        this.nombre = nombre;
        this.clave = clave;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
    }

    /**
     * Aqui se obtienen y asignan valores
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPagoHoraExtra() {
        return pagoHoraExtra;
    }

    public void setPagoHoraExtra(double pagoHoraExtra) {
        this.pagoHoraExtra = pagoHoraExtra;
    }

}