package ico.fes;

/*
 * @author Eduardo Salazar
 */
public class Persona { //Java Bean es diferente a un Enterprise Java Bean
    private int edad;
    private String nombre;

    public Persona() {
    }

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) 
    {
        if(edad >=0 && edad <=120)
        {
         this.edad = edad;
        }
        else
        {
         System.out.println("Valor fuera de rango");
        }
    }
    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + '}';
    }
    
        
}
