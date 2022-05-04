package ico.fes;

/**
 * @author Eduardo Salazar
 */
//Java Bean o POJO
public class Circulo implements Figura{
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public float calcularArea() {
        return Figura.PI * (this.radio * this.radio);
    }
    /*
    Principio de diseño 0, 1 e infinito:
        Solo los valores mencionados son validos para utilizarse en la 
        codificacion de codigos, un buen lenguaje de programación debe proporcionar
        un mecanismo para evitar usar literales numericas en el programa.
    */
    
}
