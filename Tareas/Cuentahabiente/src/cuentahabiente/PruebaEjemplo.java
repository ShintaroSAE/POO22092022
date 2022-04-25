package cuentahabiente;

/**
 * @author Eduardo Salazar
 */
public class PruebaEjemplo {
    public static void main(String[] args){
        Cuentahabiente[] cuentas = new Cuentahabiente[5];
        
        cuentas [0] = new Cuentahabiente("12345", "Pedro", 60000.1f);
        cuentas [1] = new Cuentahabiente("79866", "Luis", 20000);
        cuentas [2] = new Cuentahabiente("21355", "Eduardo", 100000);
        cuentas [3] = new Cuentahabiente("79843", "Jesus", 75000);
        cuentas [4] = new Cuentahabiente("13245", "Manuel", 59999.9f);
  
        for (Cuentahabiente cuenta : cuentas) {
            cuenta.retirarDinero(10000);
        }
        
        //Para evaluar el nivel del cliente se toma en cuenta el balance
        //que tiene almacenado en su cuenta
        for (Cuentahabiente cuenta : cuentas) {
            System.out.println(cuenta.evaluarNivelCliente());
        }
    }
}
