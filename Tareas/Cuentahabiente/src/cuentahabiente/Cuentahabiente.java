package cuentahabiente;

/**
 * @author Eduardo Salazar
 */
public class Cuentahabiente {
    private String idCliente;
    private String nombre;
    private float balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(String idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    
    public void retirarDinero(float monto){
        System.out.println("Balance total de " + this.nombre + ": " + balance);
        balance = balance - monto;
        System.out.println(this.nombre + " retiró " + monto + " de su cuenta");
        System.out.println("El balance de su cuenta es de: " + balance + "\n");
    }
    
    public String evaluarNivelCliente(){
        return 50000 >= this.balance? this.nombre + " es un Cliente Regular" : this.nombre + " es un Cliente Premium";
    }
}
