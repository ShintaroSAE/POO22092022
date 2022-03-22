package reutilizacióncódigo2209;

import Asus.com.Computadora;
import IcoFesComponentes.Monitor;
import IcoFesComponentes.Mouse;
import IcoFesComponentes.Procesador;
import IcoFesComponentes.Teclado;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.Polimorfismo.Animal;
import ico.fes.herencia.Polimorfismo.Perro;
import ico.fes.herencia.Servidor;
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
        miCompu.getCpu().setMarca("AMD");
        System.out.println(miCompu);
        //Ejercicio: Establecer un mouse de marca Logitech del tipo Optico
        miCompu.setRatón(new Mouse("Logitech", "Óptico"));
        System.out.println(miCompu);
        
        Computadora compu2 = new Computadora("Apple", "MacbookPro", 
                new Monitor("Toshiba", 14.3f), 
                new Mouse("Acteck", "Óptico"),
                new Procesador("M1", 3.4f),
                new Teclado("Apple", 101));
        System.out.println(compu2);
            //cambiar mouse a apple y touch
            compu2.getRatón().setMarca("Apple");
            compu2.getRatón().setTipo("Touch");
            System.out.println(compu2);
            
        System.out.println("======================================");
        Alumno alu1 = new Alumno();
        alu1.setNombre("José");
        System.out.println(alu1);
        
        Alumno alu2 = new Alumno("319030693", "ICO", "José Perez", 19);
        System.out.println(alu2);
        alu2.setNumeroCuenta("319456982");
        System.out.println(alu2);
            
        System.out.println("===========Composicion y Herencia en la misma clase===============");
        Servidor server = new Servidor();
        System.out.println(server);
        server.setNumeroTarjetasRed(2);
        System.out.println(server);
        server.setMarca("HP");
        System.out.println(server);
        server.setRatón(new Mouse("LG", "Optico"));
        System.out.println(server);
        server.getRatón().setMarca("Logitech");
        System.out.println(server);
        
        System.out.println("====================Ejemplo Polimorfismo================================================");
        Perro dog = new Perro("Bulldog", "5 estrellas", 4);
        Animal animal1 = new Animal(4);
        dog.emitirSonido();
        animal1.emitirSonido();
        
        
        
    }
    
}
