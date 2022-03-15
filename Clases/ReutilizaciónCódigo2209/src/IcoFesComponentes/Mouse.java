package IcoFesComponentes;

/**
 * @author Eduardo Salazar
 */
public class Mouse {
    private String marca;
    private String tipo;//optico o analogico o inalambrico

    public Mouse() {
    }

    public Mouse(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Mouse{" + "marca=" + marca + ", tipo=" + tipo + '}';
    }
    
    
}
