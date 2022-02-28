package proyectolibro;
import Libro.Libro;
import java.awt.Color;
/**
 * @author Eduardo Salazar
 */
public class ProyectoLibro {
    public static void main(String[] args) {
        
        Libro Lib1 = new Libro();
        Lib1.setAutor("Octavio Paz");
        System.out.println("Autor: " + Lib1.getAutor());
        Lib1.setColor(Color.black);
        System.out.println("Color del libro: " + Lib1.getColor());
        Lib1.setTitulo("El Laberinto De La Soledad");
        System.out.println("Titulo: " + Lib1.getTitulo());
        Lib1.setEditorial("Fondo de Cultura Económica");
        System.out.println("Editorial: " + Lib1.getEditorial());
        Lib1.setPaginas(608);
        System.out.println("Páginas: " + Lib1.getPaginas());
        
        Lib1.Abierto(" está abierto");
        Lib1.Cerrado(" está cerrado");
        
    }
    
}
