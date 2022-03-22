package ico.fes.herencia.Polimorfismo;

/**
 * @author Eduardo Salazar
 */
public class Animal {
    private int numeroPatas;

    public Animal() {
    }

    public Animal(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroPatas=" + numeroPatas + '}';
    }
    
    public void emitirSonido(){
        System.out.println("Emitiendo sonido...");
    }
}
