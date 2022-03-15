package ico.fes;

/**
 * @author Eduardo Salazar
 */
public class Alumno extends Persona{ //Hereda atributos y metodos
    private String numeroCuenta;
    private String carrera;
    private int grupo;

    public Alumno() {
    }

    public Alumno(String numeroCuenta, String carrera, int grupo) {
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.grupo = grupo;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "numeroCuenta=" + numeroCuenta + ", carrera=" + carrera + ", grupo=" + grupo + '}';
    }
    
    
}
