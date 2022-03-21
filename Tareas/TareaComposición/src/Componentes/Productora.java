package Componentes;

/**
 * @author Eduardo Salazar
 */
public class Productora {
    String nombre;
    String nombrePeli;

    public Productora() {
    }

    public Productora(String nombre, String nombrePeli) {
        this.nombre = nombre;
        this.nombrePeli = nombrePeli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrePeli() {
        return nombrePeli;
    }

    public void setNombrePeli(String nombrePeli) {
        this.nombrePeli = nombrePeli;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombre + ", nombrePeli=" + nombrePeli + '}';
    }
    
    
}
