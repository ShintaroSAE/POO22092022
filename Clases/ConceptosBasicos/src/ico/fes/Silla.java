package ico.fes;
import java.awt.Color;

/*
 * @author Eduardo Salazar
 */
public class Silla {
    String material;
    Color color;

    public Silla() {
    }

    public Silla(String material, Color color) {
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
}
