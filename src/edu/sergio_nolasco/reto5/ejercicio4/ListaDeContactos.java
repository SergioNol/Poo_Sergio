package edu.sergio_nolasco.reto5.ejercicio4;
import java.util.ArrayList;

/**
 * en esta clase se guardan los contactos y tambien  se pueden eliminar
 */
public class ListaDeContactos {

    ArrayList <Contacto> contactos;
    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }
    public void eliminarContacto(Contacto contacto) {
        contactos.remove(contacto);

    }
}
