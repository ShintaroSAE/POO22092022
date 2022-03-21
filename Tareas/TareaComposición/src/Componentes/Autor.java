package Componentes;

/**
 * @author Eduardo Salazar
 */
public class Autor {
    private String nombre;
    private int edad;

    public Autor() {
    }

    public Autor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
