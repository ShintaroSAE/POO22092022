package ico.fes;

/**
 * @author Eduardo Salazar
 */
public class Cuadrado implements Figura {
    
    private float lado;

    public Cuadrado() {
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }
    
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    
    @Override
    public float calcularArea() {
        return this.lado * this.lado;
    }


}
