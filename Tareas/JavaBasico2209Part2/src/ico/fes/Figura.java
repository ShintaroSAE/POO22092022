package ico.fes;

/**
 * @author Eduardo Salazar
 */
public interface Figura {
    public abstract float calcularArea();
    public static final float PI = 3.1416f;
    public static final int CUADRADO = 1;
    public static final int CIRCULO = 2;
    public static final int TRIANGULO = 3;
    public static final int RECTANGULO = 4;
}
