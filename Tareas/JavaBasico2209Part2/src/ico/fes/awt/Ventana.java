package ico.fes.awt;

import java.awt.Frame;
import java.awt.HeadlessException;

/**
 * @author Eduardo Salazar
 */
public class Ventana extends Frame{
    String titulo;

    public Ventana() throws HeadlessException {
    }

    public Ventana(String titulo) throws HeadlessException {
        super(titulo);
        this.setSize(600,400);
        this.setVisible(true);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Ventana{" + "titulo=" + titulo + '}';
    }
    
}
