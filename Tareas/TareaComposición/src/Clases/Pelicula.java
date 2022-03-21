package Clases;

import Componentes.Actor;
import Componentes.Director;
import Componentes.Productora;

/**
 * @author Eduardo Salazar
 */
public class Pelicula {
    private Director director;
    private Productora productora;
    private Actor actor;

    public Pelicula() {
    }

    public Pelicula(Director director, Productora productora, Actor actor) {
        this.director = director;
        this.productora = productora;
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "director=" + director + ", productora=" + productora + ", actor=" + actor + '}';
    }
    
    
}
