package IcoFesComponentes;

/**
 * @author Eduardo Salazar
 */
public class Procesador {
    private String marca;
    private float frecuenciaGhz;

    public Procesador() {
    }

    public Procesador(String marca, float frecuencia) {
        this.marca = marca;
        this.frecuenciaGhz = frecuencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getFrecuenciaGhz() {
        return frecuenciaGhz;
    }

    public void setFrecuenciaGhz(float frecuenciaGhz) {
        this.frecuenciaGhz = frecuenciaGhz;
    }

    @Override
    public String toString() {
        return "Procesador{" + "marca=" + marca + ", frecuenciaGhz=" + frecuenciaGhz + '}';
    }
    
    
}
