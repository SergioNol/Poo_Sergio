package edu.sergio_nolasco.reto3.Diccionario.process;
import java.util.Arrays;

/**
 * Esta clase llamada diccionario hace las funciones del programa
 */
public class Diccionario {
    private String[] palabras;
    private String[] definiciones;

    /**
     * Este metodo llama los arreglos definidios en Main
     -  **/
    public Diccionario(String[] palabras, String[] definiciones) {
        this.palabras = palabras;
        this.definiciones = definiciones;
    }

    public String buscarDefinicion(String palabras) {
        return getDescription(getIndice(palabras));
    }
    /**
     * Este metodo imprime las palabras que hay en la lista
     **/
    public void printList() {
        Arrays
                .stream(palabras)
                .forEach(System.out::println);
    }
    /**
     *  Este metodo permite que se realice la busqueda de un palabra en el arreglo
     */
    public int getIndice(String palabra) {
        int index = 0;
        while (index < palabras.length) {
            if (palabra.equalsIgnoreCase(palabras[index])) return index;
            index++;
        }
        return -1;
    }

    /**
     * Obtiene la descripcion de la palabra del diccionario
     */
    public String getDescription( int index){
        if (index == 1) return "La palabra no esta en el diccionario";
        return definiciones[index];
    }

    /**
     *  Este metodo desglosa las palabras y cuenta los caracteres
     *  que tienen, tanto las palabras como las definiciones
     */

    public void mostrarCaracteres () {
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            String meaning = definiciones[i];
            System.out.println(palabra + ", cantidad de caracteres: " + palabra.length()
                    + ", cantidad de caracteres de su significado: " + meaning.length());
        }
    }
}
