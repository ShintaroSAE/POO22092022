package Componentes;

/**
 * @author Eduardo Salazar
 */
public class Editorial {
    String nombreLibro;
    String nombreEdit;

    public Editorial() {
    }

    public Editorial(String nombreLibro, String nombreEdit) {
        this.nombreLibro = nombreLibro;
        this.nombreEdit = nombreEdit;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getNombreEdit() {
        return nombreEdit;
    }

    public void setNombreEdit(String nombreEdit) {
        this.nombreEdit = nombreEdit;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombreLibro=" + nombreLibro + ", nombreEdit=" + nombreEdit + '}';
    }
    
    
            
    
    
}
