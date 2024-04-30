package edu.sergio_nolasco.reto5.ejercicio5;

/**
 * En esta clase se guarda la informacion del usuario
 */
public class Usuario {
    private String nombre;
    private String contraseña;
    private String dirección;
    private String metodoPago;

    public Usuario(String nombre, String contraseña, String dirección, String metodoPago) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.dirección = dirección;
        this.metodoPago = metodoPago;
    }

    public void iniciarSesion() {
    }

    public void actualizarPerfil() {
    }

}