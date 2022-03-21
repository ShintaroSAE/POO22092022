package tareacomposición;

import Clases.Libro;
import Clases.Pelicula;
import Componentes.Actor;
import Componentes.Autor;
import Componentes.Director;
import Componentes.Editorial;
import Componentes.Productora;

/**
 * @author Eduardo Salazar
 */
public class TareaComposición {
    public static void main(String[] args) {
        Libro lib1 = new Libro();
        lib1.setAutor(new Autor("Gabriel Garcia Marquez", 40));
        lib1.setEditorial(new Editorial("Cien Anios De Soledad", "Editorial Sudamericana"));
        System.out.println(lib1);
        
        Pelicula peli1 = new Pelicula();
        peli1.setDirector(new Director("Michael Bay", 44));
        peli1.setProductora(new Productora("Dreamworks Pictures", "Transformers"));
        peli1.setActor(new Actor("Shia LaBeouf", 21));
        System.out.println(peli1);
    }
    
}
