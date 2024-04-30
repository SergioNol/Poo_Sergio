package edu.sergio_nolasco.reto5.ejercicio2;

/**
 * Clase que gyuarda los datos del cliente
 */
public class Cliente {

    private String nombre;
    private int edad;
    private String telefono;
    private String direccion;

    public Cliente(String nombre, int edad, String direccion, String telefono) {
        this.nombre = nombre;
        this.edad=edad;
        this.direccion=direccion;
        this.telefono=telefono;
    }
    /**
     * metodo para poder actualizar la información del cliente
     */
    public void actualizarDatosPersonales(){

    }
}