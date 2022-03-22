package ico.fes.herencia;

import Asus.com.Computadora;
import IcoFesComponentes.Monitor;
import IcoFesComponentes.Mouse;
import IcoFesComponentes.Procesador;
import IcoFesComponentes.Teclado;

/**
 * @author Eduardo Salazar
 */
public class Servidor extends Computadora{
    private int numeroFuentesPoder;
    private int numeroTarjetasRed;
    private int tipoRaid;

    public Servidor() {
    }

    public Servidor(int numeroFuentesPoder, int numeroTarjetasRed, int tipoRaid) {
        this.numeroFuentesPoder = numeroFuentesPoder;
        this.numeroTarjetasRed = numeroTarjetasRed;
        this.tipoRaid = tipoRaid;
    }

    public Servidor(int numeroFuentesPoder, int numeroTarjetasRed, int tipoRaid, String marca, String modelo, Monitor pantalla, Mouse ratón, Procesador cpu, Teclado teclado) {
        super(marca, modelo, pantalla, ratón, cpu, teclado);
        this.numeroFuentesPoder = numeroFuentesPoder;
        this.numeroTarjetasRed = numeroTarjetasRed;
        this.tipoRaid = tipoRaid;
    }

    public int getTipoRaid() {
        return tipoRaid;
    }

    public void setTipoRaid(int tipoRaid) {
        this.tipoRaid = tipoRaid;
    }

    public int getNumeroFuentesPoder() {
        return numeroFuentesPoder;
    }

    public void setNumeroFuentesPoder(int numeroFuentesPoder) {
        this.numeroFuentesPoder = numeroFuentesPoder;
    }

    public int getNumeroTarjetasRed() {
        return numeroTarjetasRed;
    }

    public void setNumeroTarjetasRed(int numeroTarjetasRed) {
        this.numeroTarjetasRed = numeroTarjetasRed;
    }

    @Override
    public String toString() {
        return super.toString() + "Servidor{" + "numeroFuentesPoder=" + numeroFuentesPoder + ", numeroTarjetasRed=" + numeroTarjetasRed + ", tipoRaid=" + tipoRaid + '}';
    }
    
}
