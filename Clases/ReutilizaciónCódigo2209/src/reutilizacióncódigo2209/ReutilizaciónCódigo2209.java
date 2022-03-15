package reutilizacióncódigo2209;

import Asus.com.Computadora;
import IcoFesComponentes.Procesador;
import javax.swing.JFrame;

/**
 * @author Eduardo Salazar
 */
public class ReutilizaciónCódigo2209 {

    public static void main(String[] args) {
        
        String nombre = new String("José José");
        System.out.println(nombre); 
        System.out.println(nombre.charAt(5));
        System.out.println(nombre.toUpperCase());

        /*
        JFrame ventana = new JFrame("Mi Primer Ventana Java");
        ventana.setSize(600,400);
        ventana.setVisible(true);
        */
        
        Computadora miCompu = new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println(miCompu);
        
    }
    
}
