package Libro;
import java.awt.Color;
/**
 * @author Eduardo Salazar
 */
public class Libro {
    private int Paginas;
    private Color Color;
    private String Titulo;
    private String Editorial;
    private String Autor;

    public Libro() {
    }

    public Libro(int Paginas, Color Color, String Titulo, String Editorial, String Autor) {
        this.Paginas = Paginas;
        this.Color = Color;
        this.Titulo = Titulo;
        this.Editorial = Editorial;
        this.Autor = Autor;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }
    
    public void Abierto(String Acción1){
        System.out.println("El libro " + this.Titulo + " está abierto");
    }

    public void Cerrado(String Acción2){
        System.out.println("El libro " + this.Titulo + " está cerrado");
    }
        
}
